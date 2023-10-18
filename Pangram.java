public class PangramString
{  
static int size = 26;  
static boolean isLetter(char ch)  
{  
if (!Character.isLetter(ch))  
//returns false if character is not a letter   
return false;  
return true;  
}   
static boolean containsAllLetters(String str, int len)  
{   
str = str.toLowerCase();  
boolean[] present = new boolean[size];  
for (int i = 0; i < len; i++)   
{  
//checks if the current character is a letter  
if (isLetter(str.charAt(i)))   
{  
int letter = str.charAt(i) - 'a';  
present[letter] = true;  
}  
}    
for (int i = 0; i < size; i++)   
{  
if (!present[i])  
//returns false if the current character is not presented in the string  
return false;  
}  
return true;  
}  
public static void main(String args[])  
{  
String str = "Abcdefghijklmnopqrstuvwxyz";  
//determines the length of the given string  
int len = str.length();  
if (containsAllLetters(str, len))  
System.out.println("The given string is a pangram string.");  
else  
System.out.println("The given string is not a pangram string.");  
}  
}  