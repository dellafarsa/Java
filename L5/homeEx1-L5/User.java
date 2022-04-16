public class User {
    private String username;
    private String name;
    private String password;
    private int age;
    private String address;
    private String cell;
    private String degree;

    public User setUsername(String username){
        this.username = username;
        return this;
    }

    public User setName(String name){
        this.name = name;
        return this;
    }

    public User setPassword(String password){
        this.password = password;
        return this;
    }

    public User setAge(int age){
        this.age = age;
        return this;
    }

    public User setAddress(String address){
        this.address = address;
        return this;
    }

    public User setCell(String cell){
        this.cell = cell;
        return this;
    }

    public User setDegree(String degree){
        this.degree = degree;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getCell() {
        return cell;
    }

    public String getDegree() {
        return degree;
    }
}
