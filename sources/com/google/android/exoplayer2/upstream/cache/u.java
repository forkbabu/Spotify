package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import android.util.Log;
import com.google.android.exoplayer2.database.a;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.g;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

public final class u implements Cache {
    private static final HashSet<File> k = new HashSet<>();
    private final File a;
    private final f b;
    private final m c;
    private final h d;
    private final HashMap<String, ArrayList<Cache.a>> e;
    private final Random f;
    private final boolean g;
    private long h;
    private long i;
    private Cache.CacheException j;

    public u(File file, f fVar, a aVar, byte[] bArr, boolean z, boolean z2) {
        boolean add;
        m mVar = new m(aVar, file, bArr, z, z2);
        h hVar = (aVar == null || z2) ? null : new h(aVar);
        synchronized (u.class) {
            add = k.add(file.getAbsoluteFile());
        }
        if (add) {
            this.a = file;
            this.b = fVar;
            this.c = mVar;
            this.d = hVar;
            this.e = new HashMap<>();
            this.f = new Random();
            this.g = fVar.b();
            this.h = -1;
            ConditionVariable conditionVariable = new ConditionVariable();
            new t(this, "SimpleCache.initialize()", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }

    static void m(u uVar) {
        long j2;
        if (uVar.a.exists() || uVar.a.mkdirs()) {
            File[] listFiles = uVar.a.listFiles();
            if (listFiles == null) {
                StringBuilder V0 = je.V0("Failed to list cache directory files: ");
                V0.append(uVar.a);
                String sb = V0.toString();
                Log.e("SimpleCache", sb);
                uVar.j = new Cache.CacheException(sb);
                return;
            }
            int length = listFiles.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    j2 = -1;
                    break;
                }
                File file = listFiles[i2];
                String name = file.getName();
                if (name.endsWith(".uid")) {
                    try {
                        j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                        break;
                    } catch (NumberFormatException unused) {
                        Log.e("SimpleCache", "Malformed UID file: " + file);
                        file.delete();
                    }
                } else {
                    i2++;
                }
            }
            uVar.h = j2;
            if (j2 == -1) {
                try {
                    uVar.h = q(uVar.a);
                } catch (IOException e2) {
                    StringBuilder V02 = je.V0("Failed to create cache UID: ");
                    V02.append(uVar.a);
                    String sb2 = V02.toString();
                    Log.e("SimpleCache", sb2, e2);
                    uVar.j = new Cache.CacheException(sb2, e2);
                    return;
                }
            }
            try {
                uVar.c.i(uVar.h);
                h hVar = uVar.d;
                if (hVar != null) {
                    hVar.b(uVar.h);
                    Map<String, g> a2 = uVar.d.a();
                    uVar.r(uVar.a, true, listFiles, a2);
                    uVar.d.d(((HashMap) a2).keySet());
                } else {
                    uVar.r(uVar.a, true, listFiles, null);
                }
                uVar.c.k();
                try {
                    uVar.c.l();
                } catch (IOException e3) {
                    Log.e("SimpleCache", "Storing index file failed", e3);
                }
            } catch (IOException e4) {
                StringBuilder V03 = je.V0("Failed to initialize cache indices: ");
                V03.append(uVar.a);
                String sb3 = V03.toString();
                Log.e("SimpleCache", sb3, e4);
                uVar.j = new Cache.CacheException(sb3, e4);
            }
        } else {
            StringBuilder V04 = je.V0("Failed to create cache directory: ");
            V04.append(uVar.a);
            String sb4 = V04.toString();
            Log.e("SimpleCache", sb4);
            uVar.j = new Cache.CacheException(sb4);
        }
    }

