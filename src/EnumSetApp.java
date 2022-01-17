import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

    public static enum Gender {
        MALE, FEMALE, NOT_MENTIONED
    }

    public static void main(String[] args) {

        // Get all gender
        Set<Gender> genders = EnumSet.allOf(Gender.class);
        // OR
        // Gender[] allGender = Gender.values();

        for (var gender : genders) {
            System.out.println(gender);
        }

        // Get specific enum
        EnumSet<Gender> trueGender = EnumSet.of(Gender.MALE, Gender.FEMALE);
        System.out.println(trueGender);
    }
}
