public class Cook extends Employee {

    public Cook(String name, int skillLevel) {
        super(name, "Cook", skillLevel);
    }

    // Specific skill for cooking
    public void cookFood(Food food) {
        System.out.println(name + " is cooking " + food.getName());
        try {
            Thread.sleep(food.getCookingTime() * 1000 / skillLevel); // faster cooks cook faster
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(food.getName() + " is ready.");
    }
}
