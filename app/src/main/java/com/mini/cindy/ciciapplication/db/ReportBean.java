
package com.mini.cindy.ciciapplication.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @author : cici.chen
 * @date : 2022/1/11
 * description : 服务器上报接口实体类
 *参数说明:
 *requestParameter 请求参数
 *messageType 错误类型  1正常 2告警 3错误
 *appName 服务名称(xfjy-android)
 *throwable 异常内容
 *requestIp 请求IP
 *message 消息（哪个接口触发的）
 *operator 操作人(用户姓名-id)
 *sendIP  发送Ip
 * eorrTime 错误生成时间
 */
@Entity(tableName = "reports")
public class ReportBean {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "reportid")
    private int id;

    @ColumnInfo(name="appName")
    private String appName;
    @ColumnInfo(name="message")
    private String message;
    @ColumnInfo(name="messageType")
    private Long messageType;
    @ColumnInfo(name="operator")
    private String operator;
    @ColumnInfo(name="requestIp")
    private String requestIp;
    @ColumnInfo(name="requestParameter")
    private String requestParameter;
    @ColumnInfo(name="sendIp")
    private String sendIp;
    @ColumnInfo(name="systemId")
    private String systemId;
    @ColumnInfo(name="throwable")
    private String throwable;

    private String  eorrTime;

    public String getEorrTime() {
        return eorrTime;
    }

    public void setEorrTime(String eorrTime) {
        this.eorrTime = eorrTime;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getMessageType() {
        return messageType;
    }

    public void setMessageType(Long messageType) {
        this.messageType = messageType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getRequestParameter() {
        return requestParameter;
    }

    public void setRequestParameter(String requestParameter) {
        this.requestParameter = requestParameter;
    }

    public String getSendIp() {
        return sendIp;
    }

    public void setSendIp(String sendIp) {
        this.sendIp = sendIp;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getThrowable() {
        return throwable;
    }

    public void setThrowable(String throwable) {
        this.throwable = throwable;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "ReportBean{" +
                "id=" + id +
                ", appName='" + appName + '\'' +
                ", message='" + message + '\'' +
                ", messageType=" + messageType +
                ", operator='" + operator + '\'' +
                ", requestIp='" + requestIp + '\'' +
                ", requestParameter='" + requestParameter + '\'' +
                ", sendIp='" + sendIp + '\'' +
                ", systemId='" + systemId + '\'' +
                ", throwable='" + throwable + '\'' +
                ", eorrTime='" + eorrTime + '\'' +
                '}';
    }




    public static class Builder {

        private String mAppName;
        private String mMessage;
        private Long mMessageType;
        private String mOperator;
        private String mRequestIp;
        private String mRequestParameter;
        private String mSendIp;
        private String mSystemId;
        private String mThrowable;

        public Builder withAppName(String appName) {
            mAppName = appName;
            return this;
        }

        public Builder withMessage(String message) {
            mMessage = message;
            return this;
        }

        public Builder withMessageType(Long messageType) {
            mMessageType = messageType;
            return this;
        }

        public Builder withOperator(String operator) {
            mOperator = operator;
            return this;
        }

        public Builder withRequestIp(String requestIp) {
            mRequestIp = requestIp;
            return this;
        }

        public Builder withRequestParameter(String requestParameter) {
            mRequestParameter = requestParameter;
            return this;
        }

        public Builder withSendIp(String sendIp) {
            mSendIp = sendIp;
            return this;
        }

        public Builder withSystemId(String systemId) {
            mSystemId = systemId;
            return this;
        }

        public Builder withThrowable(String throwable) {
            mThrowable = throwable;
            return this;
        }

        public ReportBean build() {
            ReportBean reportBean = new ReportBean();
            reportBean.appName = mAppName;
            reportBean.message = mMessage;
            reportBean.messageType = mMessageType;
            reportBean.operator = mOperator;
            reportBean.requestIp = mRequestIp;
            reportBean.requestParameter = mRequestParameter;
            reportBean.sendIp = mSendIp;
            reportBean.systemId = mSystemId;
            reportBean.throwable = mThrowable;
            return reportBean;
        }

    }

}
