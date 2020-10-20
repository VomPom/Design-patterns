package julis.wang.proxy;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/20 09:53
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class BookSellerProxy implements IBookSeller {
    BookSeller bookSeller;

    public BookSellerProxy(BookSeller bookSeller) {
        this.bookSeller = bookSeller;
    }

    @Override
    public void sellBook() {
        System.out.println("BookSellerProxy sell book then>>");
        bookSeller.sellBook();
    }
}
