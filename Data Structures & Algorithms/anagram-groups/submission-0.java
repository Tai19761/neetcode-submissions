class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] toArray = s.toCharArray();
            Arrays.sort(toArray);
            String st = new String(toArray);
            map.putIfAbsent(st, new ArrayList<String>());
            map.get(st).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
