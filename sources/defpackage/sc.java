package defpackage;

import com.airbnb.lottie.d;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.List;

/* renamed from: sc  reason: default package */
public class sc {
    private static <T> List<fe<T>> a(JsonReader jsonReader, d dVar, wd<T> wdVar) {
        return gd.a(jsonReader, dVar, 1.0f, wdVar);
    }

    static bc b(JsonReader jsonReader, d dVar) {
        return new bc(a(jsonReader, dVar, uc.a));
    }

    static kc c(JsonReader jsonReader, d dVar) {
        return new kc(a(jsonReader, dVar, wc.a));
    }

    public static cc d(JsonReader jsonReader, d dVar) {
        return e(jsonReader, dVar, true);
    }

    public static cc e(JsonReader jsonReader, d dVar, boolean z) {
        return new cc(gd.a(jsonReader, dVar, z ? ee.c() : 1.0f, xc.a));
    }

    static dc f(JsonReader jsonReader, d dVar, int i) {
        return new dc(a(jsonReader, dVar, new ad(i)));
    }

    static ec g(JsonReader jsonReader, d dVar) {
        return new ec(a(jsonReader, dVar, dd.a));
    }

    static gc h(JsonReader jsonReader, d dVar) {
        return new gc(gd.a(jsonReader, dVar, ee.c(), ld.a));
    }

    static hc i(JsonReader jsonReader, d dVar) {
        return new hc(a(jsonReader, dVar, pd.a));
    }
}
