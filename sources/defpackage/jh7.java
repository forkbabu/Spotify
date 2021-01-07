package defpackage;

import androidx.core.app.q;
import com.spotify.mobius.rx2.i;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.t;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.h;

/* renamed from: jh7  reason: default package */
public final class jh7 {

    /* access modifiers changed from: package-private */
    /* renamed from: jh7$a */
    /* compiled from: java-style lambda group */
    public static final class a<T, R> implements l<Boolean, gg7> {
        public static final a b = new a(0);
        public static final a c = new a(1);
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public final gg7 apply(Boolean bool) {
            int i = this.a;
            if (i == 0) {
                Boolean bool2 = bool;
                h.e(bool2, "it");
                return new uf7(bool2.booleanValue());
            } else if (i == 1) {
                Boolean bool3 = bool;
                h.e(bool3, "it");
                return new tg7(bool3.booleanValue());
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jh7$b */
    public static final class b<V> implements Callable<Boolean> {
        final /* synthetic */ q a;

        b(q qVar) {
            this.a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            return Boolean.valueOf(this.a.a());
        }
    }

    public static final com.spotify.mobius.q<gg7> a(com.spotify.music.connection.l lVar, q qVar) {
        h.e(lVar, "connectionState");
        h.e(qVar, "notificationManager");
        return i.a(lVar.b().j0(a.b), new t(new b(qVar)).j0(a.c));
    }
}
