import com.PeopleInfo.spi.InfoFinder;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<InfoFinder> loader = ServiceLoader.load(InfoFinder.class);

        int count = 0;
        for (InfoFinder human : loader) {
            human.findInfo().printExistedInfo(++count);
        }
    }
}
