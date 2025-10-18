def name_value(name):
    total = 0
    for ch in name.lower():
        if 'a' <= ch <= 'z':
            total += ord(ch) - ord('a') + 1
    return total

def load_names(path):
    with open(path, 'r') as f:
        content = f.read()
    names = [s.strip('"') for s in content.split(',') if s]
    names.sort()
    return names

def total_name_scores(names):
    total = 0
    for i, name in enumerate(names, start=1):
        total += i * name_value(name)
    return total

names = load_names('0022_names.txt')
print(total_name_scores(names))