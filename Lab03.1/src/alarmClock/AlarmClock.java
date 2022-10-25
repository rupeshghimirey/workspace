package alarmClock;

public class AlarmClock {
    private int snoozeInterval = 99;

    private static int nextId = 1;
    private int id;

    public AlarmClock() {
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        AlarmClock.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AlarmClock(int snoozeInterval) {
        this.snoozeInterval = snoozeInterval;
        this.id = nextId++;
    }

    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    void setSnoozeInterval(int snooze) {
        snoozeInterval = snooze;
    }

    @Override
    public String toString() {
        return "AlarmClock{" +
                "snoozeInterval=" + snoozeInterval +
                 +
                '}';
    }
}
