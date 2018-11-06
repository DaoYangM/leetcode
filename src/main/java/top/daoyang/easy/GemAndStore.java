package top.daoyang.easy;

public class GemAndStore {

    public static void main(String[] args) {
        GemAndStore gemAndStore = new GemAndStore();
        System.out.println(gemAndStore.numJewelsInStones("Aa", "aAABB"));
    }
    public int numJewelsInStones(String J, String S) {
        int sumOfGem = 0;

        for (int i = 0; i < J.length(); i++) {
            String gem = J.substring(i, i + 1);

            for (int j = 0; j < S.length(); j++) {
                if (S.substring(j, j + 1).equals(gem)) sumOfGem ++;
            }
        }
        return sumOfGem;
    }
}
