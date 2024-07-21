package TestGithub1.TestGithub1;

public class Practise2 {
	
	public int add(int b,int c) {
		   
		return b+c;
	}
  
  static int add(int b,int c,int a) {
	   
		return a+b-c;
	}



public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
    Practise2 prac=new Practise2();
	int test=prac.add(25,15);
	int test1=Practise2.add(25,15,5);
	System.out.println(test);
	System.out.println(test1);

}
}
