package com.chryl.po;

/**
 * Created by Chr.yl on 2020/4/17.
 *
 * @author Chr.yl
 */
public class PmsBrand {
    private Long id;
    private String name;
    private Integer showStatus;

    public PmsBrand() {
    }

    public PmsBrand(Long id, String name, Integer showStatus) {
        this.id = id;
        this.name = name;
        this.showStatus = showStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Override
    public String toString() {
        return "PmsBrand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", showStatus=" + showStatus +
                '}';
    }
}
