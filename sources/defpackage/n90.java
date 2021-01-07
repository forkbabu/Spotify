package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.android.paste.widget.RoundedCornerImageView;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.spotify.paste.widgets.layouts.AspectRatioView;

/* access modifiers changed from: package-private */
/* renamed from: n90  reason: default package */
public class n90 implements m90 {
    private final AspectRatioView a;
    private final TextView b;
    private final RoundedCornerImageView c;
    private final SpotifyIconView f;

    n90(View view) {
        AspectRatioView aspectRatioView = (AspectRatioView) view;
        this.a = aspectRatioView;
        View findViewById = aspectRatioView.findViewById(C0707R.id.background);
        TextView textView = (TextView) aspectRatioView.findViewById(16908308);
        this.b = textView;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) aspectRatioView.findViewById(C0707R.id.category_card_background);
        this.c = roundedCornerImageView;
        SpotifyIconView spotifyIconView = (SpotifyIconView) aspectRatioView.findViewById(16908295);
        this.f = spotifyIconView;
        bvd b2 = dvd.b(findViewById);
        b2.f(spotifyIconView, roundedCornerImageView);
        b2.g(textView);
        b2.a();
        roundedCornerImageView.setRoundedCorners(true);
    }

    @Override // defpackage.m90
    public ImageView getImageView() {
        return this.c;
    }

    @Override // defpackage.m90
    public TextView getTitleView() {
        return this.b;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.m90
    public void m2(SpotifyIconV2 spotifyIconV2) {
        if (spotifyIconV2 != null) {
            this.f.setIcon(spotifyIconV2);
            this.f.setVisibility(0);
            return;
        }
        this.f.setVisibility(8);
    }

    @Override // defpackage.m90
    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // defpackage.m90
    public void t2(boolean z) {
        this.c.setRoundedCorners(z);
    }
}
