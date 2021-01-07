package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.appprotocol.api.a;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesRequest;
import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesResponse;
import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$DownloadRequest;
import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$TransferData;
import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$TransferRequest;
import com.spotify.superbird.ota.model.g;
import com.spotify.superbird.ota.model.h;
import io.reactivex.d0;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.subjects.c;
import io.reactivex.v;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: hg2  reason: default package */
public class hg2 implements a, bh2 {
    private final zne a;
    private final vne b;
    private final l<String> c;
    private final c<h> d;
    private final tne e;
    private final c<ooe> f;

    public hg2(zne zne, vne vne, l<String> lVar, c<h> cVar, tne tne, c<ooe> cVar2) {
        this.a = zne;
        this.b = vne;
        this.c = lVar;
        this.d = cVar;
        this.e = tne;
        this.f = cVar2;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        cf2 b2 = cf2.b(OtaAppProtocol$CheckForUpdatesRequest.class, OtaAppProtocol$CheckForUpdatesResponse.class);
        b2.d("com.spotify.superbird.ota.check_for_updates");
        b2.c(0);
        b2.e(new wf2(this));
        qg0.accept(b2.a());
        cf2 b3 = cf2.b(OtaAppProtocol$TransferRequest.class, OtaAppProtocol$TransferData.class);
        b3.d("com.spotify.superbird.ota.transfer");
        b3.c(0);
        b3.e(new eg2(this));
        qg0.accept(b3.a());
        cf2 b4 = cf2.b(OtaAppProtocol$DownloadRequest.class, AppProtocolBase.Empty.class);
        b4.d("com.spotify.superbird.ota.download");
        b4.c(0);
        b4.e(new fg2(this));
        qg0.accept(b4.a());
    }

    @Override // defpackage.bh2
    public void b() {
        this.a.e();
    }

    @Override // defpackage.bh2
    public void c() {
        this.a.f();
    }

    /* access modifiers changed from: package-private */
    public s<OtaAppProtocol$CheckForUpdatesResponse> d(OtaAppProtocol$CheckForUpdatesRequest otaAppProtocol$CheckForUpdatesRequest) {
        return this.a.a(otaAppProtocol$CheckForUpdatesRequest.serial(), otaAppProtocol$CheckForUpdatesRequest.packages()).s(new zf2(this, otaAppProtocol$CheckForUpdatesRequest)).P().N(new dg2(this, otaAppProtocol$CheckForUpdatesRequest)).L(new yf2(this, otaAppProtocol$CheckForUpdatesRequest)).j0(bg2.a);
    }

    /* access modifiers changed from: package-private */
    public s<AppProtocolBase.Empty> e(OtaAppProtocol$DownloadRequest otaAppProtocol$DownloadRequest) {
        return this.c.i(new ag2(this, otaAppProtocol$DownloadRequest));
    }

    public /* synthetic */ d0 f(OtaAppProtocol$CheckForUpdatesRequest otaAppProtocol$CheckForUpdatesRequest, List list) {
        return this.e.a(list, otaAppProtocol$CheckForUpdatesRequest.firstTime()).A(new xf2(otaAppProtocol$CheckForUpdatesRequest, list));
    }

    public /* synthetic */ void g(OtaAppProtocol$CheckForUpdatesRequest otaAppProtocol$CheckForUpdatesRequest, h hVar) {
        this.d.onNext(hVar);
        if (hVar.b()) {
            this.a.b(otaAppProtocol$CheckForUpdatesRequest.serial(), hVar.d());
            return;
        }
        for (g gVar : hVar.d()) {
            if (this.b.g(otaAppProtocol$CheckForUpdatesRequest.serial(), gVar)) {
                this.f.onNext(ooe.a(otaAppProtocol$CheckForUpdatesRequest.serial(), gVar.packageName(), gVar.version(), gVar.hash(), gVar.sizeBytes()));
            }
        }
    }

    public /* synthetic */ void h(OtaAppProtocol$CheckForUpdatesRequest otaAppProtocol$CheckForUpdatesRequest, Throwable th) {
        this.d.onNext(h.a(otaAppProtocol$CheckForUpdatesRequest.serial(), Collections.emptyList(), false));
    }

    public /* synthetic */ v i(OtaAppProtocol$DownloadRequest otaAppProtocol$DownloadRequest, String str) {
        g create = g.create(otaAppProtocol$DownloadRequest.url(), otaAppProtocol$DownloadRequest.fromVersion(), otaAppProtocol$DownloadRequest.version(), otaAppProtocol$DownloadRequest.packageName(), otaAppProtocol$DownloadRequest.hash(), otaAppProtocol$DownloadRequest.critical(), otaAppProtocol$DownloadRequest.size());
        if (otaAppProtocol$DownloadRequest.networkType().equals("any")) {
            this.b.a();
            this.b.b(str, create);
        } else if (!otaAppProtocol$DownloadRequest.networkType().equals("wifi")) {
            return s.P(new IllegalArgumentException("Invalid network_type argument."));
        } else {
            this.b.p(str, Collections.singletonList(create));
        }
        return s.i0(AppProtocolBase.a);
    }

    public /* synthetic */ v j(OtaAppProtocol$TransferRequest otaAppProtocol$TransferRequest, String str) {
        try {
            return s.i0(this.b.n(str, otaAppProtocol$TransferRequest.packageName(), otaAppProtocol$TransferRequest.version(), otaAppProtocol$TransferRequest.offset(), otaAppProtocol$TransferRequest.size())).j0(gg2.a);
        } catch (IOException e2) {
            Logger.d("Failed to read bytes to transfer: %s", e2.getMessage());
            return s.P(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public s<OtaAppProtocol$TransferData> k(OtaAppProtocol$TransferRequest otaAppProtocol$TransferRequest) {
        return this.c.i(new cg2(this, otaAppProtocol$TransferRequest));
    }
}
