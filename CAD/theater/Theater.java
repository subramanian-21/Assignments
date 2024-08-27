package CAD.theater;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private int id ;
    public String name;
    private List<Screen> screens;
    private static int  count =0;
    public Theater(String name, int screenCount) {
        this.name = name;
        screens = new ArrayList<>();
        for (int i = 0; i < screenCount; i++) {
            screens.add(new Screen(i+1,10, 10));
        }
        count++;
        id = count;
    }
    public Screen getScreen(String screenName){
        int id = Integer.parseInt(screenName.substring(6));
        return screens.get(id-1);
    }
    public Screen getScreenById(int id){
        return screens.get(id-1);
    }
    public void printScreens(){
        for (int i = 0; i < screens.size(); i++) {
            System.out.println(screens.get(i));
        }
    }

    @Override
    public String toString() {
        return "Theater{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", screenCount=" + screens.size() +
                '}';
    }
}
