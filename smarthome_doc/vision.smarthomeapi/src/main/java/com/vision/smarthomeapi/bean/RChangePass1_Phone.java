package com.vision.smarthomeapi.bean;

/**
 * 用户通过手机号修改密码第一步
 */
public class RChangePass1_Phone extends Bean {

    private String step1key;
    private int count;

    public RChangePass1_Phone(String status, String statusMsg, String step1key, int count) {
        this.status = status;
        this.statusMsg = statusMsg;
        this.step1key = step1key;
        this.count = count;
    }

    public String getStep1key() {
        return step1key;
    }

    public void setStep1key(String step1key) {
        this.step1key = step1key;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /**
     * http请求返回码处理
     *
     * @return 处理方式
     */
    public int mode() {
        int rValue = super.mode();
        if (rValue != Bean.ERROR) {
            return rValue;
        }
        switch (status) {
            case "0035":
                statusMsg = "手机号码不可以为空";
                return Bean.TOAST;

            case "0037":
                statusMsg = "操作太频繁了，请稍后再试";
                return Bean.TOAST;

            case "0038":
                statusMsg = "发送短信验证码失败";
                return Bean.TOAST;

            case "002C":
                statusMsg = "发送短信验证码次数已达上限";
                return Bean.TOAST;

            case "0046":
                statusMsg = "忘记密码次数已达上限";
                return Bean.TOAST;

            default:
                break;
        }
        return Bean.ERROR;
    }
}
