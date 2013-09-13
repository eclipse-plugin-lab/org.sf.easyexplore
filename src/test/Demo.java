/**
 * @author VerpHen
 * @date 2013年9月13日  下午2:05:08
 */

package test;

import org.eclipse.osgi.util.NLS;

public class Demo {
	public static String platform;
	public static String user;

	static {
		NLS.initializeMessages(Demo.class.getName(),
				Demo.class);
	}

	public static void main(String[] args) {
		System.out.println(platform + "      " + user);
	}

}
