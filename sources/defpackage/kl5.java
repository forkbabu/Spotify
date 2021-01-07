package defpackage;

import defpackage.b91;
import defpackage.s81;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: kl5  reason: default package */
public final class kl5 implements w<b91, b91> {

    /* renamed from: kl5$a */
    static final class a<T, R> implements l<b91, b91> {
        final /* synthetic */ kl5 a;

        a(kl5 kl5) {
            this.a = kl5;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public b91 apply(b91 b91) {
            b91 b912 = b91;
            h.e(b912, "viewModel");
            b91.a builder = b912.toBuilder();
            List<? extends s81> body = b912.body();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (T t : body) {
                int i2 = i + 1;
                if (i >= 0) {
                    s81 b = this.a.b(i, t);
                    if (b != null) {
                        arrayList.add(b);
                    }
                    i = i2;
                } else {
                    d.L();
                    throw null;
                }
            }
            return builder.e(arrayList).g();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final s81 b(int i, s81 s81) {
        s81.a builder = s81.toBuilder();
        List<? extends s81> children = s81.children();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = children.iterator();
        while (it.hasNext()) {
            s81 b = b(i, it.next());
            if (b != null) {
                arrayList.add(b);
            }
        }
        return builder.m(arrayList).d("rowIndex", Integer.valueOf(i)).l();
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        h.e(sVar, "upstream");
        s<R> j0 = sVar.j0(new a(this));
        h.d(j0, "upstream.map { viewModel…       .build()\n        }");
        return j0;
    }
}
