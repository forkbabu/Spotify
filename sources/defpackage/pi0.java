package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;

/* renamed from: pi0  reason: default package */
public final class pi0 implements fjf<LayoutInflater> {
    private final wlf<Activity> a;

    public pi0(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        LayoutInflater layoutInflater = this.a.get().getLayoutInflater();
        yif.g(layoutInflater, "Cannot return null from a non-@Nullable @Provides method");
        return layoutInflater;
    }
}
