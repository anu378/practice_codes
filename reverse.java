public class reverse {
    public static void main(String[] s){
       
        
            String str="civic";
            StringBuilder sb=new StringBuilder(str);
        
            
            for(int i=0;i<sb.length()/2;i++){
                int front =i;
                int back=sb.length()-1-i;
                char frontchar=sb.charAt(front);
                char backChar=sb.charAt(back);
                sb.setCharAt(front, backChar);
                sb.setCharAt(back, frontchar);
         }
         System.out.println(sb);
         //check palindrome
         if(str.equals(sb.toString())){
            System.out.println("It is palindrome");
         }else{
            System.out.println("It is not palindrome");
         }
         
        
        }
    }
    

