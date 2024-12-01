package nay.kirill.pratcicum.forth.pages.image;
import nay.kirill.pratcicum.forth.pages.ComparableItem;
/*
public class ImageItem {

    public ImageItem(String url) {
        this.url = url;
    }

    private String url;

    public String getUrl() {
        return url;
    }
}

 */

public class ImageItem implements ComparableItem<ImageItem> {

    public ImageItem(String url) {
        this.url = url;
    }

    private String url;

    public String getUrl() {
        return url;
    }

    @Override
    public int compare(final ImageItem item) {
        if (url.equals(item.url)) return 0;

        return url.charAt(0) > item.url.charAt(0) ? 1 : -1;
    }
}
/*
В первом примере объекты сравниваются на основе собственного интерфейса ComparableItem,
фокусируясь только на первом символе строки, что ограничивает возможности сравнения.
Во втором примере используется интерфейс Comparator,
что позволяет по-разному сравнивать объекты в зависимости от контекста.
 */
