package defpackage;

import android.os.Build;
import com.spotify.remoteconfig.ya;
import kotlin.jvm.internal.h;

/* renamed from: tad  reason: default package */
public final class tad {
    private final ya a;

    public tad(ya yaVar) {
        h.e(yaVar, "properties");
        this.a = yaVar;
    }

    public final boolean a() {
        return this.a.a() && Build.VERSION.SDK_INT >= 21;
    }
}
