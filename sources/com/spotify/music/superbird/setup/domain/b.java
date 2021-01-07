package com.spotify.music.superbird.setup.domain;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import com.spotify.mobius.rx2.m;
import com.spotify.music.superbird.setup.domain.d;
import com.spotify.music.superbird.setup.domain.q;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class b implements e {
    private final io.reactivex.subjects.c<SetupSubscriptionEvent> a;
    private final ekd b;
    private final vne c;

    /* compiled from: java-style lambda group */
    static final class a implements io.reactivex.functions.a {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            switch (this.a) {
                case 0:
                    ((b) this.b).c.a();
                    return;
                case 1:
                    String h = ((b) this.b).b.h();
                    if (h != null) {
                        ((b) this.b).b.i(h);
                        return;
                    }
                    return;
                case 2:
                    ((da2) this.b).accept(q.h.a);
                    return;
                case 3:
                    ((da2) this.b).accept(q.a.a);
                    return;
                case 4:
                    ((da2) this.b).accept(q.b.a);
                    return;
                case 5:
                    ((da2) this.b).accept(q.f.a);
                    return;
                case 6:
                    ((da2) this.b).accept(q.d.a);
                    return;
                default:
                    throw null;
            }
        }
    }

    /* renamed from: com.spotify.music.superbird.setup.domain.b$b  reason: collision with other inner class name */
    static final class C0348b<Upstream, Downstream> implements w<d.o, f> {
        final /* synthetic */ b a;
        final /* synthetic */ da2 b;

        /* renamed from: com.spotify.music.superbird.setup.domain.b$b$a */
        static final class a<T, R> implements l<d.o, io.reactivex.e> {
            final /* synthetic */ C0348b a;

            a(C0348b bVar) {
                this.a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public io.reactivex.e apply(d.o oVar) {
                d.o oVar2 = oVar;
                kotlin.jvm.internal.h.e(oVar2, "effect");
                return io.reactivex.a.u(new a(0, this, oVar2)).o(1, TimeUnit.SECONDS).d(io.reactivex.a.u(new a(1, this, oVar2)));
            }
        }

        C0348b(b bVar, da2 da2) {
            this.a = bVar;
            this.b = da2;
        }

        @Override // io.reactivex.w
        public final v<f> apply(s<d.o> sVar) {
            kotlin.jvm.internal.h.e(sVar, "upstream");
            return sVar.Y(new a(this)).N();
        }
    }

    static final class c implements io.reactivex.functions.a {
        final /* synthetic */ b a;
        final /* synthetic */ da2 b;

        c(b bVar, da2 da2) {
            this.a = bVar;
            this.b = da2;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            BluetoothDevice a2 = b.a(this.a);
            if (a2 != null) {
                this.b.accept(new q.g(a2));
            }
        }
    }

    static final class d<T> implements io.reactivex.functions.g<d.c> {
        final /* synthetic */ b a;

        d(b bVar) {
            this.a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(d.c cVar) {
            d.c cVar2 = cVar;
            String h = this.a.b.h();
            if (h != null) {
                vne vne = this.a.c;
                List<com.spotify.superbird.ota.model.g> singletonList = Collections.singletonList(cVar2.a());
                vne.getClass();
                for (com.spotify.superbird.ota.model.g gVar : singletonList) {
                    vne.b(h, gVar);
                }
            }
        }
    }

    static final class e<T> implements io.reactivex.functions.g<d.C0349d> {
        final /* synthetic */ b a;

        e(b bVar) {
            this.a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(d.C0349d dVar) {
            d.C0349d dVar2 = dVar;
            String h = this.a.b.h();
            if (h != null) {
                this.a.c.p(h, Collections.singletonList(dVar2.a()));
            }
        }
    }

    static final class f implements io.reactivex.functions.a {
        public static final f a = new f();

        f() {
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            kotlin.jvm.internal.h.d(defaultAdapter, "BluetoothAdapter.getDefaultAdapter()");
            if (defaultAdapter.isDiscovering()) {
                BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
            }
        }
    }

    static final class g<T> implements io.reactivex.functions.g<d.e> {
        final /* synthetic */ b a;

        g(b bVar) {
            this.a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: io.reactivex.subjects.c */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(d.e eVar) {
            this.a.a.onNext(eVar.a());
        }
    }

    static final class h<T> implements io.reactivex.functions.g<d.j> {
        final /* synthetic */ da2 a;

        h(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(d.j jVar) {
            this.a.accept(new q.e(jVar.a()));
        }
    }

    static final class i<T> implements io.reactivex.functions.g<d.f> {
        final /* synthetic */ b a;
        final /* synthetic */ da2 b;

        i(b bVar, da2 da2) {
            this.a = bVar;
            this.b = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(d.f fVar) {
            b.e(this.a, fVar.a(), this.b);
        }
    }

    public b(io.reactivex.subjects.c<SetupSubscriptionEvent> cVar, ekd ekd, vne vne) {
        kotlin.jvm.internal.h.e(cVar, "subscriptionEventSubject");
        kotlin.jvm.internal.h.e(ekd, "superbirdSharedPrefs");
        kotlin.jvm.internal.h.e(vne, "superbirdOtaDownloadManager");
        this.a = cVar;
        this.b = ekd;
        this.c = vne;
    }

    public static final BluetoothDevice a(b bVar) {
        T t;
        bVar.getClass();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        kotlin.jvm.internal.h.d(defaultAdapter, "BluetoothAdapter.getDefaultAdapter()");
        Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
        kotlin.jvm.internal.h.d(bondedDevices, "BluetoothAdapter.getDefaultAdapter().bondedDevices");
        Iterator<T> it = bondedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            kotlin.jvm.internal.h.d(t2, "it");
            if (kotlin.jvm.internal.h.a(t2.getAddress(), bVar.b.e())) {
                break;
            }
        }
        return t;
    }

    public static final void e(b bVar, BluetoothDevice bluetoothDevice, da2 da2) {
        bVar.getClass();
        if (Build.VERSION.SDK_INT < 19 || !bluetoothDevice.createBond()) {
            da2.accept(q.d.a);
        } else {
            da2.accept(q.c.a);
        }
    }

    public w<d, f> f(da2<q> da2) {
        kotlin.jvm.internal.h.e(da2, "consumer");
        m f2 = com.spotify.mobius.rx2.i.f();
        f2.b(d.m.class, new a(2, da2));
        f2.b(d.n.class, f.a);
        f2.b(d.b.class, new a(3, da2));
        f2.b(d.g.class, new a(4, da2));
        f2.d(d.e.class, new g(this));
        f2.b(d.k.class, new a(5, da2));
        f2.b(d.i.class, new a(6, da2));
        f2.d(d.j.class, new h(da2));
        f2.d(d.f.class, new i(this, da2));
        f2.h(d.o.class, new C0348b(this, da2));
        f2.b(d.l.class, new c(this, da2));
        f2.d(d.c.class, new d(this));
        f2.d(d.C0349d.class, new e(this));
        f2.b(d.a.class, new a(0, this));
        f2.b(d.h.class, new a(1, this));
        w<d, f> i2 = f2.i();
        kotlin.jvm.internal.h.c(i2);
        return i2;
    }
}
