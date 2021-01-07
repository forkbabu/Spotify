package com.spotify.libs.onboarding.allboarding.flow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.spotify.libs.onboarding.allboarding.room.b;
import com.spotify.libs.onboarding.allboarding.room.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class i extends e0 {
    private final iw0 c;
    private final String d;

    static final class a<I, O> implements d1<List<? extends j>, List<? extends String>> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.d1
        public List<? extends String> apply(List<? extends j> list) {
            List<? extends j> list2 = list;
            h.d(list2, "it");
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (t.b() != null) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList(d.e(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b b = ((j) it.next()).b();
                h.c(b);
                arrayList2.add(b.a());
            }
            return arrayList2;
        }
    }

    public i(iw0 iw0, String str) {
        h.e(iw0, "allboardingProvider");
        h.e(str, "sessionId");
        this.c = iw0;
        this.d = str;
    }

    public final LiveData<List<String>> g() {
        LiveData<List<String>> b = d0.b(((kw0) this.c).q(this.d), a.a);
        h.d(b, "Transformations.map(allb…st!!.imageUrl }\n        }");
        return b;
    }
}
