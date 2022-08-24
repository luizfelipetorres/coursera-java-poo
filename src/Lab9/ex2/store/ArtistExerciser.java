package Lab9.ex2.store;

import java.util.SortedSet;
import java.util.TreeSet;

public class ArtistExerciser {
    public static void main(String[] args) {
        Artist hotPlate = new Artist();
        TreeSet<String> instruments1 = new TreeSet<>();
        instruments1.add("Piano");
        instruments1.add("Clarinet");
        instruments1.add("Hurdy Gurdy");
        instruments1.add("Tuba");

        TreeSet<String> instruments2 = new TreeSet<>();
        instruments2.add("Guitar");
        instruments2.add("Drumms");

        hotPlate.addMember("Tony", instruments1);
        hotPlate.addMember("Luiz", instruments2);
        System.out.println(hotPlate.getMembers());

        /*
         * System.out.println("Instrumentos do Luiz:");
         * System.out.println(hotPlate.getInstruments("Luiz"));
         */
        printMemberInstruments(hotPlate, "Luiz");
    }

    private static void printMemberInstruments(Artist artist, String memberName) {
        System.out.println("O membro da banda '" + memberName + "' toca: ");
        for (String a : artist.getInstruments(memberName)) {
            System.out.println("\t" + a);
        }
    }
}
