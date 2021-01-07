package defpackage;

import android.content.Context;
import android.provider.Settings;

/* renamed from: ak0  reason: default package */
class ak0 {
    private final Context a;
    private kl0 b;

    ak0(Context context, kl0 kl0) {
        this.a = context;
        this.b = kl0;
    }

    public int a() {
        try {
            return Settings.Global.getInt(this.a.getContentResolver(), "boot_count");
        } catch (Exception e) {
            this.b.a(e, "Error in getting boot count.");
            return 0;
        }
    }
}
