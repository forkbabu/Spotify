package defpackage;

import android.content.res.Resources;

/* renamed from: ou5  reason: default package */
public abstract class ou5 {
    public static ou5 a(String str, int i) {
        return new gu5(str, new cu5(i), bu5.a);
    }

    public static ou5 b(String str, int i, int i2) {
        return new gu5(str, new wt5(i), new yt5(i2));
    }

    public static ou5 c(String str, int i, String str2) {
        return new gu5(str, new xt5(i), new du5(str2));
    }

    public static ou5 d(String str, String str2, String str3) {
        return new gu5(str, new zt5(str2), new au5(str3));
    }

    /* access modifiers changed from: package-private */
    public abstract ea2<Resources, String> e();

    public String f(Resources resources) {
        return e().apply(resources);
    }

    /* access modifiers changed from: package-private */
    public abstract ea2<Resources, String> g();

    public String h(Resources resources) {
        return g().apply(resources);
    }

    public abstract String i();
}
