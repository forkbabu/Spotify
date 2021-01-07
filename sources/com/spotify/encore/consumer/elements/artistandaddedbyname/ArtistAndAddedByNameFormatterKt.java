package com.spotify.encore.consumer.elements.artistandaddedbyname;

import android.content.res.Resources;
import com.spotify.encore.consumer.elements.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class ArtistAndAddedByNameFormatterKt {
    public static final String format(Resources resources, List<String> list, String str) {
        String str2;
        h.e(resources, "resources");
        h.e(list, "artistNames");
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
            if (!e.n((String) obj)) {
                arrayList2.add(obj);
            }
        }
        String p = d.p(arrayList2, null, null, null, 0, null, null, 63, null);
        if (str == null || (str2 = e.C(str).toString()) == null) {
            str2 = "";
        }
        boolean z = !e.n(p);
        boolean z2 = !e.n(str2);
        if (z && z2) {
            String string = resources.getString(R.string.artist_and_addedby_names_format, str, p);
            h.d(string, "resources.getString(\n   …     artistName\n        )");
            return string;
        } else if (z) {
            return p;
        } else {
            if (z2) {
                return str2;
            }
            return "";
        }
    }
}
