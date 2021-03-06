package com.xiaohu.zhixuan.utils;

public class Code {
    //成功
    public static int SUCCESS = 200;
    //用户不存在
    public static int HAVE_NO_USER = 201;
    //密码错误
    public static int PASSWORD_ERROR = 202;
    //注册输入的账号为空
    public static int REGISTER_ACCOUNT_ISNULL = 203;

    //注册输入的密码为空
    public static int REGISTER_PASSWORD_ISNULL = 204;

    //注册失败
    public static int REGISTER_FAIL = 205;

    //用户已注册
    public static int RE_REGISTER = 206;

    //修改密码失败
    public static int CHANGE_PASSWORD_FAIL = 207;

    //用户信息不完善
    public static int UN_PERFECT_USER_MESSAGE = 208;

    //保存用户信息异常
    public static int SAVE_USER_MESSAGE_ERROR = 209;

    //好友用户不存在
    public static int FRIEND_IS_NULL = 210;

    //添加好友失败
    public static int INSERT_FRIEND_FAIL = 211;

    //好友列表为空
    public static int FRIEND_LIST_IS_BULL;

    //消息为空
    public static int MESSAGE_IS_NULL;

    //获取验证码错误
    public static int GET_CODE_ERROR = 212;

    //验证码不能为空
    public static int CODE_IS_NULL = 213;

    //数据为空
    public static int DATA_IS_NULL = 214;

    //数据修改错误
    public static int DATA_CHANGE_FAIL = 215;

    //数据输入不正确
    public static int DATA_INSERT_FAIL = 216;

    //军团不存在
    public static int GROUP_IS_NULL = 217;

    public static String getError(int code){
        if (code == SUCCESS){
            return null;
        }else if (code == HAVE_NO_USER){
            return "用户不存在";
        }else if (code == PASSWORD_ERROR){
            return "密码错误";
        }else if (code == REGISTER_ACCOUNT_ISNULL){
            return "输入的账号为空";
        }else if (code == REGISTER_PASSWORD_ISNULL){
            return "输入的密码为空";
        }else if (code == REGISTER_FAIL){
            return "注册失败";
        }else if (code == RE_REGISTER){
            return "用户已注册";
        }else if (code == CHANGE_PASSWORD_FAIL){
            return "修改密码失败";
        }else if (code == UN_PERFECT_USER_MESSAGE){
            return "用户信息不完善";
        }else if (code == SAVE_USER_MESSAGE_ERROR){
            return "保存用户信息失败";
        }else if (code == FRIEND_IS_NULL){
            return "好友不存在";
        }else if (code == INSERT_FRIEND_FAIL){
            return "添加好友失败";
        }else if (code == FRIEND_LIST_IS_BULL){
            return "好友列表为空";
        }else if (code == MESSAGE_IS_NULL){
            return "消息为空";
        }else if (code == GET_CODE_ERROR){
            return "内测阶段只能使用特殊验证码";
        }else if (code == CODE_IS_NULL){
            return "验证码不能为空";
        }else if (code == DATA_IS_NULL){
            return "数据为空";
        }else if (code == DATA_CHANGE_FAIL){
            return "数据修改错误";
        }else if (code == DATA_INSERT_FAIL){
            return "数据输入不正确";
        }else if (code == GROUP_IS_NULL){
            return "军团不存在";
        }
        else {
            return null;
        }
    }

}
