package gr.aueb.cf.cf9.ch07;

public class StrIndexOff {
    public static void main(String[] args) {
        String s1 = "Coding Factory.txt";
        int positionOfo = s1.indexOf("o");
        System.out.println(positionOfo);
        int positionOfNexto = s1.indexOf("o", 2);
        System.out.println(positionOfNexto);
        int lastPositionOfo = s1.lastIndexOf("o");
        System.out.println(lastPositionOfo);
        String extention = getExtension(s1);
        System.out.println(extention);
    }

    public static String getExtension(String filename){
        return filename.substring(filename.lastIndexOf(".") + 1);

    }
}
