package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* access modifiers changed from: package-private */
/* renamed from: z15  reason: default package */
public final class z15 implements AppBarLayout.c {
    final /* synthetic */ u15 a;
    final /* synthetic */ View b;
    final /* synthetic */ v15 c;

    z15(u15 u15, View view, v15 v15) {
        this.a = u15;
        this.b = view;
        this.c = v15;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        int abs = Math.abs(i);
        float f = (float) abs;
        float height = f / ((float) this.b.getHeight());
        this.c.e0(abs, height);
        this.b.setTranslationY(f);
        u15.M(this.a).o(height);
    }
}
