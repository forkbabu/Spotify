package defpackage;

import com.google.android.material.appbar.AppBarLayout;

/* renamed from: za6  reason: default package */
public final /* synthetic */ class za6 implements AppBarLayout.c {
    public final /* synthetic */ sb6 a;

    public /* synthetic */ za6(sb6 sb6) {
        this.a = sb6;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        this.a.y(appBarLayout, i);
    }
}
