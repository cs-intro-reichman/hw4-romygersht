public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            sentence = sentence.toLowerCase();
            for (int j = 0; j < keywords.length; j++) {
                String keyword = keywords[j];
                if (contains(sentence, keyword)) {
                    System.out.println(sentence);
                    break;
                }
            }
        }
    }
    public static boolean contains(String str1, String str2) {

        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            int count = 0;
            while (count < str2.length() && str1.charAt(i+count)== str2.charAt(count)) {
             count++;
            }
            if (count == str2.length()) {
                return true;
            }
        }
        return false;
    }
    }

