package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.d;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: rc  reason: default package */
public class rc {
    private static JsonReader.a a = JsonReader.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");
    private static JsonReader.a b = JsonReader.a.a("k");

    public static mc a(JsonReader jsonReader, d dVar) {
        boolean z = jsonReader.s() == JsonReader.Token.BEGIN_OBJECT;
        if (z) {
            jsonReader.d();
        }
        cc ccVar = null;
        fc fcVar = null;
        nc<PointF, PointF> ncVar = null;
        hc hcVar = null;
        cc ccVar2 = null;
        cc ccVar3 = null;
        ec ecVar = null;
        cc ccVar4 = null;
        cc ccVar5 = null;
        while (jsonReader.h()) {
            switch (jsonReader.w(a)) {
                case 0:
                    jsonReader.d();
                    while (jsonReader.h()) {
                        if (jsonReader.w(b) != 0) {
                            jsonReader.B();
                            jsonReader.C();
                        } else {
                            fcVar = pc.a(jsonReader, dVar);
                        }
                    }
                    jsonReader.g();
                    continue;
                case 1:
                    ncVar = pc.b(jsonReader, dVar);
                    continue;
                case 2:
                    hcVar = sc.i(jsonReader, dVar);
                    continue;
                case 3:
                    dVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    ecVar = sc.g(jsonReader, dVar);
                    continue;
                case 6:
                    ccVar4 = sc.e(jsonReader, dVar, false);
                    continue;
                case 7:
                    ccVar5 = sc.e(jsonReader, dVar, false);
                    continue;
                case 8:
                    ccVar2 = sc.e(jsonReader, dVar, false);
                    continue;
                case 9:
                    ccVar3 = sc.e(jsonReader, dVar, false);
                    continue;
                default:
                    jsonReader.B();
                    jsonReader.C();
                    continue;
            }
            cc e = sc.e(jsonReader, dVar, false);
            if (e.b().isEmpty()) {
                e.b().add(new fe(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(dVar.f())));
            } else if (((fe) e.b().get(0)).b == null) {
                e.b().set(0, new fe(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(dVar.f())));
            }
            ccVar = e;
        }
        if (z) {
            jsonReader.g();
        }
        if (fcVar == null || (fcVar.c() && fcVar.b().get(0).b.equals(0.0f, 0.0f))) {
            fcVar = null;
        }
        if (ncVar == null || (!(ncVar instanceof jc) && ncVar.c() && ncVar.b().get(0).b.equals(0.0f, 0.0f))) {
            ncVar = null;
        }
        return new mc(fcVar, ncVar, hcVar == null || (hcVar.c() && ((fe) hcVar.b().get(0)).b.a(1.0f, 1.0f)) ? null : hcVar, ccVar == null || (ccVar.c() && (((fe) ccVar.b().get(0)).b.floatValue() > 0.0f ? 1 : (((fe) ccVar.b().get(0)).b.floatValue() == 0.0f ? 0 : -1)) == 0) ? null : ccVar, ecVar, ccVar4, ccVar5, ccVar2 == null || (ccVar2.c() && (((fe) ccVar2.b().get(0)).b.floatValue() > 0.0f ? 1 : (((fe) ccVar2.b().get(0)).b.floatValue() == 0.0f ? 0 : -1)) == 0) ? null : ccVar2, ccVar3 == null || (ccVar3.c() && (((fe) ccVar3.b().get(0)).b.floatValue() > 0.0f ? 1 : (((fe) ccVar3.b().get(0)).b.floatValue() == 0.0f ? 0 : -1)) == 0) ? null : ccVar3);
    }
}
