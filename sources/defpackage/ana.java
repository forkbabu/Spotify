package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.d;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.s51;

/* renamed from: ana  reason: default package */
public class ana implements s51<View> {
    private final Context a;
    private final Picasso b;

    public ana(Context context, Picasso picasso) {
        context.getClass();
        this.a = context;
        picasso.getClass();
        this.b = picasso;
    }

    private void f(zma zma, SpotifyIconV2 spotifyIconV2, int i) {
        Context context = this.a;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.std_16dp));
        spotifyIconDrawable.r(a.b(this.a, i));
        zma.k1(spotifyIconDrawable);
    }

    /* access modifiers changed from: protected */
    public void a(zma zma, s81 s81) {
        x81 main = s81.images().main();
        String uri = main != null ? main.uri() : null;
        ImageView imageView = zma.getImageView();
        Drawable l = yc0.l(this.a, SpotifyIconV2.PODCASTS);
        float dimensionPixelSize = (float) imageView.getResources().getDimensionPixelSize(C0707R.dimen.podcast_charts_thumbnail_4dp_radius);
        if (uri != null) {
            z m = this.b.m(uri);
            m.t(l);
            m.g(l);
            m.o(rwd.g(imageView, d.a(dimensionPixelSize), null));
            return;
        }
        this.b.b(imageView);
        imageView.setImageDrawable(l);
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(view, s81, aVar, iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00be, code lost:
        if (r8.equals(com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.TRACK_THUMB_STATE_UP) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00eb  */
    @Override // defpackage.s51
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.view.View r8, defpackage.s81 r9, defpackage.w51 r10, defpackage.s51.b r11) {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ana.c(android.view.View, s81, w51, s51$b):void");
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        Context context = this.a;
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.podcast_charts_v2_row_view, viewGroup, false);
        y90 j = e90.d().j(context, viewGroup, false);
        ((LinearLayout) inflate.findViewById(C0707R.id.holder)).addView(j.getView());
        j.getView().setDuplicateParentStateEnabled(true);
        cna cna = new cna(inflate, j, (TextView) inflate.findViewById(C0707R.id.chart_icon_position_compound_drawable));
        cna.getView().setTag(C0707R.id.glue_viewholder_tag, cna);
        return cna.getView();
    }
}
