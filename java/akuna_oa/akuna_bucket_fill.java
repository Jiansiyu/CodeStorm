public class akuna_bucket_fill {
//    public static int find(String[] board){
//        boolean[][] visited = new boolean[board.length][board[0].length()];
//        int res = 0;
//        for(int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length(); j++) {
//                if (!visited[i][j]) {
//                    res++;
//                    expand(board, visited, i, j);
//                }
//            }
//        }
//        return res;
//    }
//
//    public static void expand(String[] board, boolean[][] visited, int i, int j) {
//        if (i > 0) {
//            if (!visited[i - 1][j] && board[i - 1].charAt(j) == board[i].charAt(j)){
//                visited[i - 1][j] = true;
//                expand(board, visited, i - 1, j);
//            }
//        }
//        if (j > 0) {
//            if (!visited[i][j - 1] && board[i].charAt(j - 1) == board[i].charAt(j)){
//                visited[i][j - 1] = true;
//                expand(board, visited, i, j - 1);
//            }
//        }
//        if (i < board.length - 1) {
//            if (!visited[i + 1][j] && board[i + 1].charAt(j) == board[i].charAt(j)){
//                visited[i + 1][j] = true;
//                expand(board, visited, i + 1, j);
//            }
//        }
//        if (j < board[0].length() - 1) {
//            if (!visited[i][j + 1] && board[i].charAt(j + 1) == board[i].charAt(j)){
//                visited[i][j + 1] = true;
//                expand(board, visited, i, j + 1);
//            }
//        }
//    }

    public static int find(String[] board){
        boolean[][] visited = new boolean[board.length][board[0].length()];


        int res= 0;

        for (int i = 0 ; i  < board.length; i++){
            for (int j = 0; j < board[0].length(); j++){
                if (!visited[i][j]){
                    res += 1;
                    expand(board,visited,i,j);
                }

            }
        }
        return res;
    }

    public static void expand(String[] board,boolean[][] visited, int i, int j){
        // look up the four diretion of the board
        if (i > 0) {
            if (!visited[i - 1][j] && board[i - 1].charAt(j) == board[i].charAt(j)) {
                visited[i - 1][j] = true;
                expand(board, visited, i - 1, j);
            }
        }
        if(j > 0){
            if (!visited[i][j-1] && board[i].charAt(j-1) == board[i].charAt(j)){
                visited[i][j-1] = true;
                expand(board,visited,i,j-1);
            }
        }

        if (i < board.length -1){
            if (!visited[i + 1][j] && board[i + 1].charAt(j) == board[i].charAt(j)) {
                visited[i + 1][j] = true;
                expand(board, visited, i + 1, j);
            }
        }

        if(j < board[0].length()-1){
            if (!visited[i][j+1] && board[i].charAt(j+1) == board[i].charAt(j)){
                visited[i][j+1] = true;
                expand(board,visited,i,j+1);
            }
        }

    }

    public static void main(String[] args) {
        String[] board = new String[] {"aaaba", "ababa", "aaaca"};
        System.out.println(find(board));
        System.out.println(find(new String[] {"bbba", "abba", "acaa", "aaac"}));
    }

}
