package defpackage;

import org.apache.commons.lang3.c;

/* renamed from: tse  reason: default package */
public final class tse implements fjf<String> {

    /* renamed from: tse$a */
    private static final class a {
        private static final tse a = new tse();
    }

    public static tse a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        StringBuilder V0 = je.V0("--");
        V0.append(c.a(30));
        String sb = V0.toString();
        yif.g(sb, "Cannot return null from a non-@Nullable @Provides method");
        return sb;
    }
}
