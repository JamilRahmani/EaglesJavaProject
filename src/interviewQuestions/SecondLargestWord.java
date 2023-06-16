package interviewQuestions;

public class SecondLargestWord {
    public static void main(String[] args) {

        //Find the second largest word in a sentence
        String sentence = "I am from california";
        String[] words = sentence.split(" ");
        String secondLargestWord = words[words.length - 2];

        System.out.println(secondLargestWord);

    }
}
