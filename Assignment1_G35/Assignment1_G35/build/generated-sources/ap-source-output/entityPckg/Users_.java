package entityPckg;

import entityPckg.Address;
import entityPckg.Newslettersubscribe;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-22T11:49:19")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> country;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, String> firstname;
    public static volatile SingularAttribute<Users, String> gender;
    public static volatile SingularAttribute<Users, Address> addresskey;
    public static volatile SingularAttribute<Users, String> idnumber;
    public static volatile ListAttribute<Users, Newslettersubscribe> newslettersubscribeList;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, String> username;
    public static volatile SingularAttribute<Users, String> lastname;

}