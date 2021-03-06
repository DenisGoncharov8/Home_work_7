/*
1. Расширить задачу про котов и тарелки с едой.
5. Создать массив котов и тарелку с едой,
попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 */

public class Main
{
    public static void main(String[] args)
    {
        Cat[] cats = {
                new Cat(5, "Русская голубая кошка"),
                new Cat(7, "Персидская кошка"),
                new Cat(10, "Британец")
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }

        plate.increaseFood(50);

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }
    }
}
