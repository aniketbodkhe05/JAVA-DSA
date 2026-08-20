class Recursion1{
public static void printnames(int i,int n){
  if(i>n){
    return;}
  
   System.out.println("Aniket");
   printnames(i+1, n);
}
 
  
  public static void main(String arg[]){

    
    printnames(1,7);
  }
}
