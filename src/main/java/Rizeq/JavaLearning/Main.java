package Rizeq.JavaLearning;

import org.w3c.dom.ls.LSOutput;

import java.awt.desktop.PreferencesEvent;
import java.sql.*;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

//        Singer singer1 = new Singer("Eminem", 40, "Singer");
//        Boxer boxer1 = new Boxer("Mouhammed Ali", 70, "Great Boxer");
//
//        singer1.Speak4urSelf();
//        boxer1.Speak4urSelf();
//
//        singer1.isDancer("Eminem can dance");

// ------------------------------------------------------------------------------------------------

//        String text = "hello my friend, wanna play my game?";
//
//        int a = text.indexOf("my");
//
//        int b = text.lastIndexOf("my");
//
//        System.out.println(a);
//        System.out.println(b);

// ------------------------------------------------------------------------------------------------
//        int a = 1;
//        while (a <= 20) {
//            System.out.println(a + " Right");
//            a = a + 1;
//
//            if (a > 10) {
//                break;
//            }
//        }

// ------------------------------------------------------------------------------------------------

//        String str = "we have a large inventory of things in our warehouse falling in "
//                + "the category:apperal and the slightly"
//                + "more in demand category:makeup along with the category:furniture and...";
//
//        printCategories(str);
//    }
//    public static void printCategories(String str) {
//
//        int i = 0;
//        while (true) {
//
//            int found = str.indexOf("category:", i);
//
//            if (found == -1) break;
//
//            int start = found +9;
//            int end = str.indexOf(" ", start);
//
//            System.out.println(str.substring(start, end));
//
//            i = end+1;
//
//        }

// ------------------------------------------------------------------------------------------------

//        for (int i = 1; i <= 100; i += 2) {
//            System.out.println("i = " + i);
//        }

//        ArrayList words = new ArrayList();
//
//        words.add("hey, hey");
//        words.add("wassap");
//        words.add(213);
//        words.add(2);
//        words.add('H');
//        words.add(13.50);

//        int item1 = (int) words.get(2);
//        double item2 = (double) words.get(5);

//        String item1 = (String) words.get(0);
//        String item2 = (String) words.get(1);

// ------------------------------------------------------------------------------------------------

//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(100);
//        numbers.add(200);
//        numbers.add(300);
//        numbers.add(500);
//        numbers.add(600);

//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }

// ------------------------------------------------------------------------------------------------

//        HashSet<Vehicle> vehicles = new HashSet<>();
//
//        vehicles.add(new Vehicle("BMW", "M3", 12000.00, 1));
//        vehicles.add(new Vehicle("BMW", "M3", 12000.00, 1));
//        vehicles.add(new Vehicle("Mercedes", "G Clas", 20000.00, 2));
//
//        for (Vehicle car : vehicles) {
//            System.out.println(car);
//        }

// ------------------------------------------------------------------------------------------------

//        HashSet<Employee> hashSet = new HashSet<Employee>();
//        hashSet.add(new Employee("Johhn", 3000, "IT"));
//        hashSet.add(new Employee("Rami", 4000, "Mechanic"));
//        hashSet.add(new Employee("Wael", 2000, "HR"));
//
//
//        ArrayList<Employee> newList = new ArrayList<Employee>(hashSet);
//
//        Collections.sort(newList);
//
//        System.out.println(newList);

// ------------------------------------------------------------------------------------------------

//        TreeMap<String, String> dictionary = new TreeMap<String, String>();
//        dictionary.put("Brave", "ready to face and endure danger or pain. showing courage.");
//        dictionary.put("Brilliant", "exceptionally clever or talented.");
//        dictionary.put("Joy", "a feeling of great pleasure and happiness.");
//        dictionary.put("Confidence", "the state of feeling certain about the truth of something.");
//
//        dictionary.put("Dance", "moving the body while listing to the music and feeling it.");
//
//        for (Map.Entry<String, String> entry: dictionary.entrySet()) {
//            System.out.println("The word: " + entry.getKey()
//                    + ", The meaning: " + entry.getValue());
//        }

// ------------------------------------------------------------------------------------------------

//        ArrayList myList = new ArrayList();
//
//        myList.add("henllo");
//        myList.add(100);
//        myList.add(false);
//
//        String myval = (String) myList.get(0);
//        Integer myval2 = (Integer) myList.get(1);
//
//        System.out.println(myval + myval2);

// ------------------------------------------------------------------------------------------------

