package itproject;


public class user {
    private String first_name;
    private double money;
    private int id; 
    private String Email;
    private String password;
    private String BirthDay;


    public user(String first_name, String Email, String password,double money ,String BirthDay) {
        this.first_name = first_name;
        this.Email = Email;
        this.password = password;
        this.money=money;
        this.BirthDay=BirthDay;
    }

  
    public String getPassword() {
        return password;
    }
        
    public user(String first_name, String second_name, double money, int id, String Email,String BirthDay) {
        this.first_name = first_name;
        this.money = money;
        this.id = id;
        this.Email = Email;
        this.BirthDay=BirthDay;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    
    
    }
}