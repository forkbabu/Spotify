package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.header.m0;
import defpackage.ep6;
import defpackage.ip6;
import defpackage.lp6;
import defpackage.np6;
import defpackage.pp6;
import defpackage.zt6;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

/* renamed from: wp6  reason: default package */
public final class wp6 implements zo6 {
    private final up6 a;
    private final sq6 b;
    private final zt6.b.a c;
    private final ui6 d;
    private final gq6 e;
    private final cq6 f;
    private final com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar.e g;

    /* renamed from: wp6$a */
    public static final class a implements ep6.c {
        final /* synthetic */ wp6 a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(wp6 wp6) {
            this.a = wp6;
        }

        @Override // defpackage.ep6.c
        public List<AdditionalAdapter> a(ep6.b bVar) {
            h.e(bVar, "dependencies");
            eq6 b = this.a.e.b();
            h.d(b, "songsNotDownloadedAdapterFactory.create()");
            bq6 b2 = this.a.f.b();
            h.d(b2, "downloadedTrackCountAdapterFactory.create()");
            return kotlin.collections.d.u(b, b2);
        }
    }

    /* renamed from: wp6$b */
    public static final class b implements ep6.c {
        b() {
        }

        @Override // defpackage.ep6.c
        public List<AdditionalAdapter> a(ep6.b bVar) {
            h.e(bVar, "dependencies");
            return EmptyList.a;
        }
    }

    /* renamed from: wp6$c */
    public static final class c implements ip6.a {
        final /* synthetic */ wp6 a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(wp6 wp6) {
            this.a = wp6;
        }

        @Override // defpackage.ip6.a
        public xo6 a(LicenseLayout licenseLayout) {
            h.e(licenseLayout, "licenseLayout");
            this.a.a.getClass();
            return new tp6();
        }
    }

    /* renamed from: wp6$d */
    public static final class d implements lp6.b {
        final /* synthetic */ wp6 a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(wp6 wp6) {
            this.a = wp6;
        }

        @Override // defpackage.lp6.b
        public m0 a(lp6.a aVar) {
            h.e(aVar, "dependencies");
            rq6 b = this.a.b.b(aVar.e());
            h.d(b, "headerViewFactory.create…istHeaderConfiguration())");
            return b;
        }
    }

    /* renamed from: wp6$e */
    public static final class e implements np6.b {
        final /* synthetic */ wp6 a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(wp6 wp6) {
            this.a = wp6;
        }

        @Override // defpackage.np6.b
        public uh6 a(np6.a aVar) {
            h.e(aVar, "dependencies");
            ui6 ui6 = this.a.d;
            up6 up6 = this.a.a;
            ItemListConfiguration d = aVar.d();
            up6.getClass();
            h.e(d, "itemListConfiguration");
            ItemListConfiguration.a t = d.t();
            t.m(false);
            return ui6.a(t.d());
        }
    }

    /* renamed from: wp6$f */
    public static final class f implements pp6.b {
        final /* synthetic */ wp6 a;

        /* renamed from: wp6$f$a */
        public static final class a implements zt6.c {
            a() {
            }

            @Override // defpackage.zt6.c
            public zt6.c.a a(h76 h76) {
                h.e(h76, "playlistMetadata");
                return zt6.c.a.d;
            }
        }

        /* renamed from: wp6$f$b */
        public static final class b implements zt6.d<eu6> {
            b() {
            }

            @Override // defpackage.zt6.d
            public ImmutableList<eu6> a(ImmutableList<eu6> immutableList) {
                h.e(immutableList, "original");
                return immutableList;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(wp6 wp6) {
            this.a = wp6;
        }

        @Override // defpackage.pp6.b
        public zt6 a(pp6.a aVar) {
            h.e(aVar, "dependencies");
            zt6.b create = this.a.c.create();
            up6 up6 = this.a.a;
            ToolbarConfiguration a2 = aVar.a();
            up6.getClass();
            h.e(a2, "toolbarConfiguration");
            ToolbarConfiguration.a l = a2.l();
            l.c(false);
            l.f(ToolbarConfiguration.FollowOption.NONE);
            l.h(false);
            ToolbarConfiguration a3 = l.a();
            a aVar2 = new a();
            b bVar = new b();
            com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar.d b2 = this.a.g.b();
            h.d(b2, "premiumMiniToolbarDelegateFactory.create()");
            return create.a(a3, aVar2, bVar, b2);
        }
    }

    public wp6(up6 up6, sq6 sq6, zt6.b.a aVar, ui6 ui6, gq6 gq6, cq6 cq6, com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar.e eVar) {
        h.e(up6, "premiumMiniConfigurations");
        h.e(sq6, "headerViewFactory");
        h.e(aVar, "toolbarFactory");
        h.e(ui6, "vanillaItemListView");
        h.e(gq6, "songsNotDownloadedAdapterFactory");
        h.e(cq6, "downloadedTrackCountAdapterFactory");
        h.e(eVar, "premiumMiniToolbarDelegateFactory");
        this.a = up6;
        this.b = sq6;
        this.c = aVar;
        this.d = ui6;
        this.e = gq6;
        this.f = cq6;
        this.g = eVar;
    }

    @Override // defpackage.pp6
    public Optional<pp6.b> a() {
        Optional<pp6.b> of = Optional.of(new f(this));
        h.d(of, "Optional.of(\n        obj…        }\n        }\n    )");
        return of;
    }

    @Override // defpackage.ep6
    public ep6.a b(AdditionalAdapter.Position position) {
        h.e(position, "position");
        int ordinal = position.ordinal();
        if (ordinal == 1) {
            return new ep6.a.d(new a(this));
        }
        if (ordinal != 2) {
            return ep6.a.b.a;
        }
        return new ep6.a.d(new b());
    }

    @Override // defpackage.np6
    public Optional<np6.b> c() {
        Optional<np6.b> of = Optional.of(new e(this));
        h.d(of, "Optional.of(\n           …)\n            }\n        )");
        return of;
    }

    @Override // defpackage.lp6
    public Optional<lp6.b> d() {
        Optional<lp6.b> of = Optional.of(new d(this));
        h.d(of, "Optional.of(\n           …)\n            }\n        )");
        return of;
    }

    @Override // defpackage.gp6
    public /* synthetic */ Optional e() {
        return fp6.a(this);
    }

    @Override // defpackage.ip6
    public Optional<ip6.a> f() {
        Optional<ip6.a> of = Optional.of(new c(this));
        h.d(of, "Optional.of(\n           …          }\n            )");
        return of;
    }

    @Override // defpackage.zo6
    public Optional<com.spotify.instrumentation.a> g(LicenseLayout licenseLayout) {
        h.e(licenseLayout, "licenseLayout");
        Optional<com.spotify.instrumentation.a> of = Optional.of(PageIdentifiers.PREMIUM_MINI_DOWNLOADED_ENTITY);
        h.d(of, "Optional.of(PageIdentifi…M_MINI_DOWNLOADED_ENTITY)");
        return of;
    }

    @Override // defpackage.ip6
    public /* synthetic */ Optional h(LicenseLayout licenseLayout) {
        return hp6.b(this, licenseLayout);
    }

    @Override // defpackage.qp6
    public String name() {
        return "Premium Mini Downloaded Songs";
    }
}
