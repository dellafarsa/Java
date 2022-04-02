public class User {
    public String[] user = new String[3];

    User(String name, String family, int age){
        user[0] = name;
        user[1] = family;
        user[2] = String.valueOf(age);
    }

}
