package com.spotify.music.features.entityselector.container;

import android.view.View;
import kotlin.jvm.internal.h;

public final class a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.entityselector.container.a$a  reason: collision with other inner class name */
    public static final class C0230a<T> implements tg0<View> {
        final /* synthetic */ EntitySelectorFragment a;

        C0230a(EntitySelectorFragment entitySelectorFragment) {
            this.a = entitySelectorFragment;
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

    public static final tg0<View> a(EntitySelectorFragment entitySelectorFragment) {
        h.e(entitySelectorFragment, "fragment");
        return new C0230a(entitySelectorFragment);
    }
}
