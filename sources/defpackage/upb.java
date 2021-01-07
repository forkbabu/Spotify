package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;

/* renamed from: upb  reason: default package */
public final /* synthetic */ class upb implements g {
    public final /* synthetic */ iqb a;

    public /* synthetic */ upb(iqb iqb) {
        this.a = iqb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        iqb.a(this.a, (Ad) obj);
    }
}
