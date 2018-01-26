package cn.appsys.dao;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.BackendUser;

/**
 * 根据用户编码获取信息
 * 
 * @author Administrator
 * 
 */
public interface DevUserMapper {
	BackendUser getLoginUser(@Param("userCode") String userCode)
			throws Exception;

}
