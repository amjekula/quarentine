package PalindromeChecker;

import javax.swing.*;

public class Palindrome {


    public static void main(String arg[]){
        String original = JOptionPane.showInputDialog("Please type a word");
        original = original.trim();

        String reverse = "";
        for(int x = original.length() - 1; x >= 0; x--){
            reverse += original.charAt(x);
            System.out.println(reverse);
        }

        Boolean isPalindrome = true;
        for(int x = 0; x < original.length(); x++){
            if(original.charAt(x) == reverse.charAt(x)){
                isPalindrome = true;
            }else{
                isPalindrome = false;
            }
        }

        if(isPalindrome == true){
            JOptionPane.showMessageDialog(null, "PALINDROME");
        }else{
            JOptionPane.showMessageDialog(null, "NOT A PALINDROME");
        }
    }

}
