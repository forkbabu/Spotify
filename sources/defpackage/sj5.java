package defpackage;

import com.spotify.ubi.specification.factories.g1;

/* renamed from: sj5  reason: default package */
public final class sj5 implements fjf<g1> {

    /* access modifiers changed from: private */
    /* renamed from: sj5$a */
    public static final class a {
        private static final sj5 a = new sj5();
    }

    public static sj5 a() {
        return a.a;
    }

    public static g1 b() {
        return new g1("homeview|static");
    }

    @Override // defpackage.wlf
    public Object get() {
        return b();
    }
}
