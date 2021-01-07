package defpackage;

import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesRequest;
import com.spotify.superbird.ota.model.h;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: xf2  reason: default package */
public final /* synthetic */ class xf2 implements l {
    public final /* synthetic */ OtaAppProtocol$CheckForUpdatesRequest a;
    public final /* synthetic */ List b;

    public /* synthetic */ xf2(OtaAppProtocol$CheckForUpdatesRequest otaAppProtocol$CheckForUpdatesRequest, List list) {
        this.a = otaAppProtocol$CheckForUpdatesRequest;
        this.b = list;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        OtaAppProtocol$CheckForUpdatesRequest otaAppProtocol$CheckForUpdatesRequest = this.a;
        return h.a(otaAppProtocol$CheckForUpdatesRequest.serial(), this.b, ((Boolean) obj).booleanValue());
    }
}
