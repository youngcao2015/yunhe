package enumeration;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午3:28 18/7/3
 */
public enum LoginType {
    USERNAME,
    WEIXIN,
    QQ,
    WEIBO
}


//public enum LoginType {
//    USERNAME(1, "用户名"),
//    WEIXIN(2, "微信"),
//    QQ(3, "QQ"),
//    WEIBO(4, "微博");
//
//    int value;
//    String name;
//
//    public int getValue() {
//        return value;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    LoginType(int value, String name) {
//        this.value = value;
//        this.name = name;
//    }
//
//    public static LoginType getByValue(int value) {
//        for(LoginType loginType : LoginType.values()) {
//            if(loginType.value == value) {
//                return loginType;
//            }
//        }
//        throw new IllegalArgumentException("No element matches " + value);
//    }
//}


