package com.xiaozhengkeji.vipfly.entity;

public class PlayerFlyTimeEntity {
    private Integer onFly;
    private Integer cd;

    public PlayerFlyTimeEntity(Integer onFly, Integer cd) {
        this.onFly = onFly;
        this.cd = cd;
    }

    public Integer getOnFly() {
        return onFly;
    }

    public void setOnFly(Integer onFly) {
        this.onFly = onFly;
    }

    public Integer getCd() {
        return cd;
    }

    public void setCd(Integer cd) {
        this.cd = cd;
    }
}
