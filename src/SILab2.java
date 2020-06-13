import java.util.ArrayList;
import java.util.List;

class Angle {
    int degrees;
    int minutes;
    int seconds;

    public Angle(int degrees, int minutes, int seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getDegrees() {
        return degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Angle> angleList) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < angleList.size(); i++) { // 1
            int deg = angleList.get(i).getDegrees(); // 2
            int min = angleList.get(i).getMinutes(); // 3
            int sec = angleList.get(i).getSeconds(); // 4
            if (deg >= 0 && deg < 360) { // 5
                if (min < 0 || min > 59) // 6
                    throw new RuntimeException("The minutes of the angle are not valid!"); // 7
                else { // 8
                    if (sec < 0 || sec > 59) // 9
                        throw new RuntimeException("The seconds of the angle are not valid"); // 10
                    else // 11
                        result.add(deg * 3600 + min * 60 + sec); // 12
                }
            } else if (deg == 360) { // 13
                if (min == 0 && sec == 0) // 14
                    result.add(deg * 3600 + min * 60 + sec); // 15
                else // 16
                    throw new RuntimeException("The angle is greater then the maximum"); // 17
            } else { // 18
                throw new RuntimeException("The angle is smaller or greater then the minimum"); // 19
            }
        }
        return result; // 20

    }
}
