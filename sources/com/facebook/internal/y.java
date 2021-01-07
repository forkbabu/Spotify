package com.facebook.internal;

import com.facebook.LoggingBehavior;
import com.facebook.k;
import java.util.HashMap;

public class y {
    private static final HashMap<String, String> d = new HashMap<>();
    public static final /* synthetic */ int e = 0;
    private final LoggingBehavior a;
    private final String b;
    private StringBuilder c = new StringBuilder();

    public y(LoggingBehavior loggingBehavior, String str) {
        h0.g(str, "tag");
        this.a = loggingBehavior;
        this.b = je.x0("FacebookSDK.", str);
    }

    public static synchronized void d(String str) {
        synchronized (y.class) {
            k.v(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
            synchronized (y.class) {
                d.put(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    public void a(String str) {
        k.v(this.a);
    }

    public void b(String str, Object obj) {
        k.v(this.a);
    }

    public void c() {
        this.c.toString();
        k.v(this.a);
        this.c = new StringBuilder();
    }
}
