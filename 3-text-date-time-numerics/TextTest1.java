import java.util.function.Function;

public  class TextTest1 {
	public static void main(String[] args){
		String teaTxt = "Tea";
		String b = "Tea";

		

		p(teaTxt == b);    // print true

		
		String c = new String("Tea");

		p( teaTxt == c);    	     // print false
		p( teaTxt == c.intern());    // print true

		



		p( "-------------------------------- Char index" );

		String d = teaTxt + ' ' + b;
		// 'Tea Tea'

		p( d.indexOf('T') );
		p( d.indexOf('T', 1) );
		p( d.lastIndexOf('T') );


		p( "last caracter ::: " + d.charAt( d.length() - 1 ) );

		p( d.toUpperCase() );
		p( d.toLowerCase() );



		p( d.substring(4,6) );
		p( d.substring(4,7) );
		

		p( "-------------------------------- String builder" );
		StringBuilder sb = new StringBuilder(d);

		p( sb.length() );
		p( sb.capacity() );

		p( sb.replace(0, sb.length()-1, "What is the price of Tea?"));
		p( sb.length() );
		p( sb.capacity() );    // auto incresead
	}


	public static void p(Object o){
		System.out.println( o );
	}
}
