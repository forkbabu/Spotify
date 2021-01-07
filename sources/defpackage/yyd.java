package defpackage;

import java.util.Set;

/* renamed from: yyd  reason: default package */
public class yyd {
    private final Set<zyd> a;

    public yyd(Set<zyd> set) {
        this.a = set;
    }

    public String a() {
        for (zyd zyd : this.a) {
            if (zyd.d()) {
                return zyd.a();
            }
        }
        return "";
    }

    public String b() {
        for (zyd zyd : this.a) {
            if (zyd.d()) {
                return zyd.b();
            }
        }
        return "";
    }

    public boolean c() {
        for (zyd zyd : this.a) {
            if (zyd.d()) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        for (zyd zyd : this.a) {
            if (zyd.d()) {
                return zyd.c();
            }
        }
        return false;
    }
}
