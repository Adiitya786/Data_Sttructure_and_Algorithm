public class Remove_Duplicate_string {

    public static void Remove_dup(String str, int idx, StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char curr_char = str.charAt(idx);
        if(map[curr_char-'a'] == true){
            // duplicate
            Remove_dup(str,idx+1, newStr, map);
        }
        else{
            map[curr_char-'a'] = true;
            Remove_dup(str, idx+1, newStr.append(curr_char), map);
        }
    }
    public static void main(String[] args) {
        String str = "adityaprajapati";
        Remove_dup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
