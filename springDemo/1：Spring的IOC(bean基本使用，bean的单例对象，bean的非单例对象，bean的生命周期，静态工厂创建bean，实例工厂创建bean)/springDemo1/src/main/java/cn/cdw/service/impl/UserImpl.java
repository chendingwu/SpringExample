package cn.cdw.service.impl;

import cn.cdw.service.User;

/**
 * @author DW-CHEN
 */
public class UserImpl implements User {

    public void play() {
        System.out.println("小明在玩游戏....测试通过....");
    }

    public void init() {
        System.out.println("初始化.....");
    }

    public void destroy() {
        System.out.println("销毁....");
    }
}
