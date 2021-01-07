package defpackage;

import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesRequest;
import com.spotify.superbird.ota.model.h;
import io.reactivex.functions.g;

/* renamed from: dg2  reason: default package */
public final /* synthetic */ class dg2 implements g {
    public final /* synthetic */ hg2 a;
    public final /* synthetic */ OtaAppProtocol$CheckForUpdatesRequest b;

    public /* synthetic */ dg2(hg2 hg2, OtaAppProtocol$CheckForUpdatesRequest otaAppProtocol$CheckForUpdatesRequest) {
        this.a = hg2;
        this.b = otaAppProtocol$CheckForUpdatesRequest;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.g(this.b, (h) obj);
    }
}
