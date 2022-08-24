package Lab9.ex2.store;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Artist {
    private String name;
    private SortedSet<String> membersName;
    private Map<String, SortedSet<String>> memberInstruments;

    public Artist() {
        membersName = new TreeSet();
        memberInstruments = new TreeMap();
    }

    public SortedSet<String> getInstruments(String memberName){

        return memberInstruments.get(memberName);
    }

    public SortedSet<String> getMembers(){
        return membersName;
    }

    public void addMember(String memberName, SortedSet<String> instruments){
        membersName.add(memberName);
        memberInstruments.put(memberName, instruments);
    }

    public Artist(String name) {
        this();
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
