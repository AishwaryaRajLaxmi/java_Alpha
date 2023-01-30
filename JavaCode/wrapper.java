public class wrapper{
    
    /*These three are static method of wrapper class
     *valueOf()
     * parseInt()
     * intValue()
     */
    public static void main(String args[]) {
        Integer i1=Integer.valueOf("101011", 2);
        System.out.println(i1);
        Double d1=Double.parseDouble("123");
        System.out.println(d1);
        //it will send data to int variable which is inside wrapper class i1
        int c=i1.intValue();
        System.out.println(c);

        

    }
    
}