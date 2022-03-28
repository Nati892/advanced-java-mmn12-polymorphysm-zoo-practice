import java.util.ArrayList;
import java.util.Random;

public class Zoo {

    private static Random random_generator = new Random();
    private static ArrayList<Animal> petting_zoo;
    private static final int PETTING_ZOO_SIZE = 30;
    private static final int ANIMAL_MAX_AGE = 10;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        petting_zoo = new ArrayList<Animal>();
        populate_zoo(petting_zoo);
        // animalsFeed();
        // animalsSleep();

        animalsMakeSound(petting_zoo);
        animalsMoveAround(petting_zoo);
        animalsEat(petting_zoo);
        animalsSleep(petting_zoo);

        System.out.println("now showing that the equals and clone methods work\n\n\n");

        // Setting a dog with an owner to show cloning works properly
        Dog baki = new Dog("Baki", 5, "Brown", "baki's owner", "035552626");

        Dog baki_clone = (Dog) baki.clone();

        System.out.println("the original dog equals the clone is: " + baki.equals(baki_clone));

        baki_clone.set_name("baki clone");
        baki_clone.getOwner().set_name("other owner");
        baki_clone.getOwner().setPhone_number("039795304");

        System.out.println("The original dog: " + baki.toString());
        System.out.println("The cloned dog: " + baki_clone.toString());

    }

    /**
     * populates a given array list with Animal type Objects with random values
     *
     * @param petting_zoo the arrayList to populate
     */
    public static void populate_zoo(ArrayList<Animal> petting_zoo) {
        System.out.println("Populating petting zoo with animals");
        String names[] = {"clara", "cleopatra", "tzachi", "nimrod", "avner", "pika"};//pool of names
        String colors[] = {"Red", "Brown", "White", "Black", "Blue", "Green"};//pool of colors
        for (int i = 0; i < PETTING_ZOO_SIZE; i++)// populate the with Cats
        {
            // pick new attributes for animal in random
            String new_name = names[random_generator.nextInt(names.length)];
            int new_age = random_generator.nextInt(ANIMAL_MAX_AGE);
            String new_color = colors[random_generator.nextInt(colors.length)];

            // make the add the new animal to zoo
            switch (i % 6) {// could have done this randomly but its just an unnecessary complication
                case 0:
                    petting_zoo.add(new Dog(new_name, new_age, new_color));
                    break;
                case 1:
                    petting_zoo.add(new Cat(new_name, new_age, new_color));
                    break;
                case 2:
                    petting_zoo.add(new Parrot(new_name, new_age, new_color));
                    break;
                case 3:
                    petting_zoo.add(new Pigeon(new_name, new_age, new_color));
                    break;
                case 4:
                    petting_zoo.add(new Turtle(new_name, new_age, new_color));
                    break;
                case 5:
                    petting_zoo.add(new Snake(new_name, new_age, new_color));
                    break;

                default:
                    break;
            }

        }

    }

    /**
     * activates each animal's individual sound-making function in the given arrayList<Animal>
     *
     * @param zoo arraylist populated with Animal objects
     */
    private static void animalsMakeSound(ArrayList<Animal> zoo) {
        System.out.println("\nLetting the animals make some noise\n");
        for (Animal temp : zoo)// populate the with Cats
        {
            if (temp instanceof Mammal) {
                ((Mammal) temp).roar();
            } else if (temp instanceof Reptile) {
                ((Reptile) temp).hiss();
            } else if (temp instanceof Bird) {
                ((Bird) temp).tweet();
            }

        }
    }

    /**
     * activates each animal's individual moving function in the given arrayList<Animal>
     *
     * @param zoo arraylist populated with Animal objects
     */
    private static void animalsMoveAround(ArrayList<Animal> zoo) {
        System.out.println("\nLetting the animals move around for a bit\n");
        for (Animal temp : zoo)// populate the with Cats
        {
            if (temp instanceof Mammal) {
                ((Mammal) temp).walk();
            } else if (temp instanceof Reptile) {
                ((Reptile) temp).crawl();
            } else if (temp instanceof Bird) {
                ((Bird) temp).fly();
            }

        }
    }

    /**
     * activates each animal's individual eating function in the given arrayList<Animal>
     *
     * @param zoo arraylist populated with Animal objects
     */
    private static void animalsEat(ArrayList<Animal> zoo) {
        System.out.println("\nFeeding the animals\n");
        for (Animal temp : zoo)// populate the with Cats
        {
            if (temp instanceof Mammal) {
                ((Mammal) temp).eat();
            } else if (temp instanceof Reptile) {
                ((Reptile) temp).eat();
            } else if (temp instanceof Bird) {
                ((Bird) temp).eat();
            }

        }
    }

    /**
     * activates each animal's individual sleeping function in the given arrayList<Animal>
     *
     * @param zoo arraylist populated with Animal objects
     */
    private static void animalsSleep(ArrayList<Animal> zoo) {
        System.out.println("\nIts the animals bed time\n");
        for (Animal temp : zoo)// populate the with Cats
        {
            if (temp instanceof Mammal) {
                ((Mammal) temp).sleep();
            } else if (temp instanceof Reptile) {
                ((Reptile) temp).sleep();
            } else if (temp instanceof Bird) {
                ((Bird) temp).sleep();
            }

        }
    }

}
