package hansung.designpatterns.factory.pizzafm;

public class DependentPizzaStore {
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		}
		else if(style.equals("Korean")){		// 새로 추가된 한국 스타일 피자들
			if(type.equals("cheese")) {
				pizza = new KoreanStyleCheesePizza();
			}
			else if (type.equals("veggie")) {
				pizza = new KoreanStyleVeggiePizza();
			}
			else if (type.equals("clam")) {
				pizza = new KoreanStyleClamPizza();
			}
			else if (type.equals("pepperoni")) {
				pizza = new KoreanStylePepperoniPizza();
			}
			else if (type.equals("bulgogi")) {
				pizza = new KoreanStyleBulgogiPizza();
			}
			else if (type.equals("ricecake")) {
				pizza = new KoreanStyleRiceCakePizza();
			}
		}
		else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		}
		else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
