package oops;

public class PassByValueReference {
	
	Integer i=10;
	int j=10;
	public static void main (String [] a){
		new PassByValueReference().caller();
		
		
	}
	
	void caller(){
		modify(j);
		System.out.println(i );// any method keeps a local copy for any premetive
		
		
		modify(i);
		System.out.println(i );
		
		
		
		
		String a="abc";
		modify(a);
		System.out.println(a);//When we alter a string 
		
		
		MyObject obj=new MyObject();
		modify(obj);
		System.out.println(obj.id+" "+obj.name);
	}
	
	
	void modify (int i){i+=10;}
	void modify (Integer i){i+=10;}
	void modify (String i){i+="def";}	
	void modify (MyObject obj){
		obj.setName("paul");
		obj.setId(200);
		}
	
	
	
	public PassByValueReference() {super();}
	public PassByValueReference(Integer i) {this.i = i;}
	public Integer getI() {return i;}
	public void setI(Integer i) {this.i = i;}
}


class MyObject{
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String name="Koushik";
	int id=100;
}

