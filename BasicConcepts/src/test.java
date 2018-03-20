public class test{
	public static void main(String[] args) {
		int number = 10;
		System.out.println("Hellow World");
		System.out.println("Value of number is : " + number);
		
		int n = 5;
		
		// to print Square pattern
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || i==5){
					System.out.print("* ");	
				}else if(j==1 || j==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//to print the second pattern
		int k = 9;
		for(int i=1; i<=k; i++) {
			for(int j=1; j<=k; j++) {
				if(i==9 || i==1) {
					System.out.print("* ");	
				}else if(j==1 || j==9) {
					System.out.print("* ");	
				}else if(i==2&&((j==2) || (j==3)|| (j==4) || (j==6) || (j==7) || (j==8))) {
					System.out.print("* ");	
				}else if(i==3&&((j==2) || (j==3)||(j==7) || (j==8))) {
					System.out.print("* ");	
				}else if(i==4&&((j==2) || (j==8))) {
					System.out.print("* ");	
				}else if(i==6&&((j==2) || (j==8))) {
					System.out.print("* ");	
				}else if(i==7&&((j==2) || (j==3)||(j==7) || (j==8))) {
					System.out.print("* ");	
				}else if(i==8&&((j==2) || (j==3)|| (j==4) || (j==6) || (j==7) || (j==8))) {
					System.out.print("* ");	
				}else {
					System.out.print("  ");	
				}
			}
			System.out.println();	
		}
			
	}
}
	
