public class RemoveDuplicateWords {

    public static void main(String[] args) {

        String input = "hello hello world world java";
        String words[] = input.split(" ");
        String result = "";

        for(int i=0;i<words.length;i++){
            if(!result.contains(words[i])){
                result += words[i] + " ";
            }
        }

        System.out.println(result);
    }
}