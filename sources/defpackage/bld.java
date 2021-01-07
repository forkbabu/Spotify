package defpackage;

import android.view.ViewGroup;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.connectivity.v;
import com.spotify.remoteconfig.g7;
import com.spotify.superbird.ota.api.b;
import com.spotify.superbird.ota.logger.pitstopevents.OtaEvent;
import com.spotify.superbird.ota.model.VersionedPackage;
import com.spotify.superbird.ota.model.g;
import io.reactivex.disposables.a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bld  reason: default package */
public class bld implements ahb, d {
    private static final long t = TimeUnit.HOURS.toMillis(1);
    private final g7 a;
    private final vne b;
    private final a c = new a();
    private final ekd f;
    private final b n;
    private final ape o;
    private final cqe p;
    private final com.spotify.music.settings.a q;
    private final v r;
    private long s;

    public bld(g7 g7Var, ape ape, b bVar, ekd ekd, vne vne, cqe cqe, com.spotify.music.settings.a aVar, v vVar) {
        this.a = g7Var;
        this.b = vne;
        this.f = ekd;
        this.n = bVar;
        this.o = ape;
        this.p = cqe;
        this.q = aVar;
        this.r = vVar;
    }

    private void b(String str, List<g> list) {
        for (g gVar : list) {
            try {
                this.b.c(str, gVar, false);
            } catch (IOException e) {
                this.o.b(str, gVar.packageName(), gVar.version(), gVar.fromVersion(), String.format("Failed to download a package: %s", e.getMessage()));
            }
        }
    }

    private boolean k() {
        return this.a.b() && this.f.g();
    }

    @Override // defpackage.ahb
    public void a() {
        if (k()) {
            if (!(this.p.d() - this.s < t)) {
                String h = this.f.h();
                if (!MoreObjects.isNullOrEmpty(h)) {
                    List<? extends VersionedPackage> singletonList = Collections.singletonList(VersionedPackage.create("superbird-os", ""));
                    this.o.e(h, singletonList, OtaEvent.Trigger.MOBILE);
                    this.c.b(this.n.a(h).subscribe(new ukd(this, h), new tkd(this, h, singletonList)));
                    this.s = this.p.d();
                }
            }
        }
    }

    @Override // defpackage.ahb
    public void c() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (k()) {
            this.b.q();
        }
    }

    @Override // defpackage.ahb
    public void e() {
        this.c.f();
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        if (k()) {
            this.b.r();
        }
    }

    public /* synthetic */ void h(String str, List list, Boolean bool) {
        if (bool.booleanValue()) {
            b(str, list);
        }
    }

    public void i(String str, List list) {
        if (!list.isEmpty()) {
            boolean z = true;
            if (!(this.r.c() == ConnectionType.CONNECTION_TYPE_WLAN)) {
                if (list.isEmpty() || ((g) list.get(0)).sizeBytes() <= 10485760) {
                    z = false;
                }
                if (z) {
                    this.c.b(this.q.a().j0(ykd.a).S().subscribe(new vkd(this, str, list)));
                    return;
                }
            }
            b(str, list);
        }
    }

    public /* synthetic */ void j(String str, List list, Throwable th) {
        this.o.c(str, list, (String) MoreObjects.firstNonNull(th.getMessage(), "Failed to check for updates."));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SuperbirdOtaPlugin";
    }
}
