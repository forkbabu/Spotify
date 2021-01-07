package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;

/* renamed from: u16  reason: default package */
public final /* synthetic */ class u16 implements AppBarLayout.c {
    public final /* synthetic */ a26 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ToolbarManager c;

    public /* synthetic */ u16(a26 a26, View view, ToolbarManager toolbarManager) {
        this.a = a26;
        this.b = view;
        this.c = toolbarManager;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        this.a.o(this.b, this.c, appBarLayout, i);
    }
}
