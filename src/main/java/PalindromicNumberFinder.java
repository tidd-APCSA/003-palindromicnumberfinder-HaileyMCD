public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      num++;
        if(getNum() == num){
          num = num + 1;
        }
        while (testPalindromeicNum == false){
           num = num + 1;
        }
        return num;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
        String pal = reverseNum(num);
        int stringCopy = Integer.parseInt(pal);

        return stringCopy == num;

    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
        for(int i = reverseNum.length() - 1; i >= 0; i--){
          temp += reverseNum.chatAt(i);
        }
        return (int)temp;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
