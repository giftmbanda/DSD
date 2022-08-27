package entityPckg;

import entityPckg.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-22T11:49:19")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> residentialcode;
    public static volatile ListAttribute<Address, Users> usersList;
    public static volatile SingularAttribute<Address, String> postalcode;
    public static volatile SingularAttribute<Address, Boolean> issame;
    public static volatile SingularAttribute<Address, String> postaladdress;
    public static volatile SingularAttribute<Address, String> residentialaddress;
    public static volatile SingularAttribute<Address, Integer> addressid;

}