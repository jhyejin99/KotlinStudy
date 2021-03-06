package ch02.section01

/** 정수형
* 사용하는 숫자 크기에 따라, 부호에 따라 타입 정해서 사용하기
* 부호O : Long, Int, Short, Byte
* 부호X : ULong, UInt, UShort, UByte
*/

/**실수형
* Double(기본), Float - :Float 또는 접미사F 사용
* 지수 : 수학 3.10*(10)^16 -> 3.14E+16 코드
*
* 부동 소수점 표현
* -12.375(10)의 표현
* 음수 표현 : 맨 앞 부호비트 127(bias) 기준값을 가지고 음수표현 (더해야함)
* 절대값 12.375 : 이진 표기 - 1100.011 - 1.100011 * 2^3 (맨 앞 1 생략)
* 100011을 가수부에 표현 후 나머지 비트 0으로 채움
* 지수부는 2^3에서 3을 사용, (음수)127+3 = 130 - 이진 - 10000010 표현
* ' 부호비트 / 지수부 / 가수부 '
* ' 1 / 10000010 / 1000110000000000000000 '
*/

fun main() {
    // 자료형 생략
    val num1 = 127 // Int형
    val num2 = -32768 // Int형
    val num3 = 2147483647 // Int형
    val num4 = 9223372036854775807 // Long형

    // 접미사 접두사 사용
    val exp1 = 423 // Int형
    val exp2 = 423L // 접미사L : Long형
    val exp3 = 0x0F // 접두사 0x : 16진 (0~F) - 15
    val exp4 = 0b00001011 // 접두사 0b : 2진 (0,1) - 11

    // 작은 값 사용
    val exp5: Byte = 127 // 명시적으로 자료형 지정
    val exp6 = 32767 // 명시적으로 자료형 지정X, Short형 범위 값도 Int형으로 추론

    // 부호 없는 정수 자료형
    val uint: UInt = 153u
    val ulong: ULong = 46322342uL

    // 큰 수 읽기 쉽게 하기 위해 언더바 포함해 표현 가능
    val cardNum = 1234_1234_1234_1234L

    // IEEE 방식의 부동 소수점 제한
    var num: Double = 0.1
    for( x in 0..999 ) {
        num+=0.1 // num = num + 0.1
    }
    println("num: $num") //100.09999999999859
}