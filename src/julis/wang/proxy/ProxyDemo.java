package julis.wang.proxy;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/20 09:48
 *
 * Description :代理模式：
 *              是一种结构型设计模式， 能提供真实服务对象的替代品给客户端使用。
 *              代理接收客户端的请求并进行一些处理 （访问控制和缓存等）， 然后再将请求传递给服务对象。
 *
 *              优缺点：
 *              优点：
 *              1、可以在客户端毫无察觉的情况下控制服务对象
 *              2、如果客户端对服务对象的生命周期没有特殊要求， 可以对生命周期进行管理
 *              3、即使服务对象还未准备好或不存在， 代理也可以正常工作。
 *              4、开闭原则。 可以在不对服务或客户端做出修改的情况下创建新代理。
 *              缺点：
 *              1、代码可能会变得复杂， 因为需要新建许多类。
 *              2、服务响应可能会延迟
 *
 * History   :
 *
 *******************************************************/

public class ProxyDemo {
    public static void main(String[] args) {
        BookSeller bookSeller = new BookSeller();
        BookSellerProxy proxy = new BookSellerProxy(bookSeller);
        proxy.sellBook();
    }
}
