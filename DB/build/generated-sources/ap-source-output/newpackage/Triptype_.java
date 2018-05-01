package newpackage;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import newpackage.Trips;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-26T17:31:05")
@StaticMetamodel(Triptype.class)
public class Triptype_ { 

    public static volatile SingularAttribute<Triptype, Integer> tripTypeID;
    public static volatile SingularAttribute<Triptype, String> tripTypeName;
    public static volatile CollectionAttribute<Triptype, Trips> tripsCollection;

}