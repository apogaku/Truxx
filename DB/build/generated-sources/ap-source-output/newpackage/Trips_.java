package newpackage;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import newpackage.City;
import newpackage.State;
import newpackage.Triptype;
import newpackage.Trucks;
import newpackage.Users;
import newpackage.Zipcode;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-26T17:31:05")
@StaticMetamodel(Trips.class)
public class Trips_ { 

    public static volatile SingularAttribute<Trips, Trucks> truckID;
    public static volatile SingularAttribute<Trips, String> tripStartLocationStreetName;
    public static volatile SingularAttribute<Trips, State> tripStartLocationStateID;
    public static volatile SingularAttribute<Trips, City> tripDestinationCityID;
    public static volatile SingularAttribute<Trips, Integer> tripId;
    public static volatile SingularAttribute<Trips, Triptype> tripTypeId;
    public static volatile SingularAttribute<Trips, Date> tripEndTime;
    public static volatile SingularAttribute<Trips, Date> tripDate;
    public static volatile SingularAttribute<Trips, String> tripBookingTime;
    public static volatile SingularAttribute<Trips, String> tripDestinationStreetName;
    public static volatile SingularAttribute<Trips, Users> renterUserID;
    public static volatile SingularAttribute<Trips, Zipcode> tripStartLocationZipcodeID;
    public static volatile SingularAttribute<Trips, Date> tripStartTime;
    public static volatile SingularAttribute<Trips, State> tripDestinationStateID;
    public static volatile SingularAttribute<Trips, City> tripStartLocationCityID;
    public static volatile SingularAttribute<Trips, Zipcode> tripDestinationZipcodeID;

}