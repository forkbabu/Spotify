package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.a;
import com.airbnb.lottie.model.content.h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qd  reason: default package */
public class qd implements wd<h> {
    public static final qd a = new qd();
    private static final JsonReader.a b = JsonReader.a.a("c", "v", "i", "o");

    private qd() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.wd
    public h a(JsonReader jsonReader, float f) {
        if (jsonReader.s() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
        }
        jsonReader.d();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.h()) {
            int w = jsonReader.w(b);
            if (w == 0) {
                z = jsonReader.i();
            } else if (w == 1) {
                list = ed.c(jsonReader, f);
            } else if (w == 2) {
                list2 = ed.c(jsonReader, f);
            } else if (w != 3) {
                jsonReader.B();
                jsonReader.C();
            } else {
                list3 = ed.c(jsonReader, f);
            }
        }
        jsonReader.g();
        if (jsonReader.s() == JsonReader.Token.END_ARRAY) {
            jsonReader.f();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new h(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new a(de.a(list.get(i2), list3.get(i2)), de.a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new a(de.a(list.get(i3), list3.get(i3)), de.a(pointF3, list2.get(0)), pointF3));
            }
            return new h(pointF, z, arrayList);
        }
    }
}
