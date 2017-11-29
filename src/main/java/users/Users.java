package users;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "username")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer orgcode;

    @ManyToOne
    @JoinColumn(name="GROUPCODE")
    private Usergroup groupcode;

    @Column(columnDefinition = "INTEGER")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean access = true;

    @Column(nullable = false)
    private String surname;

    private String firstname;

    private String lastname;

    @Column(nullable = false)
    private String username;

    @Column(updatable = false, insertable = false)
    private Date createdate;
    @Column(updatable = false, insertable = false)
    private Integer createuserid;
    @Column(updatable = false, insertable = false)
    private Date modifydate;
    @Column(updatable = false, insertable = false)
    private Integer modifyuserid;

    public Users(Integer orgcode, Usergroup groupcode, Boolean access, String surname, String firstname, String lastname, String username, Date createdate, Integer createuserid, Date modifydate, Integer modifyuserid) {
        this.orgcode = orgcode;
        this.groupcode = groupcode;
        this.access = access;
        this.surname = surname;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.createdate = createdate;
        this.createuserid = createuserid;
        this.modifydate = modifydate;
        this.modifyuserid = modifyuserid;
    }
}
