package com.spotify.music.samsungpersonalization.customization;

import defpackage.pyc;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class m implements l {
    private final pyc a;
    private final c b;

    static final class a<T, R> implements l<pyc.a, d0<? extends List<? extends m60>>> {
        final /* synthetic */ m a;

        a(m mVar) {
            this.a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends List<? extends m60>> apply(pyc.a aVar) {
            pyc.a aVar2 = aVar;
            h.e(aVar2, "tokenResponse");
            if (aVar2 instanceof pyc.a.b) {
                return this.a.b.a(((pyc.a.b) aVar2).a());
            }
            if (aVar2 instanceof pyc.a.C0671a) {
                z z = z.z(EmptyList.a);
                h.d(z, "Single.just(emptyList())");
                return z;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public m(pyc pyc, c cVar) {
        h.e(pyc, "samsungPartnerUserIdRetrofitClient");
        h.e(cVar, "samsungCustomizationClient");
        this.a = pyc;
        this.b = cVar;
    }

    public z<List<m60>> b() {
        if (this.b.e()) {
            z<R> s = this.a.a().s(new a(this));
            h.d(s, "samsungPartnerUserIdRetr…      }\n                }");
            return s;
        }
        z<List<m60>> z = z.z(EmptyList.a);
        h.d(z, "Single.just(listOf())");
        return z;
    }
}
