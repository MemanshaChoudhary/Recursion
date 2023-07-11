// To make a bar garph for the data present in an array 
public class barchart{
    public static void main(String args[]) {
    int a[]= { 1,2,9,7,5};
    int l = a.length;
    int max=0;
    for(int i = 0;i<l;i++)
    {
        if(a[i]>max)
        max=a[i];
    }
    for(int j=max;j>0;j--)
    {
        for(int x= 0;x<l;x++)
        {
            if(a[x]>=j)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
   }
}
