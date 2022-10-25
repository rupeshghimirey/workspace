package alarmClock;

public class ClientAlarm {
    public static void main(String[] args) {
        AlarmClock alarmClock1 = new AlarmClock();
        alarmClock1.setSnoozeInterval(50);

        AlarmClock alarmClock2 = new AlarmClock();
        alarmClock1.setSnoozeInterval(66);

        System.out.println(alarmClock1);
        System.out.println(alarmClock2);

    }
}
