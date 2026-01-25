package gr.aueb.cf.cf9.review.challenges;

/**
 * from a point x to point y the jump is the the moving distance
 */
public class FrogJumps {
    public static void main(String[] args) {
    int x = 15;
    int y = 76;
    int jumb = 23;
    int numOfJumbs = 0;
    numOfJumbs = frogJumbs(x, y, jumb);
        System.out.println(numOfJumbs);

    }
    public static int frogJumbs(int x, int y, int jumb){
        int count = 0;
        for (int i = x; i < y; i+= jumb){
            count++;
        }
        return count;
    }
//    public static int frogJumbs2(int start,int end, int jumb){
//        return Math.ceil((end - start)/(double) jumb);
//    }
}
