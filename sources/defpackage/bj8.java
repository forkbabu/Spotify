package defpackage;

import android.view.View;
import com.spotify.music.features.ads.model.Ad;

/* renamed from: bj8  reason: default package */
public final /* synthetic */ class bj8 implements View.OnClickListener {
    public final /* synthetic */ gj8 a;
    public final /* synthetic */ Ad b;
    public final /* synthetic */ int c;

    public /* synthetic */ bj8(gj8 gj8, Ad ad, int i) {
        this.a = gj8;
        this.b = ad;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.E0(this.b, this.c, view);
    }
}
