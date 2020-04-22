package FunctionLayer;

import DBAccess.UserMapper;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    }


    public static User createUser(String email, String password, String telefonnummer,
                                   String adresse, String navn, String postnummer, String by, int id, String rolle ) throws LoginSampleException {


        User user = new User(navn, adresse, by, telefonnummer, email, id, password, rolle);
        UserMapper.createUser( user );
        return user;
    }



    public static void sendForspørgsel(Carport carport, FKunde kunde){
        // send videre til db
    }
}
