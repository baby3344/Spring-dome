package cn.youxi;

/**
 * 玩家
 */
public class Player {
    private  Equip armet;    //头盔
    private Equip loricae;   //铠甲
    private Equip boot;      //靴子
    private Equip ring;      //指环

    public Equip getArmet() {
        return armet;
    }

    public void setArmet(Equip armet) {
        this.armet = armet;
    }

    public Equip getLoricae() {
        return loricae;
    }

    public void setLoricae(Equip loricae) {
        this.loricae = loricae;
    }

    public Equip getBoot() {
        return boot;
    }

    public void setBoot(Equip boot) {
        this.boot = boot;
    }

    public Equip getRing() {
        return ring;
    }

    public void setRing(Equip ring) {
        this.ring = ring;
    }

    public void UpdateEquip(Equip equip){
        if("头盔".equals(equip.getType())){
            System.out.println(armet.getName()+"升级为"+equip.getName());
            this.armet=equip;
        }

        if("铠甲".equals(equip.getType())){
            System.out.println(loricae.getName()+"升级为"+equip.getName());
            this.loricae=equip;
        }

        if("靴子".equals(equip.getType())){
            System.out.println(boot.getName()+"升级为"+equip.getName());
            this.boot=equip;
        }

        if("指环".equals(equip.getType())){
            System.out.println("指环"+"升级为"+equip.getName());
            this.ring=equip;
        }
    }
}
