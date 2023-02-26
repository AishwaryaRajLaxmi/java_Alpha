public class Pairing {
    //Problem:Given n friends,each one can remain single or can be paired up with some other friend,Each friend can be paired only once.Find out the total number of ways in which friends can remain single or can be paired up

    //example:n=1 (a,b) here in pair|| a,b=here a,b is single

    //a,b,c=pair could be (a,b),(b,c),(a,c),a,b,c is single
    public static void main(String args[]){
System.out.println(friendsPairing(3));
    }

    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        // int fnm1=friendsPairing(n-1);
        // int fnm2=friendsPairing(n-2);
        // int pairWays=(n-1)*fnm2;

        // //totWays
        // int totWays=fnm1+pairWays;
        // return totWays;

        return friendsPairing(n-1)*+(n-1)*friendsPairing(n-2);
    }
}
