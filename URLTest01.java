package Location;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * ͳһ��Դ��λ���������������ʯ֮һ��html,http��,������Դ
 * 1��Э��
 * 2�������������������ַ
 * 3���˿ںţ�Ĭ��80�����Բ�д
 * 4��������Դ
 * http://
 * 
 * @author dell
 *
 */
public class URLTest01 {
	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://www.baidu.com:80/index.html?uname=sxt#a");
		//��ȡ�ĸ�ֵ
		System.out.println("Э�飺"+url.getProtocol());
		System.out.println("������IP��"+url.getHost());
		System.out.println("�˿ڣ�"+url.getPort());
		System.out.println("������Դ1��"+url.getFile());
		System.out.println("������Դ2��"+url.getPath());
		
		//����
		System.out.println("������"+url.getQuery());
		//ê��
		System.out.println("ê�㣺"+url.getRef());
	}

}
