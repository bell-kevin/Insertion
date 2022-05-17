package insertion;

public class Insertion {

    public static void main(String[] args) {
        String descartes = "All nature will do as I wish it.";
        String darwin;
        int index;
        index = descartes.indexOf("will");
        darwin = descartes.substring(0, index) + "is perverse & " + descartes.substring(index);
        index = darwin.indexOf("do");
        darwin = darwin.substring(0, index) + "not " + darwin.substring(index);
        System.out.println(darwin); //Darwinism is wrong
    }
}
