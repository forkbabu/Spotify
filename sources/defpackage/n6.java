package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.v;
import defpackage.a7;
import defpackage.b7;
import defpackage.k6;
import defpackage.m6;
import defpackage.z6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: n6  reason: default package */
public final class n6 {
    static final boolean c = Log.isLoggable("MediaRouter", 3);
    static d d;
    final Context a;
    final ArrayList<b> b = new ArrayList<>();

    /* renamed from: n6$a */
    public static abstract class a {
        public void a(n6 n6Var, e eVar) {
        }

        public void b(n6 n6Var, e eVar) {
        }

        public void c(n6 n6Var, e eVar) {
        }

        public void d(n6 n6Var, f fVar) {
        }

        public void e(n6 n6Var, f fVar) {
        }

        public void f(n6 n6Var, f fVar) {
        }

        public void g(n6 n6Var, f fVar) {
        }

        public void h(n6 n6Var, f fVar) {
        }

        public void i(n6 n6Var, f fVar, int i) {
            h(n6Var, fVar);
        }

        public void j(n6 n6Var, f fVar) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n6$b */
    public static final class b {
        public final n6 a;
        public final a b;
        public m6 c = m6.c;
        public int d;

        public b(n6 n6Var, a aVar) {
            this.a = n6Var;
            this.b = aVar;
        }
    }

    /* renamed from: n6$c */
    public static abstract class c {
        public void a(String str, Bundle bundle) {
        }

        public void b(Bundle bundle) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n6$d */
    public static final class d implements b7.e, z6.c {
        final Context a;
        final ArrayList<WeakReference<n6>> b = new ArrayList<>();
        private final ArrayList<f> c = new ArrayList<>();
        private final Map<u3<String, String>, String> d = new HashMap();
        private final ArrayList<e> e = new ArrayList<>();
        private final ArrayList<f> f = new ArrayList<>();
        final a7.b g = new a7.b();
        private final e h = new e();
        final c i = new c();
        final b7 j;
        private final boolean k;
        private z6 l;
        private f m;
        private f n;
        f o;
        k6.e p;
        private final Map<String, k6.e> q = new HashMap();
        private j6 r;
        private C0642d s;
        MediaSessionCompat t;
        private MediaSessionCompat u;
        private MediaSessionCompat.h v = new a();
        k6.b.d w = new b();

        /* renamed from: n6$d$a */
        class a implements MediaSessionCompat.h {
            a() {
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.h
            public void a() {
                MediaSessionCompat mediaSessionCompat = d.this.t;
                if (mediaSessionCompat == null) {
                    return;
                }
                if (mediaSessionCompat.h()) {
                    d dVar = d.this;
                    dVar.b(dVar.t.e());
                    return;
                }
                d dVar2 = d.this;
                dVar2.q(dVar2.t.e());
            }
        }

