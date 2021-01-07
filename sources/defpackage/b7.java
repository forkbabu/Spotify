package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.view.Display;
import com.spotify.music.C0707R;
import defpackage.i6;
import defpackage.k6;
import defpackage.l6;
import defpackage.n6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: b7  reason: default package */
public abstract class b7 extends k6 {

    /* access modifiers changed from: private */
    /* renamed from: b7$a */
    public static class a extends d {
        public a(Context context, e eVar) {
            super(context, eVar);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b7.d, defpackage.b7.c, defpackage.b7.b
        public void L(b.C0058b bVar, i6.a aVar) {
            super.L(bVar, aVar);
            aVar.e(((MediaRouter.RouteInfo) bVar.a).getDeviceType());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b7$b */
    public static class b extends b7 implements o6, s6 {
        private static final ArrayList<IntentFilter> D;
        private static final ArrayList<IntentFilter> E;
        protected final ArrayList<c> A = new ArrayList<>();
        private r6 B;
        private q6 C;
        private final e r;
        protected final Object s;
        protected final Object t;
        protected final Object u;
        protected final Object v;
        protected int w;
        protected boolean x;
        protected boolean y;
        protected final ArrayList<C0058b> z = new ArrayList<>();

        /* renamed from: b7$b$a */
        protected static final class a extends k6.e {
            private final Object a;

            public a(Object obj) {
                this.a = obj;
            }

            @Override // defpackage.k6.e
            public void f(int i) {
                ((MediaRouter.RouteInfo) this.a).requestSetVolume(i);
            }

            @Override // defpackage.k6.e
            public void i(int i) {
                ((MediaRouter.RouteInfo) this.a).requestUpdateVolume(i);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b7$b$b  reason: collision with other inner class name */
        public static final class C0058b {
            public final Object a;
            public final String b;
            public i6 c;

            public C0058b(Object obj, String str) {
                this.a = obj;
                this.b = str;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b7$b$c */
        public static final class c {
            public final n6.f a;
            public final Object b;

            public c(n6.f fVar, Object obj) {
                this.a = fVar;
                this.b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            D = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            E = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, e eVar) {
            super(context);
            this.r = eVar;
            Object systemService = context.getSystemService("media_router");
            this.s = systemService;
            this.t = E();
            this.u = new t6(this);
            this.v = ((MediaRouter) systemService).createRouteCategory((CharSequence) context.getResources().getString(C0707R.string.mr_user_route_category_name), false);
            Q();
        }

        private boolean D(Object obj) {
            String str;
            String format;
            if (K(obj) != null || F(obj) >= 0) {
                return false;
            }
            if (I() == obj) {
                str = "DEFAULT_ROUTE";
            } else {
                str = String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(J(obj).hashCode()));
            }
            if (G(str) >= 0) {
                int i = 2;
                while (true) {
                    format = String.format(Locale.US, "%s_%d", str, Integer.valueOf(i));
                    if (G(format) < 0) {
                        break;
                    }
                    i++;
                }
                str = format;
            }
            C0058b bVar = new C0058b(obj, str);
            P(bVar);
            this.z.add(bVar);
            return true;
        }

        private void Q() {
            O();
            MediaRouter mediaRouter = (MediaRouter) this.s;
            int routeCount = mediaRouter.getRouteCount();
            ArrayList arrayList = new ArrayList(routeCount);
            boolean z2 = false;
            for (int i = 0; i < routeCount; i++) {
                arrayList.add(mediaRouter.getRouteAt(i));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z2 |= D(it.next());
            }
            if (z2) {
                M();
            }
        }

        @Override // defpackage.b7
        public void A(n6.f fVar) {
            int H;
            if (fVar.p() != this && (H = H(fVar)) >= 0) {
                R(this.A.get(H));
            }
        }

        @Override // defpackage.b7
        public void B(n6.f fVar) {
            int H;
            if (fVar.p() != this && (H = H(fVar)) >= 0) {
                c remove = this.A.remove(H);
                ((MediaRouter.RouteInfo) remove.b).setTag(null);
                g6.a(remove.b, null);
                ((MediaRouter) this.s).removeUserRoute((MediaRouter.UserRouteInfo) remove.b);
            }
        }

        @Override // defpackage.b7
        public void C(n6.f fVar) {
            if (fVar.y()) {
                if (fVar.p() != this) {
                    int H = H(fVar);
                    if (H >= 0) {
                        N(this.A.get(H).b);
                        return;
                    }
                    return;
                }
                int G = G(fVar.b);
                if (G >= 0) {
                    N(this.z.get(G).a);
                }
            }
        }

        /* access modifiers changed from: protected */
        public Object E() {
            return new p6(this);
        }

        /* access modifiers changed from: protected */
        public int F(Object obj) {
            int size = this.z.size();
            for (int i = 0; i < size; i++) {
                if (this.z.get(i).a == obj) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public int G(String str) {
            int size = this.z.size();
            for (int i = 0; i < size; i++) {
                if (this.z.get(i).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public int H(n6.f fVar) {
            int size = this.A.size();
            for (int i = 0; i < size; i++) {
                if (this.A.get(i).a == fVar) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public Object I() {
            if (this.C == null) {
                this.C = new q6();
            }
            return this.C.a(this.s);
        }

        /* access modifiers changed from: protected */
        public String J(Object obj) {
            CharSequence name = ((MediaRouter.RouteInfo) obj).getName(n());
            return name != null ? name.toString() : "";
        }

        /* access modifiers changed from: protected */
        public c K(Object obj) {
            Object tag = ((MediaRouter.RouteInfo) obj).getTag();
            if (tag instanceof c) {
                return (c) tag;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void L(C0058b bVar, i6.a aVar) {
            int supportedTypes = ((MediaRouter.RouteInfo) bVar.a).getSupportedTypes();
            if ((supportedTypes & 1) != 0) {
                aVar.a(D);
            }
            if ((supportedTypes & 2) != 0) {
                aVar.a(E);
            }
            aVar.h(((MediaRouter.RouteInfo) bVar.a).getPlaybackType());
            aVar.g(((MediaRouter.RouteInfo) bVar.a).getPlaybackStream());
            aVar.j(((MediaRouter.RouteInfo) bVar.a).getVolume());
            aVar.l(((MediaRouter.RouteInfo) bVar.a).getVolumeMax());
            aVar.k(((MediaRouter.RouteInfo) bVar.a).getVolumeHandling());
        }

        /* access modifiers changed from: protected */
        public void M() {
            l6.a aVar = new l6.a();
            int size = this.z.size();
            for (int i = 0; i < size; i++) {
                aVar.a(this.z.get(i).c);
            }
            x(aVar.b());
        }

        /* access modifiers changed from: protected */
        public void N(Object obj) {
            if (this.B == null) {
                this.B = new r6();
            }
            this.B.a(this.s, 8388611, obj);
        }

        /* access modifiers changed from: protected */
        public void O() {
            if (this.y) {
                this.y = false;
                ((MediaRouter) this.s).removeCallback((MediaRouter.Callback) this.t);
            }
            int i = this.w;
            if (i != 0) {
                this.y = true;
                ((MediaRouter) this.s).addCallback(i, (MediaRouter.Callback) this.t);
            }
        }

        /* access modifiers changed from: protected */
        public void P(C0058b bVar) {
            i6.a aVar = new i6.a(bVar.b, J(bVar.a));
            L(bVar, aVar);
            bVar.c = aVar.b();
        }

        /* access modifiers changed from: protected */
        public void R(c cVar) {
            ((MediaRouter.UserRouteInfo) cVar.b).setName(cVar.a.k());
            ((MediaRouter.UserRouteInfo) cVar.b).setPlaybackType(cVar.a.m());
            ((MediaRouter.UserRouteInfo) cVar.b).setPlaybackStream(cVar.a.l());
            ((MediaRouter.UserRouteInfo) cVar.b).setVolume(cVar.a.q());
            ((MediaRouter.UserRouteInfo) cVar.b).setVolumeMax(cVar.a.s());
            ((MediaRouter.UserRouteInfo) cVar.b).setVolumeHandling(cVar.a.r());
        }

        @Override // defpackage.s6
        public void a(Object obj, int i) {
            c K = K(obj);
            if (K != null) {
                K.a.C(i);
            }
        }

        @Override // defpackage.o6
        public void b(Object obj, Object obj2) {
        }

        @Override // defpackage.o6
        public void c(Object obj, Object obj2, int i) {
        }

        @Override // defpackage.s6
        public void d(Object obj, int i) {
            c K = K(obj);
            if (K != null) {
                K.a.B(i);
            }
        }

        @Override // defpackage.o6
        public void e(Object obj) {
            int F;
            if (K(obj) == null && (F = F(obj)) >= 0) {
                P(this.z.get(F));
                M();
            }
        }

        @Override // defpackage.o6
        public void f(int i, Object obj) {
        }

        @Override // defpackage.o6
        public void g(Object obj) {
            int F;
            if (K(obj) == null && (F = F(obj)) >= 0) {
                this.z.remove(F);
                M();
            }
        }

        @Override // defpackage.o6
        public void h(int i, Object obj) {
            if (obj == ((MediaRouter) this.s).getSelectedRoute(8388611)) {
                c K = K(obj);
                if (K != null) {
                    K.a.D();
                    return;
                }
                int F = F(obj);
                if (F >= 0) {
                    ((n6.d) this.r).o(this.z.get(F).b);
                }
            }
        }

        @Override // defpackage.o6
        public void j(Object obj) {
            if (D(obj)) {
                M();
            }
        }

        @Override // defpackage.o6
        public void k(Object obj) {
            int F;
            if (K(obj) == null && (F = F(obj)) >= 0) {
                C0058b bVar = this.z.get(F);
                int volume = ((MediaRouter.RouteInfo) obj).getVolume();
                if (volume != bVar.c.m()) {
                    i6.a aVar = new i6.a(bVar.c);
                    aVar.j(volume);
                    bVar.c = aVar.b();
                    M();
                }
            }
        }

        @Override // defpackage.k6
        public k6.e t(String str) {
            int G = G(str);
            if (G >= 0) {
                return new a(this.z.get(G).a);
            }
            return null;
        }

        @Override // defpackage.k6
        public void v(j6 j6Var) {
            boolean z2;
            int i = 0;
            if (j6Var != null) {
                m6 c2 = j6Var.c();
                c2.b();
                List<String> list = c2.b;
                int size = list.size();
                int i2 = 0;
                while (i < size) {
                    String str = list.get(i);
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        i2 |= 1;
                    } else {
                        i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                    }
                    i++;
                }
                z2 = j6Var.d();
                i = i2;
            } else {
                z2 = false;
            }
            if (this.w != i || this.x != z2) {
                this.w = i;
                this.x = z2;
                Q();
            }
        }

        @Override // defpackage.b7
        public void z(n6.f fVar) {
            if (fVar.p() != this) {
                MediaRouter.UserRouteInfo createUserRoute = ((MediaRouter) this.s).createUserRoute((MediaRouter.RouteCategory) this.v);
                c cVar = new c(fVar, createUserRoute);
                createUserRoute.setTag(cVar);
                g6.a(createUserRoute, this.u);
                R(cVar);
                this.A.add(cVar);
                ((MediaRouter) this.s).addUserRoute(createUserRoute);
                return;
            }
            int F = F(((MediaRouter) this.s).getSelectedRoute(8388611));
            if (F >= 0 && this.z.get(F).b.equals(fVar.b)) {
                fVar.D();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b7$c */
    public static class c extends b implements v6 {
        private u6 F;
        private x6 G;

        public c(Context context, e eVar) {
            super(context, eVar);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b7.b
        public Object E() {
            return new w6(this);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b7.b
        public void L(b.C0058b bVar, i6.a aVar) {
            Display display;
            super.L(bVar, aVar);
            if (!((MediaRouter.RouteInfo) bVar.a).isEnabled()) {
                aVar.f(false);
            }
            if (S(bVar)) {
                aVar.c(true);
            }
            try {
                display = ((MediaRouter.RouteInfo) bVar.a).getPresentationDisplay();
            } catch (NoSuchMethodError unused) {
                display = null;
            }
            if (display != null) {
                aVar.i(display.getDisplayId());
            }
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b7.b
        public void O() {
            super.O();
            if (this.F == null) {
                this.F = new u6(n(), q());
            }
            this.F.a(this.x ? this.w : 0);
        }

        /* access modifiers changed from: protected */
        public boolean S(b.C0058b bVar) {
            if (this.G == null) {
                this.G = new x6();
            }
            return this.G.a(bVar.a);
        }

        @Override // defpackage.v6
        public void i(Object obj) {
            Display display;
            int F2 = F(obj);
            if (F2 >= 0) {
                b.C0058b bVar = this.z.get(F2);
                try {
                    display = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
                } catch (NoSuchMethodError unused) {
                    display = null;
                }
                int displayId = display != null ? display.getDisplayId() : -1;
                if (displayId != bVar.c.l()) {
                    i6.a aVar = new i6.a(bVar.c);
                    aVar.i(displayId);
                    bVar.c = aVar.b();
                    M();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b7$d */
    public static class d extends c {
        public d(Context context, e eVar) {
            super(context, eVar);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b7.b
        public Object I() {
            return ((MediaRouter) this.s).getDefaultRoute();
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b7.c, defpackage.b7.b
        public void L(b.C0058b bVar, i6.a aVar) {
            super.L(bVar, aVar);
            CharSequence description = ((MediaRouter.RouteInfo) bVar.a).getDescription();
            if (description != null) {
                aVar.d(description.toString());
            }
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b7.b
        public void N(Object obj) {
            ((MediaRouter) this.s).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b7.c, defpackage.b7.b
        public void O() {
            if (this.y) {
                ((MediaRouter) this.s).removeCallback((MediaRouter.Callback) this.t);
            }
            this.y = true;
            Object obj = this.s;
            MediaRouter mediaRouter = (MediaRouter) obj;
            mediaRouter.addCallback(this.w, (MediaRouter.Callback) this.t, (this.x ? 1 : 0) | 2);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b7.b
        public void R(b.c cVar) {
            super.R(cVar);
            ((MediaRouter.UserRouteInfo) cVar.b).setDescription(cVar.a.c());
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b7.c
        public boolean S(b.C0058b bVar) {
            return ((MediaRouter.RouteInfo) bVar.a).isConnecting();
        }
    }

    /* renamed from: b7$e */
    public interface e {
    }

    protected b7(Context context) {
        super(context, new k6.d(new ComponentName("android", b7.class.getName())));
    }

    public void A(n6.f fVar) {
    }

    public void B(n6.f fVar) {
    }

    public void C(n6.f fVar) {
    }

    public void z(n6.f fVar) {
    }
}
