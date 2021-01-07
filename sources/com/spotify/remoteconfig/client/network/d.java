package com.spotify.remoteconfig.client.network;

import com.google.protobuf.GeneratedMessageLite;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.rcs.admin.grpc.v0.DynamicContext;
import com.spotify.rcs.admin.grpc.v0.PropertyDefinition$Identifier;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import com.spotify.rcs.resolver.grpc.v0.Context;
import com.spotify.rcs.resolver.grpc.v0.Fetch;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.remoteconfig.client.logging.EventLogger;
import com.spotify.remoteconfig.client.model.resolve.AssignedPropertyValue;
import com.spotify.remoteconfig.client.model.resolve.FetchType;
import defpackage.d0e;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;
import okhttp3.e0;
import retrofit2.v;

public final class d implements b {
    private final io.reactivex.functions.g<v<ResolveResponse>> a = new f(this);
    private final io.reactivex.functions.g<Throwable> b = new e(this);
    private final l<v<ResolveResponse>, com.spotify.remoteconfig.client.model.resolve.a> c = g.a;
    private final l<com.spotify.remoteconfig.client.model.resolve.a, z<com.spotify.remoteconfig.client.model.resolve.a>> d = new a(this);
    private final c0e e;
    private final j f;
    private final EventLogger g;
    private final k0e h;
    private final com.spotify.remoteconfig.client.cosmos.a i;

    static final class a<T, R> implements l<com.spotify.remoteconfig.client.model.resolve.a, z<com.spotify.remoteconfig.client.model.resolve.a>> {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public z<com.spotify.remoteconfig.client.model.resolve.a> apply(com.spotify.remoteconfig.client.model.resolve.a aVar) {
            com.spotify.remoteconfig.client.model.resolve.a aVar2 = aVar;
            h.f(aVar2, "config");
            com.spotify.remoteconfig.client.cosmos.a aVar3 = this.a.i;
            d0e.a aVar4 = d0e.d;
            return ((com.spotify.remoteconfig.client.cosmos.b) aVar3).c(d0e.a.a(aVar2)).A(new c(aVar2));
        }
    }

    static final class b<T> implements n<v<ResolveResponse>> {
        public static final b a = new b();

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(v<ResolveResponse> vVar) {
            v<ResolveResponse> vVar2 = vVar;
            h.f(vVar2, "it");
            return vVar2.f();
        }
    }

    static final class c<T, R> implements l<T, R> {
        public static final c a = new c();

        c() {
        }

        @Override // io.reactivex.functions.l
        public Object apply(Object obj) {
            com.spotify.remoteconfig.client.model.resolve.a aVar = (com.spotify.remoteconfig.client.model.resolve.a) obj;
            h.f(aVar, "it");
            d0e.a aVar2 = d0e.d;
            return d0e.a.a(aVar);
        }
    }

    /* renamed from: com.spotify.remoteconfig.client.network.d$d  reason: collision with other inner class name */
    static final class C0385d<T> implements io.reactivex.functions.g<d0e> {
        final /* synthetic */ d a;

        C0385d(d dVar) {
            this.a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(d0e d0e) {
            d0e d0e2 = d0e;
            h.f(d0e2, "it");
            ((j0e) this.a.h).f(d0e2);
        }
    }

    static final class e<T> implements io.reactivex.functions.g<Throwable> {
        final /* synthetic */ d a;

        e(d dVar) {
            this.a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            h.f(th2, AppProtocol.LogMessage.SEVERITY_ERROR);
            trf.c(th2, "There was an error when calling fetch.", new Object[0]);
            ((com.spotify.remoteconfig.client.logging.a) this.a.g).b(this.a.e, -1, th2.toString());
        }
    }

    static final class f<T> implements io.reactivex.functions.g<v<ResolveResponse>> {
        final /* synthetic */ d a;

        f(d dVar) {
            this.a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(v<ResolveResponse> vVar) {
            e0 d;
            v<ResolveResponse> vVar2 = vVar;
            h.f(vVar2, "response");
            if (!vVar2.f()) {
                h.f(vVar2, "$this$getErrorMessage");
                String c = vVar2.e().c("grpc-message");
                String str = "";
                if (c == null && ((d = vVar2.d()) == null || (c = d.m()) == null || !(!h.a(c, str)))) {
                    c = null;
                }
                if (c == null) {
                    c = vVar2.g();
                }
                if (c != null) {
                    str = c;
                }
                trf.b("There was an error returned from RCS. code: %d body: %s", Integer.valueOf(d.g(this.a, vVar2)), str);
                ((com.spotify.remoteconfig.client.logging.a) this.a.g).b(this.a.e, d.g(this.a, vVar2), str);
            }
            trf.d("RCS responded with code %d", Integer.valueOf(d.g(this.a, vVar2)));
            trf.e("RCS body %s", vVar2.a());
        }
    }

    static final class g<T, R> implements l<v<ResolveResponse>, com.spotify.remoteconfig.client.model.resolve.a> {
        public static final g a = new g();

