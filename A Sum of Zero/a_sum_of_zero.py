num_list = list(map(int, input().split()))  # Give a space separated array as input

def check_sum(num_list):
    from itertools import combinations

    for i in list(combinations(num_list, 2)):
        if i[0] + i[1] == 0:
            return True
    return False
                
print(check_sum(num_list))
