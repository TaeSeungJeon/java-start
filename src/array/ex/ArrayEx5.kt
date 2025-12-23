package array.ex

import java.util.*

object ArrayEx5 {
    @kotlin.jvm.JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        print("입력받을 숫자의 개수를 입력하세요: ")
        val count = scanner.nextInt() // 몇개 받을건지

        val num = IntArray(count)
        var sum = 0
        val avg: Double

        println(count.toString() + "개의 정수를 입력하세요.")
        for (i in 0..<count) {
            num[i] = scanner.nextInt()
            sum += num[i]
        }
        avg = sum.toDouble() / count
        println("입력한 정수의 합계: " + sum)
        println("입력한 정수의 평균: " + avg)
    }
} // 11행 몇개 받을건지 작동시켜주는 작업 생각하지 못했음.. 오답
// 오늘은 여기까지 해보려고한다.
// 역시 아직 많이 멀었고 험난하다는 생각이든다...
// 배열에서부터 난이도, 코드 읽는방법들이 확 난이도가 올라간 것 같은 느낌이다.
// 지금부터 더 집중해서 반복 코드, 문제풀이, 복습 등
// 학습을 더 요구하는 단계라고 생각이 든다.
// 내일도 화이팅...!!!!!!

