package defpackage;

import com.google.android.exoplayer2.util.g;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.h;

/* renamed from: ks  reason: default package */
final /* synthetic */ class ks implements q {
    private final ls a;
    private final SaveAccountLinkingTokenRequest b;

    ks(ls lsVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        this.a = lsVar;
        this.b = saveAccountLinkingTokenRequest;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a(Object obj, Object obj2) {
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = this.b;
        ns nsVar = new ns((h) obj2);
        g.l(saveAccountLinkingTokenRequest);
        ((hs) ((fs) obj).z()).k3(nsVar, saveAccountLinkingTokenRequest);
    }
}
