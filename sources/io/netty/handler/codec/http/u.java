package io.netty.handler.codec.http;

import com.spotify.cosmos.router.Request;
import io.netty.util.c;
import java.util.HashMap;
import java.util.Map;

public class u implements Comparable<u> {
    public static final u b;
    public static final u c;
    public static final u f;
    public static final u n;
    public static final u o;
    public static final u p;
    public static final u q;
    public static final u r;
    public static final u s;
    private static final Map<String, u> t;
    private final c a;

    static {
        u uVar = new u("OPTIONS");
        b = uVar;
        u uVar2 = new u(Request.GET);
        c = uVar2;
        u uVar3 = new u("HEAD");
        f = uVar3;
        u uVar4 = new u(Request.POST);
        n = uVar4;
        u uVar5 = new u(Request.PUT);
        o = uVar5;
        u uVar6 = new u("PATCH");
        p = uVar6;
        u uVar7 = new u(Request.DELETE);
        q = uVar7;
        u uVar8 = new u("TRACE");
        r = uVar8;
        u uVar9 = new u("CONNECT");
        s = uVar9;
        HashMap hashMap = new HashMap();
        t = hashMap;
        hashMap.put(uVar.toString(), uVar);
        hashMap.put(uVar2.toString(), uVar2);
        hashMap.put(uVar3.toString(), uVar3);
        hashMap.put(uVar4.toString(), uVar4);
        hashMap.put(uVar5.toString(), uVar5);
        hashMap.put(uVar6.toString(), uVar6);
        hashMap.put(uVar7.toString(), uVar7);
        hashMap.put(uVar8.toString(), uVar8);
        hashMap.put(uVar9.toString(), uVar9);
    }

    public u(String str) {
        String trim = str.trim();
        if (!trim.isEmpty()) {
            for (int i = 0; i < trim.length(); i++) {
                char charAt = trim.charAt(i);
                if (Character.isISOControl(charAt) || Character.isWhitespace(charAt)) {
                    throw new IllegalArgumentException("invalid character in name");
                }
            }
            this.a = new c(trim);
            return;
        }
        throw new IllegalArgumentException("empty name");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(u uVar) {
        return g().compareTo(uVar.g());
    }

    public c d() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        return g().equals(((u) obj).g());
    }

    public String g() {
        return this.a.toString();
    }

    @Override // java.lang.Object
    public int hashCode() {
        return g().hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        return this.a.toString();
    }
}
