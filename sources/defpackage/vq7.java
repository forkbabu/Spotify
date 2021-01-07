package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: vq7  reason: default package */
public final /* synthetic */ class vq7 implements AppBarLayout.c {
    public final /* synthetic */ pr7 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ mr7 c;

    public /* synthetic */ vq7(pr7 pr7, View view, mr7 mr7) {
        this.a = pr7;
        this.b = view;
        this.c = mr7;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        this.a.s(this.b, this.c, appBarLayout, i);
    }
}
