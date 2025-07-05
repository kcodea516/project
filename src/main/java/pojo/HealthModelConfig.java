package pojo;

public class HealthModelConfig {
    private int id;
    private int userid;
    private String name;
    private String detail;
    private String cover;
    private String unit;
    private String symbol;
    private String valueRange;//范围(10,20)

    public HealthModelConfig(int id, int userid, String name, String detail, String cover, String unit, String symbol, String valueRange) {
        this.id = id;
        this.userid = userid;
        this.name = name;
        this.detail = detail;
        this.cover = cover;
        this.unit = unit;
        this.symbol = symbol;
        this.valueRange = valueRange;
    }

    public int getId() {
        return id;
    }

    public int getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public String getCover() {
        return cover;
    }

    public String getUnit() {
        return unit;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getValueRange() {
        return valueRange;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    @Override
    public String toString() {
        return "HealthModelConfig{" +
                "id=" + id +
                ", userid=" + userid +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", cover='" + cover + '\'' +
                ", unit='" + unit + '\'' +
                ", symbol='" + symbol + '\'' +
                ", valueRange='" + valueRange + '\'' +
                '}';
    }
}

