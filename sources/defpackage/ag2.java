package defpackage;

import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$DownloadRequest;
import io.reactivex.functions.l;

/* renamed from: ag2  reason: default package */
public final /* synthetic */ class ag2 implements l {
    public final /* synthetic */ hg2 a;
    public final /* synthetic */ OtaAppProtocol$DownloadRequest b;

    public /* synthetic */ ag2(hg2 hg2, OtaAppProtocol$DownloadRequest otaAppProtocol$DownloadRequest) {
        this.a = hg2;
        this.b = otaAppProtocol$DownloadRequest;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.i(this.b, (String) obj);
    }
}
