package top.shmly.design.structural.composite.demo02;

import java.util.List;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 0:47
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        IRoot manager = Root.builder()
                .name("王大麻子")
                .position("Manager")
                .salary(99999)
                .build();

        IBranch devBranch = Branch.builder()
                .name("李大秃子")
                .level("leader")
                .position("Developer")
                .salary(30000)
                .build();
        Ileaf devleafA = Leaf.builder()
                .name("开发人员A")
                .position("Employee")
                .salary(8000)
                .build();
        Ileaf devleafB = Leaf.builder()
                .name("开发人员B")
                .position("Employee")
                .salary(9000)
                .build();

        IBranch peopleResourceBranch = Branch.builder()
                .name("吴大棒槌")
                .level("leader")
                .position("PeopleResource")
                .salary(22222)
                .build();
        Ileaf peopleResourceleafA = Leaf.builder()
                .name("人资人员A")
                .position("Employee")
                .salary(7000)
                .build();

        IBranch administrativeBranch = Branch.builder()
                .name("周麻婆子")
                .level("leader")
                .position("Administrative")
                .salary(23333)
                .build();
        Ileaf administrativeleafA = Leaf.builder()
                .name("行政人员A")
                .position("Employee")
                .salary(7000)
                .build();
        manager.addSubordinate(devBranch);
        manager.addSubordinate(peopleResourceBranch);
        manager.addSubordinate(administrativeBranch);

        devBranch.addSubordinate(devleafA);
        devBranch.addSubordinate(devleafB);
        peopleResourceBranch.addSubordinate(peopleResourceleafA);
        administrativeBranch.addSubordinate(administrativeleafA);

        System.out.println(manager.getInfo());
        getAllSubordinateInfo(manager.getSubordinate());
//        manager.add(devBranch);
//        manager.add(peopleResourceBranch);
//        manager.add(administrativeBranch);
//
//        devBranch.add(devleafA);
//        devBranch.add(devleafB);
//        peopleResourceBranch.add(peopleResourceleafA);
//        administrativeBranch.add(administrativeleafA);
//
//        System.out.println(manager.getInfo() + "\n");
//        getAllSubordinateInfo(manager.getSubordinateInfo());

    }

    private static void getAllSubordinateInfo(List<ICrop> subordinateInfo) {
        for (ICrop o : subordinateInfo) {
            if (o instanceof Ileaf) {
                Ileaf employee = (Leaf) o;
                System.out.println(employee.getInfo());
            } else {
                IBranch leader = (Branch) o;
                System.out.println(leader.getInfo());
                getAllSubordinateInfo(leader.getSubordinate());
                // getAllSubordinateInfo(leader.getSubordinateInfo());
            }
        }
    }
}
