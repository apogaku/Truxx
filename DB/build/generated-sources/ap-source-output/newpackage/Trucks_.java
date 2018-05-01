package newpackage;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import newpackage.Trips;
import newpackage.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-26T17:31:05")
@StaticMetamodel(Trucks.class)
public class Trucks_ { 

    public static volatile SingularAttribute<Trucks, Integer> truckId;
    public static volatile SingularAttribute<Trucks, Integer> year;
    public static volatile CollectionAttribute<Trucks, Trips> tripsCollection;
    public static volatile SingularAttribute<Trucks, String> model;
    public static volatile SingularAttribute<Trucks, String> make;
    public static volatile SingularAttribute<Trucks, Users> userID;
    public static volatile SingularAttribute<Trucks, Integer> capacity;

}