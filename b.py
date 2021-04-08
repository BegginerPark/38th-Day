def Bsearch(arr, search):
    head = 0
    tail = len(arr)-1

    while head <= tail:
        center = round((head +tail)/2)
        if arr[center] == search:
            print("%d 번째 요소와 일치 합니다." %center)
            break
        elif arr[center] <= tail:
            head = center + 1
        else:
            tail = center -1 
        if head > tail:
            print("해당 값을 찾지 못했습니다.")


search = int(input("search number: "))
arr = [11,13,17,19,23,29,31]
Bsearch(arr, search)