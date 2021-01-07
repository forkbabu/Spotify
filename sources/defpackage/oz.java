package defpackage;

import android.util.JsonReader;
import defpackage.sz;

/* access modifiers changed from: package-private */
/* renamed from: oz  reason: default package */
public final /* synthetic */ class oz implements sz.a {
    private static final oz a = new oz();

    private oz() {
    }

    public static sz.a b() {
        return a;
    }

    @Override // defpackage.sz.a
    public Object a(JsonReader jsonReader) {
        return sz.b(jsonReader);
    }
}
