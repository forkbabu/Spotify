package defpackage;

import com.airbnb.lottie.d;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.spotify.music.features.ads.rules.m;

/* access modifiers changed from: package-private */
/* renamed from: vd  reason: default package */
public class vd {
    private static JsonReader.a a = JsonReader.a.a("s", "e", "o", "nm", m.f, "hd");

    static ShapeTrimPath a(JsonReader jsonReader, d dVar) {
        ShapeTrimPath.Type type;
        String str = null;
        ShapeTrimPath.Type type2 = null;
        cc ccVar = null;
        cc ccVar2 = null;
        cc ccVar3 = null;
        boolean z = false;
        while (jsonReader.h()) {
            int w = jsonReader.w(a);
            if (w == 0) {
                ccVar = sc.e(jsonReader, dVar, false);
            } else if (w == 1) {
                ccVar2 = sc.e(jsonReader, dVar, false);
            } else if (w == 2) {
                ccVar3 = sc.e(jsonReader, dVar, false);
            } else if (w == 3) {
                str = jsonReader.q();
            } else if (w == 4) {
                int m = jsonReader.m();
                if (m == 1) {
                    type = ShapeTrimPath.Type.SIMULTANEOUSLY;
                } else if (m == 2) {
                    type = ShapeTrimPath.Type.INDIVIDUALLY;
                } else {
                    throw new IllegalArgumentException(je.p0("Unknown trim path type ", m));
                }
                type2 = type;
            } else if (w != 5) {
                jsonReader.C();
            } else {
                z = jsonReader.i();
            }
        }
        return new ShapeTrimPath(str, type2, ccVar, ccVar2, ccVar3, z);
    }
}
