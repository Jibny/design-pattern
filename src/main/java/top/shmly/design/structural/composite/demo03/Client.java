package top.shmly.design.structural.composite.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 0:47
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        Crop manager = Root.builder()
                .name("王大麻子")
                .position("Manager")
                .salary(99999)
                .build();

        Crop devBranch = Branch.builder()
                .name("李大秃子")
                .level("leader")
                .position("Developer")
                .salary(30000)
                .build();
        Crop devleafA = Leaf.builder()
                .name("开发人员A")
                .position("Employee")
                .salary(8000)
                .build();
        Crop devleafB = Leaf.builder()
                .name("开发人员B")
                .position("Employee")
                .salary(9000)
                .build();

        Crop peopleResourceBranch = Branch.builder()
                .name("吴大棒槌")
                .level("leader")
                .position("PeopleResource")
                .salary(22222)
                .build();
        Crop peopleResourceleafA = Leaf.builder()
                .name("人资人员A")
                .position("Employee")
                .salary(7000)
                .build();

        Crop administrativeBranch = Branch.builder()
                .name("周麻婆子")
                .level("leader")
                .position("Administrative")
                .salary(23333)
                .build();
        Crop administrativeleafA = Leaf.builder()
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

//        System.out.println(manager.getInfo());
//        getAllSubordinateInfo(manager.getSubordinate());
        System.out.println(getTreeInfo(manager));
    }

    private static String getTreeInfo(Crop manager) {
        List<Crop> root = manager.getSubordinate();
        StringBuilder info = new StringBuilder();
        info.append(manager.getInfo()).append("\n\n");
        for (Crop branch : root) {
            info.append(branch.getInfo()).append("\n");
            for (Crop leaf : branch.getSubordinate()) {
                info.append(leaf.getInfo()).append("\n");
            }
            info.append("\n");
        }
        return info.toString();
    }
//    private static void getAllSubordinateInfo(List<Crop> subordinateInfo) {
//        for (Crop o : subordinateInfo) {
//            if (o instanceof Leaf) {
//                Leaf employee = (Leaf) o;
//                System.out.println(employee.getInfo());
//            } else {
//                Branch leader = (Branch) o;
//                System.out.println(leader.getInfo());
//                getAllSubordinateInfo(leader.getSubordinate());
//                 getAllSubordinateInfo(leader.getSubordinate());
//            }
//        }
//    }
}

// Crop(name=王大麻子, position=Manager, salary=99999)
//
// Crop(name=李大秃子, position=Developer, salary=30000)
// Crop(name=开发人员A, position=Employee, salary=8000)
// Crop(name=开发人员B, position=Employee, salary=9000)
//
// Crop(name=吴大棒槌, position=PeopleResource, salary=22222)
// Crop(name=人资人员A, position=Employee, salary=7000)
//
// Crop(name=周麻婆子, position=Administrative, salary=23333)
// Crop(name=行政人员A, position=Employee, salary=7000)