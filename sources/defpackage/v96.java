package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: v96  reason: default package */
public final /* synthetic */ class v96 implements AppBarLayout.c {
    public final /* synthetic */ la6 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ aa6 c;

    public /* synthetic */ v96(la6 la6, View view, aa6 aa6) {
        this.a = la6;
        this.b = view;
        this.c = aa6;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        this.a.B(this.b, this.c, appBarLayout, i);
    }
}