//        Container<Integer, String> container = new Container<>(30, "Sami");
//        int val1 = container.getItem1();
//        String val2 = container.getItem2();
//
//        Set<String> myset1 = new HashSet<>();
//        myset1.add("first");
//        myset1.add("second");
//        myset1.add("sing");
//
//        Set<String> myset2 = new HashSet<>();
//        myset2.add("first");
//        myset2.add("second");
//        myset2.add("dance");
//
//        Set<String> resultSet = union(myset1, myset2);
//
//        Iterator<String> itr = resultSet.iterator();
//        while(itr.hasNext()) {
//            String var = itr.next();
//            System.out.println(var);
//        }
//
//    }

// ------------------------------------------------------------------------------------------------

//    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
//        Set<E> result = new HashSet<E>(set1);
//        result.addAll(set2);
//        return result;

//        Employee emp = new Employee();
//        Accountant acc = new Accountant();
//        emp = acc;
//
//        ArrayList<Employee> employees = new ArrayList<Employee>();
//        ArrayList<Accountant> accountants = new ArrayList<Accountant>();
//        employees = accountants;
//
//        ArrayList<?> employees2 = new ArrayList<Employee>();
//        ArrayList<Accountant> accountants2 = new ArrayList<Accountant>();
//        employees2 = accountants2;
//
//
//        ArrayList<?> employees3 = new ArrayList<Employee>();
//        ArrayList<String> accountants3 = new ArrayList<String>();
//        employees3 = accountants3;
//
//
//        // Upper bound
//        ArrayList<? extends Employee> employees4 = new ArrayList<>();
//        ArrayList<Accountant> accountants4 = new ArrayList<Accountant>();
//        employees4 = accountants4;
//
//
//        // Lower bound
//        ArrayList<? super Employee> employees5 = new ArrayList<>();
//        ArrayList<Object> accountants5 = new ArrayList<Object>();
//        employees5 = accountants5;

// ------------------------------------------------------------------------------------------------

//        List<Integer> questionsList = new ArrayList<>();
//
//        Thread t1 = new Thread(new Producer(questionsList));
//        Thread t2 = new Thread(new Consumer(questionsList));
//
//        t1.start();
//        t2.start();

// ------------------------------------------------------------------------------------------------

//        ExecutorService executor = Executors.newFixedThreadPool(2);
//
//        Runnable processor1 = new MessageProcessor(2);
//        executor.execute(processor1);
//
//        Runnable processor2 = new MessageProcessor(3);
//        executor.execute(processor2);
//
//        Runnable processor3 = new MessageProcessor(4);
//        executor.execute(processor3);
//
//        Runnable processor4 = new MessageProcessor(5);
//        executor.execute(processor4);
//
//        executor.shutdown(); // reject any new tasks from being submitted. gracefully shuts down the service
//
//        while (!executor.isTerminated()) {
//
//        }
//
//        System.out.println("submitted all tasks...");

// ------------------------------------------------------------------------------------------------

//        String url = "jdbc:mysql://localhost:3306/employees_database";
//
//        int rowsAffected = 0;
//        try {
//            // establish a connection object
//            Connection connection = DriverManager.getConnection(url, "root", "password");
//
//            // create a statement object to send it to the database
//            Statement statement = connection.createStatement();
//
//            // execute the statement's object
//            rowsAffected = statement.executeUpdate("INSERT INTO employee_tbl(name,dept,salary)" +
//                    "VALUES('Roberto','Sport','500000')");
//
//
//            // process the result
//            System.out.println("Executed on Insert query - Affected Rows: " + rowsAffected);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

                      /*
                      LAMBDA PRACTICE
                      */

//        Human1 ishido = new Human1();
//        //walker(ishido);
//
//        Robot tars = new Robot();
//        //walker(tars);
//
//        walker(() -> System.out.println("... is walking"));
//
//        Walkable walki = () -> {
//            System.out.println("... is walking");
//            System.out.println("... is trying to stop");
//
//        };
//
//        ALambdaInterface anotherTest = () -> {
//            System.out.println("So the type of the Lambda expression must be a functional interface " +
//                    "which means an interface with just one abstract method");
//        };
//        public static void walker(Walkable walkableEntity) {
//            walkableEntity.walk();
//
//        }
//
//        walker(walki);
//        anotherTest.justSomeMethod();

        Calculator cal = (one, two) ->  one + two; {
            System.out.println(cal.calculate(2,2));
        }

        Calculator nonZeroDivision = (num1, num2) -> {
            NonZeroDivision calculator = new NonZeroDivision();

            try {
                return String.valueOf(calculator.nunZeros(num1, num2));
            }catch (ArithmeticException e) {
                return "Error: " + e.getMessage();
            }
        };

        System.out.println(nonZeroDivision.calculate(4,4));

    }

}
























