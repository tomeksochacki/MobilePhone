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
        System.out.println();
        phone.getVairableEven(3, 8);
        phone.ifDivived(4,18);
        phone.getEvenSum(5, 9);
        phone.numbersDecreasing(5,-2);

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
    }else if (this.price <= 200){
        System.out.println("This price is very good");
    }else if (this.price >=350){
        System.out.println("This price could be lower");
    }else {
        System.out.println("This is difrent");
    }
}

public void getVairableEven(int min, int max){

    for (int i = min; i <=max; i++){
        if(i%2 == 0)
        System.out.println(i);
        }
    }

    public void ifDivived(int min, int max){
    int sum = 0;
        for (int i = min; i<=max; i++){
            if (i%3 == 0 || i%5==0){
                System.out.println("Nambers divived by 3 || 5 are: " + i );

                boolean info = i%3 == 0 || i%5 == 0;
                System.out.println(info);

            }
        }
    }

    public void getEvenSum(int min, int max){
    int sum = 0;
    for (int i = min; i<=max; i++){
        if (i%2 == 0){
        sum = sum + i;
        }

    }
        System.out.println("Sum is: " + sum);
    }

    public void numbersDecreasing(int max, int min){
    for (int i = max; i>= min; i--){
        System.out.print(i);
    }
    }






}


