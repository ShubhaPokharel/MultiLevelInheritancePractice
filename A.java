class A{   //parent class
	void money(){
		System.out.println("1 million dollars"); 
	}	
}
class B extends A{  //child class
	void clothes(){
		System.out.println("The child gets clothes");
	}

}

class C extends B{
	void bunny(){
		System.out.println("Bunny");
	}
}

class D extends C{
	public static void main(String[] args){
		 A a = new A();
		 a.money();  //this gets parent class property only
		// this gets the properties of the parent and child class
		System.out.println("*******************************");
		 D d = new D();
		 d.bunny();
		 d.clothes();
		 d.money();


	}
}