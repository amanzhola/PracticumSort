package nay.kirill.pratcicum.forth.pages.text;
import nay.kirill.pratcicum.forth.pages.ComparableItem;
/*
public class TextItem {

    private static int counter;

    private String text;

    private int order = counter++;

    public TextItem(String text) {this.text = text;}

    public String getText() {
        return text;
    }
}

 */

public class TextItem implements ComparableItem<TextItem> {

    private static int counter;

    private String text;

    private int order = counter++;

    public TextItem(String text) {this.text = text;}

    public String getText() {
        return text;
    }

    @Override
    public int compare(TextItem item) {
        if (item.order == order) return 0;

        return order > item.order ? 1 : -1;
    }

}
/*

Выводы:
Цель использования:

В первом примере используется интерфейс ComparableItem для предоставления возможности
сравнения объектов TextItem по порядковому номеру,
что может быть полезно для сортировки по времени создания.
Во втором примере используется интерфейс Comparator,
позволяющий сравнивать объекты TextItem по строковому значению,
делая его более универсальным для сравнения по разным критериям.
Гибкость:

Реализация Comparator позволяет создавать различные способы сортировки
для одного и того же класса, тогда как Comparable обеспечивает
единственное определение порядка.

Объектная семантика:

В первом примере акцент сделан на самом экземпляре объекта и его свойстве order,
тогда как во втором акцент сделан на сравнении двух различных объектов,
 что соответствует принципам функционального программирования.
Таким образом, выбор между этими двумя подходами зависит от требуемой логики сравнения
и использования объектов TextItem в вашей программе.


 */