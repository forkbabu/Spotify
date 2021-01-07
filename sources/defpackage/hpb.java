package defpackage;

import android.view.View;
import com.spotify.music.features.ads.model.Ad;

/* renamed from: hpb  reason: default package */
public final /* synthetic */ class hpb implements View.OnClickListener {
    public final /* synthetic */ ypb a;
    public final /* synthetic */ Ad b;

    public /* synthetic */ hpb(ypb ypb, Ad ad) {
        this.a = ypb;
        this.b = ad;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(this.b, view);
    }
}
