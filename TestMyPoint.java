package labprograms;

class MyPoint{
	private int x;
	private int y;
	public MyPoint() {
		this.x=0;
		this.y=0;
	}
	public MyPoint(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int[]getXY(){
		return new int[] { this.x,this.y};
	}
	@Override
	public String toString() {
		 return"("+ this.x+","+this.y+")";
		public double distance (int x,int y) {
			int dx=this.x-x;
			int dy=this.y-y;
			return Math.sqrt(dx*dx+dy*dy);
			public double distance(MyPoint another) { {
			}
				int dx=this.x-another.x;
				int dy=this.y-another.y;
				return Math.sqrt(dx*dx+dy*dy);
			}
			public double distance() {
				return Math.sqrt(this.x* this.x+this.y*this.y);
			}
			public class TestMyPoint {
			}public static void main(String[]args) {
				MyPoint p1=new MyPoint();
				System.out.println("p1"+p1);
				MyPoint p2=new MyPoint();
				System.out.println("p2"+p2);
				p1.setXY(5,6);
				int[]coords=getXY();
				System.out.println("p1 new coordinate:("+ coords[0]+","+coords[1]+")");
				System.out.println("distance from p1 to (7,8)"+p1 distamce(7,8));
				System.out.println("distamce from p1 to p2:"+p1.distance(p2));
				System.out.println("distance from p1 to origin: "+p1.distance());
				MyPoint p3 = new MyPoint(2,2);
				System.out.println("distance from 0,0 to 2,2 is :" +p3,distance);
				
			}
			}
		}
	







