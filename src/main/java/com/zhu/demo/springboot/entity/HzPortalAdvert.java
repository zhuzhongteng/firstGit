package com.zhu.demo.springboot.entity;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 
 *
 * @author tunny code generator
 * @date 2019-07-17 09:33:30
 */
@Data
public class HzPortalAdvert {

	/**
	 * 主键
	 */
	private Integer id;
	/**
	 * 广告标题
	 */
	private String title;
	/**
	 * 广告内容
	 */
	private String content;
	/**
	 * 图片地址
	 */
	private String address;
	/**
	 * 跳转连接
	 */
	private String link;

	/**
	 * 启用状态
	 */
	private String status;
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 创建时间
	 */
	private LocalDateTime createTime;
	/**
	 * 更新人
	 */
	private String updateBy;
	/**
	 * 更新时间
	 */
	private LocalDateTime updateTime;
	/**
	 * 逻辑删除
	 */
	private String delFlag;
	/**
	 * 广告类型
	 */
	private String advType;

	private Integer advertId;

}
