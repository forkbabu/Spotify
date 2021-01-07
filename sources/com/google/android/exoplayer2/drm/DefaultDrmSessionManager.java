package com.google.android.exoplayer2.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.q;
import com.google.android.exoplayer2.drm.r;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DefaultDrmSessionManager<T extends q> implements n<T> {
    private final UUID b;
    private final r.c<T> c;
    private final u d;
    private final HashMap<String, String> e;
    private final m<k> f = new m<>();
    private final boolean g;
    private final int[] h;
    private final boolean i;
    private final DefaultDrmSessionManager<T>.e j;
    private final v k;
    private final List<DefaultDrmSession<T>> l;
    private final List<DefaultDrmSession<T>> m;
    private int n;
    private r<T> o;
    private DefaultDrmSession<T> p;
    private DefaultDrmSession<T> q;
    private Looper r;
    private int s;
    private byte[] t;
    volatile DefaultDrmSessionManager<T>.d u;

    public static final class MissingSchemeDataException extends Exception {
        MissingSchemeDataException(UUID uuid, a aVar) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {
        private final HashMap<String, String> a = new HashMap<>();
        private UUID b = u.d;
        private r.c<q> c;
        private int[] d;
        private v e;

        public b() {
            int i = t.d;
            this.c = e.a;
            this.e = new t();
            this.d = new int[0];
        }

        public DefaultDrmSessionManager<q> a(u uVar) {
            return new DefaultDrmSessionManager<>(this.b, this.c, uVar, this.a, false, this.d, false, this.e, null);
        }

        public b b(Map<String, String> map) {
            this.a.clear();
            HashMap<String, String> hashMap = this.a;
            map.getClass();
            hashMap.putAll(map);
            return this;
        }

        public b c(UUID uuid, r.c cVar) {
            uuid.getClass();
            this.b = uuid;
            cVar.getClass();
            this.c = cVar;
            return this;
        }
    }

    /* access modifiers changed from: private */
    public class c implements r.b<T> {
        c(a aVar) {
        }
    }

    /* access modifiers changed from: private */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.l) {
                    if (defaultDrmSession.k(bArr)) {
                        defaultDrmSession.o(message.what);
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class e implements DefaultDrmSession.a<T> {
        e(a aVar) {
        }

        public void a(Exception exc) {
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.m) {
                defaultDrmSession.q(exc);
            }
            DefaultDrmSessionManager.this.m.clear();
        }

        public void b(DefaultDrmSession<T> defaultDrmSession) {
            if (!DefaultDrmSessionManager.this.m.contains(defaultDrmSession)) {
                DefaultDrmSessionManager.this.m.add(defaultDrmSession);
                if (DefaultDrmSessionManager.this.m.size() == 1) {
                    defaultDrmSession.t();
                }
            }
        }
    }

    DefaultDrmSessionManager(UUID uuid, r.c cVar, u uVar, HashMap hashMap, boolean z, int[] iArr, boolean z2, v vVar, a aVar) {
        uuid.getClass();
        g.b(!u.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.b = uuid;
        this.c = cVar;
        this.d = uVar;
        this.e = hashMap;
        this.g = z;
        this.h = iArr;
        this.i = z2;
        this.k = vVar;
        this.j = new e(null);
        this.s = 0;
        this.l = new ArrayList();
        this.m = new ArrayList();
    }

    private DefaultDrmSession<T> i(List<l.b> list, boolean z) {
        this.o.getClass();
        UUID uuid = this.b;
        r<T> rVar = this.o;
        DefaultDrmSessionManager<T>.e eVar = this.j;
        c cVar = new c(this);
        int i2 = this.s;
        byte[] bArr = this.t;
        HashMap<String, String> hashMap = this.e;
        u uVar = this.d;
        Looper looper = this.r;
        looper.getClass();
        return new DefaultDrmSession<>(uuid, rVar, eVar, cVar, list, i2, this.i | z, z, bArr, hashMap, uVar, looper, this.f, this.k);
    }

    private static List<l.b> j(l lVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(lVar.f);
        for (int i2 = 0; i2 < lVar.f; i2++) {
            l.b c2 = lVar.c(i2);
            if ((c2.c(uuid) || (u.c.equals(uuid) && c2.c(u.b))) && (c2.n != null || z)) {
                arrayList.add(c2);
            }
        }
        return arrayList;
    }

    public static void l(DefaultDrmSessionManager defaultDrmSessionManager, DefaultDrmSession defaultDrmSession) {
        defaultDrmSessionManager.l.remove(defaultDrmSession);
        if (defaultDrmSessionManager.p == defaultDrmSession) {
            defaultDrmSessionManager.p = null;
        }
        if (defaultDrmSessionManager.q == defaultDrmSession) {
            defaultDrmSessionManager.q = null;
        }
        if (defaultDrmSessionManager.m.size() > 1 && defaultDrmSessionManager.m.get(0) == defaultDrmSession) {
            defaultDrmSessionManager.m.get(1).t();
        }
        defaultDrmSessionManager.m.remove(defaultDrmSession);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public boolean a(l lVar) {
        if (this.t != null) {
            return true;
        }
        if (((ArrayList) j(lVar, this.b, true)).isEmpty()) {
            if (lVar.f != 1 || !lVar.c(0).c(u.b)) {
                return false;
            }
            StringBuilder V0 = je.V0("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            V0.append(this.b);
            V0.toString();
        }
        String str = lVar.c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if (("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) && f0.a < 25) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.drm.n
    public Class<T> b(l lVar) {
        if (!a(lVar)) {
            return null;
        }
        r<T> rVar = this.o;
        rVar.getClass();
        return rVar.a();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public DrmSession<T> c(Looper looper, int i2) {
        Looper looper2 = this.r;
        int i3 = 0;
        g.m(looper2 == null || looper2 == looper);
        this.r = looper;
        r<T> rVar = this.o;
        rVar.getClass();
        if (s.class.equals(rVar.a()) && s.d) {
            return null;
        }
        int[] iArr = this.h;
        int i4 = f0.a;
        while (true) {
            if (i3 >= iArr.length) {
                i3 = -1;
                break;
            } else if (iArr[i3] == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1 || rVar.a() == null) {
            return null;
        }
        if (this.u == null) {
            this.u = new d(looper);
        }
        if (this.p == null) {
            DefaultDrmSession<T> i5 = i(Collections.emptyList(), true);
            this.l.add(i5);
            this.p = i5;
        }
        this.p.a();
        return this.p;
    }

    @Override // com.google.android.exoplayer2.drm.n
    public final void d() {
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 == 0) {
            r<T> rVar = this.o;
            rVar.getClass();
            rVar.d();
            this.o = null;
        }
    }

    @Override // com.google.android.exoplayer2.drm.n
    public DrmSession<T> e(Looper looper, l lVar) {
        List<l.b> list;
        Looper looper2 = this.r;
        g.m(looper2 == null || looper2 == looper);
        this.r = looper;
        if (this.u == null) {
            this.u = new d(looper);
        }
        DefaultDrmSession<T> defaultDrmSession = null;
        if (this.t == null) {
            list = j(lVar, this.b, false);
            if (((ArrayList) list).isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.b, null);
                this.f.b(new d(missingSchemeDataException));
                return new p(new DrmSession.DrmSessionException(missingSchemeDataException));
            }
        } else {
            list = null;
        }
        if (this.g) {
            Iterator<DefaultDrmSession<T>> it = this.l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession<T> next = it.next();
                if (f0.a(next.a, list)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.q;
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = i(list, false);
            if (!this.g) {
                this.q = defaultDrmSession;
            }
            this.l.add(defaultDrmSession);
        }
        defaultDrmSession.a();
        return defaultDrmSession;
    }

    public final void h(Handler handler, k kVar) {
        this.f.a(handler, kVar);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public final void k() {
        int i2 = this.n;
        this.n = i2 + 1;
        if (i2 == 0) {
            g.m(this.o == null);
            r<T> a2 = this.c.a(this.b);
            this.o = a2;
            a2.h(new c(null));
        }
    }

    public void m(int i2, byte[] bArr) {
        g.m(this.l.isEmpty());
        if (i2 == 1 || i2 == 3) {
            bArr.getClass();
        }
        this.s = i2;
        this.t = bArr;
    }
}
