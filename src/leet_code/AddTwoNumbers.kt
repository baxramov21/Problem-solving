package leet_code

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val array = LinkedList<Int>()
    for (i in array) {
        array[array.indexOf(i)] = scanner.nextInt()
    }
    val target = LinkedList<Int>()
    for (i in target) {
        target[target.indexOf(i)] = scanner.nextInt()
    }

    val result = AddTwoNumbers.addTwoNumbers(array,target)
    if (result != null) {
        for (i in result) {
            println(i)
        }
    }
}

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

class AddTwoNumbers {
    companion object {
        fun addTwoNumbers(l1: LinkedList<Int>?, l2: LinkedList<Int>?): LinkedList<Int>? {
            val list = LinkedList<Int>()
            var firstSum = 0
            var secondSum = 0

            if (l1 != null && l2 != null) {
                for (i1 in l1) {
                    for (i2 in l2) {
                        list[l1.indexOf(i1)] = i1 + i2
                    }
                }
            }
            return list
        }
    }
}