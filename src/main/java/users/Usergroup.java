package users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usergroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer groupcode;

    private String rolename;

    private String groupname;

    public Usergroup() {
    }

    public Usergroup(Integer groupcode, String rolename, String groupname) {
        this.groupcode = groupcode;
        this.rolename = rolename;
        this.groupname = groupname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupCode() {
        return groupcode;
    }

    public void setGroupCode(Integer groupCode) {
        this.groupcode = groupCode;
    }

    public String getRoleName() {
        return rolename;
    }

    public void setRoleName(String roleName) {
        this.rolename = roleName;
    }

    public String getGroupName() {
        return groupname;
    }

    public void setGroupName(String groupName) {
        this.groupname = groupName;
    }
}
