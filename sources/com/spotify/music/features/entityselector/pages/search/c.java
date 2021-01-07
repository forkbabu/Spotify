package com.spotify.music.features.entityselector.pages.search;

import android.view.View;
import kotlin.jvm.internal.h;

public final class c {

    /* access modifiers changed from: package-private */
    public static final class a<T> implements tg0<View> {
        final /* synthetic */ SearchFragment a;

        a(SearchFragment searchFragment) {
            this.a = searchFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.tg0
        public View get() {
            View a3 = this.a.a3();
            if (a3 != null) {
                return a3;
            }
            throw new IllegalStateException("view is not available".toString());
        }
    }

    public static final tg0<View> a(SearchFragment searchFragment) {
        h.e(searchFragment, "fragment");
        return new a(searchFragment);
    }
}
