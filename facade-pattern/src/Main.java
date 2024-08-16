/**
 * Author: Bello Adamou - 2024.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Java facade pattern test");

        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);
        facadeServer.startServer();

        System.out.println("Start working......");
        System.out.println("After work done.........");

        facadeServer.stopServer();
    }
}