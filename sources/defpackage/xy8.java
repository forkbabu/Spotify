package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: xy8  reason: default package */
public final class xy8 implements fjf<wy8> {

    /* access modifiers changed from: private */
    /* renamed from: xy8$a */
    public static final class a {
        private static final xy8 a = new xy8();
    }

    public static xy8 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wy8(new ImmutableMap.Builder().putAll(py8.b).putAll(ry8.b).putAll(sy8.b).putAll(ty8.a).putAll(uy8.a).build());
    }
}
