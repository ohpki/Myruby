package exercise;

public class first {
	public static void main(String[] arge) {
		int num1 = 10;
		String str1 = "hallo";
		final String str2 = "hoge";
		str1 = "hogeho";
		System.out.println(str2);
		System.out.println(num1);
		System.out.println(str1);
		
		int val = 2 + 5;
		System.out.println(val);
		val *= 5;
		System.out.println(val);
		boolean bool = (val == 50);
		System.out.println(bool);
		bool = (val < 50) && (val % 10 == 0); 
		System.out.println(bool);
		
		int kyori = 10;
		if ( kyori <= 5) {
			System.out.println("とても近い");
		} else if ( kyori <= 10){
			System.out.println("近いです");
			
		} else if ( kyori <= 15){
			System.out.println("遠いです");
		} else if ( kyori <= 15){
			System.out.println("とても遠い");
		}

		
		
		String singou = "red";
		switch(singou) {
			case "red" :
				System.out.println("赤信号");
				break;
			case "yellow":
				System.out.println("黄色信号");
				break;
			default:
				System.out.println("信号の色はありません");
		}
		
		int number = 1;
		while (number < 50) {
			number *= 2;
					System.out.println("while文 =" + number);
		}
		number = 51;
		do {
			number *= 2;
			System.out.println("do~while文 =" + number);
		} while (number < 50);
		
		for (int num = 1; num <= 5; num++) {
			System.out.println("for文＝" + num);
		}
		
		int[] array = { 1, 2, 3, 4, 5 };
			for (int num2 : array) {
				System.out.println("拡張for文=" + num2);
			}
			
		int num3 = 1;
		while ( num3 < 5) {
			System.out.println(num3 * num3);
            num3++;
		}
		
		int[] num4 = { 1, 2, 3, 4 };
			for ( int i = 0; i < num4.length; i++) {
				System.out.println(num4[i]);
			}
		for (int val2 : num4) {
			if (val2 % 2 == 0) {
				continue;
			}
			System.out.println(val2);
		}
		int even[] = new int[10];
		int x = 0;
		int y = 0;
		for (int evenNum : even) {
			if (evenNum % 2 == 0) {
				x++;
				y += evenNum;
				
			}
			
		}
		System.out.println("個数は" + x);
		System.out.println("合計は" + y);
		
		for (int i = 1; i <= 10; i++) {
			if (i == 10) {
				System.out.println( i );
			} else {
			System.out.print( i + ",");
			}
		}
		int a = 3;
		int b = 5;
		System.out.println("a+b=" + (a + b));
		
		//大きい方の値を代入する↓
		int m = Math.max(a, b);
		System.out.println(m);
		//文字列を整数いんｔに変換する
		String age = "25";
		int n = Integer.parseInt( age );
		System.out.println(n+2);
		
		int gatya = new java.util.Random().nextInt(6);
		System.out.println("あなたのアイテムは★" + gatya);
		/*
		System.out.println("あなたの名前を入力して下さい");
		String name2 = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age2 = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println(age2 + "際の" + name2 + "さん、あなたの運気番号は" + fortune);
		*/
		int rand = new java.util.Random().nextInt(5)+1;
		System.out.println(rand);
		switch (rand) {
		case 1:
		case 2:
			System.out.println("小吉");
			break;
		case 3:
			System.out.println("忠吉");
			break;
		default:
			System.out.println("大吉");
		}
		
		
		int seibetsu = 0;
		int age1 = 25;
		System.out.println("こんにちは");
		if (seibetsu == 0) {
			System.out.println("男性");
		} else if (seibetsu == 1) {
			System.out.println("女性");
		}
		
		System.out.println("1:検索 2:登録 3:消去 4:変更");
		int selected = new java.util.Random().nextInt(4)+1;
		switch(selected){
		case 1:
			System.out.println("検索");
			break;
		case 2:
			System.out.println("登録");
			break;
		case 3:
			System.out.println("消去");
			break;
		case 4:
			System.out.println("変更");
			break;
		}
		
		System.out.println("数当てゲーム");
		int ans = new java.util.Random().nextInt(10);
		System.out.println(ans);
		for (int i=0; i<5; i++) {
			System.out.println("0~9を入力");
			int num = new java.util.Scanner(System.in).nextInt(10);
			if (num == ans) {
				System.out.println("正解です");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("終了");
		
		int[] score = new int[] {0,1,2,3,4};
		System.out.println(score[1]);
		
		for (int value : score) {
			System.out.println(value);
		}
		
		int[] points = new int[5];
		int[] moneyList = {121902, 8302, 55100};
		for (int i=0;i<moneyList.length;i++) {
			System.out.println(moneyList[i]);
		}
		
		for (int value : moneyList) {
			System.out.println(value);
		}
		
		int[] numbers = new int[] {3,4,9};
		System.out.println("一桁の数字を入力して下さい");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int value : numbers) {
			if (value == input) {
				System.out.println("当たりです");
			}
		}
		
		
		int[] number1 = {1,2,3,4,5,6,7,8,9,10};
		for (int num7 : number1 ) {
			if (num7==10) {
				System.out.println(num7);
			} else {
				System.out.print(num7+",");
			}
		}
		
		
	}
	
	
	
	public static void printArray(int[] array) {
		for (int ar : array) {
			System.out.println(ar);
		}
	}
	
	public static void introduceOneself (System[] args){
		String name = "taro";
		int age = 25;
		double toll = 160;
		char sex = '男';
		System.out.println(name+"と申します。"+age+"歳、性別"+sex+"身長は"+toll);
	}
	
	public static void email(System[] args) {
		String title = "こんにちは";
		String address = "aaa@aaa";
		String text = "初めまして";
		
	}
	
	
	
	
	
}
