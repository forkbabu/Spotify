package defpackage;

import com.spotify.intentrouter.m;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

/* renamed from: mlb  reason: default package */
public final class mlb implements m<hlb> {
    private final m<l0> a;

    /* renamed from: mlb$a */
    static class a implements m<l0> {
        final /* synthetic */ LinkType a;

        a(LinkType linkType) {
            this.a = linkType;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.intentrouter.m
        public boolean a(l0 l0Var) {
            return l0Var.q() == this.a;
        }

        @Override // com.spotify.intentrouter.m
        public String description() {
            StringBuilder V0 = je.V0("of type ");
            V0.append(this.a);
            return V0.toString();
        }
    }

    private mlb(m<l0> mVar) {
        mVar.getClass();
        this.a = mVar;
    }

    public static m<l0> b(LinkType linkType) {
        return new a(linkType);
    }

    public static m<hlb> c(m<l0> mVar) {
        return new mlb(mVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.intentrouter.m
    public boolean a(hlb hlb) {
        return this.a.a(l0.z(hlb.a().getDataString()));
    }

    @Override // com.spotify.intentrouter.m
    public String description() {
        StringBuilder V0 = je.V0("an intent that has a spotify link ");
        V0.append(this.a.description());
        return V0.toString();
    }
}
