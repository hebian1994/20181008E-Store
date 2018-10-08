package ldj.pojo;

public class Goods {
    private int id;
    private int bigId;
    private int smallId;
    private String goodsName;
    private String goddsFrom;
    private String introduce;
    private String createTime;
    private String originalPrice;
    private String currentPrice;
    private String number;
    private String picture;
    private String discount;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", bigId=" + bigId +
                ", smallId=" + smallId +
                ", goodsName='" + goodsName + '\'' +
                ", goddsFrom='" + goddsFrom + '\'' +
                ", introduce='" + introduce + '\'' +
                ", createTime='" + createTime + '\'' +
                ", originalPrice='" + originalPrice + '\'' +
                ", currentPrice='" + currentPrice + '\'' +
                ", number='" + number + '\'' +
                ", picture='" + picture + '\'' +
                ", discount='" + discount + '\'' +
                '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBigId() {
        return bigId;
    }

    public void setBigId(int bigId) {
        this.bigId = bigId;
    }

    public int getSmallId() {
        return smallId;
    }

    public void setSmallId(int smallId) {
        this.smallId = smallId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoddsFrom() {
        return goddsFrom;
    }

    public void setGoddsFrom(String goddsFrom) {
        this.goddsFrom = goddsFrom;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }


}
