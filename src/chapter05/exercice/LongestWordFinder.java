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
        int wordIndex = 0;
        String[] words2 = new String[15];

        for (int index = 0; index < text.length(); index++) {
            char c = text.charAt(index);

            if (c != ' '){
                currentWord += c;
            }
            else {
                words2[wordIndex] = currentWord;
                if (longestWord.length() < words2[wordIndex].length()){
                    longestWord = words2[wordIndex];
                }
                wordIndex++;
                currentWord = "";
            }
        }

        System.out.println("Affichage: " + longestWord);
    }

}
