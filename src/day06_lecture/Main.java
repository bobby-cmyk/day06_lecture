package day06_lecture;

import java.util.List;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ParseException{

        /*
        MyImplementation my1 = new MyImplementation("Task 1");
        MyImplementation my2 = new MyImplementation("Task 2");
        MyImplementation my3 = new MyImplementation("Task 3");

        
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(my1);
        es.execute(my2);
        es.execute(my3);
        es.shutdown();
        

        ExecutorService es1 = Executors.newFixedThreadPool(2);
        es1.execute(my1);
        es1.execute(my2);
        es1.execute(my3);
        es1.shutdown();
        */
        /*
        List<Product> products = new ArrayList<>();

        products.add(
            new Product(12345, "Apple iPad", "Apple tablet", "computer")
        );

        products.add(
            new Product(12346, "Apple MacBook Pro", "Apple laptop", "computer")
        );

        products.add(
            new Product(12347, "Huawei 5", "Huawei phone", "mobile")
        );

        products.add(
            new Product(12348, "Apple iPhone 15", "Apple phone", "mobile")
        );

        products.add(
            new Product(12349, "Apple iPhone 15 Pro", "Apple phone", "mobile")
        );

        products.add(
            new Product(12350, "Samsung Galaxy S24", "Samsung phone", "mobile")
        );

        products.add(
            new Product(12351, "Samsung Galaxy S23", "Samsung phone", "accessory")
        );

        products.add(
            new Product(12352, "Apple Magic Keyboard", "Apple keyboard", "accessory")
        );
        // Lamda Expression
        // products.forEach(e -> System.out.printf("\n %s \n",e));
        
        // Reference method
        // products.forEach(Product::toString);

        // Only retrieve products with 'category' mobile
        List<Product> mobileProducts = new ArrayList<>();
        mobileProducts = products.stream()
            // Predicate is pretty much your lamba function
            .filter(product -> product.getCategory().equals("mobile"))
            .collect(Collectors.toList());

        mobileProducts.forEach(mobileProduct -> System.out.printf("\n%s\n", mobileProduct));
        

        List<Person> persons = new ArrayList<>();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
        Person person1 = new Person(12345, "Aiken", "Chan", 100000, formatter.parse("18/08/1999"));
        Person person2 = new Person(12346, "Aaron", "Ang", 100000, formatter.parse("18/08/1999"));
        Person person3 = new Person(12347, "Zachary", "Ang", 100000, formatter.parse("18/08/1999"));
        Person person4 = new Person(12348, "Bob", "Lee", 100000, formatter.parse("18/08/1999"));
        Person person5 = new Person(12349, "Eddy", "Tong", 100000, formatter.parse("18/08/1999"));
        Person person6 = new Person(12350, "Zachary", "Tan", 100000, formatter.parse("18/08/1999"));

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);

        Comparator<Person> compare = Comparator.comparing(p -> p.getFirstName());

        persons.sort(compare.reversed());
        persons.forEach(p -> System.out.println(p));

        Comparator<Person> compareMultiple = Comparator.comparing((Person p) -> p.getFirstName()).thenComparing((Person p) -> p.getLastName()); 

        persons.sort(compareMultiple);
        persons.forEach(p -> System.out.println(p));

        */
        
        MyInterface<Integer> addOperation = (a, b) -> {
            return a + b;
        };

        MyInterface<Integer> multiplyOperation = (a, b) -> {
            return a * b;
        };

        System.out.println("add Operation: " + addOperation.process(3, 2));
        System.out.println("multiply Operation: " + multiplyOperation.process(3, 2));
        // Recap Comparators
        // Recap Functional Interfaces
    }
}