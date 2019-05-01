# hotelsRating
# Отели
Перед началом летнего сезона тур агенство решило назначить звездность N отелям. то есть каждому отелю должно быть присвоено определенное количество звезд — от 1 до 5. Про каждый отель известен его рейтинг — целое число от 1 до 100. Все рейтинги различны.

После присвоения всем отелям звёздности для любых двух отелей должно выполняться следующее свойство — если рейтинг отеля А больше чем рейтинг отеля В, то количество звезд, присвоенное отелю А, должно быть не меньше, чем количество звезд, присвоенное отелю В.

Перед вами стоит задача назначить количество заезд каждому отелю таким образом, чтобы выполнилось описанное выше свойство а также, чтобы отелей каждой звездности было поровну. Гарантируется, что N кратно пяти.

## Входные данные
В первой строке следует целое положительное число N (5 <= N <= 100) — количество отелей, N кратно 5.

Во второй строке следует последовательность из N различных целых положительных чисел а1,а2, аN (1 <= ai <= 100) где аi равно рейтингу i-ого отеля.
## Выходные данные

Выведите N целых чисел от 1 до 5, где i-е число должно быть равно звёздности i-го отеля.

### Примеры

### ВХОДНЫЕ данные

5 

99 2 100 50 1

### ВЫХОДНЫЕ данные

4 2 5 3 1 

### ВХОДНЫЕ данные

10 

100 90 10 20 50 60 40 30 80 70

### ВЫХОДНЫЕ данные
5 5 1 1 3 3 2 2 4 4