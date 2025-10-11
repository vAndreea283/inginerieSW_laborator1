import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
//    public static String reverse(String input) {
//        String output = "";
//        for (int i = input.length() - 1; i >= 0; i--) {
//            output += input.charAt(i);
//        }
//        return output;
//    }
    public static void main(String[] args) {
//////        System.out.println("Hello world!");
//////        char c = 'a';
//////        int len = 'z' - 'a';
//////        for(int i=0; i<=len; i++) {
//////            int next = c + i;
//////            char nextChar = (char)next;
//////            System.out.println(nextChar);
//////        }
////
////        String input = "A inceput scoala.";
////        String output = reverse(input);
////        System.out.println(input);
////        System.out.println(output);
//
//        Random random = new Random();
//        List<Integer> list = new ArrayList<>();
//        // cream lista de 10 numere aleatoare intre 5 si 25
////        for (int i = 0; i < 10; i++) {
////            int number = random.nextInt(21) + 5; // rand.nextInt(21) -> [0..20], +5 -> [5..25]
////            list.add(number);
////        }
//
//        IntStream.range(0, 10).forEach(v -> {list.add(random.nextInt(21) + 5);});
//
//        System.out.println(list);
//        // cream o noua lista pastrand doar elementele intre 10 si 20
//        List<Integer> listaFiltrata = new ArrayList<>();
////        for (int num : list) {
////            if (num >= 10 && num <= 20) {
////                listaFiltrata.add(num);
////            }
////        }
//        List<Integer> l = list.stream().filter(v -> v>=10 && v<=20).toList();
//        System.out.println(listaFiltrata);
//
////        if (!list.isEmpty()) {
////            int max = list.get(0);
////            int min = list.get(0);
////            for (int num : list) {
////                if (num > max) max = num;
////                if (num < min) min = num;
////            }
////            System.out.println(max);
////            System.out.println(min);
////        }
//        int max = l.stream().max(Integer::compareTo).orElse(0);
//        int min = l.stream().min(Integer::compareTo).orElse(0);
////        System.out.printf("\nmin = %d, max = %d\n", min, max);
////        String s = String.format("max = %10d, min = %d", max, min);
//    }
        int n=5, m=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                
                if(i==0 || j==0 || i==n-1 || j==m-1 || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}