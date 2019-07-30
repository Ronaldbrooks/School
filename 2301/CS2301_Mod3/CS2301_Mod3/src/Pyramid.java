import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int r; 
		
		System.out.print("Enter the number of lines: ");
		r=stdIn.nextInt();

		for(int i=0;i<r;i++){  
            for(int k=r;k>i;k--){  
                System.out.print(" ");  
            }  
            for(int j=i;j<=(i*2);j++){  
                System.out.print(j+1);  
                if(j==(i*2) && j!=0){  
                    for(int l=j;l>i;l--){  
                        System.out.print(l);  
                    }  
                }  
            }  
            System.out.println();  
        }  
	}
}