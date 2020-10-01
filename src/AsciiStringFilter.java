public class AsciiStringFilter implements StringFilter{
    /* conserve les caract`eres de code inférieur à 128. */

    @Override
    public String filter(String string) {
        String result="";
        int ascii;
        for(int i=0;i<string.length();i++){
            ascii = string.charAt(i);
            if(ascii<128){
                result=result+string.charAt(i);
            }

        }
        return result;
    }
}
