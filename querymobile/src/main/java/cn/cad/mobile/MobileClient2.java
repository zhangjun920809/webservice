package cn.cad.mobile;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.net.URL;

/**
 * @author User
 * @date 2020/11/30 15:08
 */
public class MobileClient2 {

    public static void main(String[] args) throws IOException {
        //创建WSDL文件的URL
        URL wsdlDocumentLocation=new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
        //创建服务名称
        //1.namespaceURI - 命名空间地址
        //2.localPart - 服务视图名
        QName serviceName=new QName("http://WebXml.com.cn/","MobileCodeWS");
        Service service= Service.create(wsdlDocumentLocation, serviceName);

        //获取服务实现类
        MobileCodeWSSoap mobileCodeWSSoap= service.getPort(MobileCodeWSSoap.class);
        //调用方法
        String message=mobileCodeWSSoap.getMobileCodeInfo("13691375623", null);
        ArrayOfString databaseInfo = mobileCodeWSSoap.getDatabaseInfo();
        System.out.println(message);
        System.out.println(databaseInfo.getString().indexOf(0));

    }

}