package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import com.coremedia.iso.boxes.UserBox;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import defpackage.sz;

/* access modifiers changed from: package-private */
/* renamed from: pz  reason: default package */
public final /* synthetic */ class pz implements sz.a {
    private static final pz a = new pz();

    private pz() {
    }

    public static sz.a b() {
        return a;
    }

    @Override // defpackage.sz.a
    public Object a(JsonReader jsonReader) {
        int i = sz.b;
        CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a a2 = CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals(UserBox.TYPE)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.c(jsonReader.nextString());
                    break;
                case 1:
                    a2.d(jsonReader.nextLong());
                    break;
                case 2:
                    a2.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a2.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }
}
