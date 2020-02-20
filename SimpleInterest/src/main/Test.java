package SimpleInterest.SimpleInterest;
import java.util.*;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class Test {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
	OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();
        CI c=new CI();
        SimpleInterest s=new SimpleInterest();
        streamWriter.write(String.valueOf(c.CompoundInterest(p,t,r))+" ");
        streamWriter.write(String.valueOf(s.SI(p,t,r)));
	streamWriter.flush();
    }
}