package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.android.glue.patterns.header.transformations.a;
import com.spotify.android.glue.patterns.header.transformations.d;
import com.spotify.android.glue.patterns.header.transformations.f;

/* renamed from: l74  reason: default package */
public class l74 {
    private final View a;
    private final View b;
    private final TransformationSet c;
    private final TransformationSet d;
    private final Interpolator e = new m74();

    public l74(View view, View view2, View view3, View view4) {
        this.a = view;
        this.b = view4;
        this.c = a(view2);
        this.d = a(view3);
    }

    private static TransformationSet a(View view) {
        d<f> d2 = new f(0.0f, 1.0f).c().d(1.0f, 0.0f);
        d2.e(ta0.b);
        return d2.f(a.b(view, View.ALPHA)).c().b();
    }

    public void b(int i, float f) {
        this.c.a(7.0f * f);
        this.d.a(6.0f * f);
        this.a.setTranslationY((float) (-i));
        this.b.setTranslationY((float) i);
        this.b.setAlpha(this.e.getInterpolation(f));
    }
}
