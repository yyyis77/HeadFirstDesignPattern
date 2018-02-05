public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        AbstrackDuckFactory factory = new CountingDuckFactory();
        simulator.simulate(factory);
    }

    public void simulate(AbstrackDuckFactory factory){
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator with Composite - flocks");

        Flock flockOfDuck = new Flock();
        flockOfDuck.add(redheadDuck);
        flockOfDuck.add(duckCall);
        flockOfDuck.add(rubberDuck);
        flockOfDuck.add(goose);

        Flock flockOfMallard = new Flock();
        Quackable mallardDuck1 = factory.createMallardDuck();
        Quackable mallardDuck2 = factory.createMallardDuck();
        Quackable mallardDuck3 = factory.createMallardDuck();

        flockOfMallard.add(mallardDuck1);
        flockOfMallard.add(mallardDuck2);
        flockOfMallard.add(mallardDuck3);

        flockOfDuck.add(flockOfMallard);

//        System.out.println("\nDuck Simulator: Whole Flock Simulator");
//        simulate(flockOfDuck);
//        System.out.println("The ducks quacked "+ QuackCounter.getQuacks()+ " times");
//
//        System.out.println("\nDuck Simulator: Mallard Flock Simulator");
//        simulate(flockOfMallard);
//
        Quackologist quackologist = new Quackologist();
        flockOfDuck.registerObserver(quackologist);
        simulate(flockOfDuck);

        System.out.println("The ducks quacked "+ QuackCounter.getQuacks()+ " times");
    }

    /*
    public void simulate(AbstrackDuckFactory factory){
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator with Abstract Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("The ducks quacked "+ QuackCounter.getQuacks()+ " times");
    }
    */



    public void simulate(){
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RedheadDuck());
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("The ducks quacked "+ QuackCounter.getQuacks()+ " times");
    }

    public void simulate(Quackable duck){
        duck.quack();
    }
}
