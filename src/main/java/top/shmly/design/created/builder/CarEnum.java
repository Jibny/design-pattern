package top.shmly.design.created.builder;

import lombok.Data;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/7 17:48
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public enum CarEnum {
    START("开始", 1),
    STOP("停止", 2),
    ALARM("喇叭", 3),
    ENGINEBOOM("引擎", 4);

    private String desc;
    private Integer code;

    CarEnum(String desc, Integer code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
