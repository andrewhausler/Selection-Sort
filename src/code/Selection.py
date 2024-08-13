import random as rd

class Selection:
    # Constructor
    # Takes Parameter listSize Which Determines The Size Of The List
    def __init__(self, listSize):
        self.list = [rd.randint(1, 21) for i in range(listSize)]
    # Sort Method
    # Sorts The List Using Selection Sort
    def sort(self):
        # Iterates Through The Length Of List
        for i in range(len(self.list)):
            # Grabs Current I Index Number
            minIndex = i
            # Iterates Through The Unsorted Portion Which Changes Depending On I
            for j in range(i+1, len(self.list)):
                # Keeps Swapping Until It Reaches Last Index
                if(self.list[j] < self.list[minIndex]):
                    minIndex = j
            # Now Smallest Index Has Been Found And Now Swaps Spots With Current I Index Location
            self.list[minIndex], self.list[i] = self.list[i], self.list[minIndex]
        return
    # Returns The List As A Sting Instead Of Memory Address
    def __str__(self):
        return f"{self.list}"

# Runs This Only When This File Is Seperatly Executed 
if __name__ == "__main__":
    mySelection = Selection(5)
    print(f"Unsorted: {mySelection}")
    mySelection.sort()
    print(f"Sorted: {mySelection}")
