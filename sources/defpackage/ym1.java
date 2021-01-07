package defpackage;

import com.spotify.mobile.android.service.SpotifyServiceCommandHandlingStatus;
import io.reactivex.functions.g;

/* renamed from: ym1  reason: default package */
public final /* synthetic */ class ym1 implements g {
    public final /* synthetic */ pn1 a;

    public /* synthetic */ ym1(pn1 pn1) {
        this.a = pn1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        pn1.j(this.a, (SpotifyServiceCommandHandlingStatus) obj);
    }
}
