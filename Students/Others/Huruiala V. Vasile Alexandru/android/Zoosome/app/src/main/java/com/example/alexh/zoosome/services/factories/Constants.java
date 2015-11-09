package com.example.alexh.zoosome.services.factories;

import com.example.alexh.zoosome.models.animals.Animal;
import com.example.alexh.zoosome.models.animals.Ballista;
import com.example.alexh.zoosome.models.animals.Bass;
import com.example.alexh.zoosome.models.animals.Bear;
import com.example.alexh.zoosome.models.animals.Beetle;
import com.example.alexh.zoosome.models.animals.Bird;
import com.example.alexh.zoosome.models.animals.Clownfish;
import com.example.alexh.zoosome.models.animals.Crocodile;
import com.example.alexh.zoosome.models.animals.Dove;
import com.example.alexh.zoosome.models.animals.Dragon;
import com.example.alexh.zoosome.models.animals.Dragonfly;
import com.example.alexh.zoosome.models.animals.Eagle;
import com.example.alexh.zoosome.models.animals.Hummingbird;
import com.example.alexh.zoosome.models.animals.Insect;
import com.example.alexh.zoosome.models.animals.Kangaroo;
import com.example.alexh.zoosome.models.animals.Lionfish;
import com.example.alexh.zoosome.models.animals.Lizard;
import com.example.alexh.zoosome.models.animals.Mammal;
import com.example.alexh.zoosome.models.animals.Mangonel;
import com.example.alexh.zoosome.models.animals.Mantis;
import com.example.alexh.zoosome.models.animals.Ostrich;
import com.example.alexh.zoosome.models.animals.Ram;
import com.example.alexh.zoosome.models.animals.Reptile;
import com.example.alexh.zoosome.models.animals.Rhinoceros;
import com.example.alexh.zoosome.models.animals.Scorpion;
import com.example.alexh.zoosome.models.animals.Siege;
import com.example.alexh.zoosome.models.animals.Surgeonfish;
import com.example.alexh.zoosome.models.animals.Trebuchet;
import com.example.alexh.zoosome.models.animals.Turtle;
import com.example.alexh.zoosome.models.animals.WaterType;
import com.example.alexh.zoosome.models.animals.Whale;
import com.example.alexh.zoosome.services.factories.Constants.Animals.Aquatic;

public final class Constants {

    public static final class Species {
        public static final String MAMMAL = "Mammal";
        public static final String REPTILE = "Reptile";
        public static final String BIRD = "Bird";
        public static final String AQUATIC = "Aquatic";
        public static final String INSECT = "Insect";
        public static final String SIEGE = "Siege";

        public static final String[] SPECIES = {MAMMAL, REPTILE, BIRD, AQUATIC, INSECT, SIEGE};

        public static final Class[] SPECIES_NAME = {Mammal.class, Reptile.class, Bird.class, Aquatic.class,
                Insect.class, Siege.class};

        public static final int getCode(String species) {

            for (int i = 0; i < SPECIES.length; i++) {
                if (SPECIES[i].equals(species)) {
                    return i;
                }
            }

            return -1;
        }
    }

    public static final class Jobs {
        public static final String CARETAKER = "Caretaker";

        public static final String[] JOBS = {CARETAKER};

        public static final int getCode(String job) {

            for (int i = 0; i < JOBS.length; i++) {
                if (JOBS[i].equals(job)) {
                    return i;
                }
            }

            return -1;
        }
    }

    public static final class Animals {

        public static final String FIELD_HELP_NAME = "A name";
        public static final String FIELD_HELP_POSITIVE_INTEGER = "A positive integer";
        public static final String FIELD_HELP_MAINTENANCE_DOUBLE = "A real number from 0.1 to 8.0";
        public static final String FIELD_HELP_INCLUSIVE_SUBUNITARY = "A real number form 0 to 1";
        public static final String FIELD_HELP_DOUBLE = "A real number";
        public static final String FIELD_HELP_BOOLEAN = "0 for false, 1 for true";
        public static final String FIELD_HELP_WATERTYPE = "0 for saltwater, 1 for freshwater";

