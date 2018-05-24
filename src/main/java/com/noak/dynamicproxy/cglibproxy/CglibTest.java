package com.noak.dynamicproxy.cglibproxy;

/**
 * @author noak
 * @date 2018-05-24 17:58
 */
public class CglibTest {
    public static void main(String[] args) {
        BookFacadeImpl1 bookFacade=new BookFacadeImpl1();
        BookFacadeCglib  cglib=new BookFacadeCglib();
        BookFacadeImpl1 bookCglib=(BookFacadeImpl1)cglib.getInstance(bookFacade);
        bookCglib.addBook();
    }
}
