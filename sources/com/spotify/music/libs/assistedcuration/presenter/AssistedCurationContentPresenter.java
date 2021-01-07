package com.spotify.music.libs.assistedcuration.presenter;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.assistedcuration.AssistedCurationLogger;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.music.libs.assistedcuration.model.i;
import com.spotify.music.libs.assistedcuration.provider.b0;
import com.spotify.music.preview.v;
import com.spotify.rxjava2.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class AssistedCurationContentPresenter implements m {
    private final a2a a;
    private final AssistedCurationLogger b;
    private final String c;
    private final b0 f;
    private final x1a n;
    private final v o;
    private final ExplicitContentFacade p;
    private final AgeRestrictedContentFacade q;
    private ImmutableMap<String, Integer> r = ImmutableMap.of();
    private String s;
    private String t;
    private final AtomicInteger u = new AtomicInteger(0);
    private final Set<String> v = new HashSet();
    private boolean w;
    private boolean x;
    private final p y = new p();

    public interface a {
        AssistedCurationContentPresenter a(n nVar, a2a a2a, com.spotify.instrumentation.a aVar, v vVar, x1a x1a);
    }

    public AssistedCurationContentPresenter(String str, b0 b0Var, ExplicitContentFacade explicitContentFacade, AgeRestrictedContentFacade ageRestrictedContentFacade, AssistedCurationLogger.a aVar, n nVar, a2a a2a, com.spotify.instrumentation.a aVar2, v vVar, x1a x1a) {
        this.c = str;
        this.f = b0Var;
        this.o = vVar;
        this.p = explicitContentFacade;
        this.q = ageRestrictedContentFacade;
        this.a = a2a;
        this.b = aVar.a(aVar2);
        this.n = x1a;
        nVar.A().a(this);
    }

    private int a(String str) {
        Integer num = this.r.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private void j(e eVar, String str, String str2) {
        if (this.w && eVar.h()) {
            this.q.d(eVar.getUri(), eVar.getImageUri());
        } else if (!this.x || !eVar.isExplicit()) {
            this.o.i(str2, str);
        } else {
            this.p.e(eVar.getUri(), null);
        }
    }

    public i b() {
        i.a a2 = i.a();
        a2.a(this.f.a());
        a2.b(this.u.get());
        a2.c(this.s);
        return a2.build();
    }

    public void c(ArrayList arrayList) {
        this.f.b(this.v);
        this.a.m(this.t);
        this.n.a(arrayList);
    }

    public void d(int i, h hVar) {
        String d = hVar.d();
        if (!rw.equal(this.s, d)) {
            this.s = d;
            this.b.i(d, i);
        }
    }

    public void e(h hVar) {
        if (rw.equal(hVar.d(), this.s)) {
            this.b.h(hVar.d());
            this.f.e(hVar, this.v);
        }
    }

    public void f(ArrayList<String> arrayList) {
        arrayList.getClass();
        MoreObjects.checkArgument(!arrayList.isEmpty());
        if (!this.v.containsAll(arrayList)) {
            this.v.addAll(arrayList);
            String str = arrayList.get(arrayList.size() - 1);
            this.b.a(str);
            this.y.b(this.f.g(str, this.v, this.c).subscribe(new a(this, arrayList)));
        }
    }

    public void g(h hVar, e eVar, int i) {
        String d = hVar.d();
        if (rw.equal(d, this.s)) {
            String uri = eVar.getUri();
            if (this.v.contains(uri)) {
                this.f.b(this.v);
                this.a.b(this.t);
                return;
            }
            this.v.add(uri);
            this.o.e(dz9.a(eVar, hVar));
            this.b.c(d, a(d), eVar.getUri(), i, this.c);
            this.f.c(hVar, eVar, this.v);
            ArrayList newArrayList = Collections2.newArrayList(uri);
            this.f.b(this.v);
            this.a.m(this.t);
            this.n.a(newArrayList);
        }
    }

    public void h(h hVar, e eVar, int i) {
        String d = hVar.d();
        String previewId = eVar.getPreviewId();
        if (rw.equal(d, this.s) && previewId != null) {
            String a2 = dz9.a(eVar, hVar);
            int a3 = a(d);
            String uri = eVar.getUri();
            if (this.o.a(a2)) {
                this.b.g(d, a3, uri, i);
                this.o.e(a2);
                return;
            }
            this.b.f(d, a3, uri, i);
            j(eVar, a2, previewId);
        }
    }

    public void i(h hVar, e eVar, int i) {
        String d = hVar.d();
        String previewId = eVar.getPreviewId();
        if (rw.equal(d, this.s) && previewId != null) {
            String a2 = dz9.a(eVar, hVar);
            int a3 = a(d);
            String uri = eVar.getUri();
            if (this.o.a(a2)) {
                this.b.e(d, a3, uri, i);
                this.o.e(a2);
                return;
            }
            this.b.d(d, a3, uri, i);
            j(eVar, a2, previewId);
        }
    }

    public void k(i iVar) {
        this.u.set(iVar.b());
        this.s = iVar.d();
        this.f.f(iVar.c());
    }

    public void l(s sVar) {
        x c2 = sVar.c();
        this.t = c2.a();
        this.v.addAll(c2.b());
        List<h> a2 = sVar.a();
        this.w = sVar.d();
        this.x = sVar.e();
        if (!a2.isEmpty()) {
            this.a.j(a2, this.x, this.w);
            this.a.h();
            ImmutableMap.Builder builder = ImmutableMap.builder();
            for (int i = 0; i < a2.size(); i++) {
                builder.mo51put(a2.get(i).d(), Integer.valueOf(i));
            }
            this.r = builder.build();
            int size = sVar.a().size();
            if (size > this.u.get()) {
                this.u.set(size);
                this.a.o();
            }
        } else if (sVar.b().or((Optional<Boolean>) Boolean.FALSE).booleanValue()) {
            this.a.p();
            this.b.k();
        } else {
            this.a.l();
            this.b.m();
        }
    }

    @w(Lifecycle.Event.ON_STOP)
    public void onStopped(n nVar) {
        this.y.a();
    }
}
