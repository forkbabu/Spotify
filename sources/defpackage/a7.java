package defpackage;

import android.content.Context;
import android.media.MediaRouter;
import android.media.RemoteControlClient;
import defpackage.n6;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: a7  reason: default package */
public abstract class a7 {
    protected final Object a;
    protected c b;

    /* access modifiers changed from: package-private */
    /* renamed from: a7$a */
    public static class a extends a7 {
        private final Object c;
        private final Object d;
        private final Object e;
        private boolean f;

        /* access modifiers changed from: private */
        /* renamed from: a7$a$a  reason: collision with other inner class name */
        public static final class C0002a implements s6 {
            private final WeakReference<a> a;

            public C0002a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // defpackage.s6
            public void a(Object obj, int i) {
                c cVar;
                a aVar = this.a.get();
                if (aVar != null && (cVar = aVar.b) != null) {
                    ((n6.d.f) cVar).d(i);
                }
            }

            @Override // defpackage.s6
            public void d(Object obj, int i) {
                c cVar;
                a aVar = this.a.get();
                if (aVar != null && (cVar = aVar.b) != null) {
                    ((n6.d.f) cVar).c(i);
                }
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            Object systemService = context.getSystemService("media_router");
            this.c = systemService;
            MediaRouter mediaRouter = (MediaRouter) systemService;
            MediaRouter.RouteCategory createRouteCategory = mediaRouter.createRouteCategory((CharSequence) "", false);
            this.d = createRouteCategory;
            this.e = mediaRouter.createUserRoute(createRouteCategory);
        }

        @Override // defpackage.a7
        public void a(b bVar) {
            ((MediaRouter.UserRouteInfo) this.e).setVolume(bVar.a);
            ((MediaRouter.UserRouteInfo) this.e).setVolumeMax(bVar.b);
            ((MediaRouter.UserRouteInfo) this.e).setVolumeHandling(bVar.c);
            ((MediaRouter.UserRouteInfo) this.e).setPlaybackStream(bVar.d);
            ((MediaRouter.UserRouteInfo) this.e).setPlaybackType(bVar.e);
            if (!this.f) {
                this.f = true;
                g6.a(this.e, new t6(new C0002a(this)));
                ((MediaRouter.UserRouteInfo) this.e).setRemoteControlClient((RemoteControlClient) this.a);
            }
        }
    }

    /* renamed from: a7$b */
    public static final class b {
        public int a;
        public int b;
        public int c = 0;
        public int d = 3;
        public int e = 1;
    }

    /* renamed from: a7$c */
    public interface c {
    }

    protected a7(Context context, Object obj) {
        this.a = obj;
    }

    public abstract void a(b bVar);
}
