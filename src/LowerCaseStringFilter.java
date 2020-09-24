public class LowerCaseStringFilter implements StringFilter {
    /* convertit en minuscules les caractères. */

    @Override
    public String filter(String string) {
        return string.toLowerCase();
    }

}
