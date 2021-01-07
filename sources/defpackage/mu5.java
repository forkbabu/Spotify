package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: mu5  reason: default package */
public abstract class mu5 {
    public static mu5 b(ea2<Context, Drawable> ea2, int i) {
        return new eu5(ea2, i);
    }

    public abstract int a();

    public Drawable c(Context context) {
        return d().apply(context);
    }

    /* access modifiers changed from: package-private */
    public abstract ea2<Context, Drawable> d();
}
