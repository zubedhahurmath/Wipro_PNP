package logicBuildingMettlStrings;

public class StringCode {
	public int findStringCode(String input1) {
        String[] arr = input1.split(" ");
        StringBuilder output = new StringBuilder();
        for (String str : arr) {
            int total = 0;
            int start = 0;
            int end = str.length() - 1;
            while (start <= end) {
                int first = Character.toUpperCase(str.charAt(start)) - 'A' + 1;
                int last = Character.toUpperCase(str.charAt(end)) - 'A' + 1;
                if (start == end) {
                    total += first;
                } else {
                    total += Math.abs(first - last);
                }
                start++;
                end--;
            }
            output.append(total);
        }
        return Integer.parseInt(output.toString());
    }
    public static void main(String[] args) {
        StringCode obj = new StringCode();
        String input = "WORLD WIDE WEB";
        int result = obj.findStringCode(input);
        System.out.println(result);
    }
}
