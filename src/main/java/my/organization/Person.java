package my.organization;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Collections;

public class Person {
    private String firstname;
    private String lastname;
    private Date dob;

    public Person(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Person setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public int getAge() throws IllegalAccessException {
        if (this.dob == null) {
            throw new IllegalAccessException();
        }
        Instant now = new Date().toInstant();

        Duration duration = Duration.between(dob.toInstant(), now);
        return Math.toIntExact(duration.get(ChronoUnit.YEARS));
    }
}
