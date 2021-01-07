package com.spotify.mobile.android.hubframework.model.immutable;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import defpackage.b91;
import defpackage.p81;
import defpackage.s81;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.d;

public final class h extends b91.a {
    private String a;
    private String b;
    private s81.a c;
    private final j<HubsImmutableComponentModel> d;
    private final j<HubsImmutableComponentModel> e;
    private String f;
    private p81.a g;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    h(HubsImmutableViewModel.c cVar) {
        this.a = cVar.r();
        this.b = cVar.t();
        HubsImmutableComponentModel q = cVar.q();
        this.c = q != null ? q.toBuilder() : null;
        this.d = new j<>(cVar.n());
        this.e = new j<>(cVar.s());
        this.f = cVar.p();
        this.g = cVar.o().toBuilder();
    }

    @Override // defpackage.b91.a
    public b91.a a(List<? extends s81> list) {
        kotlin.jvm.internal.h.e(list, "components");
        this.d.a(c.a(list));
        return this;
    }

    @Override // defpackage.b91.a
    public b91.a b(s81... s81Arr) {
        kotlin.jvm.internal.h.e(s81Arr, "components");
        this.d.a(c.a(d.c(s81Arr)));
        return this;
    }

    @Override // defpackage.b91.a
    public b91.a c(p81 p81) {
        kotlin.jvm.internal.h.e(p81, "custom");
        this.g = this.g.a(p81);
        return this;
    }

    @Override // defpackage.b91.a
    public b91.a d(String str, Serializable serializable) {
        kotlin.jvm.internal.h.e(str, "key");
        this.g = this.g.o(str, serializable);
        return this;
    }

    @Override // defpackage.b91.a
    public b91.a e(List<? extends s81> list) {
        this.d.c(c.b(list));
        return this;
    }

    @Override // defpackage.b91.a
    public b91.a f(s81... s81Arr) {
        kotlin.jvm.internal.h.e(s81Arr, "components");
        this.d.c(c.a(d.c(s81Arr)));
        return this;
    }

    @Override // defpackage.b91.a
    public b91 g() {
        HubsImmutableComponentModel hubsImmutableComponentModel;
        String str = this.a;
        String str2 = this.b;
        s81.a aVar = this.c;
        if (aVar != null) {
            HubsImmutableComponentModel.b bVar = HubsImmutableComponentModel.Companion;
            kotlin.jvm.internal.h.c(aVar);
            hubsImmutableComponentModel = bVar.c(aVar.l());
        } else {
            hubsImmutableComponentModel = null;
        }
        return new HubsImmutableViewModel(str, str2, hubsImmutableComponentModel, this.d.b(), this.e.b(), this.f, HubsImmutableComponentBundle.Companion.c(this.g.d()));
    }

    @Override // defpackage.b91.a
    public b91.a h(p81 p81) {
        this.g = p81 != null ? p81.toBuilder() : HubsImmutableComponentBundle.Companion.b();
        return this;
    }

    @Override // defpackage.b91.a
    public b91.a i(String str) {
        this.f = str;
        return this;
    }

    @Override // defpackage.b91.a
    public b91.a j(s81 s81) {
        this.c = s81 != null ? s81.toBuilder() : null;
        return this;
    }

    @Override // defpackage.b91.a
    public b91.a k(String str) {
        this.a = str;
        return this;
    }

    @Override // defpackage.b91.a
    public b91.a l(s81... s81Arr) {
        kotlin.jvm.internal.h.e(s81Arr, "components");
        this.e.c(c.a(d.c(s81Arr)));
        return this;
    }

    @Override // defpackage.b91.a
    public b91.a m(String str) {
        this.b = str;
        return this;
    }

    public b91.a n(List<? extends s81> list) {
        this.e.c(c.b(list));
        return this;
    }
}
