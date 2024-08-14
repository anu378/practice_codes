import java.util.Scanner;

public class spiralTrav{

    public static void main(String[] s){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Spiral matrix is : ");
int rowStart=0,rowEnd=n-1,colStart=0,colEnd=m-1;
while(rowStart<=rowEnd && colStart<=colEnd){
    //traverse right
    for(int col=colStart;col<=colEnd;col++){
        System.out.print(matrix[rowStart][col]+" ");
    }
    rowStart++;
    
    //traverse top to down
    for(int row=rowStart;row<=rowEnd;row++){
        System.out.print(matrix[row][colEnd]+" ");
    }
    colEnd--;
    //traverse right to left
    if(rowStart<=rowEnd)
    for(int col=colEnd;col>=colStart;col--){
        System.out.print(matrix[rowEnd][col]+" ");
    }
    rowEnd--;
    //traverse bottom to top
    if(colStart<=colEnd)
    for(int row=rowEnd;row>=rowStart;row--){
        System.out.print(matrix[row][colStart]+" ");
    }
    colStart++;
}
System.out.println("Spiral traversal is done");
}
}