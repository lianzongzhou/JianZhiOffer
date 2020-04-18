public class ReplaceBlank {
    public static void main(String[] args) {
        //test
        StringBuffer s = new StringBuffer();
        s.append("Hello World !!");
        System.out.println("方法1");
        System.out.println(s.toString());
        replaceSpace1(s);
        System.out.println(s.toString());
        System.out.println("方法2");
        String s2="We are happy !!";
        System.out.println(s2);
        System.out.println(replaceSpace2(s2));
    }

    //method—1
    private static String replaceSpace1(StringBuffer str) {
        //原数组的长度
        int oldLen = str.length();
        //每出现一个空格，在结尾添加两个任意字符，扩充字符串长度
        for (int i = 0; i < oldLen; i++) {
            if (str.charAt(i) == ' ') {
                str.append("12");
            }
        }
        int i = oldLen - 1;      //原长度
        int j = str.length() - 1;//新长度
        //从后往前循环
        while (i >= 0 && j > i) {
            char c = str.charAt(i);
            i--;
            if (c == ' ') {//每出现一个空格，替换为%20
                str.setCharAt(j, '0');
                j--;
                str.setCharAt(j, '2');
                j--;
                str.setCharAt(j, '%');
                j--;
            } else {//否则照旧
                str.setCharAt(j, c);
                j--;
            }
        }
        return str.toString();
    }

    //method-2
    private static String replaceSpace2(String s) {
        int n = s.length();
        char[] arr = new char[n * 3];
        int size = 0;
        char c;
        for (int i = 0; i < n; i++) {
            c = s.charAt(i);
            if (c == ' ') {
                arr[size] = '%';
                size++;
                arr[size] = '2';
                size++;
                arr[size] = '0';
                size++;
            } else {
                arr[size] = c;
                size++;
            }
        }
        String out = new String(arr, 0, size);
        return out;

    }
}