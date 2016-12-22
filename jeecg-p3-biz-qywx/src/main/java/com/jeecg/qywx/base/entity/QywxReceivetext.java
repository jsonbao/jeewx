package com.jeecg.qywx.base.entity;

import java.io.Serializable;
import java.util.Date;

import com.jeecg.qywx.util.SystemUtil;

/**
 * 描述：</b>QywxReceivetext:文本消息; InnoDB free: 130048 kB<br>
 * 实体定义规则
 * 字段不允许存在基本类型，必须都是包装类型(因为基本类型有默认值)
 * 基本数据类型  包装类 byte Byte boolean Boolean short Short char Character int Integer long Long float Float double  Double 
 * @author zhoujf
 * @since：2016年03月25日 10时13分23秒 星期五 
 * @version:1.0
 */
public class QywxReceivetext implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 应用id
	 */
	private String agentId;
		return SystemUtil.QYWX_ACCOUNT_ID;
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	@Override
	public String toString() {
		return "QywxReceivetext [id=" + id + ", tousername=" + tousername
				+ ", fromusername=" + fromusername + ", createtime="
				+ createtime + ", msgtype=" + msgtype + ", msgid=" + msgid
				+ ", content=" + content + ", response=" + response
				+ ", rescontent=" + rescontent + ", nickname=" + nickname
				+ ", agentId=" + agentId + ", accountid=" + accountid
				+ ", createName=" + createName + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", updateName=" + updateName
				+ ", updateBy=" + updateBy + ", updateDate=" + updateDate + "]";
	}
	
}
