package leetcode

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var cnt = 0
        var q = 0

        for (i in 0 until nums.size) {
            if (nums.get(i) === `val`) {
                cnt++
                continue
            }
            nums[q++]= nums.get(i)
        }
        return nums.size - cnt
    }
}