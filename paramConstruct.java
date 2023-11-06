
public class paramConstruct {
        private String name;
        private int age;
    
        // Parameterized constructor
        public paramConstruct(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        // Getter methods
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        public static void main(String[] args) {
            // Create an instance of the Person class using the parameterized constructor
            paramConstruct person1 = new paramConstruct("Harshit", 20);
    
            // Access the object's properties using getter methods
            String personName = person1.getName();
            int personAge = person1.getAge();
    
            // Display the information
            System.out.println("Name: " + personName);
            System.out.println("Age: " + personAge);
        }
    }