package newpackage;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import newpackage.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-26T17:31:05")
@StaticMetamodel(Type.class)
public class Type_ { 

    public static volatile SingularAttribute<Type, String> typeName;
    public static volatile SingularAttribute<Type, Integer> typeID;
    public static volatile CollectionAttribute<Type, Users> usersCollection;

}