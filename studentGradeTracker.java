
import java.util.Scanner;

public class studentGradeTracker {
   public studentGradeTracker() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the number of students:-");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         System.out.println("Enter the grade for student " + (var4 + 1) + ":");
         var3[var4] = var1.nextInt();
      }

      double var8 = calculateAvg(var3);
      int var6 = calculateHighScore(var3);
      int var7 = calculateLowScore(var3);
      System.out.println("Avarage Score:-" + var8);
      System.out.println("Highest Score:-" + var6);
      System.out.println("Lowest Score:-" + var7);
      var1.close();
   }

   private static double calculateAvg(int[] var0) {
      int var1 = 0;
      int[] var2 = var0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2[var4];
         var1 += var5;
      }

      return (double)var1 / (double)var0.length;
   }

   private static int calculateHighScore(int[] var0) {
      int var1 = var0[0];
      int[] var2 = var0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2[var4];
         if (var5 > var1) {
            var1 = var5;
         }
      }

      return var1;
   }

   private static int calculateLowScore(int[] var0) {
      int var1 = var0[0];
      int[] var2 = var0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2[var4];
         if (var5 < var1) {
            var1 = var5;
         }
      }

      return var1;
   }
}
