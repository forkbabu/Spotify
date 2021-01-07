package defpackage;

import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesRequest;
import io.reactivex.functions.g;

/* renamed from: yf2  reason: default package */
public final /* synthetic */ class yf2 implements g {
    public final /* synthetic */ hg2 a;
    public final /* synthetic */ OtaAppProtocol$CheckForUpdatesRequest b;

    public /* synthetic */ yf2(hg2 hg2, OtaAppProtocol$CheckForUpdatesRequest otaAppProtocol$CheckForUpdatesRequest) {
        this.a = hg2;
        this.b = otaAppProtocol$CheckForUpdatesRequest;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h(this.b, (Throwable) obj);
    }
}
