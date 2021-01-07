package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.base.java.logging.Logger;
import com.spotify.localization.SpotifyLocale;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.features.ads.audioplus.overlay.LeaveBehindContainerFragment;
import com.spotify.music.features.ads.audioplus.overlay.brandads.BrandAdsCTAButton;
import com.spotify.music.features.ads.audioplus.overlay.c;
import com.spotify.music.features.ads.audioplus.overlay.e;
import com.spotify.music.features.ads.audioplus.overlay.f;
import com.spotify.music.features.ads.audioplus.overlay.g;
import com.spotify.music.features.ads.audioplus.overlay.i;
import com.spotify.music.features.ads.ui.OverlayBackgroundView;
import com.spotify.music.features.ads.ui.b;
import com.squareup.picasso.Picasso;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: cm3  reason: default package */
public class cm3 implements i, b.AbstractC0214b {
    private View a;
    private View b;
    private View c;
    private View f;
    private ImageView n;
    private s42 o;
    private TextView p;
    private TextView q;
    private BrandAdsCTAButton r;
    private BookmarkAdButton s;
    private f t;
    private e u;
    Picasso v;
    g w;
    c x;
    nu3 y;
    cqe z;

    /* access modifiers changed from: package-private */
    /* renamed from: cm3$a */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ com.spotify.music.features.ads.ui.a a;

        a(cm3 cm3, com.spotify.music.features.ads.ui.a aVar) {
            this.a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.a();
        }
    }

    private void g(com.spotify.music.features.ads.ui.a aVar) {
        this.t.d(this.c, this.f, this.a, this.b, new a(this, aVar));
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void M0(int[] iArr) {
        int left = this.n.getLeft();
        int top = this.n.getTop();
        int width = this.n.getWidth();
        int height = this.n.getHeight();
        if (iArr[0] >= left && iArr[0] <= left + width && iArr[1] >= top && iArr[1] <= top + height) {
            g(new yl3(this));
        }
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.i
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.leave_behind_concert_promo, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.concert_promo_view);
        this.c = inflate.findViewById(C0707R.id.concert_promo_background);
        this.a = inflate.findViewById(C0707R.id.brand_ads_header);
        this.b = inflate.findViewById(C0707R.id.brand_ads_footer);
        this.f = inflate.findViewById(C0707R.id.concert_promo_body);
        this.n = (ImageView) inflate.findViewById(C0707R.id.iv_concert_promo);
        this.p = (TextView) inflate.findViewById(C0707R.id.tv_concert_promo_name);
        this.q = (TextView) inflate.findViewById(C0707R.id.tv_concert_promo_details);
        this.o = s42.b((ImageView) inflate.findViewById(C0707R.id.calendar_iv_concert_promo), this.z);
        OverlayBackgroundView overlayBackgroundView = (OverlayBackgroundView) inflate.findViewById(C0707R.id.bg_concert_promo);
        overlayBackgroundView.getBackground().setColorFilter(-1, PorterDuff.Mode.SRC);
        overlayBackgroundView.setRadius((float) nud.g(8.0f, layoutInflater.getContext().getResources()));
        overlayBackgroundView.setOnTouchListener(new b(findViewById, this));
        this.s = (BookmarkAdButton) inflate.findViewById(C0707R.id.btn_ad_bookmark);
        BrandAdsCTAButton brandAdsCTAButton = (BrandAdsCTAButton) inflate.findViewById(C0707R.id.btn_concert_promo_cta);
        this.r = brandAdsCTAButton;
        brandAdsCTAButton.setOnClickListener(new bm3(this, new am3(this)));
        this.b.setOnClickListener(new xl3(this, new zl3(this)));
        this.t = new f();
        return inflate;
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.i
    public void b(e eVar, d dVar) {
        this.u = eVar;
        ((lu3) this.y.a(dVar.f())).c(this.r);
        this.w.d(this.s);
        this.v.m(dVar.f()).n(this.n, new dm3(this));
        this.p.setText(dVar.a());
        this.q.setText(dVar.i());
        this.r.setText(dVar.b());
        String j = dVar.j();
        Locale locale = new Locale(SpotifyLocale.e());
        Calendar e = this.z.e();
        e.setTime(new Date(Long.MIN_VALUE));
        Date time = e.getTime();
        if (!TextUtils.isEmpty(j)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
            try {
                time = simpleDateFormat.parse(j);
            } catch (ParseException e2) {
                Logger.o(e2, "[AudioPlus] - Failed to parse concert date [%s] with formatter [%s]", j, simpleDateFormat);
            }
            this.o.d(time, locale);
        }
        this.t.c(this.c, this.f, this.a, this.b);
    }

    public /* synthetic */ void d(com.spotify.music.features.ads.ui.a aVar, View view) {
        g(aVar);
    }

    public void e() {
        c cVar = this.x;
        e eVar = this.u;
        cVar.getClass();
        ((LeaveBehindContainerFragment) eVar).K4();
    }

    public /* synthetic */ void f(com.spotify.music.features.ads.ui.a aVar, View view) {
        g(aVar);
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void j1() {
        c cVar = this.x;
        e eVar = this.u;
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
