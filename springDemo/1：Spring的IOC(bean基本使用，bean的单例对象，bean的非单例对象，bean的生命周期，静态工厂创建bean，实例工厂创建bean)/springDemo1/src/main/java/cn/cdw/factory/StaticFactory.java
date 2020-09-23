package cn.cdw.factory;

import cn.cdw.service.User;
import cn.cdw.service.impl.UserImpl;

/**
 * @author DW-CHEN
 * 通过静态来创建Bean对象
 */
public class StaticFactory {
    public static User getUser() {
        System.out.println("静态工厂执行了....");
        return new UserImpl();
    }
}
