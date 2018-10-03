package hansung.designpatterns.factory.pizzafm;

public class KoreanStyleRiceCakePizza extends Pizza {
    public KoreanStyleRiceCakePizza() {
        name = "Korea Style Ricecaks Pizza";
        dough = "Thin Crust Dough";
        sauce = "Soy Sauce";

        toppings.add("Rice Cakes");   // 메인 재료 떡
        toppings.add("Garlic");     // 한국인의 마늘 사랑
        toppings.add("Onion");      // 양파도 빼놓을 수 없다.
        toppings.add("Red Pepper");     // 고추는 빼놓을 수 없다.
        toppings.add("Spinach");        // 시금치도 피자에 의외로 잘 올라가는 재료
    }
}
