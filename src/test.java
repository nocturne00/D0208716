abstract class Questionlist{
	String desc;
	abstract void print();
}
class Question extends Questionlist{
	   String description;
	   public Question(String desc) {
	      this.description = desc;
	   }
	  
	   public void print() {
	      System.out.println(desc);
	   }      
}
class Leaf extends Questionlist{
	void print(){
		
	}
}
public class test {
 public static void main(String[] args) {
  
 }
}
