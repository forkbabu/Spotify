package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

/* renamed from: vm3  reason: default package */
public class vm3 implements i, b.AbstractC0214b {
    private View a;
    private View b;
    private View c;
    private View f;
    private OverlayBackgroundView n;
    private ImageView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private BookmarkAdButton s;
    private mu3 t;
    private f u;
    private e v;
    Picasso w;
    g x;
    c y;
    nu3 z;

    /* access modifiers changed from: package-private */
    /* renamed from: vm3$a */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ com.spotify.music.features.ads.ui.a a;

        a(vm3 vm3, com.spotify.music.features.ads.ui.a aVar) {
            this.a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.a();
        }
    }

    private void h(com.spotify.music.features.ads.ui.a aVar) {
        this.u.d(this.c, this.f, this.a, this.b, new a(this, aVar));
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void M0(int[] iArr) {
        int left = this.o.getLeft();
        int top = this.o.getTop();
        int width = this.o.getWidth();
        int height = this.o.getHeight();
        if (iArr[0] >= left && iArr[0] <= left + width && iArr[1] >= top && iArr[1] <= top + height) {
            h(new jm3(this));
        }
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.i
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.leave_behind_content_promo, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.content_promo_view);
        this.c = inflate.findViewById(C0707R.id.content_promo_background);
        this.a = inflate.findViewById(C0707R.id.content_promo_header);
        this.b = inflate.findViewById(C0707R.id.content_promo_footer);
        this.f = inflate.findViewById(C0707R.id.content_promo_body);
        this.o = (ImageView) inflate.findViewById(C0707R.id.content_promo_image);
        this.p = (TextView) inflate.findViewById(C0707R.id.tv_content_promo_name);
        this.q = (TextView) inflate.findViewById(C0707R.id.tv_content_promo_entity);
        this.r = (TextView) inflate.findViewById(C0707R.id.tv_content_promo_details);
        this.s = (BookmarkAdButton) inflate.findViewById(C0707R.id.btn_ad_bookmark);
        Button button = (Button) inflate.findViewById(C0707R.id.btn_content_promo_info);
        nm3 nm3 = new nm3(this);
        button.setOnClickListener(new mm3(this, nm3));
        button.setOnClickListener(new im3(this, nm3));
        OverlayBackgroundView overlayBackgroundView = (OverlayBackgroundView) inflate.findViewById(C0707R.id.content_promo_background_view);
        this.n = overlayBackgroundView;
        overlayBackgroundView.setColor(androidx.core.content.a.b(layoutInflater.getContext(), C0707R.color.leave_behind_ad_background_default_color));
        this.n.setRadius((float) nud.g(8.0f, layoutInflater.getContext().getResources()));
        this.n.setOnTouchListener(new b(findViewById, this));
        this.b.setOnClickListener(new km3(this, new lm3(this)));
        this.u = new f();
        return inflate;
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.i
    public void b(e eVar, d dVar) {
        this.v = eVar;
        this.t = this.z.a(dVar.f());
        this.x.d(this.s);
        ((lu3) this.t).c(this.n);
        this.w.m(dVar.f()).n(this.o, new wm3(this));
        String k = dVar.k();
        String j = dVar.j();
        String i = dVar.i();
        this.p.setText(k);
        this.q.setText(j);
        this.r.setText(i);
        this.u.c(this.c, this.f, this.a, this.b);
    }

    public /* synthetic */ void d(com.spotify.music.features.ads.ui.a aVar, View view) {
        h(aVar);
    }

    public /* synthetic */ void e(com.spotify.music.features.ads.ui.a aVar, View view) {
        h(aVar);
    }

    public void f() {
        c cVar = this.y;
        e eVar = this.v;
        cVar.getClass();
        ((LeaveBehindContainerFragment) eVar).K4();
    }

    public /* synthetic */ void g(com.spotify.music.features.ads.ui.a aVar, View view) {
        h(aVar);
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void j1() {
        c cVar = this.y;
        e eVar = this.v;
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
