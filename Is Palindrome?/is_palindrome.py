def is_palindrome(s):
    s = [_.lower() for _ in s if _.isalnum()]
    left, right = 0, len(s) - 1

    while left < right:
        if s[left] != s[right]:
            return False
        left += 1
        right -= 1

    return True


if __name__ == "__main__":
    string = input("Enter a potential palindrome: ")
    print(is_palindrome(string))