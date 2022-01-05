package cg.park.designpattern.observer;

public class PreOrder {

    public static void main(String[] args) {
        PreorderData preorderData = new PreorderData();

        MeatShop meatShop           = new MeatShop(preorderData);
        FruitShop fruitShop         = new FruitShop(preorderData);
        VegetableShop vegetableShop = new VegetableShop(preorderData);
        FoodShop foodShop           = new FoodShop(preorderData);

        preorderData.setFoodMaterials(10, 20, 30);//오픈 시 재고
        preorderData.setFoodMaterials(5, 20, 30);//고기 5개 판매

        preorderData.removeObserver(vegetableShop);//야채가게는 별도로 창고를 구입하여 이제 연락받지 않음.

        preorderData.setFoodMaterials(5, 10, 30);//과일 10개 판매
    }
}
