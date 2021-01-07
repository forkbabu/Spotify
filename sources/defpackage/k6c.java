package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;

/* renamed from: k6c  reason: default package */
public final /* synthetic */ class k6c implements g {
    public final /* synthetic */ m6c a;

    public /* synthetic */ k6c(m6c m6c) {
        this.a = m6c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        m6c.a(this.a, (Ad) obj);
    }
}
