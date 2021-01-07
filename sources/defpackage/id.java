package defpackage;

import android.graphics.Rect;
import com.airbnb.lottie.d;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.b;
import com.airbnb.lottie.model.c;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.spotify.music.podcastentityrow.u;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: id  reason: default package */
public class id {
    private static final JsonReader.a a = JsonReader.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static JsonReader.a b = JsonReader.a.a("id", "layers", "w", "h", "p", u.a);
    private static final JsonReader.a c = JsonReader.a.a("list");
    private static final JsonReader.a d = JsonReader.a.a("cm", "tm", "dr");

    public static d a(JsonReader jsonReader) {
        float f;
        float f2;
        HashMap hashMap;
        ArrayList arrayList;
        float f3;
        float f4;
        HashMap hashMap2;
        float f5;
        float f6;
        float f7;
        float c2 = ee.c();
        q1<Layer> q1Var = new q1<>(10);
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        u1<c> u1Var = new u1<>(10);
        d dVar = new d();
        jsonReader.d();
        int i = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        int i2 = 0;
        while (jsonReader.h()) {
            switch (jsonReader.w(a)) {
                case 0:
                    f4 = f10;
                    i = jsonReader.m();
                    f10 = f4;
                    break;
                case 1:
                    f4 = f10;
                    i2 = jsonReader.m();
                    f10 = f4;
                    break;
                case 2:
                    f8 = (float) jsonReader.l();
                    break;
                case 3:
                    f4 = f10;
                    f9 = ((float) jsonReader.l()) - 0.01f;
                    f8 = f8;
                    f10 = f4;
                    break;
                case 4:
                    f8 = f8;
                    f10 = (float) jsonReader.l();
                    break;
                case 5:
                    f = f9;
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    f2 = f10;
                    f3 = f8;
                    String[] split = jsonReader.q().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (!(parseInt >= 4 && (parseInt > 4 || (parseInt2 >= 4 && (parseInt2 > 4 || Integer.parseInt(split[2]) >= 0))))) {
                        dVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f8 = f3;
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f10 = f2;
                    f9 = f;
                    break;
                case 6:
                    f = f9;
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    f2 = f10;
                    f3 = f8;
                    jsonReader.b();
                    int i3 = 0;
                    while (jsonReader.h()) {
                        Layer a2 = hd.a(jsonReader, dVar);
                        if (a2.d() == Layer.LayerType.IMAGE) {
                            i3++;
                        }
                        arrayList2.add(a2);
                        q1Var.o(a2.b(), a2);
                        if (i3 > 4) {
                            ae.c("You have " + i3 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    jsonReader.f();
                    f8 = f3;
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f10 = f2;
                    f9 = f;
                    break;
                case 7:
                    f = f9;
                    f2 = f10;
                    f3 = f8;
                    jsonReader.b();
                    while (jsonReader.h()) {
                        ArrayList arrayList4 = new ArrayList();
                        q1 q1Var2 = new q1(10);
                        jsonReader.d();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i4 = 0;
                        int i5 = 0;
                        while (jsonReader.h()) {
                            int w = jsonReader.w(b);
                            if (w != 0) {
                                if (w != 1) {
                                    if (w == 2) {
                                        i4 = jsonReader.m();
                                    } else if (w == 3) {
                                        i5 = jsonReader.m();
                                    } else if (w == 4) {
                                        str2 = jsonReader.q();
                                    } else if (w != 5) {
                                        jsonReader.B();
                                        jsonReader.C();
                                        hashMap2 = hashMap5;
                                    } else {
                                        str3 = jsonReader.q();
                                    }
                                    arrayList3 = arrayList3;
                                } else {
                                    jsonReader.b();
                                    while (jsonReader.h()) {
                                        Layer a3 = hd.a(jsonReader, dVar);
                                        q1Var2.o(a3.b(), a3);
                                        arrayList4.add(a3);
                                        hashMap5 = hashMap5;
                                    }
                                    hashMap2 = hashMap5;
                                    jsonReader.f();
                                }
                                arrayList3 = arrayList3;
                                hashMap5 = hashMap2;
                            } else {
                                str = jsonReader.q();
                            }
                        }
                        jsonReader.g();
                        if (str2 != null) {
                            g gVar = new g(i4, i5, str, str2, str3);
                            hashMap4.put(gVar.d(), gVar);
                        } else {
                            hashMap3.put(str, arrayList4);
                        }
                        arrayList3 = arrayList3;
                        hashMap5 = hashMap5;
                    }
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    jsonReader.f();
                    f8 = f3;
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f10 = f2;
                    f9 = f;
                    break;
                case 8:
                    f = f9;
                    f2 = f10;
                    f3 = f8;
                    jsonReader.d();
                    while (jsonReader.h()) {
                        if (jsonReader.w(c) != 0) {
                            jsonReader.B();
                            jsonReader.C();
                        } else {
                            jsonReader.b();
                            while (jsonReader.h()) {
                                b a4 = zc.a(jsonReader);
                                hashMap5.put(a4.b(), a4);
                            }
                            jsonReader.f();
                        }
                    }
                    jsonReader.g();
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    f8 = f3;
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f10 = f2;
                    f9 = f;
                    break;
                case 9:
                    f = f9;
                    f2 = f10;
                    f3 = f8;
                    jsonReader.b();
                    while (jsonReader.h()) {
                        c a5 = yc.a(jsonReader, dVar);
                        u1Var.n(a5.hashCode(), a5);
                    }
                    jsonReader.f();
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    f8 = f3;
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f10 = f2;
                    f9 = f;
                    break;
                case 10:
                    jsonReader.b();
                    while (jsonReader.h()) {
                        jsonReader.d();
                        String str4 = null;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        while (jsonReader.h()) {
                            int w2 = jsonReader.w(d);
                            if (w2 != 0) {
                                f5 = f10;
                                if (w2 == 1) {
                                    f7 = f8;
                                    f6 = f9;
                                    f11 = (float) jsonReader.l();
                                } else if (w2 != 2) {
                                    jsonReader.B();
                                    jsonReader.C();
                                } else {
                                    f7 = f8;
                                    f6 = f9;
                                    f12 = (float) jsonReader.l();
                                }
                                f8 = f7;
                                f10 = f5;
                                f9 = f6;
                            } else {
                                f5 = f10;
                                str4 = jsonReader.q();
                            }
                            f10 = f5;
                        }
                        jsonReader.g();
                        arrayList3.add(new com.airbnb.lottie.model.g(str4, f11, f12));
                        f8 = f8;
                        f10 = f10;
                        f9 = f9;
                    }
                    f = f9;
                    f2 = f10;
                    f3 = f8;
                    jsonReader.f();
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    f8 = f3;
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f10 = f2;
                    f9 = f;
                    break;
                default:
                    f = f9;
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    f2 = f10;
                    f3 = f8;
                    jsonReader.B();
                    jsonReader.C();
                    f8 = f3;
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f10 = f2;
                    f9 = f;
                    break;
            }
        }
        dVar.r(new Rect(0, 0, (int) (((float) i) * c2), (int) (((float) i2) * c2)), f8, f9, f10, arrayList2, q1Var, hashMap3, hashMap4, u1Var, hashMap5, arrayList3);
        return dVar;
    }
}
