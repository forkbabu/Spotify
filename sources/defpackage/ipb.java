package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;

/* renamed from: ipb  reason: default package */
public final /* synthetic */ class ipb implements g {
    public final /* synthetic */ ypb a;

    public /* synthetic */ ipb(ypb ypb) {
        this.a = ypb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ypb.b(this.a, (Ad) obj);
    }
}
