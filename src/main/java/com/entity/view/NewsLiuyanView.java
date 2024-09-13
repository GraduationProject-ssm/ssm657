package com.entity.view;

import com.entity.NewsLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品新闻
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("news_liuyan")
public class NewsLiuyanView extends NewsLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 news
			/**
			* 新闻信息 的 媒体
			*/
			private Integer newsMeitiId;
			/**
			* 新闻标题
			*/
			private String newsName;
			/**
			* 新闻类型
			*/
			private Integer newsTypes;
				/**
				* 新闻类型的值
				*/
				private String newsValue;
			/**
			* 新闻图片
			*/
			private String newsPhoto;
			/**
			* 新闻审核
			*/
			private Integer newsYesnoTypes;
				/**
				* 新闻审核的值
				*/
				private String newsYesnoValue;
			/**
			* 审核结果
			*/
			private String newsYesnoText;
			/**
			* 新闻详情
			*/
			private String newsContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public NewsLiuyanView() {

	}

	public NewsLiuyanView(NewsLiuyanEntity newsLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, newsLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set news

					/**
					* 获取：新闻信息 的 媒体
					*/
					public Integer getNewsMeitiId() {
						return newsMeitiId;
					}
					/**
					* 设置：新闻信息 的 媒体
					*/
					public void setNewsMeitiId(Integer newsMeitiId) {
						this.newsMeitiId = newsMeitiId;
					}


					/**
					* 获取： 新闻标题
					*/
					public String getNewsName() {
						return newsName;
					}
					/**
					* 设置： 新闻标题
					*/
					public void setNewsName(String newsName) {
						this.newsName = newsName;
					}

					/**
					* 获取： 新闻类型
					*/
					public Integer getNewsTypes() {
						return newsTypes;
					}
					/**
					* 设置： 新闻类型
					*/
					public void setNewsTypes(Integer newsTypes) {
						this.newsTypes = newsTypes;
					}


						/**
						* 获取： 新闻类型的值
						*/
						public String getNewsValue() {
							return newsValue;
						}
						/**
						* 设置： 新闻类型的值
						*/
						public void setNewsValue(String newsValue) {
							this.newsValue = newsValue;
						}

					/**
					* 获取： 新闻图片
					*/
					public String getNewsPhoto() {
						return newsPhoto;
					}
					/**
					* 设置： 新闻图片
					*/
					public void setNewsPhoto(String newsPhoto) {
						this.newsPhoto = newsPhoto;
					}

					/**
					* 获取： 新闻审核
					*/
					public Integer getNewsYesnoTypes() {
						return newsYesnoTypes;
					}
					/**
					* 设置： 新闻审核
					*/
					public void setNewsYesnoTypes(Integer newsYesnoTypes) {
						this.newsYesnoTypes = newsYesnoTypes;
					}


						/**
						* 获取： 新闻审核的值
						*/
						public String getNewsYesnoValue() {
							return newsYesnoValue;
						}
						/**
						* 设置： 新闻审核的值
						*/
						public void setNewsYesnoValue(String newsYesnoValue) {
							this.newsYesnoValue = newsYesnoValue;
						}

					/**
					* 获取： 审核结果
					*/
					public String getNewsYesnoText() {
						return newsYesnoText;
					}
					/**
					* 设置： 审核结果
					*/
					public void setNewsYesnoText(String newsYesnoText) {
						this.newsYesnoText = newsYesnoText;
					}

					/**
					* 获取： 新闻详情
					*/
					public String getNewsContent() {
						return newsContent;
					}
					/**
					* 设置： 新闻详情
					*/
					public void setNewsContent(String newsContent) {
						this.newsContent = newsContent;
					}







				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
