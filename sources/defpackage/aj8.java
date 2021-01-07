package defpackage;

import android.view.View;
import com.spotify.music.features.ads.model.Ad;

/* renamed from: aj8  reason: default package */
public final /* synthetic */ class aj8 implements View.OnClickListener {
    public final /* synthetic */ gj8 a;
    public final /* synthetic */ Ad b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int f;

    public /* synthetic */ aj8(gj8 gj8, Ad ad, String str, int i) {
        this.a = gj8;
        this.b = ad;
        this.c = str;
        this.f = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.C0(this.b, this.c, this.f, view);
    }
}
