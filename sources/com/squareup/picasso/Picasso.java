package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.spotify.base.java.logging.Logger;
import com.squareup.picasso.c;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class Picasso {
    static final Handler o = new a(Looper.getMainLooper());
    static volatile Picasso p = null;
    private final d a;
    private final e b;
    private final c c;
    private final List<a0> d;
    final Context e;
    final k f;
    final f g;
    final d0 h;
    final Map<Object, c> i;
    final Map<ImageView, j> j;
    final ReferenceQueue<Object> k;
    final Bitmap.Config l;
    boolean m;
    volatile boolean n;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int debugColor;

        private LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i2 < size) {
                        e eVar = (e) list.get(i2);
                        eVar.b.e(eVar);
                        i2++;
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i2 < size2) {
                        c cVar = (c) list2.get(i2);
                        cVar.a.p(cVar);
                        i2++;
                    }
                } else {
                    StringBuilder V0 = je.V0("Unknown handler message received: ");
                    V0.append(message.what);
                    throw new AssertionError(V0.toString());
                }
            } else {
                c cVar2 = (c) message.obj;
                if (cVar2.a.n) {
                    j0.h("Main", "canceled", cVar2.b.b(), "target got garbage collected");
                }
                cVar2.a.a(cVar2.d());
            }
        }
    }

    public static class b {
        private final Context a;
        private l b;
        private ExecutorService c;
        private f d;
        private d e;
        private e f;
        private List<a0> g;
        private Bitmap.Config h;

        public b(Context context) {
            if (context != null) {
                this.a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public b a(a0 a0Var) {
            if (a0Var != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                if (!this.g.contains(a0Var)) {
                    this.g.add(a0Var);
                    return this;
                }
                throw new IllegalStateException("RequestHandler already registered.");
            }
            throw new IllegalArgumentException("RequestHandler must not be null.");
        }

        public Picasso b() {
            Context context = this.a;
            if (this.b == null) {
                this.b = new v(context);
            }
            if (this.d == null) {
                StringBuilder sb = j0.a;
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                this.d = new t((int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 7));
            }
            if (this.c == null) {
                this.c = new x();
            }
            if (this.f == null) {
                this.f = e.a;
            }
            d0 d0Var = new d0(this.d);
            return new Picasso(context, new k(context, this.c, Picasso.o, this.b, this.d, d0Var), this.d, this.e, this.f, this.g, d0Var, this.h, false, false);
        }

        public b c(Bitmap.Config config) {
            if (config != null) {
                this.h = config;
                return this;
            }
            throw new IllegalArgumentException("Bitmap config must not be null.");
        }

        public b d(l lVar) {
            if (lVar == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            } else if (this.b == null) {
                this.b = lVar;
                return this;
            } else {
                throw new IllegalStateException("Downloader already set.");
            }
        }

        public b e(ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("Executor service must not be null.");
            } else if (this.c == null) {
                this.c = executorService;
                return this;
            } else {
                throw new IllegalStateException("Executor service already set.");
            }
        }

        public b f(d dVar) {
            if (this.e == null) {
                this.e = dVar;
                return this;
            }
            throw new IllegalStateException("Listener already set.");
        }

        public b g(f fVar) {
            if (this.d == null) {
                this.d = fVar;
                return this;
            }
            throw new IllegalStateException("Memory cache already set.");
        }
    }

    private static class c extends Thread {
        private final ReferenceQueue<Object> a;
        private final Handler b;

        class a implements Runnable {
            final /* synthetic */ Exception a;

            a(c cVar, Exception exc) {
                this.a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.a);
            }
        }

        c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.a = referenceQueue;
            this.b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    c.a aVar = (c.a) this.a.remove(1000);
                    Message obtainMessage = this.b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.a;
                        this.b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.b.post(new a(this, e));
                    return;
                }
            }
        }
    }

    public interface d {
    }

    public interface e {
        public static final e a = new a();

        static class a implements e {
            a() {
            }
        }
    }

    Picasso(Context context, k kVar, f fVar, d dVar, e eVar, List<a0> list, d0 d0Var, Bitmap.Config config, boolean z, boolean z2) {
        this.e = context;
        this.f = kVar;
        this.g = fVar;
        this.a = dVar;
        this.b = eVar;
        this.l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new b0(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new h(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new i(context));
        arrayList.add(new d(context));
        arrayList.add(new n(context));
        arrayList.add(new NetworkRequestHandler(kVar.d, d0Var));
        this.d = Collections.unmodifiableList(arrayList);
        this.h = d0Var;
        this.i = new WeakHashMap();
        this.j = new WeakHashMap();
        this.m = z;
        this.n = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.k = referenceQueue;
        c cVar = new c(referenceQueue, o);
        this.c = cVar;
        cVar.start();
    }

    private void f(Bitmap bitmap, LoadedFrom loadedFrom, c cVar, Exception exc) {
        if (!cVar.l) {
            if (!cVar.k) {
                this.i.remove(cVar.d());
            }
            if (bitmap == null) {
                cVar.c(exc);
                if (this.n) {
                    j0.h("Main", "errored", cVar.b.b(), exc.getMessage());
                }
            } else if (loadedFrom != null) {
                cVar.b(bitmap, loadedFrom);
                if (this.n) {
                    String b2 = cVar.b.b();
                    j0.h("Main", "completed", b2, "from " + loadedFrom);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    public static Picasso h() {
        if (p == null) {
            synchronized (Picasso.class) {
                if (p == null) {
                    Context context = PicassoProvider.a;
                    if (context != null) {
                        p = new b(context).b();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return p;
    }

    /* access modifiers changed from: package-private */
    public void a(Object obj) {
        j remove;
        j0.a();
        c remove2 = this.i.remove(obj);
        if (remove2 != null) {
            remove2.a();
            Handler handler = this.f.i;
            handler.sendMessage(handler.obtainMessage(2, remove2));
        }
        if ((obj instanceof ImageView) && (remove = this.j.remove((ImageView) obj)) != null) {
            remove.a();
        }
    }

    public void b(ImageView imageView) {
        if (imageView != null) {
            a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public void c(f0 f0Var) {
        if (f0Var != null) {
            a(f0Var);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    public void d(Object obj) {
        j0.a();
        ArrayList arrayList = new ArrayList(this.i.values());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = (c) arrayList.get(i2);
            if (obj.equals(cVar.j)) {
                a(cVar.d());
            }
        }
        ArrayList arrayList2 = new ArrayList(this.j.values());
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            j jVar = (j) arrayList2.get(i3);
            if (obj.equals(jVar.b())) {
                jVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(e eVar) {
        c cVar = eVar.t;
        List<c> list = eVar.u;
        boolean z = list != null && !list.isEmpty();
        if (cVar != null || z) {
            Uri uri = eVar.p.c;
            Exception exc = eVar.y;
            Bitmap bitmap = eVar.v;
            LoadedFrom loadedFrom = eVar.x;
            if (cVar != null) {
                f(bitmap, loadedFrom, cVar, exc);
            }
            if (z) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    f(bitmap, loadedFrom, list.get(i2), exc);
                }
            }
            d dVar = this.a;
            if (!(dVar == null || exc == null)) {
                wvd wvd = (wvd) dVar;
                Logger.e(exc, "Failed to load image with uri: \"%s\".", uri);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(c cVar) {
        Object d2 = cVar.d();
        if (!(d2 == null || this.i.get(d2) == cVar)) {
            a(d2);
            this.i.put(d2, cVar);
        }
        Handler handler = this.f.i;
        handler.sendMessage(handler.obtainMessage(1, cVar));
    }

    /* access modifiers changed from: package-private */
    public List<a0> i() {
        return this.d;
    }

    public void j(Uri uri) {
        if (uri != null) {
            this.g.c(uri.toString());
        }
    }

    public z k(int i2) {
        if (i2 != 0) {
            return new z(this, null, i2);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public z l(Uri uri) {
        return new z(this, uri, 0);
    }

    public z m(String str) {
        if (str == null) {
            return new z(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return l(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public void n(Object obj) {
        if (obj != null) {
            Handler handler = this.f.i;
            handler.sendMessage(handler.obtainMessage(11, obj));
            return;
        }
        throw new IllegalArgumentException("tag == null");
    }

    /* access modifiers changed from: package-private */
    public Bitmap o(String str) {
        Bitmap bitmap = this.g.get(str);
        if (bitmap != null) {
            this.h.c.sendEmptyMessage(0);
        } else {
            this.h.c.sendEmptyMessage(1);
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    public void p(c cVar) {
        Bitmap o2 = MemoryPolicy.d(cVar.e) ? o(cVar.i) : null;
        if (o2 != null) {
            LoadedFrom loadedFrom = LoadedFrom.MEMORY;
            f(o2, loadedFrom, cVar, null);
            if (this.n) {
                String b2 = cVar.b.b();
                j0.h("Main", "completed", b2, "from " + loadedFrom);
                return;
            }
            return;
        }
        g(cVar);
        if (this.n) {
            j0.h("Main", "resumed", cVar.b.b(), "");
        }
    }

    public void q(Object obj) {
        if (obj != null) {
            Handler handler = this.f.i;
            handler.sendMessage(handler.obtainMessage(12, obj));
            return;
        }
        throw new IllegalArgumentException("tag == null");
    }

    /* access modifiers changed from: package-private */
    public y r(y yVar) {
        ((e.a) this.b).getClass();
        return yVar;
    }
}
