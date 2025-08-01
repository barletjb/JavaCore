package chapter05.exercice;

public class LongestWordFinder {

    public static void main(String[] args) {

        String text = "a bb ccc ddddddddddd eeeeeeeeee fffffffff gggg hhhhh iiiiiiiiiiii jjjjjj kkkkkkk mmmmmmmm";


        // With String.split(String regex)
        String[] words = text.split("\\s+");
        String longestWord = "";

        for (int index = 0; index < words.length; index++) {
            if (words[index].length() > longestWord.length()) {
                longestWord = words[index];
            }
        }
        System.out.println(longestWord);

        // Without String.split(String regex)
        longestWord = "";
        String currentWord = "";

        for (int index = 0; index < text.length(); index++) {
            char letter = text.charAt(index);

            if (letter != ' '){
                currentWord += letter;
            }
            else if (currentWord.length() > longestWord.length()){
                longestWord = currentWord;
                currentWord = "";
            }
            else {
                currentWord="";
            }
        }

        System.out.println("Affichage: " + longestWord);
    }

}