        g() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public com.spotify.remoteconfig.client.model.resolve.a apply(v<ResolveResponse> vVar) {
            Boolean bool;
            Integer num;
            v<ResolveResponse> vVar2 = vVar;
            h.f(vVar2, "response");
            ResolveResponse a2 = vVar2.a();
            if (a2 != null) {
                h.b(a2, "it");
                Configuration h = a2.h();
                h.b(h, "it.configuration");
                h.f(h, "protoConfiguration");
                List<Configuration.AssignedValue> h2 = h.h();
                h.b(h2, "protoConfiguration.assignedValuesList");
                ArrayList arrayList = new ArrayList(kotlin.collections.d.e(h2, 10));
                for (T t : h2) {
                    h.b(t, "it");
                    h.f(t, "proto");
                    String str = null;
                    if (t.o() == Configuration.AssignedValue.StructuredValueCase.BOOL_VALUE) {
                        Configuration.AssignedValue.BoolValue h3 = t.h();
                        h.b(h3, "proto.boolValue");
                        bool = Boolean.valueOf(h3.i());
                    } else {
                        bool = null;
                    }
                    if (t.o() == Configuration.AssignedValue.StructuredValueCase.INT_VALUE) {
                        Configuration.AssignedValue.IntValue l = t.l();
                        h.b(l, "proto.intValue");
                        num = Integer.valueOf(l.i());
                    } else {
                        num = null;
                    }
                    if (t.o() == Configuration.AssignedValue.StructuredValueCase.ENUM_VALUE) {
                        Configuration.AssignedValue.EnumValue i = t.i();
                        h.b(i, "proto.enumValue");
                        str = i.i();
                    }
                    PropertyDefinition$Identifier n = t.n();
                    h.b(n, "proto.propertyId");
                    String i2 = n.i();
                    h.b(i2, "proto.propertyId.name");
                    PropertyDefinition$Identifier n2 = t.n();
                    h.b(n2, "proto.propertyId");
                    String l2 = n2.l();
                    h.b(l2, "proto.propertyId.scope");
                    Configuration.AssignedValue.Metadata m = t.m();
                    h.b(m, "proto.metadata");
                    arrayList.add(new AssignedPropertyValue(i2, l2, bool, num, str, m.i(), null));
                }
                String i3 = h.i();
                h.b(i3, "protoConfiguration.configurationAssignmentId");
                return new com.spotify.remoteconfig.client.model.resolve.a(i3, h.m(), arrayList, (kotlin.jvm.internal.f) null);
            }
            throw new IllegalStateException("Response body shouldn't be null when the it's successful".toString());
        }
    }

    public d(c0e c0e, j jVar, EventLogger eventLogger, k0e k0e, com.spotify.remoteconfig.client.cosmos.a aVar) {
        h.f(c0e, "clientAttributes");
        h.f(jVar, "service");
        h.f(eventLogger, "logger");
        h.f(k0e, "fetchedConfigStore");
        h.f(aVar, "coreBridge");
        this.e = c0e;
        this.f = jVar;
        this.g = eventLogger;
        this.h = k0e;
        this.i = aVar;
    }

    public static final int g(d dVar, v vVar) {
        dVar.getClass();
        return vVar.b();
    }

    public static final ResolveRequest h(c0e c0e, FetchType fetchType) {
        h.f(c0e, "clientAttributes");
        h.f(fetchType, "fetchType");
        ResolveRequest.b m = ResolveRequest.m();
        m.o(c0e.d());
        Fetch.Type type = Fetch.Type.UNRECOGNIZED;
        Fetch.b i2 = Fetch.i();
        h.b(i2, "it");
        int ordinal = fetchType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                type = Fetch.Type.BACKGROUND_SYNC;
            } else if (ordinal == 2) {
                type = Fetch.Type.BLOCKING;
            } else if (ordinal == 3) {
                type = Fetch.Type.DELAYED;
            } else if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        i2.m(type);
        GeneratedMessageLite build = i2.build();
        h.b(build, "Fetch.newBuilder().also …D\n        }\n    }.build()");
        m.n((Fetch) build);
        Context.b i3 = Context.i();
        Context.ContextEntry.a l = Context.ContextEntry.l();
        l.m(DynamicContext.KnownContext.KNOWN_CONTEXT_INSTALLATION_ID);
        l.n(c0e.c());
        i3.m(l);
        Context.ContextEntry.a l2 = Context.ContextEntry.l();
        l2.m(DynamicContext.KnownContext.KNOWN_CONTEXT_VERSION);
        l2.n(c0e.b());
        i3.m(l2);
        m.m(i3);
        GeneratedMessageLite build2 = m.build();
        h.b(build2, "ResolveRequest.newBuilde…   )\n            .build()");
        return (ResolveRequest) build2;
    }

    @Override // com.spotify.remoteconfig.client.network.b
    public io.reactivex.a a(FetchType fetchType, g0e g0e) {
        h.f(fetchType, "fetchType");
        h.f(g0e, "sdkProperties");
        throw new IllegalStateException("PropertiesProvider is not supported for this service".toString());
    }

    @Override // com.spotify.remoteconfig.client.network.b
    public io.reactivex.a b(FetchType fetchType) {
        h.f(fetchType, "fetchType");
        i iVar = new i(this.f.b(h(this.e, fetchType)).p(this.a).m(this.b).r(b.a).l(this.c).w().H(io.reactivex.schedulers.a.c()).s(this.d).A(c.a).F((R) ((j0e) this.h).d()).p(new C0385d(this)));
        h.b(iVar, "service\n            .res…         .toCompletable()");
        return iVar;
    }
}
