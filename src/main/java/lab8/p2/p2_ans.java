package lab8.p2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class p2_ans {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Directory to check: ");
        String input_dirct = sc.nextLine();
        File dirct = new File(input_dirct);
//        System.out.println(dirct.exists());
        String[] list_of_files = dirct.list();
        if(list_of_files == null){
            System.out.println("Directory does not exists.");
        }
        else{
            if(0 == list_of_files.length){
                System.out.println("Given Directory does not contains any files");
            }
            else {
                System.out.println("Given Directory contains following files");
                for(String file : list_of_files) {
                    System.out.println(file);
                }
            }
        }
    }
}
