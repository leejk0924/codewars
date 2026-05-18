package kyu4;

public class RangeExtraction {
    public static String rangeExtraction(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; ) {
            int start = i;

            while (i + 1 < arr.length && arr[i + 1] == arr[i] + 1) {
                i++;
            }

            int end = i;

            int count = end - start + 1;

            if (count >= 3) {
                sb.append(arr[start]).append("-").append(arr[end]).append(",");
            } else {
                for (int j = start; j <= end; j++) {
                    sb.append(arr[j]).append(",");
                }
            }
            i++;
        }
        if (!sb.isEmpty()) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String solution1(int[] arr) {
        String str = String.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++)
            str += (arr[i-1] == arr[i]-1 ? "<":",") + arr[i];
        return str.replaceAll("<([^,]*<)+","-").replaceAll("<",",");
    }
}
