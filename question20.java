/**
 * 
 */
package one;
/**
* @author lvliangliang E-mail:lvliangbupt@136.com
* @version Create time：2017年7月7日 下午2:36:46
* class illustration:
*/
/**
 * @author NewUser
 *
 */
public class question20 {
	public static void main(String[] args) {
		String a="()()()";
		boolean b=isValid(a);
		System.out.println(b);
	}
	public static boolean isValid(String s) {
		char []leftlib={'(','{','['};
		char []rightlib={')','}',']'};
		
		int len=s.length();
		int []tf=new int[len];
		int []num=new int[6];
		
		if(len%2!=0){
			return false;
		}else if(len==0){
			return true;
		}else{
			//个数为偶数且不为0的可能性：
			
		    //给每个位置赋值，分别为
			//1,6,2,5,3,4；
			for(int i=0;i<len;i++){
				for(int j=0;j<3;j++){
					if(s.toCharArray()[i]==leftlib[j]){
						tf[i]=j+1;
					}
					if(s.toCharArray()[i]==rightlib[j]){
						tf[i]=6-j;
					}
				}
			}
			//每个数字的个数
			for(int i=0;i<len;i++){
				if(tf[i]==1) num[0]++;
				if(tf[i]==2) num[1]++;
				if(tf[i]==3) num[2]++;
				if(tf[i]==6) num[3]++;
				if(tf[i]==5) num[4]++;
				if(tf[i]==4) num[5]++;
			}
			
			if(num[0]==num[3]&&num[1]==num[4]&&num[2]==num[5]){
				
				//以下都是括号个数成对数的可能
				
				//下面算出了中心的位置和个数
				//cal为+1后的！
				int centor[]=new int [len/2];
				int cal=0;
				for(int i=0;i<len;i++){
					if(tf[i]+tf[i+1]==7&&i<len-1&&tf[i]<tf[i+1]){
						centor[cal]=i;
						cal++;
					}
				}
				//下面算出了每个中心的偏心距！。。。。。也为+1的，就是个数，不是那个。
				int yiban[]=new int [cal];
				for(int j=0;j<cal;j++){
					if(j==0){
						yiban[j]=centor[j]+1;
					}else{
						yiban[j]=centor[j]+1-2*(centor[j-1]+1);
					}
				}
				
				
				//偶数情况里的终极判断。。。。。。
				boolean tt = false;
				for(int j=0;j<cal;j++){
					for(int i=0;i<yiban[j];i++){
						if(tf[centor[j]-i]+tf[centor[j]+i+1]==7
									&&tf[centor[j]-i]<tf[centor[j]+i+1]){
							tt=true;
						}
					}
				}
				return tt;
			}else{
				return false;
			}
		}//最后一个else的后括号
    }
}
