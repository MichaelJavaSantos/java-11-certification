public class PrimitiveTypes{
	public static void main(String[] args){
		int    a = 0b101010; // binary
		short  b = 052;      // octal
		byte   c = 42;       // decimal
		long   d = 0x2A;    // hex
		float  e = 1.99E2F;
		double f = 1.99;

		long   g = 5, h = c;
		float  i = g;
		char   j = 'A';
		char   k = '\u0041', l = '\101';

		int    s;
		s = 77;

		
		System.out.println(	" -> int    a = 0b101010; // binary \n"  +
					" -> short  b = 052;      // octal \n"  +
					" -> byte   c = 42;       // decimal \n"  +
					" -> long   d = 0x2A;    // hex \n"  +
					" -> float  e = 1.99E2F; \n"  +
					" -> double f = 1.99; \n"  +

					" -> long   g = 5, h = c; \n"  +
					" -> float  i = g; \n"  +
					" -> char   j = 'A'; \n"  +
					" -> char   k = '\\u0041', l = '\\101'; \n"  +

					" -> int    s; \n"  +
					" -> s = 77; \n" );


		System.out.println("int a::: " + a + "   s::: " + s);
                System.out.println("short b::: " + b);

                System.out.println("byte c::: " + c);
                System.out.println("long d::: " + d + "   g::: " + g + "   h::: " + h);
                System.out.println("float e::: "+ 2 + "   i::: " + i);
                System.out.println("double f::: " + f);

                System.out.println("char j::: " + j + "   k::: " + k + "   l::: " + l);
                System.out.println("");

	}
}
