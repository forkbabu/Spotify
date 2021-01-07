package com.spotify.music.samsungpersonalization;

import androidx.fragment.app.Fragment;
import defpackage.pyc;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class c implements b {
    private final Fragment a;
    private final pyc b;
    private final com.spotify.music.samsungpersonalization.customization.c c;

    static final class a<T, R> implements l<pyc.a, d0<? extends Boolean>> {
        final /* synthetic */ c a;
        final /* synthetic */ boolean b;

        a(c cVar, boolean z) {
            this.a = cVar;
            this.b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends Boolean> apply(pyc.a aVar) {
            pyc.a aVar2 = aVar;
            h.e(aVar2, "response");
            if (!(aVar2 instanceof pyc.a.b)) {
                z z = z.z(Boolean.FALSE);
                h.d(z, "Single.just(false)");
                return z;
            } else if (this.b) {
                return this.a.c.c(this.a.a, ((pyc.a.b) aVar2).a());
            } else {
                return this.a.c.f(this.a.a, ((pyc.a.b) aVar2).a());
            }
        }
    }

    public c(Fragment fragment, pyc pyc, com.spotify.music.samsungpersonalization.customization.c cVar) {
        h.e(fragment, "fragment");
        h.e(pyc, "samsungPartnerUserIdRetrofitClient");
        h.e(cVar, "samsungCustomizationClient");
        this.a = fragment;
        this.b = pyc;
        this.c = cVar;
    }

    @Override // com.spotify.music.samsungpersonalization.b
    public io.reactivex.a a(boolean z) {
        i iVar = new i(this.b.a().s(new a(this, z)));
        h.d(iVar, "samsungPartnerUserIdRetr…         .ignoreElement()");
        return iVar;
    }
}
