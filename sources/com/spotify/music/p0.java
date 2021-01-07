package com.spotify.music;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Supplier;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;
import com.spotify.android.paste.app.d;
import com.spotify.mobile.android.ui.view.MainLayout;
import com.spotify.music.navigation.i;
import com.spotify.music.navigation.r;
import com.spotify.music.navigation.u;

public class p0 implements MainLayout.c, u {
    private final ToolbarManager a;
    private final MainLayout b;
    private final i c;

    public p0(Activity activity, MainLayout mainLayout, i iVar, r rVar, Supplier<Boolean> supplier) {
        this.b = mainLayout;
        ViewGroup toolbarContainer = mainLayout.getToolbarContainer();
        c c2 = l70.c(mainLayout.getContext(), toolbarContainer);
        d.d(((e) c2).getView(), activity);
        ToolbarManager toolbarManager = new ToolbarManager(activity, c2, new q(supplier, rVar));
        this.a = toolbarManager;
        this.c = iVar;
        mainLayout.C0();
        toolbarContainer.addView(toolbarManager.e().getView());
        mainLayout.setDelegate(this);
    }

    @Override // com.spotify.music.navigation.u
    public void a(Fragment fragment, String str) {
        this.a.o(1.0f);
    }

    public com.spotify.android.glue.patterns.prettylist.u b() {
        return this.a;
    }

    public void c() {
        this.a.f();
    }

    public void d(View view, boolean z, ToolbarConfig.Visibility visibility) {
        this.a.h(z);
        if (visibility != ToolbarConfig.Visibility.ONLY_MAKE_ROOM) {
            this.a.b(visibility == ToolbarConfig.Visibility.HIDE);
        }
    }

    public void e(boolean z) {
        this.a.g(z);
    }

    public void f(String str) {
        this.a.setTitle(str);
    }

    public boolean g() {
        return ToolbarConfig.e(this.b.getContext(), this.c.u());
    }

    public ToolbarConfig.Visibility h() {
        return ToolbarConfig.f(this.c.u());
    }

    public void i() {
        this.b.C0();
        this.b.requestLayout();
    }
}
