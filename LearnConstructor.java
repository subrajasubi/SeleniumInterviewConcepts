package week2.day1;

public class LearnConstructor {
	LearnConstructor(){
		System.out.println("Subraja");
	}
	LearnConstructor(String name){
		
		 System.out.println(name);
	 }
	LearnConstructor(int age,String girl){
		 System.out.println(age+" "+girl);
	 }
	LearnConstructor(int num,String boy,int kids){
		 System.out.println(num+" "+boy+" "+kids);
	 }
	public static void main(String[] args) {
		LearnConstructor obj = new LearnConstructor();
		LearnConstructor obj1 = new LearnConstructor("Iniyan");
		LearnConstructor obj2 = new LearnConstructor(7,"Adhishree");
		LearnConstructor obj3 = new LearnConstructor(34,"Madhu",2);
	}
 
}

