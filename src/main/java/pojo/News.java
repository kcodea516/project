package pojo;
import java.time.LocalDateTime;
public class News {
    private int id;
    private String name;
    private String content;
    private int tag_id;
    private String cover;
    /*
    * 阅读Id列表，用，分割*/
    private String readers_ids;
    private boolean is_top;
    private LocalDateTime createtime;

    public News(int id, String name, String content, int tag_id, String cover, String readers_ids, boolean is_top, LocalDateTime createtime) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.tag_id = tag_id;
        this.cover = cover;
        this.readers_ids = readers_ids;
        this.is_top = is_top;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getReaders_ids() {
        return readers_ids;
    }

    public void setReaders_ids(String readers_ids) {
        this.readers_ids = readers_ids;
    }

    public boolean isIs_top() {
        return is_top;
    }

    public void setIs_top(boolean is_top) {
        this.is_top = is_top;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", tag_id=" + tag_id +
                ", cover='" + cover + '\'' +
                ", readers_ids='" + readers_ids + '\'' +
                ", is_top=" + is_top +
                ", createtime=" + createtime +
                '}';
    }
}
