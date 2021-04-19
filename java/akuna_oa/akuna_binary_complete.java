import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class akuna_binary_complete {
    private static class TrieNode{
        TrieNode[] children = new TrieNode[2];
        int prefix = -1;

        public TrieNode(int prefix){
            this.prefix= prefix;
        }
    }

    public static TrieNode root = new TrieNode(-1);

    public static List<Integer> autoComplete(List<String> command){
        List<Integer> output = new ArrayList<>();
        int index = 1, res = 0;
        for (String com : command){
            TrieNode node = root;
            // always write the newest

            for (char c : com.toCharArray()){
                int temp = c-'0';

                //if the current branch does not exist
                if (node.children[temp] == null){
                    node.children[temp] = new TrieNode(index);
                    node = node.children[temp];

                    continue;
                }

                // if exist, will need to update the posiiton in the result
                res = node.children[temp].prefix;
                node.children[temp].prefix = index; // update the index to the latest input one
                node = node.children[temp];

            }
            // finish loop,
            output.add(res);
            res = index;    // if there is no existant element, returen itself
            index++;

        }
        return  output;
    }

    private static akuna_binary_complete autoComplete = new akuna_binary_complete();
    public static void  main(String[] args){
        List<String> commands = new ArrayList<>();
        commands.addAll(Arrays.asList("000", "1101", "01", "001", "110", "11"));
        List<Integer> res = autoComplete.autoComplete(commands);
        for (int i : res) {
            System.out.println(i);
        }

    }


}
