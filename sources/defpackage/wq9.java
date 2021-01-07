package defpackage;

import android.app.Activity;

/* renamed from: wq9  reason: default package */
public final class wq9 implements fjf<vq9> {
    private final wlf<Activity> a;

    public wq9(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vq9(this.a.get());
    }
}