    private void o(v vVar) {
        this.c.h(vVar.a).a(vVar);
        this.i += vVar.c;
        ArrayList<Cache.a> arrayList = this.e.get(vVar.a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                arrayList.get(size).a(this, vVar);
            }
        }
        this.b.a(this, vVar);
    }

    private static long q(File file) {
        long j2;
        long nextLong = new SecureRandom().nextLong();
        if (nextLong == Long.MIN_VALUE) {
            j2 = 0;
        } else {
            j2 = Math.abs(nextLong);
        }
        File file2 = new File(file, je.x0(Long.toString(j2, 16), ".uid"));
        if (file2.createNewFile()) {
            return j2;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private void r(File file, boolean z, File[] fileArr, Map<String, g> map) {
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    r(file2, false, file2.listFiles(), map);
                } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    long j2 = -1;
                    long j3 = -9223372036854775807L;
                    g remove = map != null ? map.remove(name) : null;
                    if (remove != null) {
                        j2 = remove.a;
                        j3 = remove.b;
                    }
                    v h2 = v.h(file2, j2, j3, this.c);
                    if (h2 != null) {
                        o(h2);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    private void s(j jVar) {
        l d2 = this.c.d(jVar.a);
        if (d2 != null && d2.i(jVar)) {
            this.i -= jVar.c;
            if (this.d != null) {
                try {
                    this.d.c(jVar.n.getName());
                } catch (IOException unused) {
                }
            }
            this.c.j(d2.b);
            ArrayList<Cache.a> arrayList = this.e.get(jVar.a);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    arrayList.get(size).d(this, jVar);
                }
            }
            this.b.d(this, jVar);
        }
    }

    private void t() {
        ArrayList arrayList = new ArrayList();
        for (l lVar : this.c.e()) {
            Iterator<v> it = lVar.f().iterator();
            while (it.hasNext()) {
                v next = it.next();
                if (next.n.length() != next.c) {
                    arrayList.add(next);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            s((j) arrayList.get(i2));
        }
    }

    private v u(String str, v vVar) {
        if (!this.g) {
            return vVar;
        }
        File file = vVar.n;
        file.getClass();
        String name = file.getName();
        long j2 = vVar.c;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        h hVar = this.d;
        if (hVar != null) {
            try {
                hVar.e(name, j2, currentTimeMillis);
            } catch (IOException unused) {
            }
        } else {
            z = true;
        }
        v j3 = this.c.d(str).j(vVar, currentTimeMillis, z);
        ArrayList<Cache.a> arrayList = this.e.get(vVar.a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                arrayList.get(size).e(this, vVar, j3);
            }
        }
        this.b.e(this, vVar, j3);
        return j3;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized File a(String str, long j2, long j3) {
        l d2;
        File file;
        g.m(true);
        p();
        d2 = this.c.d(str);
        d2.getClass();
        g.m(d2.h());
        if (!this.a.exists()) {
            this.a.mkdirs();
            t();
        }
        this.b.c(this, str, j2, j3);
        file = new File(this.a, Integer.toString(this.f.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return v.m(file, d2.a, j2, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized o b(String str) {
        g.m(true);
        return this.c.f(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void c(String str, p pVar) {
        g.m(true);
        p();
        this.c.c(str, pVar);
        try {
            this.c.l();
        } catch (IOException e2) {
            throw new Cache.CacheException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long d(String str, long j2, long j3) {
        l d2;
        g.m(true);
        d2 = this.c.d(str);
        return d2 != null ? d2.c(j2, j3) : -j3;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long e() {
        g.m(true);
        return this.i;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void f(j jVar) {
        g.m(true);
        l d2 = this.c.d(jVar.a);
        d2.getClass();
        g.m(d2.h());
        d2.k(false);
        this.c.j(d2.b);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized j g(String str, long j2) {
        v vVar;
        v e2;
        g.m(true);
        p();
        l d2 = this.c.d(str);
        if (d2 == null) {
            vVar = v.l(str, j2);
        } else {
            while (true) {
                e2 = d2.e(j2);
                if (!e2.f || e2.n.length() == e2.c) {
                    break;
                }
                t();
            }
            vVar = e2;
        }
        if (vVar.f) {
            return u(str, vVar);
        }
        l h2 = this.c.h(str);
        if (h2.h()) {
            return null;
        }
        h2.k(true);
        return vVar;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void h(j jVar) {
        g.m(true);
        s(jVar);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void i(File file, long j2) {
        boolean z = true;
        g.m(true);
        if (file.exists()) {
            if (j2 == 0) {
                file.delete();
                return;
            }
            v h2 = v.h(file, j2, -9223372036854775807L, this.c);
            h2.getClass();
            l d2 = this.c.d(h2.a);
            d2.getClass();
            g.m(d2.h());
            long a2 = n.a(d2.d());
            if (a2 != -1) {
                if (h2.b + h2.c > a2) {
                    z = false;
                }
                g.m(z);
            }
            if (this.d != null) {
                try {
                    this.d.e(file.getName(), h2.c, h2.o);
                } catch (IOException e2) {
                    throw new Cache.CacheException(e2);
                }
            }
            o(h2);
            try {
                this.c.l();
                notifyAll();
            } catch (IOException e3) {
                throw new Cache.CacheException(e3);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized boolean j(String str, long j2, long j3) {
        boolean z;
        z = true;
        g.m(true);
        l d2 = this.c.d(str);
        if (d2 == null || d2.c(j2, j3) < j3) {
            z = false;
        }
        return z;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized j k(String str, long j2) {
        j g2;
        g.m(true);
        p();
        while (true) {
            g2 = g(str, j2);
            if (g2 == null) {
                wait();
            }
        }
        return g2;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<j> l(String str) {
        TreeSet treeSet;
        g.m(true);
        l d2 = this.c.d(str);
        if (d2 != null) {
            if (!d2.g()) {
                treeSet = new TreeSet((Collection) d2.f());
            }
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    public synchronized void p() {
        Cache.CacheException cacheException = this.j;
        if (cacheException != null) {
            throw cacheException;
        }
    }
}
