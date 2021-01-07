package defpackage;

import com.airbnb.lottie.d;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.e;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* renamed from: cd  reason: default package */
class cd {
    private static JsonReader.a a = JsonReader.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final JsonReader.a b = JsonReader.a.a("p", "k");
    private static final JsonReader.a c = JsonReader.a.a("n", "v");

    static e a(JsonReader jsonReader, d dVar) {
        dc dcVar;
        ArrayList arrayList = new ArrayList();
        String str = null;
        GradientType gradientType = null;
        dc dcVar2 = null;
        ec ecVar = null;
        gc gcVar = null;
        gc gcVar2 = null;
        cc ccVar = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        float f = 0.0f;
        cc ccVar2 = null;
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
                        if (w != 0) {
                            dcVar = dcVar2;
                            if (w != 1) {
                                jsonReader.B();
                                jsonReader.C();
                            } else {
                                dcVar2 = sc.f(jsonReader, dVar, i);
                            }
                        } else {
                            dcVar = dcVar2;
                            i = jsonReader.m();
                        }
                        dcVar2 = dcVar;
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
                    ccVar = sc.d(jsonReader, dVar);
                    break;
                case 7:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.m() - 1];
                    break;
                case 8:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.m() - 1];
                    break;
                case 9:
                    f = (float) jsonReader.l();
                    break;
                case 10:
                    z = jsonReader.i();
                    break;
                case 11:
                    jsonReader.b();
                    while (jsonReader.h()) {
                        jsonReader.d();
                        cc ccVar3 = null;
                        String str2 = null;
                        while (jsonReader.h()) {
                            int w2 = jsonReader.w(c);
                            if (w2 != 0) {
                                if (w2 != 1) {
                                    jsonReader.B();
                                    jsonReader.C();
                                } else {
                                    ccVar3 = sc.d(jsonReader, dVar);
                                }
                                ccVar2 = ccVar2;
                            } else {
                                str2 = jsonReader.q();
                            }
                        }
                        jsonReader.g();
                        if (str2.equals("o")) {
                            ccVar2 = ccVar3;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                dVar.t(true);
                                arrayList.add(ccVar3);
                            }
                            ccVar2 = ccVar2;
                        }
                    }
                    jsonReader.f();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    ccVar2 = ccVar2;
                    break;
                default:
                    jsonReader.B();
                    jsonReader.C();
                    break;
            }
        }
        return new e(str, gradientType, dcVar2, ecVar, gcVar, gcVar2, ccVar, lineCapType, lineJoinType, f, arrayList, ccVar2, z);
    }
}
