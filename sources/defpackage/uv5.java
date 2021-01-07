package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest;
import com.spotify.music.features.partneraccountlinking.clientprovider.samsung.h;
import com.spotify.music.features.partneraccountlinking.clientprovider.samsung.l;
import com.spotify.remoteconfig.xj;
import io.reactivex.d0;
import io.reactivex.z;

/* renamed from: uv5  reason: default package */
public class uv5 implements rv5 {
    private final h a;
    private final Context b;
    private final l c;
    private final wv5 d;
    private final xj e;

    public uv5(l lVar, h hVar, wv5 wv5, Context context, xj xjVar) {
        this.c = lVar;
        this.a = hVar;
        this.d = wv5;
        this.e = xjVar;
        this.b = context;
    }

    private z<Boolean> g() {
        z<SamsungLinkingRequest> b2 = this.c.b(e());
        h hVar = this.a;
        hVar.getClass();
        return b2.s(new mv5(hVar));
    }

    @Override // defpackage.rv5
    public z<Boolean> a() {
        return this.a.a();
    }

    @Override // defpackage.rv5
    public String b() {
        return "Samsung";
    }

    @Override // defpackage.rv5
    public z<Boolean> c() {
        if (this.e.a()) {
            return g();
        }
        return g().D(new qv5(this));
    }

    @Override // defpackage.rv5
    public String d() {
        return "com.osp.app.signin";
    }

    @Override // defpackage.rv5
    public boolean e() {
        return AccountManager.get(this.b).getAccountsByType("com.osp.app.signin").length > 0;
    }

    @Override // defpackage.rv5
    public boolean f() {
        return this.d.a();
    }

    public /* synthetic */ d0 h(Throwable th) {
        return g();
    }
}
