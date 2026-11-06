class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        frequencies = {}

        for num in nums:
            if num in frequencies:
                frequencies[num] += 1
            else:
                frequencies[num] = 1


        sorted_pairs = sorted(frequencies.items(), key=lambda pair: pair[1], reverse=True)

        return [pair[0] for pair in sorted_pairs[:k]]