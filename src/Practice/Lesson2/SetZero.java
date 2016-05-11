package Practice.Lesson2;

/*
Вставити Нуль

Дано число. Треба замінити i-й біт замінити на нуль.
Наприклад:
для числа 6 в бінарному вигляді 110,
замінивши 2-й біт на нуль отримаємо 100 тобто 4.
1<= i <= 32
*/

public class SetZero {

    public int set(int num, int i) {
        // 0000 0000 0000 0000 0000 0000 0000 0110
        // 1111 1111 1111 1111 1111 1111 1111 1111
        // 1<<2 (i-1)
        // 0000 0000 0000 0000 0000 0000 0000 0100
        // ~
        // 1111 1111 1111 1111 1111 1111 1111 1011 mask
        // num & mask
        // 0000 0000 0000 0000 0000 0000 0000 0010

        int temp = 1<<(i-1);
        int mask = ~temp;
        int result = num & mask;

        return result;

    }

}
