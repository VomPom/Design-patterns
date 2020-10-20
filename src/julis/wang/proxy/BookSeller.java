package julis.wang.proxy;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/20 09:53
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class BookSeller implements IBookSeller {
    @Override
    public void sellBook() {
        System.out.println("BookSeller sell book.");
    }
}
