/**
 * 
 */
package one;
/**
* @author lvliangliang E-mail:lvliangbupt@136.com
* @version Create time：2017年7月21日 下午5:00:43
* class illustration:
*/
/**
 * @author NewUser
 *
 */
public class q8 {
	static int [][]show=new int[9][9];
	static int count=1;
	public static void main(String []args){
		method(1);
	}
	private static void method(int i) {
		if(i>8){
			printt(show);
		}else{
			for(int j=1;j<9;j++){
				show[i][j]=1;
				if(islegal(i,j))  method(i+1);
				show[i][j]=0;
			}
		}
	}
	private static boolean islegal(int i, int j) {
		if(i==1)return true;
		else{
			for(int m=1;m<9;m++)
				for(int k=1;k<i;k++){
					if(show[k][m]==1){
						if(m==j||Math.abs(i-k)==Math.abs(j-m)){
							return false;
						}
					}
				}
		}
		return true;
	}
	private static void printt(int[][] show2) {
		System.out.println(count);
		for(int k=1;k<9;k++){
			for(int m=1;m<9;m++){
				System.out.print(show[k][m]);
			}
			System.out.print("\n");
		}
		count++;
	}
}
