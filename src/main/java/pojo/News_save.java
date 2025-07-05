package pojo;

import java.time.LocalDateTime;

public class News_save {
    private int id;
    private int user_id;
    private int news_id;
    private LocalDateTime createtime;

    public News_save(int id, int user_id, int news_id, LocalDateTime createtime) {
        this.id = id;
        this.user_id = user_id;
        this.news_id = news_id;
        this.createtime = createtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "News_save{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", news_id=" + news_id +
                ", createtime=" + createtime +
                '}';
    }
}
