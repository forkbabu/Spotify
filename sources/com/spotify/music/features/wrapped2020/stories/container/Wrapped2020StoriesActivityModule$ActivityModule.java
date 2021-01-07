package com.spotify.music.features.wrapped2020.stories.container;

import android.app.Activity;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class Wrapped2020StoriesActivityModule$ActivityModule {

    public static final class a implements vt2 {
        a() {
        }

        @Override // defpackage.vt2
        public List<ts2> a() {
            return EmptyList.a;
        }
    }

    public static final cmf<f> a(Activity activity) {
        h.e(activity, "activity");
        return new Wrapped2020StoriesActivityModule$ActivityModule$provideExitContainerAction$1(activity);
    }

    public static final vt2 b() {
        return new a();
    }
}
