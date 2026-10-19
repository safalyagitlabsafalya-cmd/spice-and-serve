package com.spiceandserve;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MenuController {
 record Food(String name,String category,String description,int price,String emoji,String tag) {}
 private final List<Food> menu=List.of(
 new Food("Classic Veg Burger","Burgers","Crispy patty, lettuce and house sauce",99,"🍔","BESTSELLER"),
 new Food("Cheese Burger","Burgers","Melty cheese with a toasted bun",129,"🍔","CHEESY"),
 new Food("Crispy Chicken Burger","Burgers","Crunchy patty and creamy mayo",159,"🍔","POPULAR"),
 new Food("Margherita Pizza","Pizza","Tomato, mozzarella and basil",179,"🍕","CLASSIC"),
 new Food("Farmhouse Pizza","Pizza","Garden vegetables and extra cheese",249,"🍕","FAVOURITE"),
 new Food("Paneer Tikka Pizza","Pizza","Tandoori paneer with smoky spices",269,"🍕","SPICY"),
 new Food("French Fries","Snacks","Golden, crunchy and salted",89,"🍟","CRUNCHY"),
 new Food("Peri Peri Fries","Snacks","Fries with zesty peri-peri spice",109,"🍟","SPICY"),
 new Food("Paneer Sandwich","Snacks","Grilled sandwich with paneer filling",119,"🥪","FRESH"),
 new Food("Veg Momos","Snacks","Steamed dumplings with red chutney",99,"🥟","HOT"),
 new Food("Veg Biryani","Indian","Aromatic rice, vegetables and herbs",179,"🍛","AROMATIC"),
 new Food("Paneer Butter Masala","Indian","Paneer in rich tomato-butter gravy",229,"🍲","CREAMY"),
 new Food("Masala Dosa","Indian","Crispy dosa with potato masala",129,"🥞","SOUTH INDIAN"),
 new Food("Chole Bhature","Indian","Spiced chickpeas with fluffy bhature",159,"🫓","FILLING"),
 new Food("Hakka Noodles","Indian","Wok-tossed noodles with crunchy veggies",149,"🍜","WOK TOSSED"),
 new Food("Veg Manchurian","Indian","Veggie balls in Indo-Chinese sauce",159,"🥡","TANGY"),
 new Food("Cold Coffee","Drinks","Chilled coffee with a creamy finish",99,"🥤","CHILLED"),
 new Food("Mango Milkshake","Drinks","Sweet mango blended till smooth",119,"🥭","SEASONAL"),
 new Food("Fresh Lime Soda","Drinks","Refreshing lime with fizzy soda",69,"🍋","REFRESHING"),
 new Food("Chocolate Brownie","Desserts","Warm chocolate-rich brownie",99,"🍫","CHOCOLATE"),
 new Food("Gulab Jamun","Desserts","Soft dumplings in cardamom syrup",69,"🍮","SWEET"),
 new Food("Vanilla Ice Cream","Desserts","Classic smooth vanilla scoops",79,"🍨","COOL TREAT"));
 @GetMapping("/") public String home(Model model) {
 model.addAttribute("foods",menu); model.addAttribute("categories",List.of("All","Burgers","Pizza","Snacks","Indian","Drinks","Desserts")); return "index";
 }
}