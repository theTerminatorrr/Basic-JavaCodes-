//Lab Class Task 01...

class Student
    {
        String name;
        int age;
        String grade;

        public void printDetails()
        {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }
    }

    class Classroom
    {
        public static void main(String[] args)
        {
            Student student = new Student();
            student.name = "Alice Johnson";
            student.age = 15;
            student.grade = "10th grade";

            student.printDetails();
        }
    }

    class Book
    {
        String title;
        String author;

        public void printDetails()
        {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    class Library
    {
        public static void main(String[] args)
        {
            Book book = new Book();
            book.title = "To Kill a Mockingbird";
            book.author = "Harper Lee";

            book.printDetails();
        }
    }