        public static final String CONSTRUCTOR_CLASS_HELP_STRING = "String";
        public static final String CONSTRUCTOR_CLASS_HELP_POSITIVE_INTEGER = "Positive integer";
        public static final String CONSTRUCTOR_CLASS_HELP_MAINTENANCE_DOUBLE = "Maintenance double";
        public static final String CONSTRUCTOR_CLASS_HELP_INCLUSIVE_SUBUNITARY = "Inclusive subunitary";
        public static final String CONSTRUCTOR_CLASS_HELP_DOUBLE = "Double";
        public static final String CONSTRUCTOR_CLASS_HELP_BOOLEAN = "Boolean";
        public static final String CONSTRUCTOR_CLASS_HELP_WATERTYPE = "WaterType";

        public static final class Mammal {
            public static final String NAME = "Mammal";
            public static final Class CLASS = com.example.alexh.zoosome.models.animals.Mammal.class;

            public static final String BEAR = "Bear";
            public static final String KANGAROO = "Kangaroo";
            public static final String WHALE = "Whale";
            public static final String RHINOCEROS = "Rhinosceros";

            public static final String[] MAMMAL = {BEAR, KANGAROO, WHALE, RHINOCEROS};

            public static final Class[] MAMMAL_CLASSES = {Bear.class, Kangaroo.class, Whale.class, Rhinoceros.class};

            public static final Class[] MAMMAL_CONSTRUCTOR_CLASSES = {String.class, int.class, double.class,
                    double.class, double.class, double.class};
            public static final String[] MAMMAL_CONSTRUCTOR_CLASSES_HELP = {CONSTRUCTOR_CLASS_HELP_STRING,
                    CONSTRUCTOR_CLASS_HELP_POSITIVE_INTEGER, CONSTRUCTOR_CLASS_HELP_MAINTENANCE_DOUBLE,
                    CONSTRUCTOR_CLASS_HELP_INCLUSIVE_SUBUNITARY, CONSTRUCTOR_CLASS_HELP_DOUBLE,
                    CONSTRUCTOR_CLASS_HELP_INCLUSIVE_SUBUNITARY};
            public static final String[] MAMMAL_FIELD_HELP = {FIELD_HELP_NAME, FIELD_HELP_POSITIVE_INTEGER,
                    FIELD_HELP_MAINTENANCE_DOUBLE, FIELD_HELP_INCLUSIVE_SUBUNITARY, FIELD_HELP_DOUBLE,
                    FIELD_HELP_INCLUSIVE_SUBUNITARY};
        }

        public static final class Reptile {
            public static final String NAME = "Reptile";
            public static final Class CLASS = com.example.alexh.zoosome.models.animals.Reptile.class;

            public static final String LIZARD = "Lizard";
            public static final String TURTLE = "Turtle";
            public static final String CROCODILE = "Crocodile";
            public static final String DRAGON = "Dragon";

            public static final String[] REPTILE = {LIZARD, TURTLE, CROCODILE, DRAGON};

            public static final Class[] REPTILE_CLASSES = {Lizard.class, Turtle.class, Crocodile.class, Dragon.class};

            public static final Class[] REPTILE_CONSTRUCTOR_CLASSES = {String.class, int.class, double.class,
                    double.class, boolean.class};
            public static final String[] REPTILE_CONSTRUCTOR_CLASSES_HELP = {CONSTRUCTOR_CLASS_HELP_STRING,
                    CONSTRUCTOR_CLASS_HELP_POSITIVE_INTEGER, CONSTRUCTOR_CLASS_HELP_MAINTENANCE_DOUBLE,
                    CONSTRUCTOR_CLASS_HELP_INCLUSIVE_SUBUNITARY, CONSTRUCTOR_CLASS_HELP_BOOLEAN};
            public static final String[] REPTILE_FIELD_HELP = {FIELD_HELP_NAME, FIELD_HELP_POSITIVE_INTEGER,
                    FIELD_HELP_MAINTENANCE_DOUBLE, FIELD_HELP_INCLUSIVE_SUBUNITARY, FIELD_HELP_BOOLEAN};
        }

        public static final class Bird {
            public static final String NAME = "Bird";
            public static final Class CLASS = com.example.alexh.zoosome.models.animals.Bird.class;

