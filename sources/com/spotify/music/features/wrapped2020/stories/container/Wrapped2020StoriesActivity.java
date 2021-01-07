package com.spotify.music.features.wrapped2020.stories.container;

import android.app.ActionBar;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class Wrapped2020StoriesActivity extends ss2 {
    public static final a G = new a(null);

    public static final class a {
        public a(f fVar) {
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.wrapped_2020_stories_activity);
        getWindow().addFlags(128);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        androidx.appcompat.app.ActionBar I0 = I0();
        if (I0 != null) {
            I0.e();
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.WRAPPED_DATASTORIES, null);
        h.d(b, "PageViewObservable.creat…iers.WRAPPED_DATASTORIES)");
        return b;
    }
}
