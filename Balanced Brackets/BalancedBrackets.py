brackets = input("Enter the brackets string\n")

def check_balance(brackets):  # The argument is a string of combinations made by '[' and ']' only
    count = 0
    
    if len(brackets) == 0:
        return True

    for i in brackets:
        if i == "[":
            count += 1
        else:
            count -= 1
            if count < 0:
                return False
    if count == 0:
        return True
    
    return False

print("Balanced" if check_balance(brackets) else "Unbalanced")
