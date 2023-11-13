
public class Chapter2 {

	public static void main(String[] args) {
		//  	練習問題
		//		5-1
		//		var型推論を利用して、double型の変数valueを10で初期化する
		var num = 10.0;
		String type = ((Object) num).getClass().getSimpleName();
		System.out.println(type); // Double

		//		5-2
		//		「ようこそ、（改行）Javaの世界へ！」という改行を含んだ文字列を表示する
		System.out.println("「ようこそ、\nJavaの世界へ！」");

		//		5-3
		//		String型の変数strを宣言し、初期値としてnullを渡す
		String str = null;
		System.out.println(str);

		//		5-4
		//		var型推論を利用せず、int型で5*4サイズの多次元配列dataを宣言する
		int[][] data = new int[5][4];
		System.out.println(data.length); // 5

		//		5-5
		//		var型推論を利用して、int型のギザギザな配列listを宣言する（中身は[2,3,5][1,2][10,11,12,13]）
		int[][] list = {
				{ 2, 3, 4 },
				{ 1, 2 },
				{ 10, 11, 12, 13 }
		};
		System.out.println(list[0].length); // 3

	}

}
