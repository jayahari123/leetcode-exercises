class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            int j = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == separator) {
                    if (!word.substring(j, i).isEmpty()) {
                        result.add(word.substring(j, i));
                    }
                    j = i + 1;
                } else if (i == word.length() - 1)
                    if (!word.substring(j, i + 1).isEmpty())
                        result.add(word.substring(j, i + 1));

            }
        }
        return result;
    }
}