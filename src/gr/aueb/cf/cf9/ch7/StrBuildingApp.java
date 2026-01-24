package gr.aueb.cf.cf9.ch7;

public class StrBuildingApp {
    public static void main(String[] args) {
        String concatStr = "";
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;
        timeStart = System.currentTimeMillis();
//        for (int i = 0; i < 150000; i++){
//            concatStr = concatStr + i;
//        }
//
//
//        timeEnd = System.currentTimeMillis();
//        elapsedTime = (timeEnd - timeStart) / 1000.0;
//        System.out.println(elapsedTime);

        //String Builder
        StringBuilder sb = new StringBuilder();
        timeStart = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++){
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000;
        System.out.println(elapsedTime);
    }
}
