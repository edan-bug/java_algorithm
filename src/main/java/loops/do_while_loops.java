///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package loops;
//
///**
// *
// * @author ed
// */
//
//
//
//public class do_while_loops {
//    private static BufferedReader br;
//    private static StringTokenizer st;
//    private static PrintWriter pw;
//    public static void main(String[] args) throws Exception {
//        br = new BufferedReader(new InputStreamReader(System.in));
//        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//        //int qq = 1;
//        int qq = Integer.MAX_VALUE;
//        //int qq = readInt();
//        for(int casenum = 1; casenum <= qq; casenum++)    {
//            String s = nextToken();
//            LinkedList<Character> q = new LinkedList<Character>();
//            for(int i = 0; i < s.length(); i++) {
//                if(!q.isEmpty() && q.peekLast() == s.charAt(i)) {
//                    q.removeLast();
//                }
//                else {
//                    q.addLast(s.charAt(i));
//                }
//            }
//            for(char out: q) {
//                pw.print(out);
//            }
//            if(q.size() == 0) {
//                pw.print("Empty String");
//            }
//            pw.println();
//        }
//        exitImmediately();
//    }
//    private static void exitImmediately() {
//        pw.close();
//        System.exit(0);
//    }
//    private static long readLong() throws IOException {
//        return Long.parseLong(nextToken());
//    }
//    private static double readDouble() throws IOException {
//        return Double.parseDouble(nextToken());
//    }
//    private static int readInt() throws IOException {
//        return Integer.parseInt(nextToken());
//    }
//    private static String nextLine() throws IOException  {
//        if(!br.ready()) {
//            exitImmediately();
//        }
//        st = null;
//        return br.readLine();
//    }
//    private static String nextToken() throws IOException  {
//        while(st == null || !st.hasMoreTokens())  {
//            if(!br.ready()) {
//                exitImmediately();
//            }
//            st = new StringTokenizer(br.readLine().trim());
//        }
//        return st.nextToken();
//    }
//}
//
//
