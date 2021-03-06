/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hau.ulti;

/**
 *
 * @author admin
 */
//đây là class chứa các hàm toán học tính toán, với mục tiêu xài chung
//cho các nơi khác , cái gì mang tính chất xái chung ta sẽ dùng STATIC
public class MathUlti {
    //tính n! = 1.2.3.4...n Vì n! tăng giá trị tăng rất nhanh nên ta phải dùng long mới an toàn
    //int tối đa 2 tỷ 1
    public static long computeFactorial(int n){
        if(n < 0  || n > 15 )
            throw new IllegalArgumentException("Invaid input, n must be >= 0");
        if(n == 0 || n == 1)
            return 1;
        //điều kiện dừng của đệ quy
        //sống sót đến lệnh chỗ này thì n chắc chắn rơi vào 2...15
        // k cần else
        return n * computeFactorial(n-1);//n*(n-1)
    }
}
