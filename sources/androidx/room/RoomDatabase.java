package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import defpackage.q7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class RoomDatabase {
    @Deprecated
    protected volatile p7 a;
    private Executor b;
    private Executor c;
    private q7 d;
    private final g e;
    private boolean f;
    boolean g;
    @Deprecated
    protected List<b> h;
    private final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> j = new ThreadLocal<>();

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    public static class a<T extends RoomDatabase> {
        private final Class<T> a;
        private final String b;
        private final Context c;
        private ArrayList<b> d;
        private Executor e;
        private Executor f;
        private q7.c g;
        private boolean h;
        private boolean i = true;
        private boolean j;
        private final c k = new c();
        private Set<Integer> l;

        a(Context context, Class<T> cls, String str) {
            this.c = context;
            this.a = cls;
            this.b = str;
        }

        public a<T> a(b bVar) {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            this.d.add(bVar);
            return this;
        }

        public a<T> b(j7... j7VarArr) {
            if (this.l == null) {
                this.l = new HashSet();
            }
            for (j7 j7Var : j7VarArr) {
                this.l.add(Integer.valueOf(j7Var.a));
                this.l.add(Integer.valueOf(j7Var.b));
            }
            this.k.a(j7VarArr);
            return this;
        }

        public a<T> c() {
            this.h = true;
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3 A[Catch:{ ClassNotFoundException -> 0x0105, IllegalAccessException -> 0x00ee, InstantiationException -> 0x00d7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5 A[Catch:{ ClassNotFoundException -> 0x0105, IllegalAccessException -> 0x00ee, InstantiationException -> 0x00d7 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T d() {
            /*
            // Method dump skipped, instructions count: 313
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.a.d():androidx.room.RoomDatabase");
        }

        public a<T> e() {
            this.i = false;
            this.j = true;
            return this;
        }

        public a<T> f(q7.c cVar) {
            this.g = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            this.e = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(p7 p7Var) {
        }
    }

    public static class c {
        private HashMap<Integer, TreeMap<Integer, j7>> a = new HashMap<>();

        public void a(j7... j7VarArr) {
            for (j7 j7Var : j7VarArr) {
                int i = j7Var.a;
                int i2 = j7Var.b;
                TreeMap<Integer, j7> treeMap = this.a.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    this.a.put(Integer.valueOf(i), treeMap);
                }
                j7 j7Var2 = treeMap.get(Integer.valueOf(i2));
                if (j7Var2 != null) {
                    String str = "Overriding migration " + j7Var2 + " with " + j7Var;
                }
                treeMap.put(Integer.valueOf(i2), j7Var);
            }
        }

        public List<j7> b(int i, int i2) {
            Set<Integer> set;
            boolean z;
            boolean z2;
            if (i == i2) {
                return Collections.emptyList();
            }
            boolean z3 = i2 > i;
            ArrayList arrayList = new ArrayList();
            do {
                if (z3) {
                    if (i >= i2) {
                        return arrayList;
                    }
                } else if (i <= i2) {
                    return arrayList;
                }
                TreeMap<Integer, j7> treeMap = this.a.get(Integer.valueOf(i));
                if (treeMap == null) {
                    break;
                }
                if (z3) {
                    set = treeMap.descendingKeySet();
                } else {
                    set = treeMap.keySet();
                }
                Iterator<Integer> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        continue;
                        break;
                    }
                    int intValue = it.next().intValue();
                    if (!z3 ? intValue < i2 || intValue >= i : intValue > i2 || intValue <= i) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        arrayList.add(treeMap.get(Integer.valueOf(intValue)));
                        i = intValue;
                        z = true;
                        continue;
                        break;
                    }
                }
            } while (z);
            return null;
        }
    }

    public RoomDatabase() {
        new ConcurrentHashMap();
        this.e = f();
    }

    public void a() {
        if (!this.f) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public void b() {
        if (!n() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        p7 writableDatabase = this.d.getWritableDatabase();
        this.e.j(writableDatabase);
        writableDatabase.t();
    }

    public abstract void d();

    public t7 e(String str) {
        a();
        b();
        return this.d.getWritableDatabase().e1(str);
    }

    /* access modifiers changed from: protected */
    public abstract g f();

    /* access modifiers changed from: protected */
    public abstract q7 g(a aVar);

    @Deprecated
    public void h() {
        this.d.getWritableDatabase().i0();
        if (!n()) {
            g gVar = this.e;
            if (gVar.e.compareAndSet(false, true)) {
                gVar.d.l().execute(gVar.k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Lock i() {
        return this.i.readLock();
    }

    public g j() {
        return this.e;
    }

    public q7 k() {
        return this.d;
    }

    public Executor l() {
        return this.b;
    }

    public Executor m() {
        return this.c;
    }

    public boolean n() {
        return this.d.getWritableDatabase().S1();
    }

    public void o(a aVar) {
        q7 g2 = g(aVar);
        this.d = g2;
        if (g2 instanceof n) {
            ((n) g2).b(aVar);
        }
        int i2 = Build.VERSION.SDK_INT;
        boolean z = aVar.g == JournalMode.WRITE_AHEAD_LOGGING;
        this.d.setWriteAheadLoggingEnabled(z);
        this.h = aVar.e;
        this.b = aVar.h;
        this.c = new p(aVar.i);
        this.f = aVar.f;
        this.g = z;
    }

    /* access modifiers changed from: protected */
    public void p(p7 p7Var) {
        this.e.d(p7Var);
    }

    public Cursor q(s7 s7Var, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal == null) {
            return this.d.getWritableDatabase().w0(s7Var);
        }
        int i2 = Build.VERSION.SDK_INT;
        return this.d.getWritableDatabase().N(s7Var, cancellationSignal);
    }

    public void r(Runnable runnable) {
        c();
        try {
            runnable.run();
            s();
        } finally {
            h();
        }
    }

    @Deprecated
    public void s() {
        this.d.getWritableDatabase().Y();
    }
}
