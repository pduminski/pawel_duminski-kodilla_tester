public class UserTest {
    public static void main(String[] args) {
        System.out.println("test");
        User u1 = new User("Pawel", 29);
        User u2 = new User("Ada", 30);
        User u3 = new User("Dorota", 18);
        User u4 = new User("Kamil", 55);
        User u5 = new User("Tomek", 84);

        User[] tableOfUsers = new User[]{u1, u2, u3, u4, u5};

        // sum of all User.age
        int helper = 0;
        for (int i = 0; i < 5; i++) {
            helper += tableOfUsers[i].age;
        }

        // count average
        int averageAge = helper / tableOfUsers.length;

        System.out.println("Average age of the user is: " + averageAge);

        System.out.println("Users with age below average: " + averageAge + ": ");
        for (int i = 0; i < 5; i++) {
            if (tableOfUsers[i].age < averageAge) {
                System.out.println(tableOfUsers[i].name);
            }
        }
    }
}
