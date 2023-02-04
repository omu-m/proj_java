/**
 * (課題2) 2から100までの偶数のみを全て足す計算プログラムを作成
 */
public class task2 {

	/**
	 * 2から100までの偶数のみを全て足す
	 */
	public static void main(String[] args) {
		int sum = 0;
        // for文を用いて、繰り返し処理
		for (int i = 2; i <= 100; i ++) {
			//残余の計算で、2で割ったあまりが0に等しければ
			if (i % 2 == 0) {  //(偶数)
				sum = sum + i;
            } else {  //(奇数)
			//条件(奇数)にあてはまったときにその処理をスキップ
			//continue;
			}
		}
		System.out.println("2から100までの偶数の合計は " + sum + "です。");
	}

}