        /* renamed from: n6$d$b */
        class b implements k6.b.d {
            b() {
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n6$d$c */
        public final class c extends Handler {
            private final ArrayList<b> a = new ArrayList<>();

            c() {
            }

            private void a(b bVar, int i, Object obj, int i2) {
                n6 n6Var = bVar.a;
                a aVar = bVar.b;
                int i3 = 65280 & i;
                if (i3 == 256) {
                    f fVar = (f) obj;
                    if ((bVar.d & 2) != 0 || fVar.z(bVar.c)) {
                        switch (i) {
                            case 257:
                                aVar.d(n6Var, fVar);
                                return;
                            case 258:
                                aVar.f(n6Var, fVar);
                                return;
                            case 259:
                                aVar.e(n6Var, fVar);
                                return;
                            case 260:
                                aVar.j(n6Var, fVar);
                                return;
                            case 261:
                                aVar.getClass();
                                return;
                            case 262:
                                aVar.g(n6Var, fVar);
                                return;
                            case 263:
                                aVar.i(n6Var, fVar, i2);
                                return;
                            default:
                                return;
                        }
                    }
                } else if (i3 == 512) {
                    e eVar = (e) obj;
                    switch (i) {
                        case 513:
                            aVar.a(n6Var, eVar);
                            return;
                        case 514:
                            aVar.c(n6Var, eVar);
                            return;
                        case 515:
                            aVar.b(n6Var, eVar);
                            return;
                        default:
                            return;
                    }
                }
            }

            public void b(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                if (i == 259 && d.this.k().c.equals(((f) obj).c)) {
                    d.this.B(true);
                }
                if (i != 262) {
                    switch (i) {
                        case 257:
                            d.this.j.z((f) obj);
                            break;
                        case 258:
                            d.this.j.B((f) obj);
                            break;
                        case 259:
                            d.this.j.A((f) obj);
                            break;
                    }
                } else {
                    d.this.j.C((f) obj);
                }
                try {
                    int size = d.this.b.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            n6 n6Var = d.this.b.get(size).get();
                            if (n6Var == null) {
                                d.this.b.remove(size);
                            } else {
                                this.a.addAll(n6Var.b);
                            }
                        } else {
                            int size2 = this.a.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                a(this.a.get(i3), i, obj, i2);
                            }
                            return;
                        }
                    }
                } finally {
                    this.a.clear();
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n6$d$d  reason: collision with other inner class name */
        public final class C0642d {
            private final MediaSessionCompat a;
            private v b;

            /* access modifiers changed from: package-private */
            /* renamed from: n6$d$d$a */
            public class a extends v {

                /* renamed from: n6$d$d$a$a  reason: collision with other inner class name */
                class RunnableC0643a implements Runnable {
                    final /* synthetic */ int a;

                    RunnableC0643a(int i) {
                        this.a = i;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        f fVar = d.this.o;
                        if (fVar != null) {
                            fVar.B(this.a);
                        }
                    }
                }

                /* renamed from: n6$d$d$a$b */
                class b implements Runnable {
                    final /* synthetic */ int a;

                    b(int i) {
                        this.a = i;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        f fVar = d.this.o;
                        if (fVar != null) {
                            fVar.C(this.a);
                        }
                    }
                }

                a(int i, int i2, int i3) {
                    super(i, i2, i3);
                }

                @Override // androidx.media.v
                public void e(int i) {
                    d.this.i.post(new b(i));
                }

                @Override // androidx.media.v
                public void f(int i) {
                    d.this.i.post(new RunnableC0643a(i));
                }
            }

            C0642d(MediaSessionCompat mediaSessionCompat) {
                this.a = mediaSessionCompat;
            }

            public void a() {
                MediaSessionCompat mediaSessionCompat = this.a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.q(d.this.g.d);
                    this.b = null;
                }
            }

            public void b(int i, int i2, int i3) {
                MediaSessionCompat mediaSessionCompat = this.a;
                if (mediaSessionCompat != null) {
                    v vVar = this.b;
                    if (vVar != null && i == 0 && i2 == 0) {
                        vVar.h(i3);
                        return;
                    }
                    a aVar = new a(i, i2, i3);
                    this.b = aVar;
                    mediaSessionCompat.r(aVar);
                }
            }

            public MediaSessionCompat.Token c() {
                MediaSessionCompat mediaSessionCompat = this.a;
                if (mediaSessionCompat != null) {
                    return mediaSessionCompat.f();
                }
                return null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n6$d$e */
        public final class e extends k6.a {
            e() {
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n6$d$f */
        public final class f implements a7.c {
            private final a7 a;
            private boolean b;

            public f(Object obj) {
                Context context = d.this.a;
                int i = Build.VERSION.SDK_INT;
                a7.a aVar = new a7.a(context, obj);
                this.a = aVar;
                aVar.b = this;
                aVar.a(d.this.g);
            }

            public void a() {
                this.b = true;
                this.a.b = null;
            }

            public Object b() {
                return this.a.a;
            }

            public void c(int i) {
                f fVar;
                if (!this.b && (fVar = d.this.o) != null) {
                    fVar.B(i);
                }
            }

            public void d(int i) {
                f fVar;
                if (!this.b && (fVar = d.this.o) != null) {
                    fVar.C(i);
                }
            }

            public void e() {
                this.a.a(d.this.g);
            }
        }

        d(Context context) {
            b7 b7Var;
            this.a = context;
            d3.a(context);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            int i2 = Build.VERSION.SDK_INT;
            this.k = i2 >= 19 ? activityManager.isLowRamDevice() : false;
            if (i2 >= 24) {
                b7Var = new b7.a(context, this);
            } else if (i2 >= 18) {
                b7Var = new b7.d(context, this);
            } else if (i2 >= 17) {
                b7Var = new b7.c(context, this);
            } else {
                b7Var = new b7.b(context, this);
            }
            this.j = b7Var;
        }

        private int A(f fVar, i6 i6Var) {
            int A = fVar.A(i6Var);
            if (A != 0) {
                if ((A & 1) != 0) {
                    if (n6.c) {
                        String str = "Route changed: " + fVar;
                    }
                    this.i.b(259, fVar);
                }
                if ((A & 2) != 0) {
                    if (n6.c) {
                        String str2 = "Route volume changed: " + fVar;
                    }
                    this.i.b(260, fVar);
                }
                if ((A & 4) != 0) {
                    if (n6.c) {
                        String str3 = "Route presentation display changed: " + fVar;
                    }
                    this.i.b(261, fVar);
                }
            }
            return A;
        }

        private e d(k6 k6Var) {
            int size = this.e.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.e.get(i2).a == k6Var) {
                    return this.e.get(i2);
                }
            }
            return null;
        }

        private int e(Object obj) {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f.get(i2).b() == obj) {
                    return i2;
                }
            }
            return -1;
        }

