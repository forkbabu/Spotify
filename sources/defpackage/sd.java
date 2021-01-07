package defpackage;

import com.airbnb.lottie.d;
import com.airbnb.lottie.model.content.b;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: sd  reason: default package */
public class sd {
    private static JsonReader.a a = JsonReader.a.a("nm", "hd", "it");

    static j a(JsonReader jsonReader, d dVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.h()) {
            int w = jsonReader.w(a);
            if (w == 0) {
                str = jsonReader.q();
            } else if (w == 1) {
                z = jsonReader.i();
            } else if (w != 2) {
                jsonReader.C();
            } else {
                jsonReader.b();
                while (jsonReader.h()) {
                    b a2 = vc.a(jsonReader, dVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                jsonReader.f();
            }
        }
        return new j(str, arrayList, z);
    }
}
