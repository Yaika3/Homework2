public class Main {
    public static void main(String[] args) {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper =paper - 7639;
        System.out.println(paper);

        //Домашнее задание - 2
        var friend = 19;
        System.out.println(friend);
        friend = friend - 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
         frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

       // Домашнее задание - 3
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = (boxerOne + boxerTwo);
        System.out.println("Общий вес двух бойцов = " + totalWeight);
        var weightDifference = (boxerTwo - boxerOne);
        System.out.println("Разница = " + weightDifference);
        var weightDifferenceTwo = (boxerTwo % boxerOne);
        System.out.println("Разница через остаток от деления = " + weightDifferenceTwo);
















    }
}