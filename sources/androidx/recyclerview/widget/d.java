package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.m;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public class d<T> {
    private static final Executor h = new c();
    private final w a;
    final c<T> b;
    Executor c;
    private final List<b<T>> d = new CopyOnWriteArrayList();
    private List<T> e;
    private List<T> f = Collections.emptyList();
    int g;

    class a implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ List b;
        final /* synthetic */ int c;
        final /* synthetic */ Runnable f;

        /* renamed from: androidx.recyclerview.widget.d$a$a  reason: collision with other inner class name */
        class C0045a extends m.b {
            C0045a() {
            }

            @Override // androidx.recyclerview.widget.m.b
            public boolean a(int i, int i2) {
                Object obj = a.this.a.get(i);
                Object obj2 = a.this.b.get(i2);
                if (obj != null && obj2 != null) {
                    return d.this.b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.m.b
            public boolean b(int i, int i2) {
                Object obj = a.this.a.get(i);
                Object obj2 = a.this.b.get(i2);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.b.b().b(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.m.b
            public Object c(int i, int i2) {
                Object obj = a.this.a.get(i);
                Object obj2 = a.this.b.get(i2);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                d.this.b.b().getClass();
                return null;
            }

            @Override // androidx.recyclerview.widget.m.b
            public int d() {
                return a.this.b.size();
            }

            @Override // androidx.recyclerview.widget.m.b
            public int e() {
                return a.this.a.size();
            }
        }

        class b implements Runnable {
            final /* synthetic */ m.c a;

            b(m.c cVar) {
                this.a = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.g == aVar.c) {
                    dVar.c(aVar.b, this.a, aVar.f);
                }
            }
        }

        a(List list, List list2, int i, Runnable runnable) {
            this.a = list;
            this.b = list2;
            this.c = i;
            this.f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.c.execute(new b(m.b(new C0045a(), true)));
        }
    }

    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    private static class c implements Executor {
        final Handler a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    public d(w wVar, c<T> cVar) {
        this.a = wVar;
        this.b = cVar;
        if (cVar.c() != null) {
            this.c = cVar.c();
        } else {
            this.c = h;
        }
    }

    private void d(List<T> list, Runnable runnable) {
        for (b<T> bVar : this.d) {
            bVar.a(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b<T> bVar) {
        this.d.add(bVar);
    }

    public List<T> b() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public void c(List<T> list, m.c cVar, Runnable runnable) {
        List<T> list2 = this.f;
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        cVar.a(this.a);
        d(list2, runnable);
    }

    public void e(List<T> list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List<T> list2 = this.e;
        if (list != list2) {
            List<T> list3 = this.f;
            if (list == null) {
                int size = list2.size();
                this.e = null;
                this.f = Collections.emptyList();
                this.a.b(0, size);
                d(list3, runnable);
            } else if (list2 == null) {
                this.e = list;
                this.f = Collections.unmodifiableList(list);
                this.a.a(0, list.size());
                d(list3, runnable);
            } else {
                this.b.a().execute(new a(list2, list, i, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
