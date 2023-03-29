package FirstAssessment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		
String filename;
char ch;

Scanner sc = new Scanner(System.in);

System.out.println("Hi Welcome to Simplilearn.com!");
System.out.println("I am Sandhya Dutta. This is my first project");
System.out.println("This the 1st Phase of Full Stack Development Course");
System.out.println("------------------------------------------------------------");
System.out.println("------------------------------------------------------------");
System.out.println("------------------------------------------------------------");
System.out.println("Here we can perform various file operations");
System.out.println("You can create,delete,search files and many more!!");
System.out.println("------------------------------------------------------------");
System.out.println("------------------------------------------------------------");
System.out.println("------------------------------------------------------------");

do {
	
	System.out.println("Select the option to perform the respective operation: \n");
	System.out.println("[1] Create a File");
	System.out.println("[2] See the list of files");
	System.out.println("[3] Delete a file");
	System.out.println("[4] Search for a file");
	System.out.println("[5] Exit the application");
int choice = sc.nextInt();
switch(choice) {
case 1:
	System.out.println("Creating a file...");
	System.out.println("Please enter a name for your file: \n");
	filename=sc.next();
	try {
		File file1=new File("D:\\SimplilearnProject\\"+filename+".txt");
		if(file1.createNewFile()) {
			System.out.println("Your file:" +filename+ " has been created");
		}
		else {
			if(file1.exists()) {
				System.out.println("File name already exists...");
			}
			else {
				System.out.println("File doesnt exist");
			}
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	break;
	
case 2:
	System.out.println("\n---- List of Files ----");
	File file2 = new File("D:\\SimplilearnProject\\");
	String[] flist=file2.list();
	for(String f:flist) {
		System.out.println(f);
	}
	break;
case 3:
	System.out.println("Enter the name of the file you want to remove:");
	filename=sc.next();
	File file3=new File("D:\\SimplilearnProject\\"+filename+".txt");
	if (file3.delete()) {
		System.out.println(filename+ " is deletd successfully");
	}
	else {
		System.out.println("please enter the valid file name. Try again");
	}
	break;
	
case 4:
	System.out.println("\nEnter the file name you are searching for...");
	filename=sc.next();
	File search=new File("D:\\SimplilearnProject\\");
	String[] flist1=search.list();
	int flag=0;
	if(flist1==null) {
		System.out.println("there is no file present in this folder!!");
	}
	else {
		for(String fileSearch:flist1) {
		if(fileSearch.equalsIgnoreCase(filename)) {
			System.out.println(fileSearch+" file is found....");
			flag=1;
		}
		}
	}
	if(flag==0) {
		System.out.println("File you are searching for is not found!!");
	}
	break;
case 5:
	System.out.println("You are now redirected to home page. Thank you for your precious time!! ");
	break;
default:
	System.out.println("Please choose from 1/2/3/4/5\n");
	System.out.println("Try again later!!");
}
System.out.println("\nDo you want to continue?");
System.out.println("y or n");
ch=sc.next().charAt(0);
	}
while(ch=='Y'||ch=='y');

}
}
