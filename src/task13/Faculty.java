package task13;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String nameFaculty;
    private List<Group> groups;

    public Faculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
        this.groups = new ArrayList<>();
    }


    public String getNameFaculty() {
        return nameFaculty;
    }


    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }


    public List<Group> getGroups() {
        return groups;
    }


    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
