package com.ims.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Login {
	@Id
	 @Column(name="user_name")
	private String user_name;
	@Column(name="user_pass")
	private String user_pass;
	@Column(name="role_id")
	private Integer role_id;
	@Column(name="status")
	private Integer status;
	@Column(name="email_id")
	private String email_id;
	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	
}






log4j.rootLogger= ALL,  debug, info, error, stdout

log4j.threshold = ALL

log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
log4j.appender.stdout.layout.ConversionPattern=%d %p [%c] - <%m>%n

log4j.appender.debug = org.apache.log4j.DailyRollingFileAppender
log4j.appender.debug.File = D:/Dashboard log/Log_Debug.log
log4j.appender.debug.Append = true
log4j.appender.debug.DatePattern = '.'yyy-MM-dd
log4j.appender.debug.Threshold = DEBUG
#log4j.appender.debug.MaxFileSize=10240KB
log4j.appender.debug.layout = org.apache.log4j.PatternLayout
log4j.appender.debug.layout.ConversionPattern = %d{yyyy-MM-dd HH:mm:ss} %c{1} [%p] %m%n


log4j.appender.info = org.apache.log4j.DailyRollingFileAppender
log4j.appender.info.File = D:/Dashboard log/Log_INFO.log
log4j.appender.info.Append = true
log4j.appender.info.Threshold = INFO
#log4j.appender.info.MaxFileSize=10240KB
log4j.appender.info.DatePattern = '.'yyy-MM-dd
log4j.appender.info.layout = org.apache.log4j.PatternLayout
log4j.appender.info.layout.ConversionPattern = %d{yyyy-MM-dd HH:mm:ss} %c{1} [%p] %m%n

log4j.appender.logfile.File= D:/CPSMS/PMI_Schedulars/Commission_Neft_Logs/AC_inf.log


log4j.appender.error = org.apache.log4j.DailyRollingFileAppender
log4j.appender.error.File =  D:/Dashboard log/Log_ERROR.log
log4j.appender.error.Append = true
log4j.appender.error.Threshold = ERROR 
#log4j.appender.error.MaxFileSize=10240KB
log4j.appender.error.DatePattern = '.'yyy-MM-dd
log4j.appender.error.layout = org.apache.log4j.PatternLayout
log4j.appender.error.layout.ConversionPattern = %d{yyyy-MM-dd HH:mm:ss} %c{1} [%p] %m%n


