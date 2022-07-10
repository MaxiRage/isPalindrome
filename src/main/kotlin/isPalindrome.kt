/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun isPalindrome(head: ListNode?): Boolean {
    var result = mutableListOf<Int>()
    var iter = head
    while (iter != null) {
        result.add(iter.`val`)
        iter = iter.next
    }
    return result == result.reversed()
}