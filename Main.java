/**
 * TODO description
 */
public   class  Main {
	
	 private void  print__wrappee__Hello  (){
		System.out.println("Hello");
	}

	
	 private void  print__wrappee__Beautiful  (){
		print__wrappee__Hello();
		System.out.println("Beautiful");
	}

	
	public void print(){
		print__wrappee__Beautiful();
		System.out.println("World");
	}

	
	
	public static void main(String[] args){
		new Main().print();
	}


}
