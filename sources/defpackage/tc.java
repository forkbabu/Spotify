package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.d;
import com.airbnb.lottie.model.content.a;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* access modifiers changed from: package-private */
/* renamed from: tc  reason: default package */
public class tc {
    private static JsonReader.a a = JsonReader.a.a("nm", "p", "s", "hd", "d");

    static a a(JsonReader jsonReader, d dVar, int i) {
        boolean z = i == 3;
        String str = null;
        nc<PointF, PointF> ncVar = null;
        gc gcVar = null;
        boolean z2 = false;
        while (jsonReader.h()) {
            int w = jsonReader.w(a);
            if (w == 0) {
                str = jsonReader.q();
            } else if (w == 1) {
                ncVar = pc.b(jsonReader, dVar);
            } else if (w == 2) {
                gcVar = sc.h(jsonReader, dVar);
            } else if (w == 3) {
                z2 = jsonReader.i();
            } else if (w != 4) {
                jsonReader.B();
                jsonReader.C();
            } else {
                z = jsonReader.m() == 3;
            }
        }
        return new a(str, ncVar, gcVar, z, z2);
    }
}
