# You are given an integer array coins representing coins of different denominat
# ions and an integer amount representing a total amount of money. 
# 
#  Return the fewest number of coins that you need to make up that amount. If th
# at amount of money cannot be made up by any combination of the coins, return -1.
#  
# 
#  You may assume that you have an infinite number of each kind of coin. 
# 
#  
#  Example 1: 
# 
#  
# Input: coins = [1,2,5], amount = 11
# Output: 3
# Explanation: 11 = 5 + 5 + 1
#  
# 
#  Example 2: 
# 
#  
# Input: coins = [2], amount = 3
# Output: -1
#  
# 
#  Example 3: 
# 
#  
# Input: coins = [1], amount = 0
# Output: 0
#  
# 
#  Example 4: 
# 
#  
# Input: coins = [1], amount = 1
# Output: 1
#  
# 
#  Example 5: 
# 
#  
# Input: coins = [1], amount = 2
# Output: 2
#  
# 
#  
#  Constraints: 
# 
#  
#  1 <= coins.length <= 12 
#  1 <= coins[i] <= 231 - 1 
#  0 <= amount <= 104 
#  
#  Related Topics Dynamic Programming 
#  👍 6721 👎 193


# leetcode submit region begin(Prohibit modification and deletion)
import cmath


class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:

        def dp(n):
            if n == 0:
                return 0
            if n < 0 :
                return -1
            res  = cmath.inf
            for coin in coins:
                if n - coin < 0:
                    continue
                res = min(res, dp(n-coin) + 1)

            return  res if res != cmath.inf else -1
        return  dp(amount)

        
# leetcode submit region end(Prohibit modification and deletion)
