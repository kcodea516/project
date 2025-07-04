package pojo;

public class Login {
    private int id;
    private String username;
    private String password;

    public Login(String username,String password,String college,String department){
        this.username=username;
        this.password=password;

    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public int getId(){
        return this.id;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
}
