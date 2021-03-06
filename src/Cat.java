public class Cat
{
    /*
    3. Каждому коту нужно добавить поле сытость
    (когда создаем котов, они голодны).
    Если коту удалось покушать (хватило еды),
    сытость = true.
     */

    private boolean isFull;
    private int appetite;
    private String name;

    public Cat(int appetite, String name)
    {
        isFull = false;
        this.appetite = appetite;
        this.name = name;
    }

    /*
    4. Считаем, что если коту мало еды в тарелке,
    то он её просто не трогает,
    то есть не может быть наполовину сыт
    (это сделано для упрощения логики программы).
     */

    public void eat(Plate plate)
    {
        if (plate.hasEnoughFoodFor(appetite) && !isFull)
        {
            System.out.println(name + " кушает.");
            plate.decreaseFood(appetite);
            isFull = true;
        }
        else if (!plate.hasEnoughFoodFor(appetite))
        {
            System.out.println(name + " еда заканчивается!");
        }
        else if (isFull)
        {
            System.out.println("У " + name + " Сыт!");
        }
    }
}
