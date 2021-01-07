package defpackage;

import com.airbnb.lottie.d;
import com.airbnb.lottie.model.content.g;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* access modifiers changed from: package-private */
/* renamed from: od  reason: default package */
public class od {
    private static JsonReader.a a = JsonReader.a.a("nm", "c", "o", "tr", "hd");

    static g a(JsonReader jsonReader, d dVar) {
        String str = null;
        cc ccVar = null;
        cc ccVar2 = null;
        mc mcVar = null;
        boolean z = false;
        while (jsonReader.h()) {
            int w = jsonReader.w(a);
            if (w == 0) {
                str = jsonReader.q();
            } else if (w == 1) {
                ccVar = sc.e(jsonReader, dVar, false);
            } else if (w == 2) {
                ccVar2 = sc.e(jsonReader, dVar, false);
            } else if (w == 3) {
                mcVar = rc.a(jsonReader, dVar);
            } else if (w != 4) {
                jsonReader.C();
            } else {
                z = jsonReader.i();
            }
        }
        return new g(str, ccVar, ccVar2, mcVar, z);
    }
}
