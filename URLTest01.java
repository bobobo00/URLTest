package Location;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 统一资源定位器：互联网三大基石之一（html,http）,区分资源
 * 1，协议
 * 2，域名，计算机本机地址
 * 3，端口号：默认80，可以不写
 * 4，请求资源
 * http://
 * 
 * @author dell
 *
 */
public class URLTest01 {
	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://www.baidu.com:80/index.html?uname=sxt#a");
		//获取四个值
		System.out.println("协议："+url.getProtocol());
		System.out.println("域名，IP："+url.getHost());
		System.out.println("端口："+url.getPort());
		System.out.println("请求资源1："+url.getFile());
		System.out.println("请求资源2："+url.getPath());
		
		//参数
		System.out.println("参数："+url.getQuery());
		//锚点
		System.out.println("锚点："+url.getRef());
	}

}
