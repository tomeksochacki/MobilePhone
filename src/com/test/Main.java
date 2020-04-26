package com.test;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("200g", 700);
        MobilePhone oldPhone = new MobilePhone("4000g", 100);
        MobilePhone mediumPhone = new MobilePhone("600g", 350);

        System.out.println("phone");
        System.out.println(phone.weight + " " + phone.price);
        phone.checkPrice();
        phone.displayValues();
        System.out.println(phone.getParamters());

        System.out.println();
        System.out.println("medium phone");
        System.out.println(mediumPhone.weight + " " + mediumPhone.price);
        mediumPhone.checkPrice();
        mediumPhone.displayValues();
        System.out.println(mediumPhone.getParamters());

        System.out.println();
        System.out.println("old phone");
        System.out.println(oldPhone.weight + " " + oldPhone.price);
        oldPhone.checkPrice();
        oldPhone.displayValues();
        System.out.println(phone.getParamters());
    }

}

class MobilePhone{
String weight;
Integer price;

public MobilePhone(String weight, Integer price){
    this.weight = weight;
    this.price = price;
}

public String getParamters(){
    return this.weight + " " + this.price;
}

public void displayValues(){
    System.out.println(this.weight + " " + this.price);
}
public Integer getPrice(){
    return price;
}
public Integer getReduction(Integer reduction){
    return price=price-reduction;
}
public Integer setReduction(Integer reduction){
    return reduction = price*reduction/100;
}
public void checkPrice(){
    if (this.price>550){
        System.out.println("This phone is very expensive");
    }else {
        System.out.println("This phone isn't expensive");
    }
}

}
