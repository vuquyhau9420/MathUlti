/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static hau.ulti.MathUlti.computeFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class MathUltiTest {
    
    @Test  //Báo cho JVM biết rằng đây là hàm main - mỗi hàm có dấu @Test là main
    //trong hàm này chứa các lệnh để test code của chính mình
    //ở bên MathUlti
    //thành công: cF(5) -> ói về 120 gọi là thành công
    public void testSuccessfullCases(){
        //assertEquals(30, 50);
        //kỳ vọng 30, xem thực tế đưa vào là bn 50
        //
        //2 thứ khớp nhau, xử lí như dự kiến , đènn xanh -> thông đường
        //                                     đèn đỏ -> kẹt
        assertEquals(120,computeFactorial(5));
        assertEquals(720,computeFactorial(6));
        assertEquals(1,computeFactorial(0));
        assertEquals(1,computeFactorial(1));
        assertEquals(2,computeFactorial(2));
        // Muốn xanh thì phải đều xanh, đúng hết mọi case
        //Nếu tất cả xanh, có 1 thằng đỏ, coi như cả đám đỏ
        //vì hàm ý: code phải chạy đúng cho mọi tình huống
        //ta chỉ cần nhìn xanh đỏ, khỏi cần dò bằng mắt
    }
    
    @Test(expected = IllegalArgumentException.class) //annotation, dấu hiệu để báo cho JVM và thư viện jar liên quan biết cần phải làm gì
    //hàm này chứa các tình huống cà chớn, ví dụ cF(-5), cF(16)
    public void testFailCases(){
        //Kỳ vọng ném ra ngoại lệ thì coi như code ngon, vì -5 không tính giai thừa được
        //ngoại lệ hông phải là 1 value để có thề so sánh đc nên k dùng assertEquals() dc
        //Vì hàm này cần 2 value expected và actual
        //trong khi đó ném ra ngoại lệ k phải là actual values để so sánh
        //ta phải xài chiêu khác khi bắt ngoại lệ coi có đúng là ngoại lệ mình cần k 
        computeFactorial(-5);
    }
    
    //code có thề còn tiềm ẩn lỗi logic nhưng Clean & Build
    //vẫn luôn ra file .jar nếu code không sai cú pháp
    //vậy thì nguy hiểm 
    //mình phải DISABLE cái nút CLEAN & BUILD nếu code còn màu đỏ
    //tức là còn ERROR LOGIC
    //nhớ 2 con số: 1005 Netbeans, 1204 Netbeans 10 trở lên
    //khi chơi với Ant project
}
