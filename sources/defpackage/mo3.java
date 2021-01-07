package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.features.ads.audioplus.topbanner.LeaveBehindTopBannerContainerFragment;
import com.spotify.music.features.ads.audioplus.topbanner.b;
import com.spotify.music.features.ads.audioplus.topbanner.g;
import com.spotify.music.features.ads.audioplus.topbanner.i;
import com.spotify.music.features.ads.ui.OverlayBackgroundView;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.squareup.picasso.Picasso;

/* renamed from: mo3  reason: default package */
public class mo3 implements b {
    private OverlayBackgroundView a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private i e;
    Picasso f;
    g g;
    nu3 h;

    @Override // com.spotify.music.features.ads.audioplus.topbanner.b
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.audio_plus_top_banner_v1, viewGroup, false);
        OverlayBackgroundView overlayBackgroundView = (OverlayBackgroundView) inflate.findViewById(C0707R.id.top_banner_background);
        this.a = overlayBackgroundView;
        overlayBackgroundView.setColor(a.b(layoutInflater.getContext(), C0707R.color.leave_behind_ad_background_default_color));
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.top_banner_image);
        this.b = imageView;
        imageView.setOnClickListener(new go3(this));
        TextView textView = (TextView) inflate.findViewById(C0707R.id.top_banner_advertiser_name);
        this.c = textView;
        textView.setOnClickListener(new jo3(this));
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.top_banner_cta);
        this.d = textView2;
        textView2.setOnClickListener(new ho3(this));
        SpotifyIconView spotifyIconView = (SpotifyIconView) inflate.findViewById(C0707R.id.top_banner_close_button);
        spotifyIconView.setOnClickListener(new io3(this));
        View view = (View) spotifyIconView.getParent();
        view.post(new ko3(view, spotifyIconView));
        return inflate;
    }

    @Override // com.spotify.music.features.ads.audioplus.topbanner.b
    public void b(i iVar, d dVar) {
        this.e = iVar;
        ((lu3) this.h.a(dVar.f())).c(this.a);
        this.c.setText(dVar.a());
        this.f.m(dVar.f()).n(this.b, new lo3(this));
        this.d.setText(dVar.b());
    }

    public void d(View view) {
        g gVar = this.g;
        i iVar = this.e;
        gVar.getClass();
        ((LeaveBehindTopBannerContainerFragment) iVar).K4();
    }
}
