public class Frequency_Counter {
    private int[] frequency_array;

    public Frequency_Counter() {
        frequency_array = new int[52];
    }

    public void Count(String content) {
        for (char ch : content.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                frequency_array[ch - 'A']++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                frequency_array[ch - 'a' + 26]++;
            }
        }
    }
    public int[] getFrequencies() {
        return frequency_array;
    }
}
