import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileDemo 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     //  Path g=Paths.get("D:\\f1.txt");
         //FileSystem f1=FileSystems.getDefault();
         Path f=Paths.get("D:\\v1.txt");
	      System.out.println(""+f.getNameCount());
	       System.out.println(""+f.getClass());
	       System.out.println(""+f.getFileName());
	       System.out.println(""+f.getName(0));
	       System.out.println(""+f.getParent());
	       System.out.println(""+f.getRoot());
	       System.out.println(""+f.getFileSystem());
	       System.out.println("SubPath"+f.subpath(0, 1));
	       
	       System.out.format("path %s",f,StandardCopyOption.COPY_ATTRIBUTES);
         
        // System.out.println("FileSystem"+f.getFileSystem());

	}

}
