package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* renamed from: xo2  reason: default package */
public class xo2 extends e<ContextTrack> implements m {
    private final Picasso C;
    private final ImageView D;
    private final View E = this.a.findViewById(C0707R.id.peek_placeholder);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xo2(com.squareup.picasso.Picasso r2, android.view.ViewGroup r3) {
        /*
            r1 = this;
            r0 = 2131624099(0x7f0e00a3, float:1.8875368E38)
            android.view.View r3 = com.spotify.mobile.android.spotlets.common.recyclerview.e.j0(r0, r3)
            r1.<init>(r3)
            r1.C = r2
            r2 = 2131430090(0x7f0b0aca, float:1.8481871E38)
            android.view.View r2 = r3.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.D = r2
            android.view.View r2 = r1.a
            r3 = 2131430807(0x7f0b0d97, float:1.8483325E38)
            android.view.View r2 = r2.findViewById(r3)
            r1.E = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo2.<init>(com.squareup.picasso.Picasso, android.view.ViewGroup):void");
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void d() {
        this.D.setVisibility(4);
        this.E.setVisibility(0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(ContextTrack contextTrack, int i) {
        String d = kxd.d(contextTrack);
        if (d == null) {
            this.D.setImageResource(C0707R.drawable.cover_art_placeholder);
        } else {
            z m = this.C.m(d);
            m.s(C0707R.drawable.cover_art_placeholder);
            m.m(this.D);
        }
        p();
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void p() {
        if (this.D.getVisibility() == 0) {
            this.E.setVisibility(4);
        } else {
            bd0.a(this.E, this.D);
        }
    }
}
