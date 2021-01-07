package com.spotify.encore.consumer.elements.creator;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class CreatorAuthorsFormatterKt {
    public static final String format(List<String> list, float f, nmf<? super String, Float> nmf) {
        h.e(list, "authors");
        h.e(nmf, "measureText");
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        for (T t : list) {
            if (t != null) {
                arrayList.add(e.C(t).toString());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (true ^ e.n((String) obj)) {
                arrayList2.add(obj);
            }
        }
        float floatValue = nmf.invoke(" • ").floatValue();
        int i = 0;
        while (arrayList2.size() > i) {
            int size = arrayList2.size() - i;
            float floatValue2 = nmf.invoke(arrayList2.get(i)).floatValue();
            if ((f - floatValue2) - (size > 1 ? nmf.invoke(" + " + size).floatValue() : 0.0f) < ((float) 0)) {
                break;
            }
            i++;
            f -= floatValue2 + floatValue;
        }
        if (i == 0 && (!arrayList2.isEmpty())) {
            i++;
        }
        int size2 = arrayList2.size() - i;
        return d.p(arrayList2.subList(0, i), " • ", null, size2 > 0 ? je.p0(" + ", size2) : "", 0, null, null, 58, null);
    }
}
