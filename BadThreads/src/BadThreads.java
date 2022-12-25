
public class BadThreads {
static String message;



    private static class CorrectorThread

        extends Thread {



        public void run() {

            try {

                sleep(1000); 

            } catch (InterruptedException e) {}

            // Key statement 1:

            message = "Mares do eat oats."; 

        }

    }



    public static void main(String args[])

        throws InterruptedException {



        (new CorrectorThread()).start();

        message = "Mares do not eat oats.";

        Thread.sleep(2000);

        // Key statement 2:

        System.out.println(message);
}
}

//2. It is always guaranteed to do so.

//-  However, this result is not guaranteed, because there is no happens-before relationship between "Key statement 1" and "Key statement 2". This is true even if "Key statement 1" actually executes before "Key statement 2" — remember, a happens-before relationship is about visibility, not sequence.

//3. Changing the arguments of the two sleep invocations does not help either, since this does nothing to guarantee a happens-before relationship.


//4.  In the main thread, retain a reference to the CorrectorThread instance. Then invoke join on that instance before referring to message
//Encapsulate message in an object with synchronized methods. Never reference message except through those methods.