package cn.cdw.mapper.impl;

import cn.cdw.mapper.UserDao;
import cn.cdw.pojo.User;

import java.util.*;

/**
 * @author DW-CHEN
 * 集合类型数据注入
 */

public class UserDaoImpl implements UserDao {
    private ArrayList arrayList;  //list集合
    private Properties properties; //properties
    private Object[] arr; //数组
    private HashSet hashSet; //set集合
    private HashMap<String,Object> hashMap; //map集合

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public void setHashSet(HashSet hashSet) {
        this.hashSet = hashSet;
    }

    public void setHashMap(HashMap<String, Object> hashMap) {
        this.hashMap = hashMap;
    }

    public void testUserDao() { //遍历
        System.out.println("=========================遍历list集合==============================");
        for (Object s : arrayList) {//遍历properties
            System.out.println(s);
        }

        System.out.println();
        System.out.println("==========================遍历properties=============================");
        Enumeration<?> enumeration = properties.propertyNames(); //遍历properties
        while (enumeration.hasMoreElements()) {
            Object key = enumeration.nextElement();
            System.out.println( key+ "  " + properties.get(key));
        }

        System.out.println();
        System.out.println("=============================遍历数组==========================");
        for (Object i : arr) { //遍历数组
            System.out.println(i);
        }

        System.out.println();
        System.out.println("============================遍历set集合===========================");
        Iterator iterator = hashSet.iterator(); //遍历set集合
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("==========================遍历map集合=============================");
        Set<Map.Entry<String, Object>> entries = hashMap.entrySet();//遍历map集合
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        User user = (User) hashMap.get("user1");
        System.out.println(user.getName() + " " + user.getAge());
    }
}