        private int f(String str) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.c.get(i2).c.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        private boolean n(f fVar) {
            return fVar.p() == this.j && fVar.E("android.media.intent.category.LIVE_AUDIO") && !fVar.E("android.media.intent.category.LIVE_VIDEO");
        }

        private void u(f fVar, int i2) {
            if (n6.d == null || (this.n != null && fVar.t())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (int i3 = 3; i3 < stackTrace.length; i3++) {
                    StackTraceElement stackTraceElement = stackTrace[i3];
                    sb.append(stackTraceElement.getClassName());
                    sb.append(".");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append("  ");
                }
                if (n6.d == null) {
                    this.a.getPackageName();
                    sb.toString();
                } else {
                    this.a.getPackageName();
                    sb.toString();
                }
            }
            f fVar2 = this.o;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    if (n6.c) {
                        StringBuilder V0 = je.V0("Route unselected: ");
                        V0.append(this.o);
                        V0.append(" reason: ");
                        V0.append(i2);
                        V0.toString();
                    }
                    Message obtainMessage = this.i.obtainMessage(263, this.o);
                    obtainMessage.arg1 = i2;
                    obtainMessage.sendToTarget();
                    k6.e eVar = this.p;
                    if (eVar != null) {
                        eVar.h(i2);
                        this.p.d();
                        this.p = null;
                    }
                    if (!this.q.isEmpty()) {
                        for (k6.e eVar2 : this.q.values()) {
                            eVar2.h(i2);
                            eVar2.d();
                        }
                        this.q.clear();
                    }
                }
                if (fVar.o().e()) {
                    k6.b s2 = fVar.p().s(fVar.b);
                    s2.o(androidx.core.content.a.e(this.a), this.w);
                    this.p = s2;
                    this.o = fVar;
                } else {
                    this.p = fVar.p().t(fVar.b);
                    this.o = fVar;
                }
                k6.e eVar3 = this.p;
                if (eVar3 != null) {
                    eVar3.e();
                }
                if (n6.c) {
                    StringBuilder V02 = je.V0("Route selected: ");
                    V02.append(this.o);
                    V02.toString();
                }
                this.i.b(262, this.o);
                if (this.o.w()) {
                    List<f> j2 = this.o.j();
                    this.q.clear();
                    for (f fVar3 : j2) {
                        k6.e u2 = fVar3.p().u(fVar3.b, this.o.b);
                        u2.e();
                        this.q.put(fVar3.c, u2);
                    }
                }
                x();
            }
        }

        private void x() {
            f fVar = this.o;
            if (fVar != null) {
                this.g.a = fVar.q();
                this.g.b = this.o.s();
                this.g.c = this.o.r();
                this.g.d = this.o.l();
                this.g.e = this.o.m();
                int size = this.f.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    this.f.get(i3).e();
                }
                if (this.s == null) {
                    return;
                }
                if (this.o == g() || this.o == this.n) {
                    this.s.a();
                    return;
                }
                a7.b bVar = this.g;
                if (bVar.c == 1) {
                    i2 = 2;
                }
                this.s.b(i2, bVar.b, bVar.a);
                return;
            }
            C0642d dVar = this.s;
            if (dVar != null) {
                dVar.a();
            }
        }

