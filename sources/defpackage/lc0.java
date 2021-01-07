package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.spotify.android.glue.gradients.factory.GlueGradients;

/* renamed from: lc0  reason: default package */
public final class lc0 {
    public static mc0 a(Drawable drawable, Drawable drawable2) {
        return new mc0(new Drawable[]{drawable, drawable2});
    }

    public static mc0 b(Context context, GlueGradients.Style style) {
        return a(GlueGradients.a(context, style, false), new kc0(context));
    }

    public static mc0 c(Context context, int i) {
        return a(new ColorDrawable(i), new kc0(context));
    }
}
