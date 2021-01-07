package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.z;

public class i extends e<ContextTrack> implements m {
    private final ImageView C;
    private final View D = this.a.findViewById(C0707R.id.peek_placeholder);
    private final zvd E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(android.view.LayoutInflater r2, defpackage.zvd r3, int r4, android.view.ViewGroup r5) {
        /*
            r1 = this;
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r5, r0)
            r1.<init>(r2)
            r1.E = r3
            r3 = 2131430090(0x7f0b0aca, float:1.8481871E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.C = r2
            android.view.View r2 = r1.a
            r3 = 2131430807(0x7f0b0d97, float:1.8483325E38)
            android.view.View r2 = r2.findViewById(r3)
            r1.D = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.i.<init>(android.view.LayoutInflater, zvd, int, android.view.ViewGroup):void");
    }

    /* access modifiers changed from: package-private */
    public void B0() {
        this.C.setVisibility(0);
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void d() {
        v0().setVisibility(4);
        this.D.setVisibility(0);
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void p() {
        if (v0().getVisibility() == 0) {
            this.D.setVisibility(4);
        } else {
            bd0.a(this.D, v0());
        }
    }

    public void u0(ContextTrack contextTrack, int i) {
        String d = kxd.d(contextTrack);
        if (d == null) {
            this.C.setImageResource(C0707R.drawable.cover_art_placeholder);
        } else {
            z e = this.E.e(d);
            e.s(C0707R.drawable.cover_art_placeholder);
            e.m(this.C);
        }
        p();
    }

    /* access modifiers changed from: protected */
    public View v0() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void w0() {
        this.C.setVisibility(8);
    }
}
