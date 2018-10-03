package hansung.designpatterns.factory.pizzafm;

public class KoreanPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new KoreanStyleCheesePizza();
        }
        else if (item.equals("veggie")) {
            return new KoreanStyleVeggiePizza();
        }
        else if (item.equals("clam")) {
            return new KoreanStyleClamPizza();
        }
        else if (item.equals("pepperoni")) {
            return new KoreanStylePepperoniPizza();
        }
        else if(item.equals("bulgogi")) {
            return new KoreanStyleBulgogiPizza();
        }
        else if(item.equals("ricecake")) {
            return new KoreanStyleRiceCakePizza();
        }
        else return null;
    }
}
