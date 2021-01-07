package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.wsa;

/* renamed from: a68  reason: default package */
public class a68 implements z58 {
    private final h8b a;
    private final rc8 b;

    public a68(h8b h8b, rc8 rc8) {
        this.a = h8b;
        this.b = rc8;
    }

    @Override // defpackage.z58
    public y58 a(Optional<String> optional) {
        wsa.a a2 = wsa.a();
        a2.e(this.b.a(optional));
        a2.d(AppProtocol.LogMessage.SEVERITY_ERROR);
        return new x58(this.a, a2.build());
    }
}
