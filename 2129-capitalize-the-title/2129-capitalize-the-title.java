class Solution {
    public String capitalizeTitle(String title) {
        String titleArray[] = title.split(" ");
        String ans = "";
        for(int i = 0; i<titleArray.length; i++){
            String word = titleArray[i];
            if(word.length()<=2){
                ans = ans + word.toLowerCase();
            }
            else{
                ans = ans + Character.toUpperCase(word.charAt(0))
                + word.substring(1).toLowerCase();
            }
             if (i < titleArray.length - 1) {
                ans = ans + " ";
            }
        }
        return ans;
    }
}