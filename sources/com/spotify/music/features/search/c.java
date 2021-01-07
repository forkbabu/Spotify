package com.spotify.music.features.search;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.pageloader.z0;
import defpackage.qf8;
import defpackage.sg8;

public class c implements z0 {
    private final sg8.a a;
    private final qf8.a b;
    private final w51 c;
    private final b91 f;
    private Optional<qf8> n = Optional.absent();
    private View o;

    public c(sg8.a aVar, qf8.a aVar2, w51 w51, b91 b91) {
        this.a = aVar;
        this.b = aVar2;
        this.c = w51;
        this.f = b91;
    }

    @Override // com.spotify.pageloader.z0
    public void d(Bundle bundle) {
        bundle.setClassLoader(b61.class.getClassLoader());
        Parcelable parcelable = bundle.getParcelable("search_drilldown_state");
        if (parcelable != null && this.n.isPresent()) {
            this.n.get().b(parcelable);
        }
    }

    @Override // com.spotify.pageloader.z0
    public Bundle f() {
        Bundle bundle = new Bundle();
        if (this.n.isPresent()) {
            bundle.putParcelable("search_drilldown_state", this.n.get().a());
        }
        return bundle;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.o;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        sg8 a2 = this.a.a(context);
        this.n = Optional.of(this.b.a(new b61(this.c, a2)));
        this.o = ((tg8) a2).b();
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        if (this.n.isPresent()) {
            this.n.get().e(this.f);
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        if (this.n.isPresent()) {
            this.n.get().stop();
        }
    }
}
