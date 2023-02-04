/**
 * (課題1-1) 1から100までの整数を全て足す計算プログラムを作成
 */
public class task1 {

	/**
	 * 1から100までの整数を全て足す
	 */
	public static void main(String[] args) {
        int sum = 0;
        // for文を用いて、繰り返し処理
		for (int i = 1; i <= 100; i ++) {
			sum += i;
		}
		System.out.println("1から100までの合計は " + sum + "です。");
	}

}
