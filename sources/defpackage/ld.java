package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: ld  reason: default package */
public class ld implements wd<PointF> {
    public static final ld a = new ld();

    private ld() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.wd
    public PointF a(JsonReader jsonReader, float f) {
        JsonReader.Token s = jsonReader.s();
        if (s == JsonReader.Token.BEGIN_ARRAY) {
            return ed.b(jsonReader, f);
        }
        if (s == JsonReader.Token.BEGIN_OBJECT) {
            return ed.b(jsonReader, f);
        }
        if (s == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.l()) * f, ((float) jsonReader.l()) * f);
            while (jsonReader.h()) {
                jsonReader.C();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + s);
    }
}
