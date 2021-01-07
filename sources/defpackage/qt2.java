package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: qt2  reason: default package */
public final class qt2 implements fjf<Bundle> {
    private final wlf<Activity> a;

    public qt2(wlf<Activity> wlf) {
        this.a = wlf;
    }

    public static Bundle a(Activity activity) {
        Bundle extras = activity.getIntent().getExtras();
        return extras != null ? extras : new Bundle();
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
