package cn.youxi;

/**
 * 装备
 */
public class Equip {
    private String name;    //装备名称
    private String type;    //装备类型，头盔、铠甲等
    private Long speedPlus;  //速度增效
    private Long attackPlus;  //攻击增效
    private Long defencePlus;  //防御增效
    private String oldName;

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSpeedPlus() {
        return speedPlus;
    }

    public void setSpeedPlus(Long speedPlus) {
        this.speedPlus = speedPlus;
    }

    public Long getAttackPlus() {
        return attackPlus;
    }

    public void setAttackPlus(Long attackPlus) {
        this.attackPlus = attackPlus;
    }

    public Long getDefencePlus() {
        return defencePlus;
    }

    public void setDefencePlus(Long defencePlus) {
        this.defencePlus = defencePlus;
    }
}
