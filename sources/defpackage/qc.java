package defpackage;

import com.airbnb.lottie.d;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: qc  reason: default package */
public class qc {
    private static JsonReader.a a = JsonReader.a.a("a");
    private static JsonReader.a b = JsonReader.a.a("fc", "sc", "sw", "t");

    public static lc a(JsonReader jsonReader, d dVar) {
        jsonReader.d();
        lc lcVar = null;
        while (jsonReader.h()) {
            if (jsonReader.w(a) != 0) {
                jsonReader.B();
                jsonReader.C();
            } else {
                jsonReader.d();
                bc bcVar = null;
                bc bcVar2 = null;
                cc ccVar = null;
                cc ccVar2 = null;
                while (jsonReader.h()) {
                    int w = jsonReader.w(b);
                    if (w == 0) {
                        bcVar = sc.b(jsonReader, dVar);
                    } else if (w == 1) {
                        bcVar2 = sc.b(jsonReader, dVar);
                    } else if (w == 2) {
                        ccVar = sc.d(jsonReader, dVar);
                    } else if (w != 3) {
                        jsonReader.B();
                        jsonReader.C();
                    } else {
                        ccVar2 = sc.d(jsonReader, dVar);
                    }
                }
                jsonReader.g();
                lcVar = new lc(bcVar, bcVar2, ccVar, ccVar2);
            }
        }
        jsonReader.g();
        return lcVar == null ? new lc(null, null, null, null) : lcVar;
    }
}
