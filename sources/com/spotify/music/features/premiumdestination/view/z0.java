package com.spotify.music.features.premiumdestination.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.premiumdestination.domain.k;
import com.spotify.music.features.premiumdestination.domain.l;
import com.spotify.music.features.premiumdestination.domain.m;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class z0 implements g<l, k> {
    private final b61 a;
    private final t b;
    private final a1 c;
    private final FrameLayout f;
    private final CoordinatorLayout n;
    private final bj7 o;

    class a implements h<l> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            l lVar = (l) obj;
            b61 b61 = z0.this.a;
            a1 a1Var = z0.this.c;
            m d = lVar.d();
            a1Var.getClass();
            b61.k((b91) d.a(c.a, new e(a1Var), new d(a1Var)));
            z0.this.f.setVisibility(lVar.c() ? 0 : 8);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            z0.this.o.c();
        }
    }

    public z0(e61 e61, b61 b61, t tVar, a1 a1Var, Context context, wi7 wi7, bj7 bj7) {
        this.a = b61;
        this.b = tVar;
        this.c = a1Var;
        this.o = bj7;
        View b2 = e61.b();
        ViewParent parent = b2.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(b2);
        }
        wi7.g((RecyclerView) ((ViewGroup) ((ViewGroup) e61.b()).getChildAt(0)).getChildAt(0));
        bj7.b();
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context, null);
        this.n = coordinatorLayout;
        coordinatorLayout.addView(e61.b());
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(new SpotifyIconDrawable(context, SpotifyIconV2.GEARS, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.toolbar_icon_size)));
        imageView.setOnClickListener(new b(this));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setId(C0707R.id.actionbar_item_settings);
        frameLayout.setPadding(0, com.spotify.android.goldenpath.a.e(context.getResources()), 0, 0);
        int l = nud.l(context, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.e(context.getResources());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.quick_action_padding_left);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 8388629));
        CoordinatorLayout.e eVar = new CoordinatorLayout.e(-1, l);
        eVar.j(new PremiumPageSettingsBehavior());
        coordinatorLayout.addView(frameLayout, eVar);
        frameLayout.setVisibility(8);
    }

    public View e() {
        return this.n;
    }

    public /* synthetic */ void f(View view) {
        this.b.d(ViewUris.W1.toString());
    }

    @Override // com.spotify.mobius.g
    public h<l> t(da2<k> da2) {
        return new a();
    }
}
