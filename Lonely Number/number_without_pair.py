def number_without_pair(arr):
    n = 0
    for i in arr:
        n ^= i
    return n


if __name__ == "__main__":
    arr = [1,5,3,2,5,1,6,6,2]
    print("Only number without pair is", number_without_pair(arr))