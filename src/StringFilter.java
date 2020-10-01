import java.lang.*;

public interface StringFilter {
    String filter(String string);

    static String[] filter(String[] strings, StringFilter filter) {
        String[] result;
        for(int i=0;i<strings.length();i++){
            result[i]=filter(strings[i]);
        }
        return result;
    }

}


