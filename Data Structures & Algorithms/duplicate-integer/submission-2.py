class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        placeholder = []
        for number in nums:
            if number in placeholder:
                return True
            else:
                placeholder.append(number)
        
        return False
            
        