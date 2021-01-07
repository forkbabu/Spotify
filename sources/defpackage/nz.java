package defpackage;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import defpackage.sz;

/* access modifiers changed from: package-private */
/* renamed from: nz  reason: default package */
public final /* synthetic */ class nz implements sz.a {
    private static final nz a = new nz();

    private nz() {
    }

    public static sz.a b() {
        return a;
    }

    @Override // defpackage.sz.a
    public Object a(JsonReader jsonReader) {
        int i = sz.b;
        CrashlyticsReport.b.a a2 = CrashlyticsReport.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a2.b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                a2.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }
}
