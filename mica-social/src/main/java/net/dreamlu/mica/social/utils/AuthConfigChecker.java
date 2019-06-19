package net.dreamlu.mica.social.utils;

import net.dreamlu.mica.core.utils.StringUtil;
import net.dreamlu.mica.social.config.AuthConfig;

/**
 * 授权配置类的校验器
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @since 1.8
 */
public class AuthConfigChecker {

	/**
	 * 是否支持第三方登录
	 *
	 * @param config config
	 * @return true or false
	 */
	public static boolean isSupportedAuth(AuthConfig config) {
		return StringUtil.isNotBlank(config.getClientId())
			&& StringUtil.isNotBlank(config.getClientSecret())
			&& StringUtil.isNotBlank(config.getRedirectUri());
	}
}
