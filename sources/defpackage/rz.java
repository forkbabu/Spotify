package defpackage;

import android.util.JsonReader;
import defpackage.sz;

/* access modifiers changed from: package-private */
/* renamed from: rz  reason: default package */
public final /* synthetic */ class rz implements sz.a {
    private static final rz a = new rz();

    private rz() {
    }

    public static sz.a b() {
        return a;
    }

    @Override // defpackage.sz.a
    public Object a(JsonReader jsonReader) {
        return sz.j(jsonReader);
    }
}
