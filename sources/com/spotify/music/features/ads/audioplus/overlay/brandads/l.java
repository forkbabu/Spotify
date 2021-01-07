package com.spotify.music.features.ads.audioplus.overlay.brandads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.features.ads.audioplus.overlay.LeaveBehindContainerFragment;
import com.spotify.music.features.ads.audioplus.overlay.c;
import com.spotify.music.features.ads.audioplus.overlay.e;
import com.spotify.music.features.ads.audioplus.overlay.f;
import com.spotify.music.features.ads.audioplus.overlay.i;
import com.spotify.music.features.ads.ui.OverlayBackgroundView;
import com.spotify.music.features.ads.ui.b;
import com.squareup.picasso.Picasso;

public class l implements i, b.AbstractC0214b {
    private View a;
    private View b;
    private View c;
    private View f;
    private OverlayBackgroundView n;
    private ImageView o;
    private TextView p;
    private Button q;
    private mu3 r;
    private f s;
    private e t;
    Picasso u;
    c v;
    nu3 w;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ com.spotify.music.features.ads.ui.a a;

        a(l lVar, com.spotify.music.features.ads.ui.a aVar) {
            this.a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.a();
        }
    }

    private void g(com.spotify.music.features.ads.ui.a aVar) {
        this.s.d(this.c, this.f, this.a, this.b, new a(this, aVar));
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void M0(int[] iArr) {
        int left = this.o.getLeft();
        int top = this.o.getTop();
        int width = this.o.getWidth();
        int height = this.o.getHeight();
        if (iArr[0] >= left && iArr[0] <= left + width && iArr[1] >= top && iArr[1] <= top + height) {
            g(new f(this));
        }
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.i
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.leave_behind_brand_ads, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.brand_ads_view);
        this.c = inflate.findViewById(C0707R.id.brand_ads_background);
        this.a = inflate.findViewById(C0707R.id.brand_ads_header);
        this.b = inflate.findViewById(C0707R.id.brand_ads_footer);
        this.f = inflate.findViewById(C0707R.id.brand_ads_body);
        this.o = (ImageView) inflate.findViewById(C0707R.id.companion_ad_image);
        this.p = (TextView) inflate.findViewById(C0707R.id.companion_advertiser_name);
        OverlayBackgroundView overlayBackgroundView = (OverlayBackgroundView) inflate.findViewById(C0707R.id.brand_ads_background_view);
        this.n = overlayBackgroundView;
        overlayBackgroundView.setColor(androidx.core.content.a.b(layoutInflater.getContext(), C0707R.color.leave_behind_ad_background_default_color));
        this.n.setRadius((float) nud.g(8.0f, layoutInflater.getContext().getResources()));
        this.n.setOnTouchListener(new b(findViewById, this));
        Button button = (Button) inflate.findViewById(C0707R.id.companion_ad_cta);
        this.q = button;
        button.setOnClickListener(new e(this, new b(this)));
        this.b.setOnClickListener(new d(this, new c(this)));
        this.s = new f();
        return inflate;
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.i
    public void b(e eVar, d dVar) {
        this.t = eVar;
        mu3 a2 = this.w.a(dVar.f());
        this.r = a2;
        ((lu3) a2).c(this.n);
        this.u.m(dVar.f()).n(this.o, new m(this));
        this.p.setText(dVar.a());
        this.q.setText(dVar.b());
        this.s.c(this.c, this.f, this.a, this.b);
    }

    public /* synthetic */ void d(com.spotify.music.features.ads.ui.a aVar, View view) {
        g(aVar);
    }

    public void e() {
        c cVar = this.v;
        e eVar = this.t;
        cVar.getClass();
        ((LeaveBehindContainerFragment) eVar).K4();
    }

    public /* synthetic */ void f(com.spotify.music.features.ads.ui.a aVar, View view) {
        g(aVar);
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void j1() {
        c cVar = this.v;
        e eVar = this.t;
        cVar.getClass();
        ((LeaveBehindContainerFragment) eVar).K4();
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void m() {
        je.g(this.a, 1.0f, 100);
        je.g(this.b, 1.0f, 100);
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void s() {
        je.g(this.a, 0.0f, 100);
        je.g(this.b, 0.0f, 100);
    }
}
