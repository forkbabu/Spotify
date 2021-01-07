package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.music.canvas.model.b;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public class c extends e<ContextTrack> implements m {
    private final pl2 C;
    private final km2 D;
    private final mm2 E;
    private final ImageView F;
    private final Picasso G;
    private final View H = this.a.findViewById(C0707R.id.peek_placeholder);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.view.LayoutInflater r3, defpackage.pl2 r4, com.squareup.picasso.Picasso r5, defpackage.km2 r6, defpackage.mm2 r7, androidx.lifecycle.n r8, android.view.ViewGroup r9) {
        /*
            r2 = this;
            r0 = 2131624775(0x7f0e0347, float:1.887674E38)
            r1 = 0
            android.view.View r3 = r3.inflate(r0, r9, r1)
            r2.<init>(r3)
            r2.C = r4
            r2.G = r5
            r2.D = r6
            r2.E = r7
            r4 = 2131430090(0x7f0b0aca, float:1.8481871E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.F = r3
            android.view.View r3 = r2.a
            r4 = 2131430807(0x7f0b0d97, float:1.8483325E38)
            android.view.View r3 = r3.findViewById(r4)
            r2.H = r3
            androidx.lifecycle.Lifecycle r3 = r8.A()
            com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.CanvasImageViewHolder$2 r4 = new com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.CanvasImageViewHolder$2
            r4.<init>(r7)
            r3.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.c.<init>(android.view.LayoutInflater, pl2, com.squareup.picasso.Picasso, km2, mm2, androidx.lifecycle.n, android.view.ViewGroup):void");
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void d() {
        this.F.setVisibility(4);
        this.H.setVisibility(0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(ContextTrack contextTrack, int i) {
        ContextTrack contextTrack2 = contextTrack;
        b a = this.C.a(contextTrack2);
        String c = this.C.c(contextTrack2);
        if (c == null) {
            c = kxd.d(contextTrack2);
        }
        if (c == null) {
            this.F.setImageResource(C0707R.drawable.cover_art_placeholder);
        } else {
            this.D.b(a);
            this.E.e(a.h());
            z m = this.G.m(c);
            m.s(C0707R.drawable.cover_art_placeholder);
            m.n(this.F, new b(this, a));
        }
        p();
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void p() {
        if (this.F.getVisibility() == 0) {
            this.H.setVisibility(4);
        } else {
            bd0.a(this.H, this.F);
        }
    }
}
