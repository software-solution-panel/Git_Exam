package lk.ijse.exam.git_exam.model;

/**
 * @author Chathumal Jayasingha | [chathumaljayasingha@hotmail.com]
 * @since - 10/9/21 | 2021-October-09[Saturday]
 */
public class Item {
    private String code;
    private String name;
    private int qty;
    private double unitPrice;

    public Item(){

    }
    public Item(String code,String name,int qty,double unitPrice){
        this.code=code;
        this.name=name;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
