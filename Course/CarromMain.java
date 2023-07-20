class CarromMain{
	public static void main(String[] args){
		Carrom carrom = new Carrom();
		
		Carrom carrom1 = new Carrom(3);
		
		int noOfColors = 3;
		int redCoin = 1;
		Carrom carrom2 = new Carrom(noOfColors,redCoin);
		
		int noOfColors1 = 3;
		int redCoin1 = 1;
		int stricker1 = 1;
		Carrom carrom3 = new Carrom(noOfColors1,redCoin1,stricker1);
		
		int noOfColors2 = 3;
		int redCoin2 = 1;
		int stricker2 = 1;
		String boardType2 = "Wood";
		Carrom carrom4 = new Carrom(noOfColors2,redCoin2,stricker2,boardType2);
		
		int noOfColors3 = 3;
		int redCoin3 = 1;
		int stricker3 = 1;
		String boardType3 = "Wood";
		int totalCoins3 = 19;
		Carrom carrom5 = new Carrom(noOfColors3,redCoin3,stricker3,boardType3,totalCoins3);
	}
}