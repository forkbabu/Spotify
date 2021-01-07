package com.spotify.music.sociallistening.nearby.medium;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.h;

public final class NearbyMediumWifi {
    private String a;
    private final d b = kotlin.a.b(new NearbyMediumWifi$nsdManager$2(this));
    private NsdManager.RegistrationListener c;
    private final Context d;

    static final class a implements io.reactivex.d {
        final /* synthetic */ NearbyMediumWifi a;
        final /* synthetic */ String b;

        /* renamed from: com.spotify.music.sociallistening.nearby.medium.NearbyMediumWifi$a$a  reason: collision with other inner class name */
        public static final class C0345a implements NsdManager.RegistrationListener {
            final /* synthetic */ a a;
            final /* synthetic */ io.reactivex.b b;

            C0345a(a aVar, io.reactivex.b bVar) {
                this.a = aVar;
                this.b = bVar;
            }

            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
                this.b.onError(new RuntimeException(je.p0("Wifi service registration failed with code ", i)));
            }

            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
                this.a.a.j("Nearby wifi service registered");
                this.b.onComplete();
            }

            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
                this.a.a.j("Wifi service un-registered");
                this.b.onComplete();
            }

            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
                this.b.onError(new RuntimeException(je.p0("Wifi service un-registration failed with code ", i)));
            }
        }

        a(NearbyMediumWifi nearbyMediumWifi, String str) {
            this.a = nearbyMediumWifi;
            this.b = str;
        }

        @Override // io.reactivex.d
        public final void subscribe(io.reactivex.b bVar) {
            h.e(bVar, "emitter");
            this.a.c = new C0345a(this, bVar);
            this.a.j("Start nearby wifi broadcasting");
            NsdManager d = NearbyMediumWifi.d(this.a);
            NearbyMediumWifi nearbyMediumWifi = this.a;
            String str = this.b;
            nearbyMediumWifi.getClass();
            h.e(str, "token");
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setPort(60000);
            nsdServiceInfo.setServiceType("_spotify-social-listening._tcp");
            nsdServiceInfo.setServiceName("Spotify Group Session");
            nsdServiceInfo.setAttribute("token", str);
            d.registerService(nsdServiceInfo, 1, this.a.c);
        }
    }

    static final class b<T> implements u<ImmutableList<String>> {
        final /* synthetic */ NearbyMediumWifi a;
        final /* synthetic */ Ref$ObjectRef b;
        final /* synthetic */ List c;

        public static final class a implements NsdManager.DiscoveryListener {
            final /* synthetic */ b a;
            final /* synthetic */ t b;

            /* renamed from: com.spotify.music.sociallistening.nearby.medium.NearbyMediumWifi$b$a$a  reason: collision with other inner class name */
            public static final class C0346a implements NsdManager.ResolveListener {
                final /* synthetic */ a a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                C0346a(a aVar) {
                    this.a = aVar;
                }

                @Override // android.net.nsd.NsdManager.ResolveListener
                public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
                    this.a.a.a.j("Could not resolve found wifi service");
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: io.reactivex.t */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.net.nsd.NsdManager.ResolveListener
                public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
                    String a2 = NearbyMediumWifi.a(this.a.a.a, nsdServiceInfo);
                    if (a2 != null && !this.a.a.c.contains(a2) && (!h.a(a2, this.a.a.a.a))) {
                        NearbyMediumWifi nearbyMediumWifi = this.a.a.a;
                        nearbyMediumWifi.j("resolved nearby wifi session: " + a2);
                        this.a.a.c.add(a2);
                        a aVar = this.a;
                        aVar.b.onNext(ImmutableList.copyOf((Collection) aVar.a.c));
                    }
                }
            }

            /* renamed from: com.spotify.music.sociallistening.nearby.medium.NearbyMediumWifi$b$a$b  reason: collision with other inner class name */
            public static final class C0347b implements NsdManager.ResolveListener {
                final /* synthetic */ a a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                C0347b(a aVar) {
                    this.a = aVar;
                }

                @Override // android.net.nsd.NsdManager.ResolveListener
                public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
                    this.a.a.a.j("Could not resolve lost wifi service");
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: io.reactivex.t */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.net.nsd.NsdManager.ResolveListener
                public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
                    String a2 = NearbyMediumWifi.a(this.a.a.a, nsdServiceInfo);
                    if (a2 != null && this.a.a.c.contains(a2)) {
                        NearbyMediumWifi nearbyMediumWifi = this.a.a.a;
                        nearbyMediumWifi.j("resolved lost nearby wifi session: " + a2);
                        this.a.a.c.remove(a2);
                        a aVar = this.a;
                        aVar.b.onNext(ImmutableList.copyOf((Collection) aVar.a.c));
                    }
                }
            }

            a(b bVar, t tVar) {
                this.a = bVar;
                this.b = tVar;
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onDiscoveryStarted(String str) {
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onDiscoveryStopped(String str) {
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
                NearbyMediumWifi.d(this.a.a).resolveService(nsdServiceInfo, new C0346a(this));
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
                NearbyMediumWifi.d(this.a.a).resolveService(nsdServiceInfo, new C0347b(this));
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onStartDiscoveryFailed(String str, int i) {
                this.b.onError(new RuntimeException(je.p0("Wifi start discovery failed with code ", i)));
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onStopDiscoveryFailed(String str, int i) {
                this.b.onError(new RuntimeException(je.p0("Wifi stop discovery failed with code ", i)));
            }
        }

        b(NearbyMediumWifi nearbyMediumWifi, Ref$ObjectRef ref$ObjectRef, List list) {
            this.a = nearbyMediumWifi;
            this.b = ref$ObjectRef;
            this.c = list;
        }

        @Override // io.reactivex.u
        public final void subscribe(t<ImmutableList<String>> tVar) {
            h.e(tVar, "emitter");
            this.b.element = (T) new a(this, tVar);
            NearbyMediumWifi.d(this.a).discoverServices("_spotify-social-listening._tcp", 1, this.b.element);
        }
    }

    static final class c implements io.reactivex.functions.a {
        final /* synthetic */ NearbyMediumWifi a;
        final /* synthetic */ Ref$ObjectRef b;

        c(NearbyMediumWifi nearbyMediumWifi, Ref$ObjectRef ref$ObjectRef) {
            this.a = nearbyMediumWifi;
            this.b = ref$ObjectRef;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            T t = this.b.element;
            if (t != null) {
                this.a.j("disposed wifi discovery");
                NearbyMediumWifi.d(this.a).stopServiceDiscovery(t);
                this.b.element = null;
            }
        }
    }

    public NearbyMediumWifi(Context context) {
        h.e(context, "context");
        this.d = context;
    }

    public static final String a(NearbyMediumWifi nearbyMediumWifi, NsdServiceInfo nsdServiceInfo) {
        nearbyMediumWifi.getClass();
        if (nsdServiceInfo == null) {
            return null;
        }
        Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
        h.d(attributes, "it.attributes");
        if (!attributes.containsKey("token")) {
            return null;
        }
        Charset charset = StandardCharsets.UTF_8;
        h.d(charset, "UTF_8");
        return new String((byte[]) kotlin.collections.d.o(attributes, "token"), charset);
    }

    public static final NsdManager d(NearbyMediumWifi nearbyMediumWifi) {
        return (NsdManager) nearbyMediumWifi.b.getValue();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void j(String str) {
        Logger.b(je.x0("social listening nearby: ", str), new Object[0]);
    }

    public io.reactivex.a h(String str) {
        h.e(str, "token");
        this.a = str;
        io.reactivex.a m = io.reactivex.a.m(new a(this, str));
        h.d(m, "Completable.create { emi…r\n            )\n        }");
        return m;
    }

    public s<ImmutableList<String>> i() {
        j("Start nearby wifi discovery");
        ArrayList arrayList = new ArrayList();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        s<ImmutableList<String>> M = s.y(new b(this, ref$ObjectRef, arrayList)).M(Functions.f(), new c(this, ref$ObjectRef));
        h.d(M, "Observable.create { emit…l\n            }\n        }");
        return M;
    }

    public void k() {
        if (this.c != null) {
            j("Stop wifi broadcasting");
            ((NsdManager) this.b.getValue()).unregisterService(this.c);
            this.c = null;
            this.a = null;
            return;
        }
        j("No wifi broadcast listener to unregister");
    }
}
