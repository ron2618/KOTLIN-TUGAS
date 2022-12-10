/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
package twoten;

import java.util.Scanner;
fun main() {
    
    var total:Int;
   
    val nilai = Array<Int>(2){0}
   
   
    val input = Scanner(System.`in`)
    
    for (i in 0..1) {
    print("Masukan 2 nilai yang di inginkan : ");
    
    nilai[i] = input.nextInt();
    
}
print("Nilai yang telah di masukan adalah :  ");
 for (i in 0..1) {
   print(nilai[i].toString()+",");
   }
  println("");
   total = nilai[0]+nilai[1];
   print("Jumlah nilai tersebut adalah  :  "+total.toString());
   println("");
    print("Rata Rata nilai  :  "+(total/2).toString());
     println("");
    if((total/2) > 6){
    println("LULUS");
    }else{
    println("Tidak LULUS");}

	
}
