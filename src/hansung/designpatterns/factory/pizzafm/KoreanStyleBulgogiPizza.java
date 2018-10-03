package hansung.designpatterns.factory.pizzafm;

public class KoreanStyleBulgogiPizza extends Pizza {

    public KoreanStyleBulgogiPizza() {
        name = "Korea Style Bulgogi Pizza";
        dough = "Thin Crust Dough";
        sauce = "Soy Sauce";

        toppings.add("Mozzarella Cheese");  // 불고기와 치즈는 의외로 잘 어울린다!
        toppings.add("Bulgogi meat");   // 메인 재료 불고기
        toppings.add("Garlic");     // 한국인의 마늘 사랑
        toppings.add("Onion");      // 양파도 빼놓을 수 없다.
        toppings.add("Mushrooms");  // 버섯이랑 불고기는 잘 어울린다.
        toppings.add("Red Pepper");     // 고추는 빼놓을 수 없다.
        toppings.add("Spinach");        // 시금치도 피자에 의외로 잘 올라가는 재료
    }
}
