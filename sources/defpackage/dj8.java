package defpackage;

import android.view.View;
import com.spotify.music.features.ads.model.Ad;

/* renamed from: dj8  reason: default package */
public final /* synthetic */ class dj8 implements View.OnClickListener {
    public final /* synthetic */ gj8 a;
    public final /* synthetic */ Ad b;

    public /* synthetic */ dj8(gj8 gj8, Ad ad) {
        this.a = gj8;
        this.b = ad;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.w0(this.b, view);
    }
}
