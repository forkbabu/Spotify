package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import com.spotify.cosmos.router.Request;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

public class g {
    private static final String[] l = {"UPDATE", Request.DELETE, "INSERT"};
    final HashMap<String, Integer> a;
    final String[] b;
    private Map<String, Set<String>> c;
    final RoomDatabase d;
    AtomicBoolean e = new AtomicBoolean(false);
    private volatile boolean f = false;
    volatile t7 g;
    private b h;
    private final f i;
    final c1<c, d> j = new c1<>();
    Runnable k = new a();

    class a implements Runnable {
        a() {
        }

        /* JADX INFO: finally extract failed */
        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor q = g.this.d.q(new o7("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
            while (q.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(q.getInt(0)));
                } catch (Throwable th) {
                    q.close();
                    throw th;
                }
            }
            q.close();
            if (!hashSet.isEmpty()) {
                g.this.g.E();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock i = g.this.d.i();
            Set<Integer> set = null;
            try {
                i.lock();
                if (!g.this.c()) {
                    i.unlock();
                } else if (!g.this.e.compareAndSet(true, false)) {
                    i.unlock();
                } else if (g.this.d.n()) {
                    i.unlock();
                } else {
                    RoomDatabase roomDatabase = g.this.d;
                    if (roomDatabase.g) {
                        p7 writableDatabase = roomDatabase.k().getWritableDatabase();
                        writableDatabase.t();
                        try {
                            set = a();
                            writableDatabase.Y();
                        } finally {
                            writableDatabase.i0();
                        }
                    } else {
                        set = a();
                    }
                    i.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (g.this.j) {
                            Iterator<Map.Entry<c, d>> it = g.this.j.iterator();
                            while (it.hasNext()) {
                                it.next().getValue().a(set);
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            } catch (Throwable th) {
                i.unlock();
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {
        final long[] a;
        final boolean[] b;
        final int[] c;
        boolean d;
        boolean e;

        b(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            boolean[] zArr = new boolean[i];
            this.b = zArr;
            this.c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            synchronized (this) {
                if (this.d) {
                    if (!this.e) {
                        int length = this.a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.a[i] > 0;
                                boolean[] zArr = this.b;
                                if (z != zArr[i]) {
                                    int[] iArr = this.c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.c[i] = 0;
                                }
                                zArr[i] = z;
                                i++;
                            } else {
                                this.e = true;
                                this.d = false;
                                return this.c;
                            }
                        }
                    }
                }
                return null;
            }
        }
    }

    public static abstract class c {
        final String[] a;

        public c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract void a(Set<String> set);
    }

    /* access modifiers changed from: package-private */
    public static class d {
        final int[] a;
        private final String[] b;
        final c c;
        private final Set<String> d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.c = cVar;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.d = null;
        }

        /* access modifiers changed from: package-private */
        public void a(Set<Integer> set) {
            int length = this.a.length;
            Set<String> set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.a[i]))) {
                    if (length == 1) {
                        set2 = this.d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.c.a(set2);
            }
        }
    }

    static class e extends c {
        final g b;
        final WeakReference<c> c;

        e(g gVar, c cVar) {
            super(cVar.a);
            this.b = gVar;
            this.c = new WeakReference<>(cVar);
        }

        @Override // androidx.room.g.c
        public void a(Set<String> set) {
            c cVar = this.c.get();
            if (cVar == null) {
                this.b.e(this);
            } else {
                cVar.a(set);
            }
        }
    }