            public static final String DOVE = "Dove";
            public static final String OSTRICH = "Ostrich";
            public static final String EAGLE = "Eagle";
            public static final String HUMMINGBIRD = "Hummingbird";

            public static final String[] BIRD = {DOVE, OSTRICH, EAGLE, HUMMINGBIRD};

            public static final Class[] BIRD_CLASSES = {Dove.class, Ostrich.class, Eagle.class, Hummingbird.class};

            public static final Class[] BIRD_CONSTRUCTOR_CLASSES = {String.class, int.class, double.class,
                    double.class, boolean.class, int.class};
            public static final String[] BIRD_CONSTRUCTOR_CLASSES_HELP = {CONSTRUCTOR_CLASS_HELP_STRING,
                    CONSTRUCTOR_CLASS_HELP_POSITIVE_INTEGER, CONSTRUCTOR_CLASS_HELP_MAINTENANCE_DOUBLE,
                    CONSTRUCTOR_CLASS_HELP_INCLUSIVE_SUBUNITARY, CONSTRUCTOR_CLASS_HELP_BOOLEAN,
                    CONSTRUCTOR_CLASS_HELP_POSITIVE_INTEGER};
            public static final String[] BIRD_FIELD_HELP = {FIELD_HELP_NAME, FIELD_HELP_POSITIVE_INTEGER,
                    FIELD_HELP_MAINTENANCE_DOUBLE, FIELD_HELP_INCLUSIVE_SUBUNITARY, FIELD_HELP_BOOLEAN,
                    FIELD_HELP_POSITIVE_INTEGER};
        }

        public static final class Aquatic {
            public static final String NAME = "Aquatic";
            public static final Class CLASS = com.example.alexh.zoosome.models.animals.Aquatic.class;

            public static final String BASS = "Bass";
            public static final String CLOWNFISH = "Clownfish";
            public static final String SURGEONFISH = "Surgeonfish";
            public static final String LIONFISH = "Lionfish";

            public static final String[] AQUATIC = {BASS, CLOWNFISH, SURGEONFISH, LIONFISH};

            public static final Class[] AQUATIC_CLASSES = {Bass.class, Clownfish.class, Surgeonfish.class,
                    Lionfish.class};

            public static final Class[] AQUATIC_CONSTRUCTOR_CLASSES = {String.class, int.class, double.class,
                    double.class, int.class, WaterType.class};
            public static final String[] AQUATIC_CONSTRUCTOR_CLASSES_HELP = {CONSTRUCTOR_CLASS_HELP_STRING,
                    CONSTRUCTOR_CLASS_HELP_POSITIVE_INTEGER, CONSTRUCTOR_CLASS_HELP_MAINTENANCE_DOUBLE,
                    CONSTRUCTOR_CLASS_HELP_INCLUSIVE_SUBUNITARY, CONSTRUCTOR_CLASS_HELP_POSITIVE_INTEGER,
                    CONSTRUCTOR_CLASS_HELP_WATERTYPE};
            public static final String[] AQUATIC_FIELD_HELP = {FIELD_HELP_NAME, FIELD_HELP_POSITIVE_INTEGER,
                    FIELD_HELP_MAINTENANCE_DOUBLE, FIELD_HELP_INCLUSIVE_SUBUNITARY, FIELD_HELP_POSITIVE_INTEGER,
                    FIELD_HELP_WATERTYPE};
        }

        public static final class Insect {
            public static final String NAME = "Insect";
            public static final Class CLASS = com.example.alexh.zoosome.models.animals.Insect.class;

            public static final String BEETLE = "Beetle";
            public static final String SCORPION = "Scorpion";
            public static final String MANTIS = "Mantis";
            public static final String DRAGONFLY = "Dragonfly";

            public static final String[] INSECT = {BEETLE, SCORPION, MANTIS, DRAGONFLY};

            public static final Class[] INSECT_CLASSES = {Beetle.class, Scorpion.class, Mantis.class,
                    Dragonfly.class};

