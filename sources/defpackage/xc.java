package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: xc  reason: default package */
public class xc implements wd<Float> {
    public static final xc a = new xc();

    private xc() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.wd
    public Float a(JsonReader jsonReader, float f) {
        return Float.valueOf(ed.d(jsonReader) * f);
    }
}
