package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: pd  reason: default package */
public class pd implements wd<ie> {
    public static final pd a = new pd();

    private pd() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.wd
    public ie a(JsonReader jsonReader, float f) {
        boolean z = jsonReader.s() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.b();
        }
        float l = (float) jsonReader.l();
        float l2 = (float) jsonReader.l();
        while (jsonReader.h()) {
            jsonReader.C();
        }
        if (z) {
            jsonReader.f();
        }
        return new ie((l / 100.0f) * f, (l2 / 100.0f) * f);
    }
}
