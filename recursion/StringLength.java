public interface StringLength {
    
        public static void main(String args[]){
            String str="abcdef";
           System.out.println(stringLength(str));
        }
        
        public static int stringLength(String str){
            if(str.length()==0){
              return 0;
            }

            return stringLength(str.substring(1))+1;
        }

       
}
