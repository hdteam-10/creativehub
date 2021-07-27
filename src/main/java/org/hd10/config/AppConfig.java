package org.hd10.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@PropertySource(value = { "file:config/.creativehub.conf" })
@Data
public class AppConfig {
	@Value("${database.path}")
	public String databasePathString;
	//@Value("${database.password}")
	//public String databasePasswdString;
}
