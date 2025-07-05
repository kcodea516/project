package pojo;

import java.time.LocalDateTime;
public class UserHealth {
    private int id;
    private int userid;
    private int health_model_config_id;
    private String value;
    private LocalDateTime createtime;

    public UserHealth(int id, int userid, int health_model_config_id, String value, LocalDateTime createtime) {
        this.id = id;
        this.userid = userid;
        this.health_model_config_id = health_model_config_id;
        this.value = value;
        this.createtime = createtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getHealth_model_config_id() {
        return health_model_config_id;
    }

    public void setHealth_model_config_id(int health_model_config_id) {
        this.health_model_config_id = health_model_config_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "UserHealth{" +
                "id=" + id +
                ", userid=" + userid +
                ", health_model_config_id=" + health_model_config_id +
                ", value='" + value + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
