package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$TransferRequest;
import defpackage.cf2;
import io.reactivex.s;

/* renamed from: eg2  reason: default package */
public final /* synthetic */ class eg2 implements cf2.c {
    public final /* synthetic */ hg2 a;

    public /* synthetic */ eg2(hg2 hg2) {
        this.a = hg2;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        return this.a.k((OtaAppProtocol$TransferRequest) jacksonModel);
    }
}
