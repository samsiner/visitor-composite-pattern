package client;

import component.CollegeComponent;
import component.Department;
import component.Faculty;
import element.BadKid;
import element.GoodKid;
import element.Kid;
import visitor.EasterBunny;
import visitor.SantaClaus;
import visitor.Visitor;

public class Client {
    public static void main(String[] args) {

        //Visitor Pattern
        System.out.println("VISITOR PATTERN\n");

        Visitor easterBunny = new EasterBunny();
        Visitor santaClaus = new SantaClaus();
        GoodKid goodKid = new GoodKid("Sam");
        BadKid badKid = new BadKid("Tyler");

        System.out.println(goodKid.getName() + " is a good kid and " + badKid.getName() + " is a bad kid.");

        //Easter Bunny visits the good kid and the bad kid
        System.out.println("\n" + easterBunny.getName() + " visits " + goodKid.getName() + "!");

        goodKid.accept(easterBunny);
        badKid.accept(easterBunny);

        if (goodKid.hasPresent()) System.out.println(goodKid.getName() + " gets a present: " + goodKid.getPresentDescription() + ".");
        else System.out.println(goodKid.getName() + " doesn't get a present. Instead, " + goodKid.getName() + " gets " + goodKid.getPresentDescription() + ".");

        if (badKid.hasPresent()) System.out.println(badKid.getName() + " gets a present: " + badKid.getPresentDescription() + ".");
        else System.out.println(badKid.getName() + " doesn't get a present. Instead, " + badKid.getName() + " gets " + badKid.getPresentDescription() + ".");

        //Santa Claus visits the good kid and the bad kid
        System.out.println("\n" + santaClaus.getName() + " visits " + goodKid.getName() + "!");

        goodKid.accept(santaClaus);
        badKid.accept(santaClaus);

        if (goodKid.hasPresent()) System.out.println(goodKid.getName() + " gets a present: " + goodKid.getPresentDescription() + ".");
        else System.out.println(goodKid.getName() + " doesn't get a present. Instead, " + goodKid.getName() + " gets " + goodKid.getPresentDescription() + ".");

        if (badKid.hasPresent()) System.out.println(badKid.getName() + " gets a present: " + badKid.getPresentDescription() + ".");
        else System.out.println(badKid.getName() + " doesn't get a present. Instead, " + badKid.getName() + " gets " + badKid.getPresentDescription() + ".");

        System.out.println("\n-------------\n");

        //Composite Pattern
        System.out.println("COMPOSITE PATTERN\n");

        Department csDepartment = new Department("Computer Science");
        System.out.println("The " + csDepartment.getName() + " Department exists at Loyola.");

        CollegeComponent drLaufer = new Faculty("Dr. Laufer");
        System.out.println(drLaufer.getName() + " is now a faculty member at Loyola.");

        csDepartment.addCollegeComponent(drLaufer);
        System.out.println(csDepartment.getCollegeComponents().get(0).getName() + " has been added as faculty for the " + csDepartment.getName() + " Department at Loyola.\n");

        Department seDepartment = new Department("Software Engineering");
        csDepartment.addCollegeComponent(csDepartment);
        System.out.println("The " + seDepartment.getName() + " Department is now part of the " + csDepartment.getName() + " Department.");

        CollegeComponent drZewdie = new Faculty("Dr. Zewdie");
        System.out.println(drZewdie.getName() + " is now a faculty member at Loyola.");

        seDepartment.addCollegeComponent(drZewdie);
        System.out.println(seDepartment.getCollegeComponents().get(0).getName() + " has been added as faculty for the " + seDepartment.getName() + " Department at Loyola.");
    }
}
