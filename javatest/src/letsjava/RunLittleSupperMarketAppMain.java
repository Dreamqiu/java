package letsjava;

import letsjava.person.Customer;
import letsjava.supermarket.ListSuperMarket;
import letsjava.supermarket.Merchandise;

import java.util.Scanner;

public class RunLittleSupperMarketAppMain {
    public static void main(String[] args) {
        ListSuperMarket listSuperMarket = new ListSuperMarket();
        listSuperMarket.address = "大桥镇";
        listSuperMarket.superMarketName = "新冠超市";
        listSuperMarket.parkingCount = 200;
        listSuperMarket.merchandises = new Merchandise[200];
        listSuperMarket.merchandiseSold = new int[listSuperMarket.merchandises.length];

        Merchandise[] merchandises = listSuperMarket.merchandises;

        for (int i = 0; i<merchandises.length; i++){
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "ID"+i;
            m.name = "商品"+i;
            m.purchasPrice = Math.random() *200;
            m.soldPrice = (1+Math.random())*200;
            merchandises[i] = m;
        }

        System.out.println("超市开门了");

        boolean open = true;

        Scanner scanner = new Scanner(System.in);
        while (open){
            System.out.println("本店叫做"+listSuperMarket.superMarketName);
            System.out.println("本店地址"+listSuperMarket.address);
            System.out.println("共有停车位："+listSuperMarket.parkingCount);
            System.out.println("共有商品"+listSuperMarket.merchandises.length);

            Customer customer = new Customer();
            customer.name = "顾客编号"+ ((int) (Math.random()*1000));
            customer.money = (1+Math.random())*1000;
            customer.idDrivingCar = Math.random()>0.5;

            if (customer.idDrivingCar){
                if (listSuperMarket.parkingCount>0){
                    System.out.println("欢迎"+customer.name+";本店为您免费提供停车位");
                    listSuperMarket.parkingCount--;
                }else {
                    System.out.println("不好意思，停车已满，欢迎下次再来");
                }
            }

            double totalCost = 0;
            while (open){
                System.out.println("本店共有：" + listSuperMarket.merchandises.length + "种商品，欢迎选购，请输入商品编号");
                int index = scanner.nextInt();
                Merchandise m = merchandises[index];
                System.out.println("您选购的商品名字"+ m.name+"单价是"+m.soldPrice+"请问要购买几个");
                int numToBuy = scanner.nextInt();
                totalCost += numToBuy*m.soldPrice;
                m.count -= numToBuy;
                listSuperMarket.merchandiseSold[index] +=numToBuy;
                customer.money =  customer.money - totalCost;
                break;
            }

            if (customer.idDrivingCar){
                listSuperMarket.parkingCount++;
            }
            System.out.println("顾客"+ customer.name + "共消费了" + totalCost);


            listSuperMarket.incomingSum = totalCost;

            System.out.println("还需要继续营业吗？");
            open = scanner.nextBoolean();
        }

        System.out.println("超市关门了");
        System.out.println("今天超市营业额为："+listSuperMarket.incomingSum + "营业情况如下");

        for (int i=0;i<listSuperMarket.merchandiseSold.length;i++ ){
            Merchandise m = merchandises[i];
            int numSold = listSuperMarket.merchandiseSold[i];
            if (numSold > 0){
                double incomming =m.soldPrice * numSold;
                double netIncomming = (m.soldPrice - m.purchasPrice) * numSold;
                System.out.println(m.name + "售出了" + numSold + "个,销售额为" + incomming + "利润为："+ netIncomming);
            }
        }

    }
}
