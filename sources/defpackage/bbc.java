package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.common.base.Optional;

/* renamed from: bbc  reason: default package */
public final class bbc implements fjf<Optional<Runnable>> {
    private final wlf<Context> a;

    public bbc(wlf<Context> wlf) {
        this.a = wlf;
    }

    public static Optional<Runnable> a(Context context) {
        return Optional.fromNullable(Build.VERSION.SDK_INT >= 29 ? new wac(context) : null);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