    public g(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.d = roomDatabase;
        this.h = new b(strArr.length);
        this.a = new HashMap<>();
        this.c = map2;
        this.i = new f(roomDatabase);
        int length = strArr.length;
        this.b = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.a.put(lowerCase, Integer.valueOf(i2));
            String str2 = map.get(strArr[i2]);
            if (str2 != null) {
                this.b[i2] = str2.toLowerCase(locale);
            } else {
                this.b[i2] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private String[] f(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.c.containsKey(lowerCase)) {
                hashSet.addAll(this.c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void g(p7 p7Var, int i2) {
        p7Var.A("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.b[i2];
        StringBuilder sb = new StringBuilder();
        String[] strArr = l;
        for (String str2 : strArr) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            p7Var.A(sb.toString());
        }
    }

    private void h(p7 p7Var, int i2) {
        String str = this.b[i2];
        StringBuilder sb = new StringBuilder();
        String[] strArr = l;
        for (String str2 : strArr) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            p7Var.A(sb.toString());
        }
    }

    public void a(c cVar) {
        d i2;
        boolean z;
        String[] f2 = f(cVar.a);
        int length = f2.length;
        int[] iArr = new int[length];
        int length2 = f2.length;
        for (int i3 = 0; i3 < length2; i3++) {
            Integer num = this.a.get(f2[i3].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i3] = num.intValue();
            } else {
                StringBuilder V0 = je.V0("There is no table with name ");
                V0.append(f2[i3]);
                throw new IllegalArgumentException(V0.toString());
            }
        }
        d dVar = new d(cVar, iArr, f2);
        synchronized (this.j) {
            i2 = this.j.i(cVar, dVar);
        }
        if (i2 == null) {
            b bVar = this.h;
            synchronized (bVar) {
                z = false;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr[i4];
                    long[] jArr = bVar.a;
                    long j2 = jArr[i5];
                    jArr[i5] = 1 + j2;
                    if (j2 == 0) {
                        bVar.d = true;
                        z = true;
                    }
                }
            }
            if (z) {
                i();
            }
        }
    }

    public <T> LiveData<T> b(String[] strArr, boolean z, Callable<T> callable) {
        f fVar = this.i;
        String[] f2 = f(strArr);
        for (String str : f2) {
            if (!this.a.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException(je.x0("There is no table with name ", str));
            }
        }
        return fVar.a(f2, z, callable);
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        p7 p7Var = this.d.a;
        if (!(p7Var != null && p7Var.isOpen())) {
            return false;
        }
        if (!this.f) {
            this.d.k().getWritableDatabase();
        }
        if (this.f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* access modifiers changed from: package-private */
    public void d(p7 p7Var) {
        synchronized (this) {
            if (this.f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            p7Var.A("PRAGMA temp_store = MEMORY;");
            p7Var.A("PRAGMA recursive_triggers='ON';");
            p7Var.A("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            j(p7Var);
            this.g = p7Var.e1("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f = true;
        }
    }

    public void e(c cVar) {
        d j2;
        boolean z;
        synchronized (this.j) {
            j2 = this.j.j(cVar);
        }
        if (j2 != null) {
            b bVar = this.h;
            int[] iArr = j2.a;
            synchronized (bVar) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = bVar.a;
                    long j3 = jArr[i2];
                    jArr[i2] = j3 - 1;
                    if (j3 == 1) {
                        bVar.d = true;
                        z = true;
                    }
                }
            }
            if (z) {
                i();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        p7 p7Var = this.d.a;
        if (p7Var != null && p7Var.isOpen()) {
            j(this.d.k().getWritableDatabase());
        }
    }

    /* access modifiers changed from: package-private */
    public void j(p7 p7Var) {
        if (!p7Var.S1()) {
            while (true) {
                try {
                    Lock i2 = this.d.i();
                    i2.lock();
                    try {
                        int[] a2 = this.h.a();
                        if (a2 == null) {
                            i2.unlock();
                            return;
                        }
                        int length = a2.length;
                        p7Var.t();
                        for (int i3 = 0; i3 < length; i3++) {
                            try {
                                int i4 = a2[i3];
                                if (i4 == 1) {
                                    g(p7Var, i3);
                                } else if (i4 == 2) {
                                    h(p7Var, i3);
                                }
                            } catch (Throwable th) {
                                p7Var.i0();
                                throw th;
                            }
                        }
                        p7Var.Y();
                        p7Var.i0();
                        b bVar = this.h;
                        synchronized (bVar) {
                            bVar.e = false;
                        }
                    } finally {
                        i2.unlock();
                    }
                } catch (SQLiteException | IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    return;
                }
            }
        }
    }
}
