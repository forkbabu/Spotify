package com.spotify.music.features.carepackage;

import com.spotify.remoteconfig.ac;
import kotlin.jvm.internal.h;

public final class d {

    /* access modifiers changed from: package-private */
    public static final class a<T> implements tg0<Boolean> {
        final /* synthetic */ ac a;

        a(ac acVar) {
            this.a = acVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.tg0
        public Boolean get() {
            return Boolean.valueOf(this.a.a());
        }
    }

    public final blb a(ac acVar) {
        h.e(acVar, "properties");
        return new zi4(new a(acVar));
    }
}
