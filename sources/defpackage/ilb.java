package defpackage;

import com.spotify.intentrouter.m;

/* renamed from: ilb  reason: default package */
public class ilb implements m<hlb> {
    private final String a;

    public ilb(String str) {
        str.getClass();
        this.a = str;
    }

    public static m<hlb> b() {
        return new ilb("android.intent.action.VIEW");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.intentrouter.m
    public boolean a(hlb hlb) {
        return this.a.equals(hlb.a().getAction());
    }

    @Override // com.spotify.intentrouter.m
    public String description() {
        StringBuilder V0 = je.V0("an intent with the action ");
        V0.append(this.a);
        return V0.toString();
    }
}
