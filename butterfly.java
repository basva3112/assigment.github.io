class butterfly{

	public static void pattern(int n){
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			for(int j = 1; j<= 2*(n-i); i++){
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			SYstem.out.println();
		}
	}
	public static void main(String args[]){
		pattern(5);
	}
}