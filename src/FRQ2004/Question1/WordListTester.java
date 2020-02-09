package FRQ2004.Question1;

public class WordListTester {
    public static void main(String[] args) {
        WordList list = new WordList("cat", "mouse", "frog", "dog", "dog");
        System.out.println(list);
        list.removeWordsOfLength(4);
        System.out.println(list);
        list.removeWordsOfLength(3);
        System.out.println(list);
        list.removeWordsOfLength(2);
        System.out.println(list);
    }
}
