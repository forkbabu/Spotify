package defpackage;

import android.util.JsonReader;
import defpackage.sz;

/* access modifiers changed from: package-private */
/* renamed from: qz  reason: default package */
public final /* synthetic */ class qz implements sz.a {
    private static final qz a = new qz();

    private qz() {
    }

    public static sz.a b() {
        return a;
    }

    @Override // defpackage.sz.a
    public Object a(JsonReader jsonReader) {
        return sz.j(jsonReader);
    }
}
