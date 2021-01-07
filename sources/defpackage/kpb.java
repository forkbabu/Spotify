package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;

/* renamed from: kpb  reason: default package */
public final /* synthetic */ class kpb implements g {
    public final /* synthetic */ cqb a;

    public /* synthetic */ kpb(cqb cqb) {
        this.a = cqb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        cqb.d(this.a, (Ad) obj);
    }
}
