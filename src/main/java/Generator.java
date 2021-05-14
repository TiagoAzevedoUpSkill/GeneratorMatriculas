import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;

public class Generator {

    public String generateNew() {
        String box1 = RandomStringUtils.randomAlphabetic(2);
        String box2 = RandomStringUtils.randomNumeric(2);
        String box3 = RandomStringUtils.randomAlphabetic(2);

        return box1.concat(box2).concat(box3).toUpperCase(Locale.ROOT);
    }

    public String generateOld() {
        String box1 = RandomStringUtils.randomNumeric(2);
        String box2 = RandomStringUtils.randomAlphabetic(2);
        String box3 = RandomStringUtils.randomNumeric(2);

        return box1.concat(box2).concat(box3).toUpperCase(Locale.ROOT);
    }
}
