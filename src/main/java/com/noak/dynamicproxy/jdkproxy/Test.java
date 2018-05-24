package com.noak.dynamicproxy.jdkproxy;

/**
 * @author noak
 * @date 2018-05-24 17:48
 */
public class Test {
    public static void main(String[] args) {
        BookFacade service = new BookFacadeImpl();
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade bookFacade = (BookFacade) proxy.bind(service);
        bookFacade.addBook();
    }
}
