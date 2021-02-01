package ua.com.alevel.practic;

public class Packer {
    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        Box<Bakery> bakeryBox = new Box<>();
        Box<Pie> pieBox = new Box<>();

//        Box<String> stringBox = new Box<>();
//        Box<Object> objectBox = new Box<>();

        /*Some code to test*/
        Pie pie = new Pie();
        pieBox.put(pie);


        packer.repackage(pieBox,bakeryBox);
        packer.repackage(bakeryBox,foodBox);

        System.out.println("There is an object in the Box " + bakeryBox.get(0));
        System.out.println("There is an object in the Box " + foodBox.get(0));


    }

    public<T> void repackage(Box<?extends T> from, Box<?super T> to) {
        to.put(from.get(0));
    }

}

 class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get(int i) {
        return this.item;
    }


 }

class Goods {
}

class Food extends Goods{
}

class Bakery extends Food{
}

class Cake extends Bakery {
}

class Pie extends Bakery {
}

class Tart extends Bakery {
}

