package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.x;
import kotlin.jvm.internal.h;

/* renamed from: ceb  reason: default package */
public final class ceb {
    private final Context a;

    public ceb(Context context) {
        h.e(context, "context");
        this.a = context;
    }

    public final double a() {
        return x.g(this.a) ? 0.4d : 0.8d;
    }
}
