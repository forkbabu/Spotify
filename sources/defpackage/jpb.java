package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;

/* renamed from: jpb  reason: default package */
public final /* synthetic */ class jpb implements g {
    public final /* synthetic */ aqb a;

    public /* synthetic */ jpb(aqb aqb) {
        this.a = aqb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        aqb.a(this.a, (Ad) obj);
    }
}
