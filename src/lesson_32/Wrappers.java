package lesson_32;

public class Wrappers {

        public static void main(String[] args) {

            Integer maxValue = Integer.MAX_VALUE;
            System.out.println("max: " + maxValue);
            System.out.println("min: " + Integer.MIN_VALUE);

            maxValue = null;

            Integer wrapperInt = 5;
            System.out.println(wrapperInt);

            int primitiveInt = wrapperInt;
            System.out.println(primitiveInt);
            System.out.println("\n======================");

            Integer a = 127;
            Integer b = 127;
            System.out.println("127 == 127: " + (a == b)); // true
            System.out.println("127.equals(127): " + a.equals(b)); // true

            Integer c = 128;
            Integer d = 128;
            System.out.println("128 == 128: " + (c == d)); // false
            System.out.println("128.equals(128): " + c.equals(d)); // true
            System.out.println("\n=====================");

            Integer e = Integer.valueOf(127);
            Integer e1 =  Integer.valueOf("127");
            System.out.println(e + " | " + e1);

            Double dbl = Double.valueOf(154.5);
            System.out.println("dbl: " + dbl);

            Boolean b1 = Boolean.valueOf("true");
            System.out.println("b1: " + b1);

            System.out.println("\n=====================");

            double dblP = Double.parseDouble("456");
            Double dblD = Double.valueOf("456");

            System.out.println(dblP + " | " + dblD);

            System.out.println(Integer.parseInt("123"));

            Integer i1 = 127;
            Integer i2 = 256;

            System.out.println(i1 > i2);
            System.out.println("127.compareTo(256): " + i1.compareTo(i2));
            System.out.println("256.compareTo(128): " + i2.compareTo(i1));

            System.out.println("\n=====================");

            Double d2 = 125.67;
            d2 = Double.valueOf(125.67);
            double dPrimitive = d2;
            dPrimitive = d2.doubleValue();

            System.out.println("\n=========================");

            Integer integer = 31844;

            double dVal = integer.doubleValue();
            System.out.println(dVal);

            System.out.println(integer.floatValue());

            Double dWrapper = 245.78;
            int iVal =  dWrapper.intValue();
            System.out.println(iVal);

            System.out.println("dWrapper.byteValue(): " + dWrapper.byteValue());
            System.out.println("dWrapper.intValue(): " + dWrapper.intValue());

        }


    }


