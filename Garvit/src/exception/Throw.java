package exception;

public class Throw {
	
	
	public static void main (String [] a) {
		Throw n=new Throw();
		System.out.println(n.caller());
		
	}
	
	int caller(){
		
		
		try {throwCheckedException();} 
		catch (CheckedException e) {System.out.println("MyException has been caught");
			e.printStackTrace();}			
		finally {System.out.println();}
		//throwUncheckedException();// finally with return ???
		
		return 10;
		
	}
	
	int throwCheckedException() throws CheckedException{
		throw new CheckedException();
	}
	void throwUncheckedException() {
		throw new UncheckedException();
	}
	

}



class CheckedException extends Exception{}
class UncheckedException extends RuntimeException{}