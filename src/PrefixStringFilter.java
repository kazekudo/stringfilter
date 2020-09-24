public class PrefixStringFilter implements StringFilter {
    /** conserve les n premiers caractères de string.
     * La valeur de n est fournie lors de la construction
     * d’une instance de la classe. */

    private int n;
    public PrefixStringFilter(int n){
        this.n=n;
    }

    @Override
    public String filter(String string) {
        String result="";
        for(int i=0;i<n;i++){
            result=result+string.charAt(i);
        }
        return result;
    }
}