        private void y(e eVar, l6 l6Var) {
            int i2;
            boolean z;
            Iterator<i6> it;
            int i3;
            String format;
            if (eVar.f(l6Var)) {
                char c2 = 0;
                if (l6Var == null || (!l6Var.b() && l6Var != this.j.o())) {
                    String str = "Ignoring invalid provider descriptor: " + l6Var;
                    z = false;
                    i2 = 0;
                } else {
                    List<i6> list = l6Var.a;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<i6> it2 = list.iterator();
                    z = false;
                    i2 = 0;
                    while (it2.hasNext()) {
                        i6 next = it2.next();
                        if (next == null || !next.q()) {
                            it = it2;
                            String str2 = "Ignoring invalid system route descriptor: " + next;
                        } else {
                            String h2 = next.h();
                            int size = eVar.b.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size) {
                                    i4 = -1;
                                    break;
                                } else if (eVar.b.get(i4).b.equals(h2)) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            if (i4 < 0) {
                                String flattenToShortString = eVar.b().flattenToShortString();
                                String y0 = je.y0(flattenToShortString, ":", h2);
                                if (f(y0) < 0) {
                                    this.d.put(new u3<>(flattenToShortString, h2), y0);
                                    it = it2;
                                } else {
                                    int i5 = 2;
                                    while (true) {
                                        Locale locale = Locale.US;
                                        it = it2;
                                        Object[] objArr = new Object[2];
                                        objArr[c2] = y0;
                                        objArr[1] = Integer.valueOf(i5);
                                        format = String.format(locale, "%s_%d", objArr);
                                        if (f(format) < 0) {
                                            break;
                                        }
                                        i5++;
                                        c2 = 0;
                                        it2 = it;
                                    }
                                    this.d.put(new u3<>(flattenToShortString, h2), format);
                                    y0 = format;
                                }
                                f fVar = new f(eVar, h2, y0);
                                i3 = i2 + 1;
                                eVar.b.add(i2, fVar);
                                this.c.add(fVar);
                                if (next.f().size() > 0) {
                                    arrayList.add(new u3(fVar, next));
                                } else {
                                    fVar.A(next);
                                    if (n6.c) {
                                        String str3 = "Route added: " + fVar;
                                    }
                                    this.i.b(257, fVar);
                                }
                            } else {
                                it = it2;
                                if (i4 < i2) {
                                    String str4 = "Ignoring route descriptor with duplicate id: " + next;
                                } else {
                                    f fVar2 = eVar.b.get(i4);
                                    i3 = i2 + 1;
                                    Collections.swap(eVar.b, i4, i2);
                                    if (next.f().size() > 0) {
                                        arrayList2.add(new u3(fVar2, next));
                                    } else if (A(fVar2, next) != 0 && fVar2 == this.o) {
                                        i2 = i3;
                                        z = true;
                                    }
                                }
                            }
                            i2 = i3;
                        }
                        c2 = 0;
                        it2 = it;
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        u3 u3Var = (u3) it3.next();
                        F f2 = u3Var.a;
                        f2.A(u3Var.b);
                        if (n6.c) {
                            String str5 = "Route added: " + ((Object) f2);
                        }
                        this.i.b(257, f2);
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        u3 u3Var2 = (u3) it4.next();
                        F f3 = u3Var2.a;
                        if (A(f3, u3Var2.b) != 0 && f3 == this.o) {
                            z = true;
                        }
                    }
                }
                for (int size2 = eVar.b.size() - 1; size2 >= i2; size2--) {
                    f fVar3 = eVar.b.get(size2);
                    fVar3.A(null);
                    this.c.remove(fVar3);
                }
                B(z);
                for (int size3 = eVar.b.size() - 1; size3 >= i2; size3--) {
                    f remove = eVar.b.remove(size3);
                    if (n6.c) {
                        String str6 = "Route removed: " + remove;
                    }
                    this.i.b(258, remove);
                }
                if (n6.c) {
                    String str7 = "Provider changed: " + eVar;
                }
                this.i.b(515, eVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void B(boolean z) {
            f fVar = this.m;
            if (fVar != null && !fVar.x()) {
                StringBuilder V0 = je.V0("Clearing the default route because it is no longer selectable: ");
                V0.append(this.m);
                V0.toString();
                this.m = null;
            }
            if (this.m == null && !this.c.isEmpty()) {
                Iterator<f> it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    if ((next.p() == this.j && next.b.equals("DEFAULT_ROUTE")) && next.x()) {
                        this.m = next;
                        StringBuilder V02 = je.V0("Found default route: ");
                        V02.append(this.m);
                        V02.toString();
                        break;
                    }
                }
            }
            f fVar2 = this.n;
            if (fVar2 != null && !fVar2.x()) {
                StringBuilder V03 = je.V0("Clearing the bluetooth route because it is no longer selectable: ");
                V03.append(this.n);
                V03.toString();
                this.n = null;
            }
            if (this.n == null && !this.c.isEmpty()) {
                Iterator<f> it2 = this.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    f next2 = it2.next();
                    if (n(next2) && next2.x()) {
                        this.n = next2;
                        StringBuilder V04 = je.V0("Found bluetooth route: ");
                        V04.append(this.n);
                        V04.toString();
                        break;
                    }
                }
            }
            f fVar3 = this.o;
            if (fVar3 == null || !fVar3.g) {
                StringBuilder V05 = je.V0("Unselecting the current route because it is no longer selectable: ");
                V05.append(this.o);
                V05.toString();
                u(c(), 0);
            } else if (z) {
                if (fVar3.w()) {
                    List<f> j2 = this.o.j();
                    HashSet hashSet = new HashSet();
                    for (f fVar4 : j2) {
                        hashSet.add(fVar4.c);
                    }
                    Iterator<Map.Entry<String, k6.e>> it3 = this.q.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry<String, k6.e> next3 = it3.next();
                        if (!hashSet.contains(next3.getKey())) {
                            k6.e value = next3.getValue();
                            value.g();
                            value.d();
                            it3.remove();
                        }
                    }
                    for (f fVar5 : j2) {
                        if (!this.q.containsKey(fVar5.c)) {
                            k6.e u2 = fVar5.p().u(fVar5.b, this.o.b);
                            u2.e();
                            this.q.put(fVar5.c, u2);
                        }
                    }
                }
                x();
            }
        }

