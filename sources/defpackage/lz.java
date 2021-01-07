package defpackage;

import android.util.JsonReader;
import defpackage.sz;

/* access modifiers changed from: package-private */
/* renamed from: lz  reason: default package */
public final /* synthetic */ class lz implements sz.a {
    private static final lz a = new lz();

    private lz() {
    }

    public static sz.a b() {
        return a;
    }

    @Override // defpackage.sz.a
    public Object a(JsonReader jsonReader) {
        return sz.h(jsonReader);
    }
}