            public static final Class[] INSECT_CONSTRUCTOR_CLASSES = {String.class, int.class, double.class,
                    double.class, boolean.class, boolean.class};
            public static final String[] INSECT_CONSTRUCTOR_CLASSES_HELP = {CONSTRUCTOR_CLASS_HELP_STRING,
                    CONSTRUCTOR_CLASS_HELP_POSITIVE_INTEGER, CONSTRUCTOR_CLASS_HELP_MAINTENANCE_DOUBLE,
                    CONSTRUCTOR_CLASS_HELP_INCLUSIVE_SUBUNITARY, CONSTRUCTOR_CLASS_HELP_BOOLEAN,
                    CONSTRUCTOR_CLASS_HELP_BOOLEAN};
            public static final String[] INSECT_FIELD_HELP = {FIELD_HELP_NAME, FIELD_HELP_POSITIVE_INTEGER,
                    FIELD_HELP_MAINTENANCE_DOUBLE, FIELD_HELP_INCLUSIVE_SUBUNITARY, FIELD_HELP_BOOLEAN,
                    FIELD_HELP_BOOLEAN};
        }

        public static final class Siege {
            public static final String NAME = "Siege";
            public static final Class CLASS = com.example.alexh.zoosome.models.animals.Siege.class;

            public static final String RAM = "Ram";
            public static final String MANGONEL = "Mangonel";
            public static final String BALLISTA = "Ballista";
            public static final String TREBUCHET = "Trebuchet";

            public static final String[] SIEGE = {RAM, MANGONEL, BALLISTA, TREBUCHET};

            public static final Class[] SIEGE_CLASSES = {Ram.class, Mangonel.class, Ballista.class, Trebuchet.class};

            public static final Class[] SIEGE_CONSTRUCTOR_CLASSES = {String.class, int.class, double.class,
                    double.class, int.class, boolean.class};
            public static final String[] SIEGE_CONSTRUCTOR_CLASSES_HELP = {CONSTRUCTOR_CLASS_HELP_STRING,
                    CONSTRUCTOR_CLASS_HELP_POSITIVE_INTEGER, CONSTRUCTOR_CLASS_HELP_MAINTENANCE_DOUBLE,
                    CONSTRUCTOR_CLASS_HELP_INCLUSIVE_SUBUNITARY, CONSTRUCTOR_CLASS_HELP_POSITIVE_INTEGER,
                    CONSTRUCTOR_CLASS_HELP_BOOLEAN};
            public static final String[] SIEGE_FIELD_HELP = {FIELD_HELP_NAME, FIELD_HELP_POSITIVE_INTEGER,
                    FIELD_HELP_MAINTENANCE_DOUBLE, FIELD_HELP_INCLUSIVE_SUBUNITARY, FIELD_HELP_POSITIVE_INTEGER,
                    FIELD_HELP_BOOLEAN};

        }

        public static final String[] CLASSES_NAME = {Mammal.NAME, Reptile.NAME, Bird.NAME, Aquatic.NAME,
                Insect.NAME, Siege.NAME};

        public static final String[][] SPECIES_NAME = {Mammal.MAMMAL, Reptile.REPTILE, Bird.BIRD, Aquatic.AQUATIC,
                Insect.INSECT, Siege.SIEGE};

        public static final Class[] ANIMAL_CLASS_CLASSES = {Mammal.CLASS, Reptile.CLASS,
                Bird.CLASS, Aquatic.CLASS, Insect.CLASS, Siege.CLASS};

        public static final Class[][] ANIMAL_SPECIES_CLASSES = {Mammal.MAMMAL_CLASSES, Reptile.REPTILE_CLASSES,
                Bird.BIRD_CLASSES, Aquatic.AQUATIC_CLASSES, Insect.INSECT_CLASSES, Siege.SIEGE_CLASSES};

        public static final Class[][] ANIMAL_CONSTRUCTOR_CLASSES = {Mammal.MAMMAL_CONSTRUCTOR_CLASSES,
                Reptile.REPTILE_CONSTRUCTOR_CLASSES, Bird.BIRD_CONSTRUCTOR_CLASSES, Aquatic.AQUATIC_CONSTRUCTOR_CLASSES,
                Insect.INSECT_CONSTRUCTOR_CLASSES, Siege.SIEGE_CONSTRUCTOR_CLASSES};
        public static final String[][] ANIMAL_CONSTRUCTOR_CLASSES_HELP = {Mammal.MAMMAL_CONSTRUCTOR_CLASSES_HELP,
                Reptile.REPTILE_CONSTRUCTOR_CLASSES_HELP, Bird.BIRD_CONSTRUCTOR_CLASSES_HELP,
                Aquatic.AQUATIC_CONSTRUCTOR_CLASSES_HELP, Insect.INSECT_CONSTRUCTOR_CLASSES_HELP,
                Siege.SIEGE_CONSTRUCTOR_CLASSES_HELP};
        public static final String[][] ANIMAL_FIELD_HELP = {Mammal.MAMMAL_FIELD_HELP, Reptile.REPTILE_FIELD_HELP,
                Bird.BIRD_FIELD_HELP, Aquatic.AQUATIC_FIELD_HELP, Insect.INSECT_FIELD_HELP, Siege.SIEGE_FIELD_HELP};

