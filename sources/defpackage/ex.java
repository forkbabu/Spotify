package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;

/* renamed from: ex  reason: default package */
public class ex {
    private final boolean a;
    private final int b;
    private final int c;
    private final float d;

    public ex(Context context) {
        this.a = rw.s(context, C0707R.attr.elevationOverlayEnabled, false);
        this.b = rw.l(context, C0707R.attr.elevationOverlayColor, 0);
        this.c = rw.l(context, C0707R.attr.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public int a(int i, float f) {
        if (!this.a) {
            return i;
        }
        if (!(s2.h(i, BitmapRenderer.ALPHA_VISIBLE) == this.c)) {
            return i;
        }
        float f2 = this.d;
        float f3 = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            f3 = Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return s2.h(rw.o(s2.h(i, BitmapRenderer.ALPHA_VISIBLE), this.b, f3), Color.alpha(i));
    }

    public boolean b() {
        return this.a;
    }
}
