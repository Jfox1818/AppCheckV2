//package com.appcheck.model;
//
//import com.appcheck.utils.FileNameUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.io.File;
//
//@Component
//public class FindInboundFileImpl implements FindInboundFile {
//
//    File directory;
//    String directoryPath;
//    String fileName;
//
//    @Autowired
//    public FindInboundFileImpl(File directory, String directoryPath, String fileName) {
//        this.directory = directory;
//        this.directoryPath = directoryPath;
//        this.fileName = fileName;
//    }
//
//
//    @Override
//    public File findFile() {
//
//        // Create an object of the File class
//        // Replace the file path with path of the directory
//        // ile directory = new File(directoryPath);
//
//        // Create an object of Class MyFilenameFilter
//        // Constructor with name of file which is being
//        // searched
//        InboundFilenameFilter filter
//                = new InboundFilenameFilter(fileName);
//
//        // store all names with same name
//        // with/without extension
//        // String[] flist = directory.list(filter);
//        File[] files = directory.listFiles(filter);
//        int tracker = 0;
//
//        // Empty array
//        if (files == null) {
//            System.out.println(
//                    "Cannot find " + filter.toString() + " in directory or directory does not exists.");
//        } else {
//
//
//            // Print all files with same name in directory
//            // as provided in object of MyFilenameFilter
//            // class
//            for (int i = 0; i < files.length; i++) {
//                System.out.println(files[i] + " found");
//                tracker = i;
//            }
//        }
//        return files[tracker];
//
//    }
//
////
////    public void setDirectoryPath(String directoryPath) {
////        this.directoryPath = directoryPath;
////    }
////
////    public void setFileName(String fileName) {
////        this.fileName = fileName;
////    }
//}