package defpackage;

import android.app.Activity;

/* renamed from: zb6  reason: default package */
public final class zb6 implements fjf<String> {
    private final wlf<Activity> a;

    public zb6(wlf<Activity> wlf) {
        this.a = wlf;
    }

    public static String a(Activity activity) {
        String stringExtra = activity.getIntent().getStringExtra("KEY_PLAYLIST_URI");
        yif.g(stringExtra, "Cannot return null from a non-@Nullable @Provides method");
        return stringExtra;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
