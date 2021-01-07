package defpackage;

import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$PackageState;
import io.reactivex.functions.g;

/* renamed from: jg2  reason: default package */
public final /* synthetic */ class jg2 implements g {
    public final /* synthetic */ lg2 a;

    public /* synthetic */ jg2(lg2 lg2) {
        this.a = lg2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((OtaAppProtocol$PackageState) obj);
    }
}
