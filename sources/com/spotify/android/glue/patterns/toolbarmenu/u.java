package com.spotify.android.glue.patterns.toolbarmenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.HashMap;
import java.util.Map;

class u implements a0 {
    private final Map<Integer, Object> a = new HashMap();
    private final a4 b;
    private final b c;
    private View.OnClickListener d = a.a;
    private final Context e;
    private final Menu f;
    private final ContextMenuViewModel g;
    private boolean h;
    private MenuItem i;

    /* access modifiers changed from: package-private */
    public static class a implements g0 {
        private final com.spotify.android.glue.patterns.contextmenu.model.b a;

        /* renamed from: com.spotify.android.glue.patterns.toolbarmenu.u$a$a  reason: collision with other inner class name */
        class C0150a implements e {
            final /* synthetic */ Runnable a;

            C0150a(a aVar, Runnable runnable) {
                this.a = runnable;
            }

            @Override // com.spotify.android.glue.patterns.contextmenu.model.e
            public void a(com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
                this.a.run();
            }
        }

        public a(com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
            this.a = bVar;
        }

        @Override // com.spotify.android.glue.patterns.toolbarmenu.g0
        public g0 a(Runnable runnable) {
            this.a.o(new C0150a(this, runnable));
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
    }

    u(Context context, Menu menu, b bVar) {
        this.e = context;
        this.f = menu;
        this.c = bVar;
        this.g = new ContextMenuViewModel();
        this.b = new z(context, menu);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.a0
    public void a(String str, SpotifyIconV2 spotifyIconV2, boolean z, boolean z2) {
        c(str, spotifyIconV2, z);
        if (z2) {
            this.g.y(ContextMenuViewModel.HeaderViewType.LARGE_IMAGE);
        }
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.a0
    public g0 b(int i2, CharSequence charSequence, Drawable drawable) {
        if (!this.h) {
            this.i = this.f.add(0, 0, BitmapRenderer.ALPHA_VISIBLE, C0707R.string.content_description_show_context_menu);
            Context context = this.e;
            this.i.setIcon(new SpotifyIconDrawable(context, SpotifyIconV2.MORE_ANDROID, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.toolbar_context_menu_icon_size)));
            this.i.setOnMenuItemClickListener(new t(this));
            this.i.setShowAsAction(2);
            a4 a4Var = this.b;
            if (a4Var != null) {
                e2.r(this.i, a4Var);
            }
            if (this.i.getActionView() != null) {
                this.i.getActionView().setId(C0707R.id.glue_overflow);
            }
            this.h = true;
        }
        a aVar = new a(this.g.b(i2, charSequence, drawable));
        this.a.put(Integer.valueOf(i2), aVar);
        return aVar;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.a0
    public void c(String str, SpotifyIconV2 spotifyIconV2, boolean z) {
        this.g.x(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY);
        this.g.C(spotifyIconV2);
        this.g.z(z);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.a0
    public b0 d(int i2, CharSequence charSequence) {
        c0 b2 = c0.b(this.f, i2, charSequence, this.b);
        this.a.put(Integer.valueOf(i2), b2);
        return b2;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.a0
    public b0 e(int i2, int i3) {
        return d(i2, this.e.getString(i3));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.a0
    public void f() {
        MenuItem menuItem = this.i;
        if (menuItem != null) {
            menuItem.getActionView().performClick();
        }
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.a0
    public void g(View.OnClickListener onClickListener) {
        this.d = (View.OnClickListener) MoreObjects.firstNonNull(onClickListener, this.d);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.a0
    public Context getContext() {
        return this.e;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.a0
    public void h(String str) {
        this.g.G(str);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.a0
    public void i(String str) {
        this.g.F(str);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.a0
    public g0 j(int i2, int i3, Drawable drawable) {
        return b(i2, this.e.getString(i3), drawable);
    }
}
