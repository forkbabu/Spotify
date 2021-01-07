package com.spotify.music.features.podcast.entity.presentation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import androidx.lifecycle.e;
import androidx.lifecycle.n;
import com.spotify.android.glue.components.toolbar.d;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.mobile.android.ui.view.w;
import com.spotify.music.C0707R;
import com.spotify.music.features.podcast.entity.l;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.q;

public class ToolbarPresenterImpl implements y, e {
    private final String a;
    private final l b;
    private final d c;
    private final int f;
    private final int n;
    private q67 o;

    public ToolbarPresenterImpl(Context context, d dVar, String str, l lVar, n nVar) {
        this.c = dVar;
        this.a = str;
        this.b = lVar;
        Resources resources = context.getResources();
        this.f = resources.getColor(C0707R.color.poodcast_entity_toolbar_overlay_start);
        this.n = resources.getColor(C0707R.color.poodcast_entity_toolbar_overlay_end);
        nVar.A().a(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void V(n nVar) {
        androidx.lifecycle.d.d(this, nVar);
    }

    @Override // com.spotify.music.features.podcast.entity.presentation.y
    public void a(a0 a0Var) {
        q67 q67 = this.o;
        if (q67 != null) {
            this.b.a(a0Var, q67);
        }
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void a0(n nVar) {
        androidx.lifecycle.d.c(this, nVar);
    }

    @Override // com.spotify.music.features.podcast.entity.presentation.y
    public void b(Show show) {
        this.o = q67.a(q.c(show.c(), Covers.Size.NORMAL), this.a, show.h(), show.i(), show.d(), show.k());
        this.c.P();
        this.c.R().setTitle(show.h());
    }

    @Override // com.spotify.music.features.podcast.entity.presentation.y
    public void c(int i) {
        this.c.R().u(lc0.a(new ColorDrawable(i), new w(new int[]{this.f, this.n}, new float[]{0.0f, 1.0f})));
    }

    @Override // androidx.lifecycle.g
    public void d0(n nVar) {
        this.c.R().u(null);
    }

    @Override // androidx.lifecycle.g
    public void h0(n nVar) {
        nVar.A().c(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void n(n nVar) {
        androidx.lifecycle.d.a(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void o0(n nVar) {
        androidx.lifecycle.d.e(this, nVar);
    }
}
