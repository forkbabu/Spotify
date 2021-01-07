package com.spotify.music.features.partneraccountlinking.dialog;

import android.app.Activity;
import androidx.appcompat.app.g;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.C0707R;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingLogger;
import com.spotify.rxjava2.p;
import io.reactivex.d0;
import io.reactivex.z;

public class t extends m {
    private final k a;
    private final o b;
    private final PartnerAccountLinkingLogger c;
    private final r f;
    private final yn1 n;
    private final p o;
    private final g p;
    private final p q = new p();

    public t(Activity activity, o oVar, r rVar, yn1 yn1, p pVar, PartnerAccountLinkingLogger partnerAccountLinkingLogger) {
        this.p = (g) activity;
        k kVar = (k) activity;
        this.a = kVar;
        kVar.y0(this);
        this.b = oVar;
        this.f = rVar;
        this.n = yn1;
        this.o = pVar;
        this.c = partnerAccountLinkingLogger;
    }

    public static void E2(t tVar, boolean z) {
        o v0 = tVar.p.v0();
        if (z && !v0.o0()) {
            tVar.c.e(tVar.o.b());
            tVar.f.a();
            x i = v0.i();
            i.q(C0707R.id.partner_account_linking_dialog_card_container, new PartnerAccountLinkingSlateFragment(), "PartnerAccountLinkingSlateFragmentTag");
            i.i();
        }
    }

    public /* synthetic */ d0 F2(String str) {
        return this.b.a();
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onDestroy() {
        this.a.e1(this);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStart() {
        p pVar = this.q;
        io.reactivex.g<SessionState> a2 = this.n.a();
        z B0 = je.Z(a2, a2).Q(l.a).N0(1).j0(n.a).B0();
        p pVar2 = this.o;
        pVar2.getClass();
        pVar.b(B0.A(new k(pVar2)).s(new d(this)).subscribe(new b(this), c.a));
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStop() {
        this.q.a();
    }
}
