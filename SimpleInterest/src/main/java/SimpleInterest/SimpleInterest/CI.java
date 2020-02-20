package SimpleInterest.SimpleInterest;
class CI
{
    public double CompoundInterest(float p,float t,float r) {
	return p*Math.pow(1.0+r/100.0,t)-p;
    }
}