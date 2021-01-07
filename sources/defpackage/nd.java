package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.d;
import com.airbnb.lottie.model.content.f;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* access modifiers changed from: package-private */
/* renamed from: nd  reason: default package */
public class nd {
    private static JsonReader.a a = JsonReader.a.a("nm", "p", "s", "r", "hd");

    static f a(JsonReader jsonReader, d dVar) {
        String str = null;
        nc<PointF, PointF> ncVar = null;
        gc gcVar = null;
        cc ccVar = null;
        boolean z = false;
        while (jsonReader.h()) {
            int w = jsonReader.w(a);
            if (w == 0) {
                str = jsonReader.q();
            } else if (w == 1) {
                ncVar = pc.b(jsonReader, dVar);
            } else if (w == 2) {
                gcVar = sc.h(jsonReader, dVar);
            } else if (w == 3) {
                ccVar = sc.d(jsonReader, dVar);
            } else if (w != 4) {
                jsonReader.C();
            } else {
                z = jsonReader.i();
            }
        }
        return new f(str, ncVar, gcVar, ccVar, z);
    }
}
