import java.util.ArrayList;

abstract class Questionlist{
	abstract void print();
}
class Question extends Questionlist{
	   String description;
	   ArrayList<Questionlist> list;
	   public Question(String desc) {
	      this.description = desc;
	      list =new ArrayList();
	   }
	   public void addquestion(Questionlist c) {
		   list.add(c);
		   }
	   public void print() {
	      System.out.println(description);
	      for(Questionlist q:list)  
	        {  
	            q.print();  
	        }  
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
