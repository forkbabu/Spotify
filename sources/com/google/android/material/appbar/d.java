package com.google.android.material.appbar;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.f5;

/* access modifiers changed from: package-private */
public class d implements f5 {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ boolean b;

    d(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // defpackage.f5
    public boolean a(View view, f5.a aVar) {
        this.a.setExpanded(this.b);
        return true;
    }
}
