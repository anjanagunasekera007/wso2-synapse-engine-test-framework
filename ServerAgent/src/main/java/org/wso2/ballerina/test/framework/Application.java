package org.wso2.ballerina.test.framework;

//import org.wso2.msf4j.MicroservicesRunner;

public class Application {

    public static void main(String[] args) {
//        new MicroservicesRunner()
//                .deploy(new ServerAgent())
//                .start();


//        new MicroservicesRunner().deploy(new BallerinaServerAgent()).start();
        String[] ar = new String[0];
        BallerinaServerAgent bs = new BallerinaServerAgent();
        bs.startService(ar);
    }


}