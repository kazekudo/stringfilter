import java.lang.*;

public class UpperCaseStringFilter implements StringFilter{
    /* convertit en majuscules les caractères */

    @Override
    public String filter(String string) {
        return string.toUpperCase();
    }


}
