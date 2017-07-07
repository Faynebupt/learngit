/**
 * 
 */
package one;
/**
* @author lvliangliang E-mail:lvliangbupt@136.com
* @version Create time：2017年7月7日 上午9:38:59
* class illustration:
*/
/**
 * @author NewUser
 *
 */
public class question14 {
	 @SuppressWarnings("unused")
	public static void main(String [] args){
		 String []ff={"1ac4dsfs","1ac4d","1ac4dbc"};
		 String []ff1={};
		 
		 System.out.println(longestCommonPrefix(ff1));
	 }
	 public static String longestCommonPrefix(String[] strs) {
	        
		 if(strs==null||strs.length==0){
	            return "";
	     }else{
            int l_length=strs.length;
			int length_max=strs[0].length();
			
			char []longest=new char[length_max+1];
			int temp=0;
			s:for(temp=0;temp<length_max;temp++){
				longest[temp]=strs[0].toCharArray()[temp];
				for(int j=1;j<l_length;j++){
					if(strs[j].length()<temp+1){
						break s;
					}else{
						if(longest[temp]!=strs[j].toCharArray()[temp]){
							break s;
						}
					}
				}
			}
			
			if(temp==0){
				 return "";
			}else{
				String result=new String(longest,0,temp);
				return result;
			}
	    }
	}
}
