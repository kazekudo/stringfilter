public class PostfixStringFilter implements StringFilter {
    /* conserve les n derniers caract`eres de string. */
    private int n;
    public PostfixStringFilter(int n){
        this.n=n;
    }

    @Override
    public String filter(String string) {
        String result="";
        for(int i=n-1;i<string.length();i++){
            result=result+string.charAt(i);
        }
        return result;
    }

}
