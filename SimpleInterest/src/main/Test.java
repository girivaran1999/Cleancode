package SimpleInterest.SimpleInterest;
import java.util.*;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class Test {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
	OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
	System.out.println("Enter Principle Amount:");
        float p = sc.nextFloat();
	System.out.println("Enter Rate of Interest:");
        float r = sc.nextFloat();
	System.out.println("Enter Time:");
        float t = sc.nextFloat();
        CI c=new CI();
        SimpleInterest s=new SimpleInterest();
        streamWriter.write(String.valueOf(c.CompoundInterest(p,t,r))+" ");
        streamWriter.write(String.valueOf(s.SI(p,t,r)));
	streamWriter.flush();
    }
}