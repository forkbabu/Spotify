package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.features.ads.audioplus.topbanner.carousel.a;
import com.spotify.music.features.ads.ui.OverlayBackgroundView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* renamed from: co3  reason: default package */
public class co3 extends e<d> {
    private final ImageView C;
    private final TextView D;
    private final TextView E;
    private final TextView F;
    private final ImageButton G;
    private final a H;
    private final BookmarkAdButton I;
    private final OverlayBackgroundView J;
    private final com.spotify.music.features.ads.audioplus.topbanner.d K;
    private final nu3 L;
    private final Picasso M;
    private final int N;

    co3(Picasso picasso, ViewGroup viewGroup, a aVar, com.spotify.music.features.ads.audioplus.topbanner.d dVar, nu3 nu3) {
        super(je.G(viewGroup, C0707R.layout.ad_card_in_carousel, viewGroup, false));
        this.N = nud.g(6.0f, viewGroup.getContext().getResources());
        this.M = picasso;
        this.L = nu3;
        this.H = aVar;
        this.K = dVar;
        View findViewById = this.a.findViewById(C0707R.id.layout_ad_card);
        findViewById.getClass();
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        OverlayBackgroundView overlayBackgroundView = (OverlayBackgroundView) viewGroup2.findViewById(C0707R.id.bg_view_carousel_card);
        this.J = overlayBackgroundView;
        overlayBackgroundView.setColor(androidx.core.content.a.b(viewGroup.getContext(), C0707R.color.leave_behind_ad_background_default_color));
        this.C = (ImageView) viewGroup2.findViewById(C0707R.id.top_banner_image);
        this.D = (TextView) viewGroup2.findViewById(C0707R.id.tv_top_banner_adertiser);
        this.E = (TextView) viewGroup2.findViewById(C0707R.id.tv_top_banner_details);
        this.F = (TextView) viewGroup2.findViewById(C0707R.id.btn_top_banner_cta);
        this.G = (ImageButton) viewGroup2.findViewById(C0707R.id.img_btn_click_through);
        this.I = (BookmarkAdButton) viewGroup2.findViewById(C0707R.id.btn_ad_bookmark);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public /* bridge */ /* synthetic */ void h0(d dVar, int i) {
        v0(dVar);
    }

    public void v0(d dVar) {
        ((lu3) this.L.a(dVar.f())).c(this.J);
        this.J.setRadius((float) this.N);
        this.K.b(dVar).d(this.I);
        String f = dVar.f();
        String e = dVar.e();
        z m = this.M.m(f);
        m.x(new uo3(20));
        m.n(this.C, new bo3(this, e));
        this.D.setText(dVar.a());
        this.E.setText("");
        this.F.setText(dVar.b());
        this.F.setOnClickListener(new xn3(this, dVar));
        if (l0.z(dVar.c()).q() == LinkType.DUMMY) {
            this.G.setVisibility(0);
        } else {
            this.G.setVisibility(4);
        }
    }

    public /* synthetic */ void w0(d dVar, View view) {
        this.H.b(dVar.e(), dVar.c());
    }
}
