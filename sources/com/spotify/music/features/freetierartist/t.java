package com.spotify.music.features.freetierartist;

import android.content.Context;
import com.spotify.music.features.freetierartist.discographysortandfilter.sort.SortCriteria;
import kotlin.jvm.internal.h;

public final class t {
    public static final String a(SortCriteria sortCriteria, Context context) {
        h.e(sortCriteria, "$this$asString");
        h.e(context, "context");
        String string = context.getString(sortCriteria.d());
        h.d(string, "context.getString(label)");
        return string;
    }
}
