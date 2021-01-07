package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;

/* renamed from: s6c  reason: default package */
public final /* synthetic */ class s6c implements g {
    public final /* synthetic */ c7c a;

    public /* synthetic */ s6c(c7c c7c) {
        this.a = c7c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        c7c.d(this.a, (Ad) obj);
    }
}
