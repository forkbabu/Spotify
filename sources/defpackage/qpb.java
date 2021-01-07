package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;

/* renamed from: qpb  reason: default package */
public final /* synthetic */ class qpb implements g {
    public final /* synthetic */ gqb a;

    public /* synthetic */ qpb(gqb gqb) {
        this.a = gqb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        gqb.c(this.a, (Ad) obj);
    }
}
