package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: dd  reason: default package */
public class dd implements wd<Integer> {
    public static final dd a = new dd();

    private dd() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.wd
    public Integer a(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(ed.d(jsonReader) * f));
    }
}
