package src;

public class StaticcInnerClassTest {

	public static void main(String[] args) {
		double[] d = new double[20];
		for(int i = 0; i<d.length; i ++){
			d[i] = 100 * Math.random();
			System.out.println("data" +i +" as: "+d[i]);
		}
		
		ArrayAlg.Pair p = ArrayAlg.Pair.minmax(d);
		System.out.println("min = "+ p.getFirst());
		System.out.println("max = "+ p.getSecond());
	}

}
class ArrayAlg
{
	public static class Pair{
		private double first;
		private double second;
		
		
		public Pair(double f, double s){
			first = f;
			second = s;
		}
		
		public static Pair minmax(double[] value){
			double min = Double.MAX_VALUE;
			double max = Double.MIN_VALUE;
			for(double v: value){
				if(min >v) min =v;
				if(max <v) max =v;
			}
			return new Pair(min,max);
		}
		
		public double getFirst(){
			return first;
		}
		
		public double getSecond(){
			return second;
		}
	}
}