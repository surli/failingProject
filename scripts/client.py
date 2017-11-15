#!/usr/bin/python

import os, sys, requests, zipfile

args = sys.argv
tempZip = "/tmp/target.zip"

def zipdir(path, ziph):
    # ziph is zipfile handle
    for root, dirs, files in os.walk(path):
        for file in files:
            ziph.write(os.path.join(root, file))

if __name__ == '__main__':
    zipf = zipfile.ZipFile(tempZip, 'w', zipfile.ZIP_DEFLATED)
    zipdir('./target/', zipf)
    zipf.close()
    url = args[1]
    file = {'file': open(tempZip, 'rb')}
    r = requests.post(url, files=file)

