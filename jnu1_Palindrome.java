public class jnu1_Palindrome {

    static String palindromeCheck(String str)
    {
        int i=0,j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return "NO";
            }
            i++;
            j--;
        }
        return "YES";
    }
    public static void main(String[] args) {
        System.out.println(palindromeCheck("abba"));
        System.out.println(palindromeCheck("abc"));
        System.out.println(palindromeCheck("abbcaacbba"));
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
