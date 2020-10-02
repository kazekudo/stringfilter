public class Main {

    public static String[] filter(String[] strings, StringFilter filter) {
        for(int i=0;i<strings.length;i++){
            strings[i]=filter.filter(strings[i]);
        }
        return strings;
    }
}
