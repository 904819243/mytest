package Test;

import java.util.ArrayList;

public class Test01 {
    /*
    2.定义测试类Test,完成以下要求：

    ①定义方法，public static ArrayList<User> getUser(ArrayList<User> users)，获得年龄大于等于18岁，并且性别为 “男”的User，加入新的集合并返回。

   ②在main方法中完成以下功能：创建5个User对象并赋值，加入ArrayList<User>集合中，调用getUser方法，并输出返回的新集合中所有元素信息，格式如下：
     */
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>(5);
        User u1 = new User("小明", 18, "男");
        User u2 = new User("小红", 16, "女");
        User u3 = new User("小张", 25, "男");
        User u4 = new User("张三", 15, "女");
        User u5 = new User("李四", 19, "男");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        ArrayList<User> array = filterArray(list);

        for (int i = 0; i < array.size(); i++) {
            User u = array.get(i);
            System.out.println(u.getName()+" " + u.getAge() +" "+ u.getSex());
        }
    }

    public static ArrayList<User> filterArray(ArrayList<User> arr) {
        ArrayList<User> newList = new ArrayList<>();
        for (int i = 0; i <arr.size(); i++) {
            User a=arr.get(i);
            if (a.getAge()>=18&&a.getSex()=="男"){
                newList.add(a);
            }
        }
         return newList;

    }
}

