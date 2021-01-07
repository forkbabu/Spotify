package defpackage;

import android.app.Activity;
import android.view.Window;

/* renamed from: ut2  reason: default package */
public final class ut2 implements fjf<Window> {
    private final wlf<Activity> a;

    public ut2(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Window window = this.a.get().getWindow();
        yif.g(window, "Cannot return null from a non-@Nullable @Provides method");
        return window;
    }
}
