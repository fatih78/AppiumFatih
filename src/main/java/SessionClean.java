
public class SessionClean extends SessionFactory {

    public static void close() {

        try {
            if (driver != null) {
                driver.quit();
//                driver.close();
//                driver.closeApp();
            }
        } catch (Exception e) {
            //log.info("cannot close browser: unreachable browser", e);
        }
    }


    public static class SessionCleanUp implements Runnable {
        public void run() {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            close();
        }
    }
}
