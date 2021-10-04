public class Main{
    public static void main(String[] args){
        /* Variables */
        String name = "Arun";
        int age = 26;
        float weight = 75.5f;
        char init = 'S';
        boolean isEntrepreneur = true;
        double doubleVar = 123.12d;

        System.out.println("Basic Main");
        System.out.println("Name : "+ name);
        System.out.println("Init : "+ init);
        System.out.println("Age : "+ age);
        System.out.println("Weight : "+ weight);
        System.out.println("Entrepreneur : " + isEntrepreneur);
        System.out.println("Double : "+ doubleVar);

        // Widening Casting
        // type casting 
        int fromInt = 123;
        double toDouble = fromInt;
        System.out.println("type casting : "+ toDouble);

        // Narrowing Casting 
        // type casting double -> int
        double fromDouble = 123.321d;
        System.out.println("double to int : "+ (int) fromDouble);

        //String 
        String txt = "Hello, World";
        String txt1 = "This is Java";
        System.out.println("Length "+ txt.length());
        System.out.println("Index of "+ txt.indexOf(","));
        System.out.println("Upper "+txt.toUpperCase());
        System.out.println("Lower "+txt.toLowerCase());
        System.out.println("concate "+txt.concat(txt1));
        
        //Math
        System.out.println("max "+Math.max(2,34));
        System.out.println("min "+Math.min(2,34));
        System.out.println("Sqrt "+Math.sqrt(36));
        System.out.println("abs "+Math.abs(-34.5));
        System.out.println("random "+Math.random());
        System.out.println("ram 0 -> 100 "+ (Math.random() * 101));

        //Boolean
        boolean isJavaFun = true;
        System.out.println("boolean "+ isJavaFun);

        /*
        Controll statements in java
         */

        // if else
        int a = 10;

        if (a < 5){
            System.out.println(" lesser than 5 ");
        }else if(a == 10){
            System.out.println(" a  == 10");

        }else{
            System.out.println(" greater than 5 ");
        }

        //Ternary Operator
        int time1  = 23;
        System.out.println("Greetings "+ ((time1 < 13) ? "Good Morning" : "Good After Noon"));

        //switch
        switch(time1){
            case 10:
                System.out.println("10");
                break;
            case 23: System.out.println("23");break;
            default: System.out.println(time1);
        }

        /* Looping  */
        //while loop
        int i = 0;
        while (i < 5){
            System.out.println("while i "+i);
            i++;
        }

        //do while
        do {
            System.out.println("do while i "+i);
            i++;
        }while(i<10);

        //for loop
        for(i =0; i <10; i++){
            System.out.println("Loop "+i);
        }

        // for each 
        String[] cars = {"TATA", "Mahindra", "Force","HM"};
        for (String car : cars){
            System.out.println("Indian Cars are "+ car);
        }

        //break statement
        System.out.println("Break");
        for (i=0; i<10; i++){
            if(i==4)break;
            System.out.println("break "+i);
        }

        //Continue statement
        for (i=0; i<10; i++){
            if(i==4)continue;
            System.out.println("Continue "+i);
        }

        //array
        System.out.println("Array");
        //d
        String studentName[] = new String[10];
        studentName[0]="sam";
        //2 d
        int[][] myNumber = {{1,2,3,4,5}, {6,7,8,9,0}};
        System.out.println("My Number "+ myNumber[1][1]);
        System.out.println("name : "+studentName[0]);
        System.out.println("name : "+studentName[1]);
        
        //looping for with index
        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (i=0; i< cars.length; i++){
            System.out.println("Array Car : "+ cars1[i]);
        }

        //loop
        for(String car: cars1){
            System.out.println("Array Car : "+ car);
        }

        

    }

}