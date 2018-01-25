package networks.service.email;

import networks.model.User;
import static sun.security.x509.X509CertInfo.SUBJECT;

public class RecoverPasswordBuilder implements MessegeBuilder {

    public  String getSUBJECT(){
        return  SUBJECT;
    }

    @Override
    public String build(User user) {
        return "Dear "
                +user.getName()
                +", "
                +" you recover password is: "
                +"'"
                +user.getPassword()
                +"'";
    }
}
