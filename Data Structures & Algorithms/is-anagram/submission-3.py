class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # two hash tables to store the frequency of each character
        # if the frequency is the same in both strings, return true
        frequencyS = {}
        frequencyT = {}

        for char in s:
            if char not in frequencyS:
                frequencyS[char] = 1
            frequencyS[char] += 1
        
        for char in t:
            if char not in frequencyT:
                frequencyT[char] = 1
            frequencyT[char] += 1

        if frequencyS == frequencyT:
            return True
        return False