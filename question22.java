/**
 * 
 */
package one;

import java.util.List;
import java.util.Vector;

/**
* @author lvliangliang E-mail:lvliangbupt@136.com
* @version Create time：2017年7月21日 上午10:29:30
* class illustration:
*/
/**
 * @author NewUser
 *
 */
public class question22 {

	/**
	 * @param args
	 * 这也是递归，只不过没有return 来作为结束，这里是通过运行完方法中的语句来结束的。
	 * 刚开始之所以看不出来回溯的原因是因为上述的原因
	 * 这种可以说是隐式的回溯很哟意思，
	 * 不用面向过程去想，主要想好了方法，只需几句代码就可以完成非常复杂的过程。
	 * 这就是回溯的魅力。
	 * 几个if语句就可以回溯，自动的结束这一种情况就会回溯一步进行下一种情况。	
	 */
	public static void main(String[] args) {
		List<String> a=generateParenthesis(4);
		System.out.println(a.size());
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
	}
	public static List<String> generateParenthesis(int n){
		Vector<String> result=new Vector<String>();
		String temp ="";
		work(result,n,n,temp);
		return result;
	}
	private static void work(Vector<String> result, int l, int r, String temp) {
		if(l==0&&r==0) result.add(temp);
		if(l>0)work(result,l-1,r,temp+"(");
		if(r>0&&l<r)work(result,l,r-1,temp+")");
	}
}
