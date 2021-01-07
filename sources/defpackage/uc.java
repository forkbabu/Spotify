package defpackage;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: uc  reason: default package */
public class uc implements wd<Integer> {
    public static final uc a = new uc();

    private uc() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.wd
    public Integer a(JsonReader jsonReader, float f) {
        boolean z = jsonReader.s() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.b();
        }
        double l = jsonReader.l();
        double l2 = jsonReader.l();
        double l3 = jsonReader.l();
        double l4 = jsonReader.l();
        if (z) {
            jsonReader.f();
        }
        if (l <= 1.0d && l2 <= 1.0d && l3 <= 1.0d) {
            l *= 255.0d;
            l2 *= 255.0d;
            l3 *= 255.0d;
            if (l4 <= 1.0d) {
                l4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) l4, (int) l, (int) l2, (int) l3));
    }
}
