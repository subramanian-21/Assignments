public class BirdWatcher {
    // 5. https://exercism.org/tracks/java/exercises/bird-watcher
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       return birdsPerDay.clone();
    }

    public int getToday() {
        int n = birdsPerDay.length;
        return birdsPerDay[n-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i] == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for(int i = 0;i<numberOfDays && i < birdsPerDay.length ;i++){
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for(int i = 0;i< birdsPerDay.length;i++){
            if(birdsPerDay[i] >= 5) count++;
        }

        return count;
    }
}
