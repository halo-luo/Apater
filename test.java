package Apater;

import prototype.Apple;
import prototype.Banana;
import prototype.MyFruit;
import prototype.MyFruitStore;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        NewJuicer newJuicer=new Apater();
        MyFruit fr1=new Apple();
        MyFruit fr2=new Banana();
        MyFruitStore mfs=new MyFruitStore();
        mfs.Add(1,fr1);
        mfs.Add(2,fr2);
        mfs.Add(3,new Apple());
        mfs.Add(4,new Banana());

        System.out.println(newJuicer.newPort(mfs.Get(1),mfs.Get(2)));
    }
}
