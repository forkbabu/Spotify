package defpackage;

import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m;
import com.spotify.player.model.ContextTrack;

/* renamed from: jvb  reason: default package */
public class jvb extends e<ContextTrack> implements m {
    private final AppCompatTextView C;
    private final AppCompatTextView D;
    private final View E = this.a.findViewById(C0707R.id.driving_track_info_container);
    private final View F;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jvb(android.view.LayoutInflater r2, int r3, android.view.ViewGroup r4) {
        /*
            r1 = this;
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r4, r0)
            r1.<init>(r2)
            r3 = 2131428274(0x7f0b03b2, float:1.8478188E38)
            android.view.View r2 = r2.findViewById(r3)
            r1.F = r2
            android.view.View r2 = r1.a
            r3 = 2131428292(0x7f0b03c4, float:1.8478224E38)
            android.view.View r2 = r2.findViewById(r3)
            r1.E = r2
            android.view.View r2 = r1.a
            r3 = 2131428294(0x7f0b03c6, float:1.8478228E38)
            android.view.View r2 = r2.findViewById(r3)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            r1.C = r2
            android.view.View r3 = r1.a
            r4 = 2131428293(0x7f0b03c5, float:1.8478226E38)
            android.view.View r3 = r3.findViewById(r4)
            androidx.appcompat.widget.AppCompatTextView r3 = (androidx.appcompat.widget.AppCompatTextView) r3
            r1.D = r3
            r4 = 2132083370(0x7f1502aa, float:1.980688E38)
            androidx.core.widget.c.n(r2, r4)
            r2 = 2132083369(0x7f1502a9, float:1.9806878E38)
            androidx.core.widget.c.n(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvb.<init>(android.view.LayoutInflater, int, android.view.ViewGroup):void");
    }

    private void u0(AppCompatTextView appCompatTextView) {
        if (TextUtils.isEmpty(appCompatTextView.getText())) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setVisibility(0);
        }
        bd0.b(this.a, new hvb(appCompatTextView), false);
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void d() {
        this.E.setVisibility(4);
        this.F.setVisibility(0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(ContextTrack contextTrack, int i) {
        ContextTrack contextTrack2 = contextTrack;
        this.C.setText(contextTrack2.metadata().get("title"));
        this.D.setText(kxd.a(contextTrack2));
        u0(this.C);
        u0(this.D);
        p();
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void p() {
        if (this.E.getVisibility() == 0) {
            this.F.setVisibility(4);
        } else {
            bd0.a(this.F, this.E);
        }
    }
}
