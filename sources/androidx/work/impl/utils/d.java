package androidx.work.impl.utils;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.s;
import androidx.lifecycle.v;

public class d {

    /* access modifiers changed from: package-private */
    public class a implements v<In> {
        Out a = null;
        final /* synthetic */ na b;
        final /* synthetic */ Object c;
        final /* synthetic */ d1 d;
        final /* synthetic */ s e;

        /* renamed from: androidx.work.impl.utils.d$a$a  reason: collision with other inner class name */
        class RunnableC0054a implements Runnable {
            final /* synthetic */ Object a;

            RunnableC0054a(Object obj) {
                this.a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.c) {
                    Out out = (Out) a.this.d.apply(this.a);
                    a aVar = a.this;
                    Out out2 = aVar.a;
                    if (out2 == null && out != null) {
                        aVar.a = out;
                        aVar.e.l(out);
                    } else if (out2 != null && !out2.equals(out)) {
                        a aVar2 = a.this;
                        aVar2.a = out;
                        aVar2.e.l(out);
                    }
                }
            }
        }

        a(na naVar, Object obj, d1 d1Var, s sVar) {
            this.b = naVar;
            this.c = obj;
            this.d = d1Var;
            this.e = sVar;
        }

        @Override // androidx.lifecycle.v
        public void a(In in) {
            ((oa) this.b).a(new RunnableC0054a(in));
        }
    }

    public static <In, Out> LiveData<Out> a(LiveData<In> liveData, d1<In, Out> d1Var, na naVar) {
        Object obj = new Object();
        s sVar = new s();
        sVar.o(liveData, new a(naVar, obj, d1Var, sVar));
        return sVar;
    }
}
