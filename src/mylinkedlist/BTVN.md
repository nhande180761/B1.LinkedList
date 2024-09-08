1 Giải thích tại sao khi a dùng
for (int i = 1; i <= index; i++){
temp = temp.next;
}
thì temp nó là node tại vị trí index (VD: index=2)
VD: 1 -> 2 -> 3 -> 4 -> 5 
Tại i = 1 temp đi từ node 1 -> 2
Tại i = 2 temp đi từ 2 -> 3 và dừng vòng lặp
tức là tại index =2 sẽ là node 3


///////////////////////////////////////
còn nếu anh dùng ntn:
for (int i = 1; i < index; i++){
temp = temp.next;
}
thì temp nó là node trước vị trí index (VD: index=2)
VD: 1 -> 2 -> 3 -> 4 -> 5
Tại i = 1 temp đi từ node 1 -> 2 sẽ kết thúc
tức là tại index =2 sẽ lấy node đứng trước index đó tức là node 2


