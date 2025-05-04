public class Main 
{
    public static void main(String[] args) 
    {
        String[] tokens = {"(", "x + y", ")", " * 5"};
        Delimiters d = new Delimiters("(", ")");
        System.out.println(d.getDelimitersList(tokens)); // Output: [(, )]
        System.out.println(d.isBalanced(d.getDelimitersList(tokens))); // Output: true

        String[] something = {"<q>", "yy", "</q>", "zz", "</q>"};
        Delimiters a = new Delimiters("<q>", "</q>");
        System.out.println(a.isBalanced(a.getDelimitersList(something))); // Output: false
    }
}
