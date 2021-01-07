package defpackage;

import java.util.UUID;

/* renamed from: sse  reason: default package */
public class sse {
    private String a = UUID.randomUUID().toString();

    sse() {
    }

    static void a(sse sse) {
        sse.getClass();
        sse.a = UUID.randomUUID().toString();
    }

    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof sse) {
            return this.a.equals(((sse) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
