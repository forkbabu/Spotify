package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;

/* renamed from: epb  reason: default package */
public final /* synthetic */ class epb implements g {
    public final /* synthetic */ wpb a;

    public /* synthetic */ epb(wpb wpb) {
        this.a = wpb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        wpb.b(this.a, (Ad) obj);
    }
}
