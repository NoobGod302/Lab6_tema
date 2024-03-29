class Animal {

    public void eat() {
        System.out.println("Animal is eating something.");
    }


    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}


class Lion extends Animal {

    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }


    @Override
    public void sound() {
        System.out.println("Lion roars!");
    }
}


class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("Tiger eats meat and sometimes fish.");
    }


    @Override
    public void sound() {
        System.out.println("Tiger growls!");
    }
}


class Panther extends Animal {

    @Override
    public void eat() {
        System.out.println("Panther eats meat and can climb trees.");
    }


    @Override
    public void sound() {
        System.out.println("Panther makes a unique sound: Ionut is the best teacher");
    }
}

