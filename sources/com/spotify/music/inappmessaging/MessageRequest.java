package com.spotify.music.inappmessaging;

import java.io.Serializable;

public abstract class MessageRequest implements Serializable {
    private static final long serialVersionUID = 1;

    public static MessageRequest a(String str, String str2, String str3) {
        return new AutoValue_MessageRequest(str, str2, str3, null);
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public String f() {
        String str = e() + ':' + c() + ':' + d();
        String b = b();
        if (b == null || b.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(b.length() + str.length() + 1);
        sb.append(str);
        sb.append(':');
        sb.append(b);
        return sb.toString();
    }
}
