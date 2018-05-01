package newpackage;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import newpackage.City;
import newpackage.State;
import newpackage.Trips;
import newpackage.Trucks;
import newpackage.Type;
import newpackage.Zipcode;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-26T17:31:05")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> lastName;
    public static volatile SingularAttribute<Users, Zipcode> zipcodeID;
    public static volatile CollectionAttribute<Users, Trips> tripsCollection;
    public static volatile SingularAttribute<Users, State> stateID;
    public static volatile CollectionAttribute<Users, Trucks> trucksCollection;
    public static volatile SingularAttribute<Users, String> dateOfBirth;
    public static volatile SingularAttribute<Users, City> cityID;
    public static volatile SingularAttribute<Users, Integer> userID;
    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile SingularAttribute<Users, String> streetName;
    public static volatile SingularAttribute<Users, Type> typeID;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, String> contactNo;

}