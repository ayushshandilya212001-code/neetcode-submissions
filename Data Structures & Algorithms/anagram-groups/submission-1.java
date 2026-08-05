class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> tempAns = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String temp1 = new String(temp);
            tempAns.computeIfAbsent(temp1, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(tempAns.values());
    }
}
