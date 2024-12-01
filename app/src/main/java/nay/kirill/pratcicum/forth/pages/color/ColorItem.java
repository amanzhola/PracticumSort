package nay.kirill.pratcicum.forth.pages.color;
import nay.kirill.pratcicum.forth.pages.ComparableItem;
/*
public class ColorItem {

    public ColorItem(int color) {
        this.color = color;
    }

    private int color;

    public int getColor() {
        return color;
    }
}

 */

public class ColorItem implements ComparableItem<ColorItem> {

    public ColorItem(int color) {
        this.color = color;
    }

    private int color;

    public int getColor() {
        return color;
    }

    @Override
    public int compare(final ColorItem item) {
        if(color == item.color) return 0;

        return color > item.color ? 1 : -1;
    }
}
/*
Сравнение по значению цвета: Сравнение осуществляется
на основе целочисленного значения color,
которое может представлять цвет в формате, например, ARGB (Alpha, Red, Green, Blue).
Если значения color равны, возвращается 0 (объекты считаются равными).
Если значения разны, метод возвращает 1 или -1 в зависимости от того,
какое значение больше.

Простота и эффективность: Сравнение значений целых чисел является простым
и быстрым действием.

other method:
Сравнение по HEX коду цвета: Вместо работы с целыми числами,
в этом примере объекты ColorItem сравниваются по их строковому представлению
colorHex (который может выглядеть как #FF5733 и т.п.).
Метод compare использует стандартную лексикографическую сортировку строк для сравнения.

Гибкость: Использование Comparator позволяет создавать несколько различных
способов сравнения объектов ColorItem.
Например, можно определить другие компараторы для сравнения по значению RGB,
или другим критериям, в зависимости от потребностей.
 */