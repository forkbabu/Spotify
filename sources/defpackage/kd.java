package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: kd  reason: default package */
public class kd implements wd<PointF> {
    public static final kd a = new kd();

    private kd() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.wd
    public PointF a(JsonReader jsonReader, float f) {
        return ed.b(jsonReader, f);
    }
}
