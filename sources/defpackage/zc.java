package defpackage;

import com.airbnb.lottie.model.b;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* access modifiers changed from: package-private */
/* renamed from: zc  reason: default package */
public class zc {
    private static final JsonReader.a a = JsonReader.a.a("fFamily", "fName", "fStyle", "ascent");

    static b a(JsonReader jsonReader) {
        jsonReader.d();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (jsonReader.h()) {
            int w = jsonReader.w(a);
            if (w == 0) {
                str = jsonReader.q();
            } else if (w == 1) {
                str2 = jsonReader.q();
            } else if (w == 2) {
                str3 = jsonReader.q();
            } else if (w != 3) {
                jsonReader.B();
                jsonReader.C();
            } else {
                f = (float) jsonReader.l();
            }
        }
        jsonReader.g();
        return new b(str, str2, str3, f);
    }
}
