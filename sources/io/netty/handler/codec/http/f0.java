package io.netty.handler.codec.http;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;

public class f0 {
    private final Charset a;
    private final String b;
    private final List<a> c = new ArrayList();

    /* access modifiers changed from: private */
    public static final class a {
        final String a;
        final String b;

        a(String str, String str2) {
            this.b = str2;
            this.a = str;
        }
    }

    public f0(String str) {
        Charset charset = n.a;
        if (str == null) {
            throw new NullPointerException("getUri");
        } else if (charset != null) {
            this.b = str;
            this.a = charset;
        } else {
            throw new NullPointerException("charset");
        }
    }

    private static String b(String str, Charset charset) {
        try {
            return URLEncoder.encode(str, charset.name()).replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            throw new UnsupportedCharsetException(charset.name());
        }
    }

    public void a(String str, String str2) {
        if (str != null) {
            this.c.add(new a(str, str2));
            return;
        }
        throw new NullPointerException("name");
    }

    public String toString() {
        if (this.c.isEmpty()) {
            return this.b;
        }
        StringBuilder sb = new StringBuilder(this.b);
        sb.append('?');
        for (int i = 0; i < this.c.size(); i++) {
            a aVar = this.c.get(i);
            sb.append(b(aVar.a, this.a));
            if (aVar.b != null) {
                sb.append('=');
                sb.append(b(aVar.b, this.a));
            }
            if (i != this.c.size() - 1) {
                sb.append('&');
            }
        }
        return sb.toString();
    }
}
