package newpackage;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import newpackage.City;
import newpackage.Trips;
import newpackage.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-26T17:31:05")
@StaticMetamodel(State.class)
public class State_ { 

    public static volatile SingularAttribute<State, String> stateName;
    public static volatile CollectionAttribute<State, Trips> tripsCollection;
    public static volatile SingularAttribute<State, Integer> stateID;
    public static volatile CollectionAttribute<State, City> cityCollection;
    public static volatile CollectionAttribute<State, Trips> tripsCollection1;
    public static volatile CollectionAttribute<State, Users> usersCollection;

}