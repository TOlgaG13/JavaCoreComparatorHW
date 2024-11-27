package sample5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<File> files = Arrays.asList(
		            new File("D:\\Java 11.09.2024\\JavaCoreComparator\\src\\sample5\\file1.txt"),
		            new File("D:\\Java 11.09.2024\\JavaCoreComparator\\src\\sample5\\file2.txt")
		        );
		 files.sort(Comparator.comparingInt(Main::countPunctuation));
		 files.forEach(file -> {
	            int punctuationCount = countPunctuation(file);
	            System.out.println(file.getName() + " has " + punctuationCount + " punctuation marks.");
	        });
	    }
	  private static int countPunctuation(File file) {
	        String punctuation = "{,.-?!}"; 
	        int count = 0;
	        try {
	           
	            String content = Files.readString(file.toPath());
	          
	            for (char c : content.toCharArray()) {
	                if (punctuation.indexOf(c) != -1) { 
	                    count++;
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return count;
	    }
	}