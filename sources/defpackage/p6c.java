package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;

/* renamed from: p6c  reason: default package */
public final /* synthetic */ class p6c implements g {
    public final /* synthetic */ z6c a;

    public /* synthetic */ p6c(z6c z6c) {
        this.a = z6c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        z6c.a(this.a, (Ad) obj);
    }
}
