package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ed  reason: default package */
class ed {
    private static final JsonReader.a a = JsonReader.a.a("x", "y");

    static int a(JsonReader jsonReader) {
        jsonReader.b();
        int l = (int) (jsonReader.l() * 255.0d);
        int l2 = (int) (jsonReader.l() * 255.0d);
        int l3 = (int) (jsonReader.l() * 255.0d);
        while (jsonReader.h()) {
            jsonReader.C();
        }
        jsonReader.f();
        return Color.argb((int) BitmapRenderer.ALPHA_VISIBLE, l, l2, l3);
    }

    static PointF b(JsonReader jsonReader, float f) {
        int ordinal = jsonReader.s().ordinal();
        if (ordinal == 0) {
            jsonReader.b();
            float l = (float) jsonReader.l();
            float l2 = (float) jsonReader.l();
            while (jsonReader.s() != JsonReader.Token.END_ARRAY) {
                jsonReader.C();
            }
            jsonReader.f();
            return new PointF(l * f, l2 * f);
        } else if (ordinal == 2) {
            jsonReader.d();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (jsonReader.h()) {
                int w = jsonReader.w(a);
                if (w == 0) {
                    f2 = d(jsonReader);
                } else if (w != 1) {
                    jsonReader.B();
                    jsonReader.C();
                } else {
                    f3 = d(jsonReader);
                }
            }
            jsonReader.g();
            return new PointF(f2 * f, f3 * f);
        } else if (ordinal == 6) {
            float l3 = (float) jsonReader.l();
            float l4 = (float) jsonReader.l();
            while (jsonReader.h()) {
                jsonReader.C();
            }
            return new PointF(l3 * f, l4 * f);
        } else {
            StringBuilder V0 = je.V0("Unknown point starts with ");
            V0.append(jsonReader.s());
            throw new IllegalArgumentException(V0.toString());
        }
    }

    static List<PointF> c(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.b();
        while (jsonReader.s() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            arrayList.add(b(jsonReader, f));
            jsonReader.f();
        }
        jsonReader.f();
        return arrayList;
    }

    static float d(JsonReader jsonReader) {
        JsonReader.Token s = jsonReader.s();
        int ordinal = s.ordinal();
        if (ordinal == 0) {
            jsonReader.b();
            float l = (float) jsonReader.l();
            while (jsonReader.h()) {
                jsonReader.C();
            }
            jsonReader.f();
            return l;
        } else if (ordinal == 6) {
            return (float) jsonReader.l();
        } else {
            throw new IllegalArgumentException("Unknown value for token of type " + s);
        }
    }
}
