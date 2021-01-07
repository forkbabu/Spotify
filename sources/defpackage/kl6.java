package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: kl6  reason: default package */
public final /* synthetic */ class kl6 implements AppBarLayout.c {
    public final /* synthetic */ sl6 a;
    public final /* synthetic */ View b;

    public /* synthetic */ kl6(sl6 sl6, View view) {
        this.a = sl6;
        this.b = view;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        this.a.z(this.b, appBarLayout, i);
    }
}
