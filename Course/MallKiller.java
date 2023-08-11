class MallKiller{
	public static void main(String[] aargs){
		System.out.println("Invoking main in mallkiller");
		Mall mall = new Mall("GT mall","vector",30*40,4,"puma","Enginnerig");
		System.out.println(mall.name);
		System.out.println(mall.shape);
		System.out.println(mall.space);
		System.out.println(mall.floor);
		System.out.println(mall.brand);
		System.out.println(mall.employe);
		mall.company();
	}
}