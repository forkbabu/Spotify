package com.spotify.music.features.wrapped2020.stories.templates.genrelust;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import kotlin.jvm.internal.h;

public final class f {
    public static final float a(View view, int i) {
        Context context = view.getContext();
        h.d(context, "context");
        Resources resources = context.getResources();
        h.d(resources, "context.resources");
        return ((float) i) * resources.getDisplayMetrics().density;
    }
}
