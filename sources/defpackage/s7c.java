package defpackage;

import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* renamed from: s7c  reason: default package */
public class s7c extends e<ContextTrack> {
    private final Picasso C;
    private final ImageView D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s7c(android.view.LayoutInflater r3, com.squareup.picasso.Picasso r4, android.view.ViewGroup r5) {
        /*
            r2 = this;
            r0 = 2131624702(0x7f0e02fe, float:1.8876591E38)
            r1 = 0
            android.view.View r3 = r3.inflate(r0, r5, r1)
            r2.<init>(r3)
            r2.C = r4
            r4 = 2131430090(0x7f0b0aca, float:1.8481871E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.D = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7c.<init>(android.view.LayoutInflater, com.squareup.picasso.Picasso, android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(ContextTrack contextTrack, int i) {
        String d = kxd.d(contextTrack);
        if (d == null) {
            this.D.setImageResource(C0707R.drawable.cover_art_placeholder);
            return;
        }
        z m = this.C.m(d);
        m.s(C0707R.drawable.cover_art_placeholder);
        m.m(this.D);
    }
}
