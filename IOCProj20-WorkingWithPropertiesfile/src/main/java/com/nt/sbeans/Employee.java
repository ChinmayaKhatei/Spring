package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
//@PropertySource("classpath:com/nt/commons/info.properties")
public class Employee {
	//@Value("101")--directly
	@Value("${emp.id}")
	private int empno;
	@Value("${emp.name}")
	private String ename;
	@Value("${emp.addrs}")
	private String empaddrs;
	
	@Value("${os.name}")
	private String os;
	@Value("${os.version}")
	private String osver;
	@Value("${user.name}")
	private String username;
	
	@Value("${path}")
	private String pathContent;
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", empaddrs=" + empaddrs + "]";
	}
	
	
}
