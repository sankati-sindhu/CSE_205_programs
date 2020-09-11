/*==============================Problem Statement==============================*/
/**
 *  Initialize an integer array with ascii values and print the corresponding character values in a single row
 */
/*==================================Solution==================================*/

public class A1P4 {
        public static void main(final String[] args) {
        int n = 128;
        int[] arr = new int[n];
    
        for(int i=0;i<n;i++){
            arr[i] =  i;
        }
        for(int i=0;i<n;i++){
            System.out.print((char)i+" ");
        }
    }

}
/*===================================Sample Output===================================*/
/*
                
 
  
               1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c d e f g h i j k l m n o p q r s t u v w x y z { | } ~      
                    
                      ¡ ¢ £ ¤ ¥ ¦ § ¨ © ª « ¬ ­ ® ¯ ° ± ² ³ ´ µ ¶ · ¸ ¹ º » ¼ ½ ¾ ¿ À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ð Ñ Ò Ó Ô Õ Ö × Ø Ù Ú Û Ü Ý Þ ß à á â ã ä å æ ç è é ê ë ì í î ï ð ñ ò ó ô õ ö ÷ ø ù ú û ü ý þ 
 */