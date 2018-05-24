package com.noak.dynamicproxy.cglibproxy;

import com.noak.dynamicproxy.jdkproxy.BookFacade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author noak
 * @date 2018-05-24 17:45
 */
@Slf4j
public class BookFacadeImpl1 implements BookFacade {
    @Override
    public void addBook() {
      log.info("增加图书");
    }
}
