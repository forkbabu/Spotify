package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.k6;
import defpackage.n6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: y6  reason: default package */
public final class y6 extends k6 implements ServiceConnection {
    static final boolean y = Log.isLoggable("MediaRouteProviderProxy", 3);
    private final ComponentName r;
    final c s;
    private final ArrayList<b> t = new ArrayList<>();
    private boolean u;
    private boolean v;
    private a w;
    private boolean x;

    /* access modifiers changed from: private */
    /* renamed from: y6$a */
    public final class a implements IBinder.DeathRecipient {
        private final Messenger a;
        private final d b;
        private final Messenger c;
        private int f = 1;
        private int n = 1;
        private int o;
        private int p;
        private final SparseArray<n6.c> q = new SparseArray<>();

        /* access modifiers changed from: package-private */
        /* renamed from: y6$a$a  reason: collision with other inner class name */
        public class RunnableC0702a implements Runnable {
            RunnableC0702a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.e();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y6$a$b */
        public class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                y6.this.E(aVar);
            }
        }

        public a(Messenger messenger) {
            this.a = messenger;
            d dVar = new d(this);
            this.b = dVar;
            this.c = new Messenger(dVar);
        }

        private boolean q(int i, int i2, int i3, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.c;
            try {
                this.a.send(obtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e) {
                if (i == 2) {
                    return false;
                }
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
                return false;
            }
        }

        public void a(int i, String str) {
            Bundle E = je.E("memberRouteId", str);
            int i2 = this.f;
            this.f = i2 + 1;
            q(12, i2, i, null, E);
        }

        public int b(String str, n6.c cVar) {
            int i = this.n;
            this.n = i + 1;
            int i2 = this.f;
            this.f = i2 + 1;
            q(11, i2, i, null, je.E("memberRouteId", str));
            this.q.put(i2, cVar);
            return i;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            y6.this.s.post(new b());
        }

        public int c(String str, String str2) {
            int i = this.n;
            this.n = i + 1;
            Bundle F = je.F("routeId", str, "routeGroupId", str2);
            int i2 = this.f;
            this.f = i2 + 1;
            q(3, i2, i, null, F);
            return i;
        }

        public void d() {
            q(2, 0, 0, null, null);
            this.b.a();
            this.a.getBinder().unlinkToDeath(this, 0);
            y6.this.s.post(new RunnableC0702a());
        }

        /* access modifiers changed from: package-private */
        public void e() {
            int size = this.q.size();
            for (int i = 0; i < size; i++) {
                this.q.valueAt(i).a(null, null);
            }
            this.q.clear();
        }

        public boolean f(int i, String str, Bundle bundle) {
            n6.c cVar = this.q.get(i);
            if (cVar == null) {
                return false;
            }
            this.q.remove(i);
            cVar.a(str, bundle);
            return true;
        }

        public boolean g(int i, Bundle bundle) {
            n6.c cVar = this.q.get(i);
            if (cVar == null) {
                return false;
            }
            this.q.remove(i);
            cVar.b(bundle);
            return true;
        }

        public boolean h(Bundle bundle) {
            if (this.o == 0) {
                return false;
            }
            y6.this.D(this, l6.a(bundle));
            return true;
        }

        public void i(int i, Bundle bundle) {
            n6.c cVar = this.q.get(i);
            if (bundle == null || !bundle.containsKey("routeId")) {
                cVar.a("DynamicGroupRouteController is created without valid route id.", bundle);
                return;
            }
            this.q.remove(i);
            cVar.b(bundle);
        }

        public boolean j(int i, Bundle bundle) {
            if (this.o == 0) {
                return false;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("dynamicRoutes");
            ArrayList arrayList = new ArrayList();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Bundle bundle2 = (Bundle) it.next();
                k6.b.c cVar = null;
                i6 i6Var = null;
                if (bundle2 != null) {
                    Bundle bundle3 = bundle2.getBundle("mrDescriptor");
                    if (bundle3 != null) {
                        i6Var = new i6(bundle3);
                    }
                    cVar = new k6.b.c(i6Var, bundle2.getInt("selectionState", 1), bundle2.getBoolean("isUnselectable", false), bundle2.getBoolean("isGroupable", false), bundle2.getBoolean("isTransferable", false));
                }
                arrayList.add(cVar);
            }
            y6.this.I(this, i, arrayList);
            return true;
        }

        public boolean k(int i) {
            if (i == this.p) {
                this.p = 0;
                y6.this.F(this, "Registration failed");
            }
            n6.c cVar = this.q.get(i);
            if (cVar == null) {
                return true;
            }
            this.q.remove(i);
            cVar.a(null, null);
            return true;
        }

        public boolean l(int i, int i2, Bundle bundle) {
            if (this.o != 0 || i != this.p || i2 < 1) {
                return false;
            }
            this.p = 0;
            this.o = i2;
            y6.this.D(this, l6.a(bundle));
            y6.this.G(this);
            return true;
        }

        public boolean m() {
            int i = this.f;
            this.f = i + 1;
            this.p = i;
            if (!q(1, i, 3, null, null)) {
                return false;
            }
            try {
                this.a.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public void n(int i) {
            int i2 = this.f;
            this.f = i2 + 1;
            q(4, i2, i, null, null);
        }

        public void o(int i, String str) {
            Bundle E = je.E("memberRouteId", str);
            int i2 = this.f;
            this.f = i2 + 1;
            q(13, i2, i, null, E);
        }

        public void p(int i) {
            int i2 = this.f;
            this.f = i2 + 1;
            q(5, i2, i, null, null);
        }

        public void r(j6 j6Var) {
            int i = this.f;
            this.f = i + 1;
            q(10, i, 0, j6Var != null ? j6Var.a() : null, null);
        }

        public void s(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.f;
            this.f = i3 + 1;
            q(7, i3, i, null, bundle);
        }

        public void t(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i2);
            int i3 = this.f;
            this.f = i3 + 1;
            q(6, i3, i, null, bundle);
        }

        public void u(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.f;
            this.f = i3 + 1;
            q(8, i3, i, null, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y6$b */
    public interface b {
        int a();

        void b();

        void c(a aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y6$c */
    public static final class c extends Handler {
        c() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y6$d */
    public static final class d extends Handler {
        private final WeakReference<a> a;

        public d(a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        public void a() {
            this.a.clear();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            a aVar = this.a.get();
            if (aVar != null) {
                int i = message.what;
                int i2 = message.arg1;
                int i3 = message.arg2;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                boolean z = true;
                switch (i) {
                    case 0:
                        aVar.k(i2);
                        break;
                    case 1:
                        break;
                    case 2:
                        if (obj == null || (obj instanceof Bundle)) {
                            z = aVar.l(i2, i3, (Bundle) obj);
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (obj == null || (obj instanceof Bundle)) {
                            z = aVar.g(i2, (Bundle) obj);
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (obj == null || (obj instanceof Bundle)) {
                            if (peekData == null) {
                                str = null;
                            } else {
                                str = peekData.getString(AppProtocol.LogMessage.SEVERITY_ERROR);
                            }
                            z = aVar.f(i2, str, (Bundle) obj);
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (obj == null || (obj instanceof Bundle)) {
                            z = aVar.h((Bundle) obj);
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (obj instanceof Bundle) {
                            aVar.i(i2, (Bundle) obj);
                        }
                        z = false;
                        break;
                    case 7:
                        if (obj == null || (obj instanceof Bundle)) {
                            z = aVar.j(i3, (Bundle) obj);
                            break;
                        }
                        z = false;
                        break;
                    default:
                        z = false;
                        break;
                }
                if (!z && y6.y) {
                    String str2 = "Unhandled message from server: " + message;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y6$e */
    public final class e extends k6.b implements b {
        private final String e;
        String f;
        String g;
        private boolean h;
        private int i = -1;
        private int j;
        private a k;
        private int l = -1;

        /* access modifiers changed from: package-private */
        /* renamed from: y6$e$a */
        public class a extends n6.c {
            a() {
            }

            @Override // defpackage.n6.c
            public void a(String str, Bundle bundle) {
                String str2 = "Error: " + str + ", data: " + bundle;
            }

            @Override // defpackage.n6.c
            public void b(Bundle bundle) {
                e.this.f = bundle.getString("groupableTitle");
                e.this.g = bundle.getString("transferableTitle");
            }
        }

        e(String str) {
            this.e = str;
        }

        @Override // defpackage.y6.b
        public int a() {
            return this.l;
        }

        @Override // defpackage.y6.b
        public void b() {
            a aVar = this.k;
            if (aVar != null) {
                aVar.n(this.l);
                this.k = null;
                this.l = 0;
            }
        }

        @Override // defpackage.y6.b
        public void c(a aVar) {
            a aVar2 = new a();
            this.k = aVar;
            int b = aVar.b(this.e, aVar2);
            this.l = b;
            if (this.h) {
                aVar.p(b);
                int i2 = this.i;
                if (i2 >= 0) {
                    aVar.s(this.l, i2);
                    this.i = -1;
                }
                int i3 = this.j;
                if (i3 != 0) {
                    aVar.u(this.l, i3);
                    this.j = 0;
                }
            }
        }

        @Override // defpackage.k6.e
        public void d() {
            y6.this.H(this);
        }

        @Override // defpackage.k6.e
        public void e() {
            this.h = true;
            a aVar = this.k;
            if (aVar != null) {
                aVar.p(this.l);
            }
        }

        @Override // defpackage.k6.e
        public void f(int i2) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.s(this.l, i2);
                return;
            }
            this.i = i2;
            this.j = 0;
        }

        @Override // defpackage.k6.e
        public void g() {
            h(0);
        }

        @Override // defpackage.k6.e
        public void h(int i2) {
            this.h = false;
            a aVar = this.k;
            if (aVar != null) {
                aVar.t(this.l, i2);
            }
        }

        @Override // defpackage.k6.e
        public void i(int i2) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.u(this.l, i2);
            } else {
                this.j += i2;
            }
        }

        @Override // defpackage.k6.b
        public String j() {
            return this.f;
        }

        @Override // defpackage.k6.b
        public String k() {
            return this.g;
        }

        @Override // defpackage.k6.b
        public void m(String str) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.a(this.l, str);
            }
        }

        @Override // defpackage.k6.b
        public void n(String str) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.o(this.l, str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y6$f */
    public final class f extends k6.e implements b {
        private final String a;
        private final String b;
        private boolean c;
        private int d = -1;
        private int e;
        private a f;
        private int g;

        f(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.y6.b
        public int a() {
            return this.g;
        }

        @Override // defpackage.y6.b
        public void b() {
            a aVar = this.f;
            if (aVar != null) {
                aVar.n(this.g);
                this.f = null;
                this.g = 0;
            }
        }

        @Override // defpackage.y6.b
        public void c(a aVar) {
            this.f = aVar;
            int c2 = aVar.c(this.a, this.b);
            this.g = c2;
            if (this.c) {
                aVar.p(c2);
                int i = this.d;
                if (i >= 0) {
                    aVar.s(this.g, i);
                    this.d = -1;
                }
                int i2 = this.e;
                if (i2 != 0) {
                    aVar.u(this.g, i2);
                    this.e = 0;
                }
            }
        }

        @Override // defpackage.k6.e
        public void d() {
            y6.this.H(this);
        }

        @Override // defpackage.k6.e
        public void e() {
            this.c = true;
            a aVar = this.f;
            if (aVar != null) {
                aVar.p(this.g);
            }
        }

        @Override // defpackage.k6.e
        public void f(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.s(this.g, i);
                return;
            }
            this.d = i;
            this.e = 0;
        }

        @Override // defpackage.k6.e
        public void g() {
            h(0);
        }

        @Override // defpackage.k6.e
        public void h(int i) {
            this.c = false;
            a aVar = this.f;
            if (aVar != null) {
                aVar.t(this.g, i);
            }
        }

        @Override // defpackage.k6.e
        public void i(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.u(this.g, i);
            } else {
                this.e += i;
            }
        }
    }

    public y6(Context context, ComponentName componentName) {
        super(context, new k6.d(componentName));
        this.r = componentName;
        this.s = new c();
    }

    private k6.e A(String str, String str2) {
        l6 o = o();
        if (o == null) {
            return null;
        }
        List<i6> list = o.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).h().equals(str)) {
                f fVar = new f(str, str2);
                this.t.add(fVar);
                if (this.x) {
                    fVar.c(this.w);
                }
                O();
                return fVar;
            }
        }
        return null;
    }

    private void B() {
        if (this.w != null) {
            x(null);
            this.x = false;
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                this.t.get(i).b();
            }
            this.w.d();
            this.w = null;
        }
    }

    private boolean K() {
        if (!this.u) {
            return false;
        }
        if (p() == null && this.t.isEmpty()) {
            return false;
        }
        return true;
    }

    private void N() {
        if (this.v) {
            if (y) {
                String str = this + ": Unbinding";
            }
            this.v = false;
            B();
            try {
                n().unbindService(this);
            } catch (IllegalArgumentException e2) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e2);
            }
        }
    }

    private void O() {
        if (K()) {
            z();
        } else {
            N();
        }
    }

    private void z() {
        if (!this.v) {
            boolean z = y;
            if (z) {
                String str = this + ": Binding";
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.r);
            try {
                boolean bindService = n().bindService(intent, this, 1);
                this.v = bindService;
                if (!bindService && z) {
                    String str2 = this + ": Bind failed";
                }
            } catch (SecurityException unused) {
                if (y) {
                    String str3 = this + ": Bind failed";
                }
            }
        }
    }

    public boolean C(String str, String str2) {
        return this.r.getPackageName().equals(str) && this.r.getClassName().equals(str2);
    }

    /* access modifiers changed from: package-private */
    public void D(a aVar, l6 l6Var) {
        if (this.w == aVar) {
            if (y) {
                String str = this + ": Descriptor changed, descriptor=" + l6Var;
            }
            x(l6Var);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(a aVar) {
        if (this.w == aVar) {
            if (y) {
                String str = this + ": Service connection died";
            }
            B();
        }
    }

    /* access modifiers changed from: package-private */
    public void F(a aVar, String str) {
        if (this.w == aVar) {
            if (y) {
                String str2 = this + ": Service connection error - " + str;
            }
            N();
        }
    }

    /* access modifiers changed from: package-private */
    public void G(a aVar) {
        if (this.w == aVar) {
            this.x = true;
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                this.t.get(i).c(this.w);
            }
            j6 p = p();
            if (p != null) {
                this.w.r(p);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H(b bVar) {
        this.t.remove(bVar);
        bVar.b();
        O();
    }

    /* access modifiers changed from: package-private */
    public void I(a aVar, int i, List<k6.b.c> list) {
        b bVar;
        if (this.w == aVar) {
            if (y) {
                String str = this + ": DynamicRouteDescriptors changed, descriptors=" + list;
            }
            Iterator<b> it = this.t.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it.next();
                if (bVar.a() == i) {
                    break;
                }
            }
            if (bVar instanceof e) {
                ((e) bVar).l(list);
            }
        }
    }

    public void J() {
        if (this.w == null && K()) {
            N();
            z();
        }
    }

    public void L() {
        if (!this.u) {
            if (y) {
                String str = this + ": Starting";
            }
            this.u = true;
            O();
        }
    }

    public void M() {
        if (this.u) {
            if (y) {
                String str = this + ": Stopping";
            }
            this.u = false;
            O();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (y) {
            String str = this + ": Connected";
        }
        if (this.v) {
            B();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            boolean z = false;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        z = true;
                    }
                } catch (NullPointerException unused) {
                }
            }
            if (z) {
                a aVar = new a(messenger);
                if (aVar.m()) {
                    this.w = aVar;
                } else if (y) {
                    String str2 = this + ": Registration failed";
                }
            } else {
                Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (y) {
            String str = this + ": Service disconnected";
        }
        B();
    }

    @Override // defpackage.k6
    public k6.b s(String str) {
        if (str != null) {
            l6 o = o();
            if (o != null) {
                List<i6> list = o.a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (list.get(i).h().equals(str)) {
                        e eVar = new e(str);
                        this.t.add(eVar);
                        if (this.x) {
                            eVar.c(this.w);
                        }
                        O();
                        return eVar;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override // defpackage.k6
    public k6.e t(String str) {
        if (str != null) {
            return A(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Service connection ");
        V0.append(this.r.flattenToShortString());
        return V0.toString();
    }

    @Override // defpackage.k6
    public k6.e u(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return A(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    @Override // defpackage.k6
    public void v(j6 j6Var) {
        if (this.x) {
            this.w.r(j6Var);
        }
        O();
    }
}
