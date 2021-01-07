package com.spotify.libs.nudges.api.options;

import android.view.View;
import kotlin.jvm.internal.h;

public final class b extends a {
    private View b;

    public final b d(View view) {
        h.e(view, "content");
        this.b = view;
        return this;
    }

    public final View e() {
        return this.b;
    }
}
