public class Main {
    public static void main (String[] args){
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        //parsing int values from String
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        //parsing double values from String
        double num = Double.parseDouble(numberAsString);
        System.out.println(num);

        //parsing float values from String
        float floatNum = Float.parseFloat(numberAsString);
        System.out.println(floatNum);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
