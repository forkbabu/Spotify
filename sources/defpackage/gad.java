package defpackage;

import android.app.Activity;
import kotlin.jvm.internal.h;

/* renamed from: gad  reason: default package */
public final class gad implements fad {
    private final Activity a;
    private final scd b;

    public gad(Activity activity, scd scd) {
        h.e(activity, "activity");
        h.e(scd, "participantListIntentProvider");
        this.a = activity;
        this.b = scd;
    }

    @Override // defpackage.fad
    public void a() {
        this.a.startActivity(this.b.getIntent());
    }
}
