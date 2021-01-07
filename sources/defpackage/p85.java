package defpackage;

import android.view.View;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.android.glue.patterns.header.transformations.a;
import com.spotify.android.glue.patterns.header.transformations.d;
import com.spotify.android.glue.patterns.header.transformations.f;
import java.util.Arrays;

/* renamed from: p85  reason: default package */
public class p85 implements qc0, tc0 {
    private final View a;
    private final View b;
    private final TransformationSet c;
    private final TransformationSet f;

    public p85(View view, View view2, View view3, View view4) {
        this.a = view;
        view3.getClass();
        this.b = view3;
        d<f> d = new f(0.0f, 1.0f).c().d(1.0f, 0.0f);
        d.e(ta0.a);
        this.c = d.f(a.b(view2, View.ALPHA)).d(1.0f, 0.9f).f(a.a(view2, Arrays.asList(View.SCALE_X, View.SCALE_Y))).c().b();
        this.f = l70.d(view4);
    }

    @Override // defpackage.tc0
    public void e0(int i, float f2) {
        this.c.a(f2);
        this.f.a(f2);
        this.b.setTranslationY((float) (-i));
    }

    @Override // defpackage.qc0, com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }
}
