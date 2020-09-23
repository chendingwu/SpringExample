package cn.cdw.factory;

import cn.cdw.service.User;
import cn.cdw.service.impl.UserImpl;

/**
 * @author DW-CHEN
 * 通过实例工厂创建对象
 */
public class InstanceFactory {
    public User getUser() {
        System.out.println("实例工厂执行了....");
        return new UserImpl();
    }
}
