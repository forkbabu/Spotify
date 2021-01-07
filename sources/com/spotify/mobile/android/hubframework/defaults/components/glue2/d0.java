package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.goldenpath.a;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.mobile.android.util.Assertion;
import defpackage.s51;
import java.util.EnumSet;

public class d0 implements d<GlueHeaderView> {
    private final HubsGlueImageDelegate a;

    public d0(HubsGlueImageDelegate hubsGlueImageDelegate) {
        hubsGlueImageDelegate.getClass();
        this.a = hubsGlueImageDelegate;
    }

    static HubsGlueImageDelegate a(d0 d0Var) {
        return d0Var.a;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
        g91.a((GlueHeaderView) view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        ec0 ec0;
        GlueHeaderView glueHeaderView = (GlueHeaderView) view;
        boolean z = false;
        Assertion.l(s81.text().title() != null, "title is missing");
        Assertion.l(s81.images().background() != null, "background image not set");
        String title = s81.text().title();
        String subtitle = s81.text().subtitle();
        if (subtitle != null) {
            ec0 f = tb0.f(glueHeaderView);
            f.f(subtitle);
            ec0 = f;
        } else {
            ec0 = tb0.a(glueHeaderView);
        }
        ec0.setTitle(title);
        c glueToolbar = glueHeaderView.getGlueToolbar();
        if (glueToolbar != null) {
            z = true;
        }
        Assertion.j("toolbar not set", z);
        glueToolbar.setTitle(title);
        rc0.a(glueHeaderView, ec0);
        glueHeaderView.e(new c0(this, glueHeaderView, s81));
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.noneOf(GlueLayoutTraits.Trait.class);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        GlueHeaderView.c d = GlueHeaderView.d();
        d.b();
        GlueHeaderView a2 = d.a(viewGroup.getContext());
        a2.setTopOffset(a.d(viewGroup.getContext()) + nud.l(viewGroup.getContext(), 16843499));
        a2.setGlueToolbar(l70.c(a2.getContext(), a2));
        return a2;
    }
}
