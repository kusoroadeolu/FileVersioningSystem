package com.myproject;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.myproject.helper.FileHelper;
import com.myproject.watcher.DirectoryWatcher;
//import com.myproject.watcher.DirectoryHandler;

public class Main {
        public static void main(String[] args) throws Exception {
            DirectoryWatcher handler = new DirectoryWatcher(Paths.get("C:\\Users\\eastw\\Git Projects\\Personal\\filemanager"));

          
            
       
        } 
        
    }


   