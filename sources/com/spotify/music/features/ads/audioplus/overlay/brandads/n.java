package com.spotify.music.features.ads.audioplus.overlay.brandads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.features.ads.audioplus.overlay.LeaveBehindContainerFragment;
import com.spotify.music.features.ads.audioplus.overlay.c;
import com.spotify.music.features.ads.audioplus.overlay.e;
import com.spotify.music.features.ads.audioplus.overlay.f;
import com.spotify.music.features.ads.audioplus.overlay.g;
import com.spotify.music.features.ads.audioplus.overlay.i;
import com.spotify.music.features.ads.ui.OverlayBackgroundView;
import com.spotify.music.features.ads.ui.b;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.h0;
import com.squareup.picasso.z;

public class n implements i, b.AbstractC0214b {
    private View a;
    private View b;
    private View c;
    private View f;
    private ImageView n;
    private TextView o;
    private TextView p;
    private BrandAdsCTAButton q;
    private BookmarkAdButton r;
    private f s;
    private e t;
    Picasso u;
    c v;
    nu3 w;
    g x;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ com.spotify.music.features.ads.ui.a a;

        a(n nVar, com.spotify.music.features.ads.ui.a aVar) {
            this.a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.a();
        }
    }

    private static class b implements h0 {
        public b(int i) {
        }

        @Override // com.squareup.picasso.h0
        public String a() {
            return "bookmark_corner_radius_8_px";
        }

        @Override // com.squareup.picasso.h0
        public Bitmap b(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStrokeWidth(1.0f);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            Rect rect = new Rect(1, 1, bitmap.getWidth() - 1, bitmap.getHeight() - 1);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            RectF rectF = new RectF(rect);
            Rect rect2 = new Rect(0, bitmap.getHeight() / 2, bitmap.getWidth() / 2, bitmap.getHeight());
            Rect rect3 = new Rect(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth(), bitmap.getHeight());
            canvas.drawARGB(0, 0, 0, 0);
            float f = (float) 8;
            canvas.drawRoundRect(rectF, f, f, paint);
            canvas.drawRect(rect2, paint);
            canvas.drawRect(rect3, paint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
    }

    private void g(com.spotify.music.features.ads.ui.a aVar) {
        this.s.d(this.c, this.f, this.a, this.b, new a(this, aVar));
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void M0(int[] iArr) {
        int left = this.n.getLeft();
        int top = this.n.getTop();
        int width = this.n.getWidth();
        int height = this.n.getHeight();
        if (iArr[0] >= left && iArr[0] <= left + width && iArr[1] >= top && iArr[1] <= top + height) {
            g(new g(this));
        }
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.i
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.leave_behind_brand_ads_v2, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.brand_ads_view);
        this.c = inflate.findViewById(C0707R.id.brand_ads_background);
        this.a = inflate.findViewById(C0707R.id.brand_ads_header);
        this.b = inflate.findViewById(C0707R.id.brand_ads_footer);
        this.f = inflate.findViewById(C0707R.id.brand_ads_body);
        this.n = (ImageView) inflate.findViewById(C0707R.id.companion_ad_image);
        this.o = (TextView) inflate.findViewById(C0707R.id.tv_advertiser_name);
        this.p = (TextView) inflate.findViewById(C0707R.id.tv_advertiser_tagline);
        OverlayBackgroundView overlayBackgroundView = (OverlayBackgroundView) inflate.findViewById(C0707R.id.brand_ads_background_view);
        overlayBackgroundView.setRadius((float) nud.g(8.0f, layoutInflater.getContext().getResources()));
        overlayBackgroundView.setOnTouchListener(new com.spotify.music.features.ads.ui.b(findViewById, this));
        this.r = (BookmarkAdButton) inflate.findViewById(C0707R.id.btn_ad_bookmark);
        BrandAdsCTAButton brandAdsCTAButton = (BrandAdsCTAButton) inflate.findViewById(C0707R.id.btn_ad_cta);
        this.q = brandAdsCTAButton;
        brandAdsCTAButton.setOnClickListener(new i(this, new h(this)));
        this.b.setOnClickListener(new k(this, new j(this)));
        this.s = new f();
        return inflate;
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.i
    public void b(e eVar, d dVar) {
        this.t = eVar;
        ((lu3) this.w.a(dVar.f())).c(this.q);
        this.x.d(this.r);
        z m = this.u.m(dVar.f());
        m.x(new b(8));
        m.n(this.n, new o(this));
        this.o.setText(dVar.a());
        String i = dVar.i();
        if (TextUtils.isEmpty(i)) {
            this.p.setVisibility(8);
        } else {
            this.p.setVisibility(0);
            this.p.setText(i);
        }
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
