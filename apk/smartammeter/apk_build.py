#!/usr/bin/python
# coding=utf-8
import zipfile
import shutil
import os
import os.path
import time
import datetime
import sys


def buildApk():
   
        dir1 = "C:\Program Files\Android\Android Studio\gradle"
    	dir2 = "C:/moon/gradle"
        flag = os.path.exists(dir2)
    	if not flag:
    		shutil.copytree(dir1,dir2)
        
        os.system(dir2+"/gradle-4.4/bin/gradle assembleRelease")
 
        #os.system("gradle assembleRelease")
   
    
# 主函数的实现
if __name__ == "__main__":

  
    buildApk()
    print "apk_build sucess"
