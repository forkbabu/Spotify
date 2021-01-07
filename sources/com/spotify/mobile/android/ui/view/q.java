package com.spotify.mobile.android.ui.view;

import android.view.View;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;

public final /* synthetic */ class q implements AnchorBar.b {
    public final /* synthetic */ MainLayout a;

    public /* synthetic */ q(MainLayout mainLayout) {
        this.a = mainLayout;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorBar.b
    public final void a(View view, float f) {
        MainLayout.w0(this.a, view, f);
    }
}
