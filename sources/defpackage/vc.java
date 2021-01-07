package defpackage;

import com.airbnb.lottie.d;
import com.airbnb.lottie.model.content.b;
import com.airbnb.lottie.model.content.k;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* access modifiers changed from: package-private */
/* renamed from: vc  reason: default package */
public class vc {
    private static JsonReader.a a = JsonReader.a.a("ty", "d");

    static b a(JsonReader jsonReader, d dVar) {
        String str;
        String str2;
        b bVar;
        jsonReader.d();
        int i = 2;
        while (true) {
            str = null;
            bVar = null;
            if (!jsonReader.h()) {
                str2 = null;
                break;
            }
            int w = jsonReader.w(a);
            if (w == 0) {
                str2 = jsonReader.q();
                break;
            } else if (w != 1) {
                jsonReader.B();
                jsonReader.C();
            } else {
                i = jsonReader.m();
            }
        }
        if (str2 == null) {
            return null;
        }
        char c = 65535;
        int i2 = 0;
        switch (str2.hashCode()) {
            case 3239:
                if (str2.equals("el")) {
                    c = 0;
                    break;
                }
                break;
            case 3270:
                if (str2.equals("fl")) {
                    c = 1;
                    break;
                }
                break;
            case 3295:
                if (str2.equals("gf")) {
                    c = 2;
                    break;
                }
                break;
            case 3307:
                if (str2.equals("gr")) {
                    c = 3;
                    break;
                }
                break;
            case 3308:
                if (str2.equals("gs")) {
                    c = 4;
                    break;
                }
                break;
            case 3488:
                if (str2.equals("mm")) {
                    c = 5;
                    break;
                }
                break;
            case 3633:
                if (str2.equals("rc")) {
                    c = 6;
                    break;
                }
                break;
            case 3646:
                if (str2.equals("rp")) {
                    c = 7;
                    break;
                }
                break;
            case 3669:
                if (str2.equals("sh")) {
                    c = '\b';
                    break;
                }
                break;
            case 3679:
                if (str2.equals("sr")) {
                    c = '\t';
                    break;
                }
                break;
            case 3681:
                if (str2.equals("st")) {
                    c = '\n';
                    break;
                }
                break;
            case 3705:
                if (str2.equals("tm")) {
                    c = 11;
                    break;
                }
                break;
            case 3710:
                if (str2.equals("tr")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bVar = tc.a(jsonReader, dVar, i);
                break;
            case 1:
                bVar = rd.a(jsonReader, dVar);
                break;
            case 2:
                bVar = bd.a(jsonReader, dVar);
                break;
            case 3:
                bVar = sd.a(jsonReader, dVar);
                break;
            case 4:
                bVar = cd.a(jsonReader, dVar);
                break;
            case 5:
                bVar = jd.a(jsonReader);
                dVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                bVar = nd.a(jsonReader, dVar);
                break;
            case 7:
                bVar = od.a(jsonReader, dVar);
                break;
            case '\b':
                JsonReader.a aVar = td.a;
                ic icVar = null;
                boolean z = false;
                while (jsonReader.h()) {
                    int w2 = jsonReader.w(td.a);
                    if (w2 == 0) {
                        str = jsonReader.q();
                    } else if (w2 == 1) {
                        i2 = jsonReader.m();
                    } else if (w2 == 2) {
                        icVar = new ic(gd.a(jsonReader, dVar, ee.c(), qd.a));
                    } else if (w2 != 3) {
                        jsonReader.C();
                    } else {
                        z = jsonReader.i();
                    }
                }
                bVar = new k(str, i2, icVar, z);
                break;
            case '\t':
                bVar = md.a(jsonReader, dVar);
                break;
            case '\n':
                bVar = ud.a(jsonReader, dVar);
                break;
            case 11:
                bVar = vd.a(jsonReader, dVar);
                break;
            case '\f':
                bVar = rc.a(jsonReader, dVar);
                break;
            default:
                ae.c("Unknown shape type " + str2);
                break;
        }
        while (jsonReader.h()) {
            jsonReader.C();
        }
        jsonReader.g();
        return bVar;
    }
}
