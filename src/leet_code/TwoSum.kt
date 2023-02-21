package leet_code

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val array = IntArray(2)
    for (i in array) {
        array[array.indexOf(i)] = scanner.nextInt()
    }
    val target = scanner.nextInt()
    val result = TwoSum.twoSum(array,target)
    for (i in result) {
        println(result.indexOf(i))
    }
}

/**
 * Given an array of integers numbers and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
class TwoSum {
    companion object {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val array: IntArray = IntArray(2)
            for ((k,i) in nums.withIndex()) {
                for ((j,l) in nums.withIndex()) {
                        if (i + l == target && k != j) {
                            array[0] = k
                            array[1] = j
                            break
                        }
                    }
            }
            return array
        }
    }
}