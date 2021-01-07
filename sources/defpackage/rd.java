package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.d;
import com.airbnb.lottie.model.content.i;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* access modifiers changed from: package-private */
/* renamed from: rd  reason: default package */
public class rd {
    private static final JsonReader.a a = JsonReader.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static i a(JsonReader jsonReader, d dVar) {
        String str = null;
        bc bcVar = null;
        ec ecVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (jsonReader.h()) {
            int w = jsonReader.w(a);
            if (w == 0) {
                str = jsonReader.q();
            } else if (w == 1) {
                bcVar = sc.b(jsonReader, dVar);
            } else if (w == 2) {
                ecVar = sc.g(jsonReader, dVar);
            } else if (w == 3) {
                z = jsonReader.i();
            } else if (w == 4) {
                i = jsonReader.m();
            } else if (w != 5) {
                jsonReader.B();
                jsonReader.C();
            } else {
                z2 = jsonReader.i();
            }
        }
        return new i(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, bcVar, ecVar, z2);
    }
}
