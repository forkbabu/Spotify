package com.spotify.music.features.partneraccountlinking;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.util.connectivity.c0;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper;
import com.spotify.music.features.partneraccountlinking.j;
import com.spotify.music.features.partneraccountlinking.q;
import com.spotify.rxjava2.p;
import io.reactivex.d0;
import io.reactivex.s;

public class o implements k {
    private final rv5 a;
    private final c0 b;
    private final l c;
    private final PartnerAccountLinkingSessionHelper d;
    private final PartnerAccountLinkingLogger e;
    private q.a f;
    private final p g = new p();

    public o(rv5 rv5, c0 c0Var, l lVar, PartnerAccountLinkingSessionHelper partnerAccountLinkingSessionHelper, PartnerAccountLinkingLogger partnerAccountLinkingLogger) {
        this.a = rv5;
        this.b = c0Var;
        this.c = lVar;
        this.d = partnerAccountLinkingSessionHelper;
        this.e = partnerAccountLinkingLogger;
    }

    private void d(PartnerAccountLinkingError.ErrorType errorType, String str) {
        this.e.f(errorType, str);
        i iVar = new i(errorType, str);
        q.a aVar = this.f;
        aVar.getClass();
        aVar.a(iVar);
        this.c.U0(this.f.build());
    }

    public static void e(o oVar, boolean z) {
        if (z) {
            oVar.e.h();
            l lVar = oVar.c;
            q.a aVar = oVar.f;
            aVar.getClass();
            lVar.U0(aVar.build());
            return;
        }
        oVar.d(PartnerAccountLinkingError.ErrorType.ERROR_DOING_ACCOUNT_LINKING, "");
    }

    public static s f(o oVar, PartnerAccountLinkingSessionHelper.State state) {
        oVar.getClass();
        s<Object> sVar = io.reactivex.internal.operators.observable.o.a;
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            return s.i0(Boolean.TRUE);
        }
        if (ordinal == 1) {
            oVar.c.w0(111);
            return sVar;
        } else if (ordinal != 2) {
            return sVar;
        } else {
            return s.P(new RuntimeException("Error getting session state"));
        }
    }

    @Override // com.spotify.music.features.partneraccountlinking.k
    public void a() {
        d(PartnerAccountLinkingError.ErrorType.ERROR_USER_CANCELLED, "");
    }

    @Override // com.spotify.music.features.partneraccountlinking.k
    public void b(int i, int i2, Intent intent) {
        if (i == 111 && i2 != -1) {
            d(PartnerAccountLinkingError.ErrorType.ERROR_SPOTIFY_LOGIN, "");
        }
    }

    @Override // com.spotify.music.features.partneraccountlinking.k
    public void c(String str) {
        j.b bVar = new j.b();
        if (str != null) {
            Uri parse = Uri.parse(str);
            bVar.c(parse.getQueryParameter("state"));
            bVar.b(parse.getQueryParameter("redirect_uri"));
        }
        this.f = bVar;
        if (!this.a.f()) {
            d(PartnerAccountLinkingError.ErrorType.ERROR_NO_PARTNER_ACCOUNT_APP, "");
        } else if (!this.b.a()) {
            d(PartnerAccountLinkingError.ErrorType.ERROR_CAN_NOT_CONNECT, "");
        } else {
            this.g.b(this.d.a().P0(d.a).W(new c(this), false, Integer.MAX_VALUE).a0(new f(this)).subscribe(new b(this), new e(this)));
        }
    }

    public /* synthetic */ d0 g(Boolean bool) {
        return this.a.c();
    }

    public /* synthetic */ void h(Throwable th) {
        d(PartnerAccountLinkingError.ErrorType.ERROR_INTERNAL, th.getMessage());
    }

    @Override // com.spotify.music.features.partneraccountlinking.k
    public void teardown() {
        this.g.a();
    }
}
