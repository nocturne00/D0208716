abstract class Questionlist{
	
	abstract void print();
}
class Question extends Questionlist{
	   String description;
	   public Question(String desc) {
	      this.description = desc;
	   }
	  
	   public void print() {
	      System.out.println(description);
	   }
	  
}

class Leaf extends Questionlist{
	void print(){
		
	}
}
public class test {
 public static void main(String[] args) {
	 Questionlist q1=new  Question("1+1=?");
	 q1.print();
	 }
}