        public void a(k6 k6Var) {
            if (d(k6Var) == null) {
                e eVar = new e(k6Var);
                this.e.add(eVar);
                if (n6.c) {
                    String str = "Provider added: " + eVar;
                }
                this.i.b(513, eVar);
                y(eVar, k6Var.o());
                k6Var.w(this.h);
                k6Var.y(this.r);
            }
        }

        public void b(Object obj) {
            if (e(obj) < 0) {
                this.f.add(new f(obj));
            }
        }

        /* access modifiers changed from: package-private */
        public f c() {
            Iterator<f> it = this.c.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next != this.m && n(next) && next.x()) {
                    return next;
                }
            }
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public f g() {
            f fVar = this.m;
            if (fVar != null) {
                return fVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        public MediaSessionCompat.Token h() {
            C0642d dVar = this.s;
            if (dVar != null) {
                return dVar.c();
            }
            MediaSessionCompat mediaSessionCompat = this.u;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.f();
            }
            return null;
        }

        public f i(String str) {
            Iterator<f> it = this.c.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next.c.equals(str)) {
                    return next;
                }
            }
            return null;
        }

        public List<f> j() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public f k() {
            f fVar = this.o;
            if (fVar != null) {
                return fVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        /* access modifiers changed from: package-private */
        public String l(e eVar, String str) {
            return this.d.get(new u3(eVar.b().flattenToShortString(), str));
        }

        public boolean m(m6 m6Var, int i2) {
            if (m6Var.d()) {
                return false;
            }
            if ((i2 & 2) == 0 && this.k) {
                return true;
            }
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar = this.c.get(i3);
                if (((i2 & 1) == 0 || !fVar.u()) && fVar.z(m6Var)) {
                    return true;
                }
            }
            return false;
        }

        public void o(String str) {
            f a2;
            this.i.removeMessages(262);
            e d2 = d(this.j);
            if (d2 != null && (a2 = d2.a(str)) != null) {
                a2.D();
            }
        }

        public void p(k6 k6Var) {
            e d2 = d(k6Var);
            if (d2 != null) {
                k6Var.w(null);
                k6Var.y(null);
                y(d2, null);
                if (n6.c) {
                    String str = "Provider removed: " + d2;
                }
                this.i.b(514, d2);
                this.e.remove(d2);
            }
        }

        public void q(Object obj) {
            int e2 = e(obj);
            if (e2 >= 0) {
                this.f.remove(e2).a();
            }
        }

        public void r(f fVar, int i2) {
            k6.e eVar;
            k6.e eVar2;
            if (fVar == this.o && (eVar2 = this.p) != null) {
                eVar2.f(i2);
            } else if (!this.q.isEmpty() && (eVar = this.q.get(fVar.c)) != null) {
                eVar.f(i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void s(f fVar, int i2) {
            if (!this.c.contains(fVar)) {
                String str = "Ignoring attempt to select removed route: " + fVar;
            } else if (!fVar.g) {
                String str2 = "Ignoring attempt to select disabled route: " + fVar;
            } else {
                u(fVar, i2);
            }
        }

        public void t(MediaSessionCompat mediaSessionCompat) {
            this.u = mediaSessionCompat;
            if (Build.VERSION.SDK_INT >= 21) {
                C0642d dVar = mediaSessionCompat != null ? new C0642d(mediaSessionCompat) : null;
                C0642d dVar2 = this.s;
                if (dVar2 != null) {
                    dVar2.a();
                }
                this.s = dVar;
                if (dVar != null) {
                    x();
                    return;
                }
                return;
            }
            MediaSessionCompat mediaSessionCompat2 = this.t;
            if (mediaSessionCompat2 != null) {
                int e2 = e(mediaSessionCompat2.e());
                if (e2 >= 0) {
                    this.f.remove(e2).a();
                }
                this.t.j(this.v);
            }
            this.t = mediaSessionCompat;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.a(this.v);
                if (mediaSessionCompat.h()) {
                    Object e3 = mediaSessionCompat.e();
                    if (e(e3) < 0) {
                        this.f.add(new f(e3));
                    }
                }
            }
        }

        public void v() {
            a(this.j);
            z6 z6Var = new z6(this.a, this);
            this.l = z6Var;
            z6Var.b();
        }

        public void w() {
            m6.a aVar = new m6.a();
            int size = this.b.size();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                n6 n6Var = this.b.get(size).get();
                if (n6Var == null) {
                    this.b.remove(size);
                } else {
                    int size2 = n6Var.b.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        b bVar = n6Var.b.get(i2);
                        aVar.b(bVar.c);
                        int i3 = bVar.d;
                        if ((i3 & 1) != 0) {
                            z = true;
                            z2 = true;
                        }
                        if ((i3 & 4) != 0 && !this.k) {
                            z = true;
                        }
                        if ((i3 & 8) != 0) {
                            z = true;
                        }
                    }
                }
            }
            m6 c2 = z ? aVar.c() : m6.c;
            j6 j6Var = this.r;
            if (j6Var == null || !j6Var.c().equals(c2) || this.r.d() != z2) {
                if (!c2.d() || z2) {
                    this.r = new j6(c2, z2);
                } else if (this.r != null) {
                    this.r = null;
                } else {
                    return;
                }
                if (n6.c) {
                    StringBuilder V0 = je.V0("Updated discovery request: ");
                    V0.append(this.r);
                    V0.toString();
                }
                int size3 = this.e.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.e.get(i4).a.y(this.r);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void z(k6 k6Var, l6 l6Var) {
            e d2 = d(k6Var);
            if (d2 != null) {
                y(d2, l6Var);
            }
        }
    }

    /* renamed from: n6$e */
    public static final class e {
        final k6 a;
        final List<f> b = new ArrayList();
        private final k6.d c;
        private l6 d;

        e(k6 k6Var) {
            this.a = k6Var;
            this.c = k6Var.r();
        }

        /* access modifiers changed from: package-private */
        public f a(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (this.b.get(i).b.equals(str)) {
                    return this.b.get(i);
                }
            }
            return null;
        }

        public ComponentName b() {
            return this.c.a();
        }

        public String c() {
            return this.c.b();
        }

        public List<f> d() {
            n6.c();
            return Collections.unmodifiableList(this.b);
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            l6 l6Var = this.d;
            return l6Var != null && l6Var.b;
        }

        /* access modifiers changed from: package-private */
        public boolean f(l6 l6Var) {
            if (this.d == l6Var) {
                return false;
            }
            this.d = l6Var;
            return true;
        }

        public String toString() {
            StringBuilder V0 = je.V0("MediaRouter.RouteProviderInfo{ packageName=");
            V0.append(this.c.b());
            V0.append(" }");
            return V0.toString();
        }
    }

    /* renamed from: n6$f */
    public static class f {
        private final e a;
        final String b;
        final String c;
        private String d;
        private String e;
        private Uri f;
        boolean g;
        private int h;
        private boolean i;
        private final ArrayList<IntentFilter> j = new ArrayList<>();
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q = -1;
        private Bundle r;
        private IntentSender s;
        i6 t;
        k6.b.c u;
        private a v;
        private List<f> w = new ArrayList();

        /* renamed from: n6$f$a */
        public class a {
            public a() {
            }

            public int a() {
                k6.b.c cVar = f.this.u;
                if (cVar != null) {
                    return cVar.b;
                }
                return 1;
            }

            public boolean b() {
                k6.b.c cVar = f.this.u;
                return cVar != null && cVar.d;
            }

            public boolean c() {
                k6.b.c cVar = f.this.u;
                return cVar != null && cVar.e;
            }

            public boolean d() {
                k6.b.c cVar = f.this.u;
                return cVar == null || cVar.c;
            }
        }

        f(e eVar, String str, String str2) {
            this.a = eVar;
            this.b = str;
            this.c = str2;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
            if (r3.hasNext() != false) goto L_0x00f4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
            if (r4.hasNext() != false) goto L_0x00f4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x0207  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x020d  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x00f4 A[EDGE_INSN: B:106:0x00f4->B:55:0x00f4 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0110  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0130  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0140  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0150  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0160  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0170  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0184  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01e0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int A(defpackage.i6 r12) {
            /*
            // Method dump skipped, instructions count: 527
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.n6.f.A(i6):int");
        }

        public void B(int i2) {
            n6.c();
            n6.d.r(this, Math.min(this.p, Math.max(0, i2)));
        }

        public void C(int i2) {
            k6.e eVar;
            n6.c();
            if (i2 != 0) {
                d dVar = n6.d;
                if (this == dVar.o && (eVar = dVar.p) != null) {
                    eVar.i(i2);
                }
            }
        }

        public void D() {
            n6.c();
            n6.d.s(this, 3);
        }

        public boolean E(String str) {
            n6.c();
            int size = this.j.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.j.get(i2).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void F(Collection<k6.b.c> collection) {
            this.w.clear();
            for (k6.b.c cVar : collection) {
                f a2 = this.a.a(cVar.a.h());
                if (a2 != null) {
                    a2.u = cVar;
                    int i2 = cVar.b;
                    if (i2 == 2 || i2 == 3) {
                        this.w.add(a2);
                    }
                }
            }
            n6.d.i.b(259, this);
        }

        public boolean a() {
            return this.i;
        }

        public int b() {
            return this.h;
        }

        public String c() {
            return this.e;
        }

        public int d() {
            return this.m;
        }

        public k6.b e() {
            k6.e eVar = n6.d.p;
            if (eVar instanceof k6.b) {
                return (k6.b) eVar;
            }
            return null;
        }

        public a f() {
            if (this.v == null && this.u != null) {
                this.v = new a();
            }
            return this.v;
        }

        public Bundle g() {
            return this.r;
        }

        public Uri h() {
            return this.f;
        }

        public String i() {
            return this.c;
        }

        public List<f> j() {
            return Collections.unmodifiableList(this.w);
        }

        public String k() {
            return this.d;
        }

        public int l() {
            return this.l;
        }

        public int m() {
            return this.k;
        }

        public int n() {
            return this.q;
        }

        public e o() {
            return this.a;
        }

        public k6 p() {
            e eVar = this.a;
            eVar.getClass();
            n6.c();
            return eVar.a;
        }

        public int q() {
            return this.o;
        }

        public int r() {
            return this.n;
        }

        public int s() {
            return this.p;
        }

        public boolean t() {
            n6.c();
            return n6.d.g() == this;
        }

        public String toString() {
            if (w()) {
                StringBuilder sb = new StringBuilder(super.toString());
                sb.append('[');
                int size = this.w.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.w.get(i2));
                }
                sb.append(']');
                return sb.toString();
            }
            StringBuilder V0 = je.V0("MediaRouter.RouteInfo{ uniqueId=");
            V0.append(this.c);
            V0.append(", name=");
            V0.append(this.d);
            V0.append(", description=");
            V0.append(this.e);
            V0.append(", iconUri=");
            V0.append(this.f);
            V0.append(", enabled=");
            V0.append(this.g);
            V0.append(", connectionState=");
            V0.append(this.h);
            V0.append(", canDisconnect=");
            V0.append(this.i);
            V0.append(", playbackType=");
            V0.append(this.k);
            V0.append(", playbackStream=");
            V0.append(this.l);
            V0.append(", deviceType=");
            V0.append(this.m);
            V0.append(", volumeHandling=");
            V0.append(this.n);
            V0.append(", volume=");
            V0.append(this.o);
            V0.append(", volumeMax=");
            V0.append(this.p);
            V0.append(", presentationDisplayId=");
            V0.append(this.q);
            V0.append(", extras=");
            V0.append(this.r);
            V0.append(", settingsIntent=");
            V0.append(this.s);
            V0.append(", providerPackageName=");
            V0.append(this.a.c());
            V0.append(" }");
            return V0.toString();
        }

        public boolean u() {
            if (t() || this.m == 3) {
                return true;
            }
            if (!TextUtils.equals(p().r().b(), "android") || !E("android.media.intent.category.LIVE_AUDIO") || E("android.media.intent.category.LIVE_VIDEO")) {
                return false;
            }
            return true;
        }

        public boolean v() {
            return this.g;
        }

        public boolean w() {
            return j().size() >= 1;
        }

        /* access modifiers changed from: package-private */
        public boolean x() {
            return this.t != null && this.g;
        }

        public boolean y() {
            n6.c();
            return n6.d.k() == this;
        }

        public boolean z(m6 m6Var) {
            if (m6Var != null) {
                n6.c();
                ArrayList<IntentFilter> arrayList = this.j;
                if (arrayList == null) {
                    return false;
                }
                m6Var.b();
                int size = m6Var.b.size();
                if (size == 0) {
                    return false;
                }
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    IntentFilter intentFilter = arrayList.get(i2);
                    if (intentFilter != null) {
                        for (int i3 = 0; i3 < size; i3++) {
                            if (intentFilter.hasCategory(m6Var.b.get(i3))) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
    }

    n6(Context context) {
        this.a = context;
    }

    static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    private int d(a aVar) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (this.b.get(i).b == aVar) {
                return i;
            }
        }
        return -1;
    }

    public static n6 f(Context context) {
        if (context != null) {
            c();
            if (d == null) {
                d dVar = new d(context.getApplicationContext());
                d = dVar;
                dVar.v();
            }
            d dVar2 = d;
            int size = dVar2.b.size();
            while (true) {
                size--;
                if (size >= 0) {
                    n6 n6Var = dVar2.b.get(size).get();
                    if (n6Var == null) {
                        dVar2.b.remove(size);
                    } else if (n6Var.a == context) {
                        return n6Var;
                    }
                } else {
                    n6 n6Var2 = new n6(context);
                    dVar2.b.add(new WeakReference<>(n6Var2));
                    return n6Var2;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public void a(m6 m6Var, a aVar, int i) {
        b bVar;
        if (m6Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (aVar != null) {
            c();
            if (c) {
                String str = "addCallback: selector=" + m6Var + ", callback=" + aVar + ", flags=" + Integer.toHexString(i);
            }
            int d2 = d(aVar);
            if (d2 < 0) {
                bVar = new b(this, aVar);
                this.b.add(bVar);
            } else {
                bVar = this.b.get(d2);
            }
            boolean z = false;
            int i2 = bVar.d;
            boolean z2 = true;
            if (((i2 ^ -1) & i) != 0) {
                bVar.d = i2 | i;
                z = true;
            }
            m6 m6Var2 = bVar.c;
            m6Var2.getClass();
            m6Var2.b();
            m6Var.b();
            if (!m6Var2.b.containsAll(m6Var.b)) {
                m6.a aVar2 = new m6.a(bVar.c);
                aVar2.b(m6Var);
                bVar.c = aVar2.c();
            } else {
                z2 = z;
            }
            if (z2) {
                d.w();
            }
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    public void b(f fVar) {
        c();
        d dVar = d;
        if (dVar.o.f() == null || !(dVar.p instanceof k6.b)) {
            throw new IllegalStateException("There is no currently selected dynamic group route.");
        }
        f.a f2 = fVar.f();
        if (dVar.o.j().contains(fVar) || f2 == null || !f2.b()) {
            String str = "Ignoring attemp to add a non-groupable route to dynamic group : " + fVar;
            return;
        }
        ((k6.b) dVar.p).m(fVar.b);
    }

    public f e() {
        c();
        return d.g();
    }

    public MediaSessionCompat.Token g() {
        return d.h();
    }

    public List<f> h() {
        c();
        return d.j();
    }

    public f i() {
        c();
        return d.k();
    }

    public boolean j(m6 m6Var, int i) {
        if (m6Var != null) {
            c();
            return d.m(m6Var, i);
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public void k(a aVar) {
        if (aVar != null) {
            c();
            if (c) {
                String str = "removeCallback: callback=" + aVar;
            }
            int d2 = d(aVar);
            if (d2 >= 0) {
                this.b.remove(d2);
                d.w();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void l(f fVar) {
        c();
        d dVar = d;
        if (dVar.o.f() == null || !(dVar.p instanceof k6.b)) {
            throw new IllegalStateException("There is no currently selected dynamic group route.");
        }
        f.a f2 = fVar.f();
        if (dVar.o.j().contains(fVar) && f2 != null) {
            k6.b.c cVar = f.this.u;
            if (cVar == null || cVar.c) {
                if (dVar.o.j().size() > 1) {
                    ((k6.b) dVar.p).n(fVar.b);
                    return;
                }
                return;
            }
        }
        String str = "Ignoring attempt to remove a non-unselectable member route : " + fVar;
    }

    public void m(f fVar) {
        if (fVar != null) {
            c();
            if (c) {
                String str = "selectRoute: " + fVar;
            }
            d.s(fVar, 3);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }

    public void n(MediaSessionCompat mediaSessionCompat) {
        if (c) {
            String str = "addMediaSessionCompat: " + mediaSessionCompat;
        }
        d.t(mediaSessionCompat);
    }

    public void o(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        c();
        f c2 = d.c();
        if (d.k() != c2) {
            d.s(c2, i);
            return;
        }
        d dVar = d;
        dVar.s(dVar.g(), i);
    }
}
