package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.d;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.z;

public class n extends e<ContextTrack> implements m {
    private final zvd C;
    private final ViewGroup D;
    private final ImageView E = ((ImageView) this.a.findViewById(C0707R.id.image));
    private final View F = this.a.findViewById(C0707R.id.peek_placeholder);
    private final boolean G;
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private final int L;

    public n(LayoutInflater layoutInflater, zvd zvd, DisplayMetrics displayMetrics, ViewGroup viewGroup, boolean z) {
        super(layoutInflater.inflate(C0707R.layout.player_v2_square_track_content, viewGroup, false));
        this.C = zvd;
        this.G = z;
        this.D = (ViewGroup) viewGroup.getParent();
        this.H = displayMetrics.widthPixels;
        this.I = displayMetrics.heightPixels;
        this.J = viewGroup.getResources().getDimensionPixelSize(C0707R.dimen.player_v2_square_cover_art_min_horizontal_margin);
        this.K = viewGroup.getResources().getDimensionPixelSize(C0707R.dimen.player_v2_square_cover_art_min_top_vertical_margin);
        this.L = viewGroup.getResources().getDimensionPixelSize(C0707R.dimen.player_v2_square_cover_art_min_bottom_vertical_margin);
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void d() {
        this.E.setVisibility(4);
        this.F.setVisibility(0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(ContextTrack contextTrack, int i) {
        bd0.b(this.D, new a(this, contextTrack), false);
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void p() {
        if (this.E.getVisibility() == 0) {
            this.F.setVisibility(4);
        } else {
            bd0.a(this.F, this.E);
        }
    }

    public void u0(ContextTrack contextTrack, View view) {
        View findViewById = this.D.findViewById(C0707R.id.player_overlay_header);
        View findViewById2 = this.D.findViewById(C0707R.id.player_overlay_footer);
        if (findViewById == null || findViewById2 == null) {
            throw new NullPointerException("The Player Fragment layout is missing player_overlay_header and/or player_overlay_footer views, needed to position the square cover art in between.");
        }
        int top = (findViewById2.getTop() - findViewById.getBottom()) - (this.K + this.L);
        int min = Math.min(top, this.H - (this.J * 2));
        int bottom = ((top - min) / 2) + findViewById.getBottom() + this.K;
        int i = this.H;
        boolean z = true;
        boolean z2 = i > this.I;
        double d = (double) i;
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d);
        boolean z3 = ((double) min) > d * 0.4d;
        if (!z2 && !z3) {
            z = false;
        }
        if (z) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height = min;
            layoutParams.width = min;
            layoutParams.setMargins(0, bottom, 0, 0);
            this.E.setLayoutParams(layoutParams);
            this.F.setLayoutParams(layoutParams);
        }
        String d2 = kxd.d(contextTrack);
        if (d2 == null) {
            this.E.setImageResource(C0707R.drawable.cover_art_placeholder);
        } else {
            z e = this.C.e(d2);
            e.s(C0707R.drawable.cover_art_placeholder);
            if (this.G) {
                ImageView imageView = this.E;
                e.o(rwd.g(imageView, d.a((float) imageView.getResources().getDimensionPixelSize(C0707R.dimen.std_8dp)), null));
            } else {
                e.m(this.E);
            }
        }
        p();
    }
}
