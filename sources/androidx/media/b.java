package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class b extends Service {
    static final boolean p = Log.isLoggable("MBServiceCompat", 3);
    private d a;
    final c b = new c("android.media.session.MediaController", -1, -1, null, null);
    final ArrayList<c> c = new ArrayList<>();
    final m1<IBinder, c> f = new m1<>();
    final o n = new o();
    MediaSessionCompat.Token o;

    /* access modifiers changed from: package-private */
    public class a extends j<List<MediaBrowserCompat.MediaItem>> {
        final /* synthetic */ c f;
        final /* synthetic */ String g;
        final /* synthetic */ Bundle h;
        final /* synthetic */ Bundle i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Object obj, c cVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f = cVar;
            this.g = str;
            this.h = bundle;
            this.i = bundle2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // androidx.media.b.j
        public void e(List<MediaBrowserCompat.MediaItem> list) {
            List<MediaBrowserCompat.MediaItem> list2 = list;
            c cVar = b.this.f.get(((n) this.f.f).a());
            c cVar2 = this.f;
            if (cVar == cVar2) {
                if ((b() & 1) != 0) {
                    list2 = b.this.b(list2, this.h);
                }
                try {
                    ((n) this.f.f).d(this.g, list2, this.h, this.i);
                } catch (RemoteException unused) {
                    String str = this.f.a;
                }
            } else if (b.p) {
                String str2 = cVar2.a;
            }
        }
    }

    /* renamed from: androidx.media.b$b  reason: collision with other inner class name */
    public static final class C0034b {
        private final String a;
        private final Bundle b;

        public C0034b(String str, Bundle bundle) {
            if (str != null) {
                this.a = str;
                this.b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        public Bundle c() {
            return this.b;
        }

        public String d() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public class c implements IBinder.DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final m f;
        public final HashMap<String, List<u3<IBinder, Bundle>>> n = new HashMap<>();
        public C0034b o;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                b.this.f.remove(((n) cVar.f).a());
            }
        }

        c(String str, int i, int i2, Bundle bundle, m mVar) {
            this.a = str;
            this.b = i;
            this.c = i2;
            if (Build.VERSION.SDK_INT >= 28) {
                new t(str, i, i2);
            }
            this.f = mVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            b.this.n.post(new a());
        }
    }

    interface d {
        IBinder G(Intent intent);

        void H(String str, Bundle bundle);

        void q();

        void r(MediaSessionCompat.Token token);
    }

    /* access modifiers changed from: package-private */
    public class e implements d {
        final List<Bundle> a = new ArrayList();
        MediaBrowserService b;
        Messenger c;

        class a implements Runnable {
            final /* synthetic */ MediaSessionCompat.Token a;

            a(MediaSessionCompat.Token token) {
                this.a = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!e.this.a.isEmpty()) {
                    android.support.v4.media.session.b a2 = this.a.a();
                    if (a2 != null) {
                        for (Bundle bundle : e.this.a) {
                            androidx.core.app.d.c(bundle, "extra_session_binder", a2.asBinder());
                        }
                    }
                    e.this.a.clear();
                }
                e.this.b.setSessionToken((MediaSession.Token) this.a.c());
            }
        }

        /* renamed from: androidx.media.b$e$b  reason: collision with other inner class name */
        class C0035b extends MediaBrowserService {
            C0035b(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundle2;
                int i2;
                C0034b bVar;
                IBinder iBinder;
                MediaSessionCompat.b(bundle);
                e eVar = e.this;
                Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
                eVar.getClass();
                if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
                    bundle2 = null;
                    i2 = -1;
                } else {
                    bundle3.remove("extra_client_version");
                    eVar.c = new Messenger(b.this.n);
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("extra_service_version", 2);
                    androidx.core.app.d.c(bundle4, "extra_messenger", eVar.c.getBinder());
                    MediaSessionCompat.Token token = b.this.o;
                    if (token != null) {
                        android.support.v4.media.session.b a2 = token.a();
                        if (a2 == null) {
                            iBinder = null;
                        } else {
                            iBinder = a2.asBinder();
                        }
                        androidx.core.app.d.c(bundle4, "extra_session_binder", iBinder);
                    } else {
                        eVar.a.add(bundle4);
                    }
                    int i3 = bundle3.getInt("extra_calling_pid", -1);
                    bundle3.remove("extra_calling_pid");
                    i2 = i3;
                    bundle2 = bundle4;
                }
                c cVar = new c(str, i2, i, bundle3, null);
                b.this.getClass();
                C0034b e = b.this.e(str, i, bundle3);
                b.this.getClass();
                if (e == null) {
                    bVar = null;
                } else {
                    if (eVar.c != null) {
                        b.this.c.add(cVar);
                    }
                    if (bundle2 == null) {
                        bundle2 = e.c();
                    } else if (e.c() != null) {
                        bundle2.putAll(e.c());
                    }
                    bVar = new C0034b(e.d(), bundle2);
                }
                if (bVar == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(bVar.a, bVar.b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                e eVar = e.this;
                f fVar = new f(eVar, str, new k(result));
                b bVar = b.this;
                c cVar = bVar.b;
                bVar.f(str, fVar);
                b.this.getClass();
            }
        }

        e() {
        }

        @Override // androidx.media.b.d
        public IBinder G(Intent intent) {
            return this.b.onBind(intent);
        }

        @Override // androidx.media.b.d
        public void H(String str, Bundle bundle) {
            a(str, null);
            b.this.n.post(new g(this, str, null));
        }

        /* access modifiers changed from: package-private */
        public void a(String str, Bundle bundle) {
            this.b.notifyChildrenChanged(str);
        }

        @Override // androidx.media.b.d
        public void q() {
            C0035b bVar = new C0035b(b.this);
            this.b = bVar;
            bVar.onCreate();
        }

        @Override // androidx.media.b.d
        public void r(MediaSessionCompat.Token token) {
            b.this.n.a(new a(token));
        }
    }

    class f extends e {

        class a extends e.C0035b {
            a(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                f fVar = f.this;
                h hVar = new h(fVar, str, new k(result));
                b bVar = b.this;
                c cVar = bVar.b;
                bVar.h(hVar);
                b.this.getClass();
            }
        }

        f() {
            super();
        }

        @Override // androidx.media.b.e, androidx.media.b.d
        public void q() {
            a aVar = new a(b.this);
            this.b = aVar;
            aVar.onCreate();
        }
    }

    /* access modifiers changed from: package-private */
    public class g extends f {

        class a extends f.a {
            a(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b bVar = b.this;
                c cVar = bVar.b;
                bVar.getClass();
                g gVar = g.this;
                i iVar = new i(gVar, str, new k(result), bundle);
                b bVar2 = b.this;
                c cVar2 = bVar2.b;
                bVar2.g(str, iVar, bundle);
                b.this.getClass();
                b.this.getClass();
            }
        }

        g() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.media.b.e
        public void a(String str, Bundle bundle) {
            if (bundle != null) {
                this.b.notifyChildrenChanged(str, bundle);
            } else {
                this.b.notifyChildrenChanged(str);
            }
        }

        @Override // androidx.media.b.f, androidx.media.b.e, androidx.media.b.d
        public void q() {
            a aVar = new a(b.this);
            this.b = aVar;
            aVar.onCreate();
        }
    }

    class h extends g {
        h(b bVar) {
            super();
        }
    }

    class i implements d {
        private Messenger a;

        class a implements Runnable {
            final /* synthetic */ MediaSessionCompat.Token a;

            a(MediaSessionCompat.Token token) {
                this.a = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<c> it = b.this.f.values().iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    try {
                        ((n) next.f).b(next.o.d(), this.a, next.o.c());
                    } catch (RemoteException unused) {
                        String str = next.a;
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: androidx.media.b$i$b  reason: collision with other inner class name */
        class RunnableC0036b implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ Bundle b;

            RunnableC0036b(String str, Bundle bundle) {
                this.a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (IBinder iBinder : b.this.f.keySet()) {
                    c cVar = b.this.f.get(iBinder);
                    i iVar = i.this;
                    String str = this.a;
                    Bundle bundle = this.b;
                    iVar.getClass();
                    List<u3<IBinder, Bundle>> list = cVar.n.get(str);
                    if (list != null) {
                        for (u3<IBinder, Bundle> u3Var : list) {
                            if (e2.o(bundle, u3Var.b)) {
                                b.this.l(str, cVar, u3Var.b, bundle);
                            }
                        }
                    }
                }
            }
        }

        i() {
        }

        @Override // androidx.media.b.d
        public IBinder G(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.a.getBinder();
            }
            return null;
        }

        @Override // androidx.media.b.d
        public void H(String str, Bundle bundle) {
            b.this.n.post(new RunnableC0036b(str, null));
        }

        @Override // androidx.media.b.d
        public void q() {
            this.a = new Messenger(b.this.n);
        }

        @Override // androidx.media.b.d
        public void r(MediaSessionCompat.Token token) {
            b.this.n.post(new a(token));
        }
    }

    public static class j<T> {
        private final Object a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;

        j(Object obj) {
            this.a = obj;
        }

        public void a() {
            if (this.b) {
                StringBuilder V0 = je.V0("detach() called when detach() had already been called for: ");
                V0.append(this.a);
                throw new IllegalStateException(V0.toString());
            } else if (this.c) {
                StringBuilder V02 = je.V0("detach() called when sendResult() had already been called for: ");
                V02.append(this.a);
                throw new IllegalStateException(V02.toString());
            } else if (!this.d) {
                this.b = true;
            } else {
                StringBuilder V03 = je.V0("detach() called when sendError() had already been called for: ");
                V03.append(this.a);
                throw new IllegalStateException(V03.toString());
            }
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.b || this.c || this.d;
        }

        /* access modifiers changed from: package-private */
        public void d(Bundle bundle) {
            StringBuilder V0 = je.V0("It is not supported to send an error for ");
            V0.append(this.a);
            throw new UnsupportedOperationException(V0.toString());
        }

        /* access modifiers changed from: package-private */
        public void e(T t) {
            throw null;
        }

        public void f(Bundle bundle) {
            if (this.c || this.d) {
                StringBuilder V0 = je.V0("sendError() called when either sendResult() or sendError() had already been called for: ");
                V0.append(this.a);
                throw new IllegalStateException(V0.toString());
            }
            this.d = true;
            d(null);
        }

        public void g(T t) {
            if (this.c || this.d) {
                StringBuilder V0 = je.V0("sendResult() called when either sendResult() or sendError() had already been called for: ");
                V0.append(this.a);
                throw new IllegalStateException(V0.toString());
            }
            this.c = true;
            e(t);
        }

        /* access modifiers changed from: package-private */
        public void h(int i) {
            this.e = i;
        }
    }

    /* access modifiers changed from: package-private */
    public static class k<T> {
        MediaBrowserService.Result a;

        k(MediaBrowserService.Result result) {
            this.a = result;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: android.service.media.MediaBrowserService$Result */
        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: android.service.media.MediaBrowserService$Result */
        /* JADX WARN: Multi-variable type inference failed */
        public void a(T t) {
            ArrayList arrayList = null;
            if (t instanceof List) {
                MediaBrowserService.Result result = this.a;
                T<Parcel> t2 = t;
                if (t2 != null) {
                    arrayList = new ArrayList();
                    for (Parcel parcel : t2) {
                        parcel.setDataPosition(0);
                        arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                        parcel.recycle();
                    }
                }
                result.sendResult(arrayList);
            } else if (t instanceof Parcel) {
                T t3 = t;
                t3.setDataPosition(0);
                this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(t3));
                t3.recycle();
            } else {
                this.a.sendResult(null);
            }
        }
    }

    /* access modifiers changed from: private */
    public class l {
        l() {
        }
    }

    /* access modifiers changed from: private */
    public interface m {
    }

    /* access modifiers changed from: private */
    public static class n implements m {
        final Messenger a;

        n(Messenger messenger) {
            this.a = messenger;
        }

        private void e(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.a.send(obtain);
        }

        public IBinder a() {
            return this.a.getBinder();
        }

        public void b(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            e(1, bundle2);
        }

        public void c() {
            e(2, null);
        }

        public void d(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            e(3, bundle3);
        }
    }

    private final class o extends Handler {
        private final l a;

        o() {
            this.a = new l();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.b(bundle);
                    l lVar = this.a;
                    String string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_pid");
                    int i2 = data.getInt("data_calling_uid");
                    n nVar = new n(message.replyTo);
                    b bVar = b.this;
                    bVar.getClass();
                    boolean z = false;
                    if (string != null) {
                        String[] packagesForUid = bVar.getPackageManager().getPackagesForUid(i2);
                        int length = packagesForUid.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (packagesForUid[i3].equals(string)) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (z) {
                        b.this.n.a(new j(lVar, nVar, string, i, i2, bundle));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
                case 2:
                    l lVar2 = this.a;
                    b.this.n.a(new k(lVar2, new n(message.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.b(bundle2);
                    l lVar3 = this.a;
                    b.this.n.a(new l(lVar3, new n(message.replyTo), data.getString("data_media_item_id"), androidx.core.app.d.a(data, "data_callback_token"), bundle2));
                    return;
                case 4:
                    l lVar4 = this.a;
                    b.this.n.a(new m(lVar4, new n(message.replyTo), data.getString("data_media_item_id"), androidx.core.app.d.a(data, "data_callback_token")));
                    return;
                case 5:
                    l lVar5 = this.a;
                    String string2 = data.getString("data_media_item_id");
                    p pVar = (p) data.getParcelable("data_result_receiver");
                    n nVar2 = new n(message.replyTo);
                    lVar5.getClass();
                    if (!TextUtils.isEmpty(string2) && pVar != null) {
                        b.this.n.a(new n(lVar5, nVar2, string2, pVar));
                        return;
                    }
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.b(bundle3);
                    l lVar6 = this.a;
                    b.this.n.a(new o(lVar6, new n(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), bundle3));
                    return;
                case 7:
                    l lVar7 = this.a;
                    b.this.n.a(new p(lVar7, new n(message.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.b(bundle4);
                    l lVar8 = this.a;
                    String string3 = data.getString("data_search_query");
                    p pVar2 = (p) data.getParcelable("data_result_receiver");
                    n nVar3 = new n(message.replyTo);
                    lVar8.getClass();
                    if (!TextUtils.isEmpty(string3) && pVar2 != null) {
                        b.this.n.a(new q(lVar8, nVar3, string3, bundle4, pVar2));
                        return;
                    }
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.b(bundle5);
                    l lVar9 = this.a;
                    String string4 = data.getString("data_custom_action");
                    p pVar3 = (p) data.getParcelable("data_result_receiver");
                    n nVar4 = new n(message.replyTo);
                    lVar9.getClass();
                    if (!TextUtils.isEmpty(string4) && pVar3 != null) {
                        b.this.n.a(new r(lVar9, nVar4, string4, bundle5, pVar3));
                        return;
                    }
                    return;
                default:
                    String str = "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1;
                    return;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public void a(String str) {
        if (str != null) {
            this.a.H(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    /* access modifiers changed from: package-private */
    public List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int i5 = i4 + i3;
        if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
            return Collections.emptyList();
        }
        if (i5 > list.size()) {
            i5 = list.size();
        }
        return list.subList(i4, i5);
    }

    public MediaSessionCompat.Token c() {
        return this.o;
    }

    /* JADX WARN: Incorrect args count in method signature: (Ljava/lang/String;Landroid/os/Bundle;Landroidx/media/b$j<Landroid/os/Bundle;>;)V */
    public void d(j jVar) {
        jVar.f(null);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract C0034b e(String str, int i2, Bundle bundle);

    public abstract void f(String str, j<List<MediaBrowserCompat.MediaItem>> jVar);

    public abstract void g(String str, j<List<MediaBrowserCompat.MediaItem>> jVar, Bundle bundle);

    /* JADX WARN: Incorrect args count in method signature: (Ljava/lang/String;Landroidx/media/b$j<Landroid/support/v4/media/MediaBrowserCompat$MediaItem;>;)V */
    public void h(j jVar) {
        jVar.h(2);
        jVar.g(null);
    }

    public abstract void i(String str, Bundle bundle, j<List<MediaBrowserCompat.MediaItem>> jVar);

    public void j() {
    }

    public void k() {
    }

    /* access modifiers changed from: package-private */
    public void l(String str, c cVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, cVar, str, bundle, bundle2);
        if (bundle == null) {
            f(str, aVar);
        } else {
            g(str, aVar, bundle);
        }
        if (!aVar.c()) {
            throw new IllegalStateException(je.J0(je.V0("onLoadChildren must call detach() or sendResult() before returning for package="), cVar.a, " id=", str));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a.G(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.a = new h(this);
        } else if (i2 >= 26) {
            this.a = new g();
        } else if (i2 >= 23) {
            this.a = new f();
        } else if (i2 >= 21) {
            this.a = new e();
        } else {
            this.a = new i();
        }
        this.a.q();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.h3
    public void r(MediaSessionCompat.Token token) {
        if (this.o == null) {
            this.o = token;
            this.a.r(token);
            return;
        }
        throw new IllegalStateException("The session token has already been set");
    }
}