        public static final Class[] GENERAL_CONSTRUCTOR_CLASSES = {String.class, String.class, String.class,
                String.class, String.class, String.class};
    }

    public static final class Employees {
        public static final class Caretakers {
            public static final String TCO_SUCCESS = "SUCCESS";
            public static final String TCO_KILLED = "KILLED";
            public static final String TCO_NO_TIME = "NO_TIME";
        }
    }

    public static final class XML_TAGS {
        public static final String ANIMAL = "ANIMAL";
        public static final String EMPLOYEE = "EMPLOYEE";
        public static final String DISCRIMINANT = "DISCRIMINANT";
    }

    public static final class Frames {
        public static int MULT = 60;
        public static int WIDTH = 9 * MULT;
        public static int HEIGHT = 16 * MULT;

        public static void setResolution(int w, int h) {
            WIDTH = w;
            HEIGHT = h;
        }
    }

    /**
     * Class finder. Returns the index of class
     */
    public static final int indexOfSpecies(Animal a) {
        Class cls = a.getClass();
        for (int classIndex = 0; classIndex < Animals.ANIMAL_SPECIES_CLASSES.length; classIndex++) {
            for (int speciesIndex = 0; speciesIndex < Animals.ANIMAL_SPECIES_CLASSES[classIndex].length; speciesIndex++) {
                if (cls.equals(Animals.ANIMAL_SPECIES_CLASSES[classIndex][speciesIndex])) {
                    return speciesIndex;
                }
            }
        }
        return -1;
    }

    /**
     * Species finder. Returns the index of species
     */
    public static final int indexOfClass(Animal a) {
        Class cls = a.getClass();
        for (int classIndex = 0; classIndex < Animals.ANIMAL_SPECIES_CLASSES.length; classIndex++) {
            for (int speciesIndex = 0; speciesIndex < Animals.ANIMAL_SPECIES_CLASSES[classIndex].length; speciesIndex++) {
                if (cls.equals(Animals.ANIMAL_SPECIES_CLASSES[classIndex][speciesIndex])) {
                    return classIndex;
                }
            }
        }
        return -1;
    }

    public static final String nameOfClass(Animal a) {
        return Animals.CLASSES_NAME[indexOfClass(a)];
    }

    public static final String nameOfSpecies(Animal a) {
        return Animals.SPECIES_NAME[indexOfClass(a)][indexOfSpecies(a)];
    }

    /**
     * Returns the index of a String if it is included in a String[]
     */
    public static final int indexOfStringIn1DStringArray(String[] arr, String e) {
        if (arr.length <= 0 || e.length() <= 0) {
            return -2;
        }

        for (int index = 0; index < arr.length; index++) {
            boolean subElement = true;

            if (!arr[index].equals(e)) {
                subElement = false;
            }

            if (subElement) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns the index of a String[] if it is included in a String[][]
     */
    public static final int indexOf1DStringArrayIn2DStringArray(String[][] mat, String[] arr) {
        if (mat.length <= 0 || arr.length <= 0) {
            return -2;
        } else if (mat[0].length <= 0) {
            return -3;
        }

        for (int index = 0; index < mat.length; index++) {
            if (mat[index].length != arr.length) {
                return -4;
            }

            boolean subArrayFound = true;
            for (int i = 0; i < mat[index].length && subArrayFound; i++) {
                if (!mat[index][0].equals(arr[0])) {
                    subArrayFound = false;
                }
            }

            if (subArrayFound) {
                return index;
            }
        }
        return -1;
    }
}
