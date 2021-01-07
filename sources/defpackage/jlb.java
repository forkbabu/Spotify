package defpackage;

import com.spotify.intentrouter.m;

/* renamed from: jlb  reason: default package */
public final class jlb implements m<hlb> {
    private final m<String> a;

    /* renamed from: jlb$a */
    static class a implements m<String> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.intentrouter.m
        public boolean a(String str) {
            return str.startsWith(this.a);
        }

        @Override // com.spotify.intentrouter.m
        public String description() {
            StringBuilder V0 = je.V0("starts with ");
            V0.append(this.a);
            return V0.toString();
        }
    }

    private jlb(m<String> mVar) {
        this.a = mVar;
    }

    public static m<hlb> b(String str) {
        return new jlb(new a(str));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.intentrouter.m
    public boolean a(hlb hlb) {
        String dataString = hlb.a().getDataString();
        if (dataString == null) {
            return false;
        }
        return this.a.a(dataString);
    }

    @Override // com.spotify.intentrouter.m
    public String description() {
        StringBuilder V0 = je.V0("intent uri matches ");
        V0.append(this.a.description());
        return V0.toString();
    }
}
