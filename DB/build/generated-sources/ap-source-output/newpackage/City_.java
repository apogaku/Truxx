package newpackage;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import newpackage.State;
import newpackage.Trips;
import newpackage.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-26T17:31:05")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile SingularAttribute<City, String> cityName;
    public static volatile CollectionAttribute<City, Trips> tripsCollection;
    public static volatile SingularAttribute<City, State> stateID;
    public static volatile CollectionAttribute<City, Trips> tripsCollection1;
    public static volatile SingularAttribute<City, Integer> cityID;
    public static volatile CollectionAttribute<City, Users> usersCollection;

}