package newpackage;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import newpackage.Trips;
import newpackage.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-26T17:31:05")
@StaticMetamodel(Zipcode.class)
public class Zipcode_ { 

    public static volatile SingularAttribute<Zipcode, String> zipcode;
    public static volatile CollectionAttribute<Zipcode, Trips> tripsCollection;
    public static volatile CollectionAttribute<Zipcode, Trips> tripsCollection1;
    public static volatile SingularAttribute<Zipcode, Integer> id;
    public static volatile CollectionAttribute<Zipcode, Users> usersCollection;

}