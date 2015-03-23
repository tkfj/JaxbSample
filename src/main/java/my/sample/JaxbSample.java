package my.sample;

import java.io.BufferedInputStream;
import java.io.IOException;

import javax.xml.bind.JAXB;

public class JaxbSample {

    public static void main(String[] args) {

        String loadXmlPath = "my/sample/Parent.xml";
        Parent parent = null;

        try (BufferedInputStream bis = new BufferedInputStream(JaxbSample.class
                .getClassLoader().getResourceAsStream(loadXmlPath));) {

            parent = JAXB.unmarshal(bis, Parent.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Child c : parent.getChildren()) {
            System.out.println("firstName :" + c.getFirstName());
            System.out.println("lastName :" + c.getLastName());
            System.out.println("birthday :" + c.getBirthday());
            System.out.println("gender :" + c.getGender());
        }

    }

}
