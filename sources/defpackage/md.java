package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.d;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* access modifiers changed from: package-private */
/* renamed from: md  reason: default package */
public class md {
    private static final JsonReader.a a = JsonReader.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    static PolystarShape a(JsonReader jsonReader, d dVar) {
        String str = null;
        PolystarShape.Type type = null;
        cc ccVar = null;
        nc<PointF, PointF> ncVar = null;
        cc ccVar2 = null;
        cc ccVar3 = null;
        cc ccVar4 = null;
        cc ccVar5 = null;
        cc ccVar6 = null;
        boolean z = false;
        while (jsonReader.h()) {
            switch (jsonReader.w(a)) {
                case 0:
                    str = jsonReader.q();
                    break;
                case 1:
                    type = PolystarShape.Type.d(jsonReader.m());
                    break;
                case 2:
                    ccVar = sc.e(jsonReader, dVar, false);
                    break;
                case 3:
                    ncVar = pc.b(jsonReader, dVar);
                    break;
                case 4:
                    ccVar2 = sc.e(jsonReader, dVar, false);
                    break;
                case 5:
                    ccVar4 = sc.d(jsonReader, dVar);
                    break;
                case 6:
                    ccVar6 = sc.e(jsonReader, dVar, false);
                    break;
                case 7:
                    ccVar3 = sc.d(jsonReader, dVar);
                    break;
                case 8:
                    ccVar5 = sc.e(jsonReader, dVar, false);
                    break;
                case 9:
                    z = jsonReader.i();
                    break;
                default:
                    jsonReader.B();
                    jsonReader.C();
                    break;
            }
        }
        return new PolystarShape(str, type, ccVar, ncVar, ccVar2, ccVar3, ccVar4, ccVar5, ccVar6, z);
    }
}
