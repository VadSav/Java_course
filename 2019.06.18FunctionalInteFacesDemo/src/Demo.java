
public class Demo {
	public static void main(String[] args) {
		Printable p= new Printer();
		
		p.print("Hello world");
		
		Printable pAnon = new Printable() {
			@Override
			public void print(String s) {
				System.out.println(s);
				
			}
		};
		pAnon.print("Hello world 2");
		//Lambda exspressions
		Printable pl =s->{
			System.out.println(s);
		};
		Countable c = (a,b)->a+b;
		//int count = c.count(1,4);
		System.out.println(c.count(1, 4));
	}
	Countable c=(a,b)->{
		if(a>b) {
			return a+b;
		}else {
			return a-b;
		}
		
	};
	//  toje samoe po drugomu
	Countable c2 =(a,b)-> a>b ? a+b:a-b;

}
