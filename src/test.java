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
	   public void addQuestion(Questionlist q) {
		   list.add(q);
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
	 Question q=new Question("1+1=?");
	 Questionlist q1 =new Question("5*8=?");
	 q.addQuestion(q1);
	 q.print();
	 }
}
