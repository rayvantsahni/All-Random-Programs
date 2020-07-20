def sorted_words(s):
    words = s.split()
    words = [i.lower() + i for i in words]
    return " ".join([i[-(len(i)//2):] for i in sorted(words)])
