package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		int userAge = 3 ;
		String serviceCost = "";
		
		switch(userAge) {
		case 1 -> System.out.println("10代の料金は1000円");
		case 2 -> System.out.println("20代の料金は2000円");
		case 3 -> System.out.println("30代の料金は3000円");
		case 4 -> System.out.println("40代の料金は3000円");
		case 5 -> System.out.println("50代の料金は4000円");
		case 6 -> System.out.println("60代の料金は4000円");
		case 7 -> System.out.println("70代の料金は4000円");
		case 8 -> System.out.println("80代の料金は5000円");
		default -> System.out.println("上記以外の年齢は500円");
		
		}
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
