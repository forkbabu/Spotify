package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.d;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* renamed from: pc  reason: default package */
public class pc {
    private static JsonReader.a a = JsonReader.a.a("k", "x", "y");

    public static fc a(JsonReader jsonReader, d dVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.s() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            while (jsonReader.h()) {
                arrayList.add(new qb(dVar, fd.a(jsonReader, dVar, ee.c(), kd.a, jsonReader.s() == JsonReader.Token.BEGIN_OBJECT)));
            }
            jsonReader.f();
            gd.b(arrayList);
        } else {
            arrayList.add(new fe(ed.b(jsonReader, ee.c())));
        }
        return new fc(arrayList);
    }

    static nc<PointF, PointF> b(JsonReader jsonReader, d dVar) {
        JsonReader.Token token = JsonReader.Token.STRING;
        jsonReader.d();
        fc fcVar = null;
        cc ccVar = null;
        cc ccVar2 = null;
        boolean z = false;
        while (jsonReader.s() != JsonReader.Token.END_OBJECT) {
            int w = jsonReader.w(a);
            if (w != 0) {
                if (w != 1) {
                    if (w != 2) {
                        jsonReader.B();
                        jsonReader.C();
                    } else if (jsonReader.s() == token) {
                        jsonReader.C();
                    } else {
                        ccVar2 = sc.d(jsonReader, dVar);
                    }
                } else if (jsonReader.s() == token) {
                    jsonReader.C();
                } else {
                    ccVar = sc.d(jsonReader, dVar);
                }
                z = true;
            } else {
                fcVar = a(jsonReader, dVar);
            }
        }
        jsonReader.g();
        if (z) {
            dVar.a("Lottie doesn't support expressions.");
        }
        if (fcVar != null) {
            return fcVar;
        }
        return new jc(ccVar, ccVar2);
    }
}
