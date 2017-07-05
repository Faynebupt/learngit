package one;
public class testtry {
	public static void main(String[] args) {
		}
		public static void demo1(){
			System.out.println(12%10);
			System.out.println(-22/10);
			System.out.println(2%10);
			System.out.println(Math.pow(10,2));
			System.out.println(aaa());
			bbb();
			String result;
			
			String d="-123";
			result=d.substring(1);
			String ac=new StringBuilder(d).reverse().toString();
			System.out.println(ac);
			
			System.out.println("-------------------------------");
			String a="12345";
			
			StringBuffer sb=new StringBuffer(a);
			sb.insert(0, '-');
			String s=sb.toString();
			System.out.println(s);
		}
		
		public static int aaa(){
			int temp=9;
			if(temp==9){
				return 0;
			} 
			return temp;
		}
		
		public static void bbb(){
			int a=-123;
			String b=Integer.toString(a);
			System.out.println(b);
			char c=b.charAt(0);
			System.out.println(b.length());
			if(c=='-'){
				System.out.println(1);
			}
			System.out.println("-------------------------------");
		}
	}