package defpackage;

import com.airbnb.lottie.d;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: gd  reason: default package */
public class gd {
    static JsonReader.a a = JsonReader.a.a("k");

    static <T> List<fe<T>> a(JsonReader jsonReader, d dVar, float f, wd<T> wdVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.s() == JsonReader.Token.STRING) {
            dVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.d();
        while (jsonReader.h()) {
            if (jsonReader.w(a) != 0) {
                jsonReader.C();
            } else if (jsonReader.s() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.b();
                if (jsonReader.s() == JsonReader.Token.NUMBER) {
                    arrayList.add(fd.a(jsonReader, dVar, f, wdVar, false));
                } else {
                    while (jsonReader.h()) {
                        arrayList.add(fd.a(jsonReader, dVar, f, wdVar, true));
                    }
                }
                jsonReader.f();
            } else {
                arrayList.add(fd.a(jsonReader, dVar, f, wdVar, false));
            }
        }
        jsonReader.g();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends fe<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            fe feVar = (fe) list.get(i2);
            i2++;
            fe feVar2 = (fe) list.get(i2);
            feVar.f = Float.valueOf(feVar2.e);
            if (feVar.c == null && (t = feVar2.b) != null) {
                feVar.c = t;
                if (feVar instanceof qb) {
                    ((qb) feVar).i();
                }
            }
        }
        fe feVar3 = (fe) list.get(i);
        if ((feVar3.b == null || feVar3.c == null) && list.size() > 1) {
            list.remove(feVar3);
        }
    }
}
