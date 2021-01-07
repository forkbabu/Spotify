package defpackage;

import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$TransferRequest;
import io.reactivex.functions.l;

/* renamed from: cg2  reason: default package */
public final /* synthetic */ class cg2 implements l {
    public final /* synthetic */ hg2 a;
    public final /* synthetic */ OtaAppProtocol$TransferRequest b;

    public /* synthetic */ cg2(hg2 hg2, OtaAppProtocol$TransferRequest otaAppProtocol$TransferRequest) {
        this.a = hg2;
        this.b = otaAppProtocol$TransferRequest;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.j(this.b, (String) obj);
    }
}
