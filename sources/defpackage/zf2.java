package defpackage;

import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesRequest;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: zf2  reason: default package */
public final /* synthetic */ class zf2 implements l {
    public final /* synthetic */ hg2 a;
    public final /* synthetic */ OtaAppProtocol$CheckForUpdatesRequest b;

    public /* synthetic */ zf2(hg2 hg2, OtaAppProtocol$CheckForUpdatesRequest otaAppProtocol$CheckForUpdatesRequest) {
        this.a = hg2;
        this.b = otaAppProtocol$CheckForUpdatesRequest;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, (List) obj);
    }
}
