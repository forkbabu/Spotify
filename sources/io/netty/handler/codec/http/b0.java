package io.netty.handler.codec.http;

import com.comscore.streaming.ContentDeliveryMode;
import com.comscore.streaming.WindowState;
import com.spotify.core.http.HttpConnection;
import io.netty.util.c;
import io.netty.util.h;

public class b0 implements Comparable<b0> {
    public static final b0 c = g(100, "Continue");
    private final int a;
    private final String b;

    static {
        g(101, "Switching Protocols");
        g(102, "Processing");
        g(200, "OK");
        g(201, "Created");
        g(202, "Accepted");
        g(203, "Non-Authoritative Information");
        g(204, "No Content");
        g(205, "Reset Content");
        g(206, "Partial Content");
        g(207, "Multi-Status");
        g(300, "Multiple Choices");
        g(301, "Moved Permanently");
        g(302, "Found");
        g(303, "See Other");
        g(304, "Not Modified");
        g(HttpConnection.kErrorHttpBadRange, "Use Proxy");
        g(HttpConnection.kErrorHttpBadTransferEncoding, "Temporary Redirect");
        g(WindowState.NORMAL, "Bad Request");
        g(WindowState.FULL_SCREEN, "Unauthorized");
        g(WindowState.MINIMIZED, "Payment Required");
        g(WindowState.MAXIMIZED, "Forbidden");
        g(404, "Not Found");
        g(405, "Method Not Allowed");
        g(406, "Not Acceptable");
        g(407, "Proxy Authentication Required");
        g(408, "Request Timeout");
        g(409, "Conflict");
        g(410, "Gone");
        g(411, "Length Required");
        g(412, "Precondition Failed");
        g(413, "Request Entity Too Large");
        g(414, "Request-URI Too Long");
        g(415, "Unsupported Media Type");
        g(416, "Requested Range Not Satisfiable");
        g(417, "Expectation Failed");
        g(421, "Misdirected Request");
        g(422, "Unprocessable Entity");
        g(423, "Locked");
        g(424, "Failed Dependency");
        g(425, "Unordered Collection");
        g(426, "Upgrade Required");
        g(428, "Precondition Required");
        g(429, "Too Many Requests");
        g(431, "Request Header Fields Too Large");
        g(500, "Internal Server Error");
        g(ContentDeliveryMode.LINEAR, "Not Implemented");
        g(ContentDeliveryMode.ON_DEMAND, "Bad Gateway");
        g(503, "Service Unavailable");
        g(504, "Gateway Timeout");
        g(505, "HTTP Version Not Supported");
        g(506, "Variant Also Negotiates");
        g(507, "Insufficient Storage");
        g(510, "Not Extended");
        g(511, "Network Authentication Required");
    }

    public b0(int i, String str) {
        this(i, str, false);
    }

    private static b0 g(int i, String str) {
        return new b0(i, str, true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(b0 b0Var) {
        return this.a - b0Var.a;
    }

    public int d() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if ((obj instanceof b0) && this.a == ((b0) obj).a) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder(this.b.length() + 5);
        sb.append(this.a);
        sb.append(' ');
        sb.append(this.b);
        return sb.toString();
    }

    private b0(int i, String str, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException(je.q0("code: ", i, " (expected: 0+)"));
        } else if (str != null) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (charAt == '\n' || charAt == '\r') {
                    throw new IllegalArgumentException(je.x0("reasonPhrase contains one of the following prohibited characters: \\r\\n: ", str));
                }
            }
            this.a = i;
            new c(Integer.toString(i));
            this.b = str;
            if (z) {
                (i + " " + str).getBytes(h.f);
            }
        } else {
            throw new NullPointerException("reasonPhrase");
        }
    }
}
