package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.audioplus.topbanner.LeaveBehindTopBannerContainerFragment;
import com.spotify.music.features.ads.audioplus.topbanner.b;
import com.spotify.music.features.ads.audioplus.topbanner.d;
import com.spotify.music.features.ads.audioplus.topbanner.g;
import com.spotify.music.features.ads.audioplus.topbanner.i;
import com.spotify.music.features.ads.ui.OverlayBackgroundView;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* renamed from: so3  reason: default package */
public class so3 implements b {
    private OverlayBackgroundView a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private ImageButton f;
    private BookmarkAdButton g;
    private i h;
    private int i;
    Picasso j;
    d k;
    g l;
    nu3 m;

    @Override // com.spotify.music.features.ads.audioplus.topbanner.b
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.audio_plus_top_banner_v2, viewGroup, false);
        this.i = nud.g(6.0f, layoutInflater.getContext().getResources());
        OverlayBackgroundView overlayBackgroundView = (OverlayBackgroundView) inflate.findViewById(C0707R.id.top_banner_background_overlay_view);
        this.a = overlayBackgroundView;
        overlayBackgroundView.setColor(a.b(layoutInflater.getContext(), C0707R.color.leave_behind_ad_background_default_color));
        inflate.findViewById(C0707R.id.layout_info).setOnClickListener(new po3(this));
        this.b = (ImageView) inflate.findViewById(C0707R.id.top_banner_image);
        this.c = (TextView) inflate.findViewById(C0707R.id.tv_top_banner_adertiser);
        this.d = (TextView) inflate.findViewById(C0707R.id.tv_top_banner_details);
        this.e = (TextView) inflate.findViewById(C0707R.id.btn_top_banner_cta);
        this.f = (ImageButton) inflate.findViewById(C0707R.id.img_btn_click_through);
        this.g = (BookmarkAdButton) inflate.findViewById(C0707R.id.btn_ad_bookmark);
        SpotifyIconView spotifyIconView = (SpotifyIconView) inflate.findViewById(C0707R.id.btn_top_banner_close);
        spotifyIconView.setOnClickListener(new qo3(this));
        View view = (View) spotifyIconView.getParent();
        view.post(new oo3(view, spotifyIconView));
        return inflate;
    }

    @Override // com.spotify.music.features.ads.audioplus.topbanner.b
    public void b(i iVar, com.spotify.music.features.ads.audioplus.d dVar) {
        this.h = iVar;
        ((lu3) this.m.a(dVar.f())).c(this.a);
        this.k.b(dVar).d(this.g);
        this.c.setText(dVar.k());
        this.d.setText(!TextUtils.isEmpty(dVar.i()) ? dVar.i() : dVar.j());
        z m2 = this.j.m(dVar.f());
        m2.x(new uo3(36));
        m2.n(this.b, new ro3(this));
        this.a.setRadius((float) this.i);
        this.e.setText(dVar.b());
        if (l0.z(dVar.c()).q() == LinkType.DUMMY) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(4);
        }
    }

    public void d(View view) {
        g gVar = this.l;
        i iVar = this.h;
        gVar.getClass();
        ((LeaveBehindTopBannerContainerFragment) iVar).K4();
    }
}
