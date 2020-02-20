package SimpleInterest.SimpleInterest;
import java.util.*;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class Construction {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
	OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
	streamWriter.write("Enter area");
	float area=sc.nextFloat();
	streamWriter.write("Material Standard:\n1.Little Standard\n2.standard\n3.More standard\n"
						+ "4.High standard");
	int standardchoice=sc.nextInt();
	if(standardchoice>0&&standardchoice<=4)
	{
	    CCC cobj=new CCC();
	    streamWriter.write("Cost of Construction is:"+cobj.Calc(standardchoice, area)+" Rupees");
	}
	else
	{
	    streamWriter.write("Invalid Choice");
	}
	streamWriter.flush();
    }
}