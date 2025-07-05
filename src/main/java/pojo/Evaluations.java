package pojo;

import java.time.LocalDateTime;

public class Evaluations {
    private int id;
    private int parent_id;
    private int commenter_id;
    private String content_type;
    private int content_id;
    private String content;
    private int replier_id;
    private LocalDateTime createtime;

    public Evaluations(int id, int parent_id, int commenter_id, String content_type, int content_id, String content, int replier_id, LocalDateTime createtime) {
        this.id = id;
        this.parent_id = parent_id;
        this.commenter_id = commenter_id;
        this.content_type = content_type;
        this.content_id = content_id;
        this.content = content;
        this.replier_id = replier_id;
        this.createtime = createtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getCommenter_id() {
        return commenter_id;
    }

    public void setCommenter_id(int commenter_id) {
        this.commenter_id = commenter_id;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public int getContent_id() {
        return content_id;
    }

    public void setContent_id(int content_id) {
        this.content_id = content_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReplier_id() {
        return replier_id;
    }

    public void setReplier_id(int replier_id) {
        this.replier_id = replier_id;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Evaluations{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", commenter_id=" + commenter_id +
                ", content_type='" + content_type + '\'' +
                ", content_id=" + content_id +
                ", content='" + content + '\'' +
                ", replier_id=" + replier_id +
                ", createtime=" + createtime +
                '}';
    }
}
