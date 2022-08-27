package entityPckg;

import entityPckg.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-22T11:49:19")
@StaticMetamodel(Newslettersubscribe.class)
public class Newslettersubscribe_ { 

    public static volatile SingularAttribute<Newslettersubscribe, String> newsletters;
    public static volatile SingularAttribute<Newslettersubscribe, Date> enddate;
    public static volatile SingularAttribute<Newslettersubscribe, Boolean> issubscribe;
    public static volatile SingularAttribute<Newslettersubscribe, Integer> subscriptionid;
    public static volatile SingularAttribute<Newslettersubscribe, Date> startdate;
    public static volatile SingularAttribute<Newslettersubscribe, Users> username;

}