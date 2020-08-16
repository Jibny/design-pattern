package top.shmly.design.structural.bridge.demo02;

import javax.xml.parsers.*;

import org.w3c.dom.*;

import java.io.*;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 22:47
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class XMLUtilPen {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean(String args) {
        try {
            //创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc = documentuilder.parse(new File("src/main/java/top/shmly/design/structural/bridge/demo02/configPen.xml"));
            NodeList nl = null;
            Node classNode = null;
            String clazzName = null;
            nl = doc.getElementsByTagName("className");

            if (args.equals("color")) {
                //获取包含类名的文本节点
                classNode = nl.item(0).getFirstChild();

            } else if (args.equals("pen")) {
                //获取包含类名的文本节点
                classNode = nl.item(1).getFirstChild();
            }
            clazzName = classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c = Class.forName(clazzName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
