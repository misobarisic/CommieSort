def sort(arr: list) -> list:
    length = len(arr)
    for i in range(length):
        if i != length - 1:
            if arr[i] >= arr[i + 1]:
                arr.remove(arr[i+1])
                return sort(arr)
    return arr
