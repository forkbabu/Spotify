package defpackage;

import com.airbnb.lottie.d;
import com.airbnb.lottie.model.c;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: yc  reason: default package */
public class yc {
    private static final JsonReader.a a = JsonReader.a.a("ch", "size", "w", "style", "fFamily", "data");
    private static final JsonReader.a b = JsonReader.a.a("shapes");

    static c a(JsonReader jsonReader, d dVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.d();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        char c = 0;
        while (jsonReader.h()) {
            int w = jsonReader.w(a);
            if (w == 0) {
                c = jsonReader.q().charAt(0);
            } else if (w == 1) {
                d = jsonReader.l();
            } else if (w == 2) {
                d2 = jsonReader.l();
            } else if (w == 3) {
                str = jsonReader.q();
            } else if (w == 4) {
                str2 = jsonReader.q();
            } else if (w != 5) {
                jsonReader.B();
                jsonReader.C();
            } else {
                jsonReader.d();
                while (jsonReader.h()) {
                    if (jsonReader.w(b) != 0) {
                        jsonReader.B();
                        jsonReader.C();
                    } else {
                        jsonReader.b();
                        while (jsonReader.h()) {
                            arrayList.add((j) vc.a(jsonReader, dVar));
                        }
                        jsonReader.f();
                    }
                }
                jsonReader.g();
            }
        }
        jsonReader.g();
        return new c(arrayList, c, d, d2, str, str2);
    }
}
