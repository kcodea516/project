package pojo;

import java.time.LocalDateTime;

public class Message {
    private int id;
    private String content;
    private int message_type;
    private int receiver_id;
    private int sender_id;
    private boolean is_reader;
    private int content_id;
    private LocalDateTime createtime;

    public Message(int id, String content, int message_type, int receiver_id, int sender_id, boolean is_reader, int content_id, LocalDateTime createtime) {
        this.id = id;
        this.content = content;
        this.message_type = message_type;
        this.receiver_id = receiver_id;
        this.sender_id = sender_id;
        this.is_reader = is_reader;
        this.content_id = content_id;
        this.createtime = createtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMessage_type() {
        return message_type;
    }

    public void setMessage_type(int message_type) {
        this.message_type = message_type;
    }

    public int getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(int receiver_id) {
        this.receiver_id = receiver_id;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public boolean isIs_reader() {
        return is_reader;
    }

    public void setIs_reader(boolean is_reader) {
        this.is_reader = is_reader;
    }

    public int getContent_id() {
        return content_id;
    }

    public void setContent_id(int content_id) {
        this.content_id = content_id;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", message_type=" + message_type +
                ", receiver_id=" + receiver_id +
                ", sender_id=" + sender_id +
                ", is_reader=" + is_reader +
                ", content_id=" + content_id +
                ", createtime=" + createtime +
                '}';
    }
}
