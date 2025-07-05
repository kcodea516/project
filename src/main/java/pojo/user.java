package pojo;
import java.time.LocalDateTime;
public class user {
    private int id;
    private String name;
    private int account;
    private String password;
    private String role;
    private String email;
    private boolean isonline;
    private boolean isremark;
    private LocalDateTime  createtime;

    public user(int id, String name, int account, String password, String role, String email, boolean isonline, boolean isremark, LocalDateTime createtime) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.password = password;
        this.role = role;
        this.email = email;
        this.isonline = isonline;
        this.isremark = isremark;
        this.createtime = createtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsonline() {
        return isonline;
    }

    public void setIsonline(boolean isonline) {
        this.isonline = isonline;
    }

    public boolean isIsremark() {
        return isremark;
    }

    public void setIsremark(boolean isremark) {
        this.isremark = isremark;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", isonline=" + isonline +
                ", isremark=" + isremark +
                ", createtime=" + createtime +
                '}';
    }
}
