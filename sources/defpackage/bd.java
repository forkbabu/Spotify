package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.d;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: bd  reason: default package */
class bd {
    private static final JsonReader.a a = JsonReader.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final JsonReader.a b = JsonReader.a.a("p", "k");

    static d a(JsonReader jsonReader, com.airbnb.lottie.d dVar) {
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType = null;
        dc dcVar = null;
        ec ecVar = null;
        gc gcVar = null;
        gc gcVar2 = null;
        boolean z = false;
        while (jsonReader.h()) {
            switch (jsonReader.w(a)) {
                case 0:
                    str = jsonReader.q();
                    break;
                case 1:
                    int i = -1;
                    jsonReader.d();
                    while (jsonReader.h()) {
                        int w = jsonReader.w(b);
                        if (w == 0) {
                            i = jsonReader.m();
                        } else if (w != 1) {
                            jsonReader.B();
                            jsonReader.C();
                        } else {
                            dcVar = sc.f(jsonReader, dVar, i);
                        }
                    }
                    jsonReader.g();
                    break;
                case 2:
                    ecVar = sc.g(jsonReader, dVar);
                    break;
                case 3:
                    gradientType = jsonReader.m() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    gcVar = sc.h(jsonReader, dVar);
                    break;
                case 5:
                    gcVar2 = sc.h(jsonReader, dVar);
                    break;
                case 6:
                    fillType = jsonReader.m() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = jsonReader.i();
                    break;
                default:
                    jsonReader.B();
                    jsonReader.C();
                    break;
            }
        }
        return new d(str, gradientType, fillType, dcVar, ecVar, gcVar, gcVar2, null, null, z);
    }
}
