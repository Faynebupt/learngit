package one;
public class testtry {
	public static void main(String[] args) {
			demo2();
		}
		public static void demo2(){
			String []str={"cc","dddd","323423","3216543243"};
			int i=str.length;
			System.out.println(i);
			String []temp2={"a","b"};
			String aa=temp2[0]+temp2[1];
			System.out.println(aa);	
			
			String []temp3 = null;
			//temp3[0]="a";
			//temp3[1]="b";
			//String bb=temp3[0]+temp3[1];
			//System.out.print(bb);
			
			String tt="fasdfa";
			System.out.println(tt.length());
			String a="a";
			String b="b";
			String c=a+b;
			System.out.println(c);
			
			System.out.println("---------------------------------");
			
		 
			System.out.println(tt.toCharArray()[0]);
			
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











public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int l_length=strs.length;
        
        int []Most_String=new int[l_length];
        for(int i=0;i<l_length;i++){
            Most_String[i]=strs[i].length;
        }
        for(int i=0;i<l_length;i++)
        
        
        
        for(int i=0;i<l_length;i++){
            strs[i].toCharArray[0]
        }
            
        
    }
}