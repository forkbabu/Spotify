package com.spotify.music.features.browse.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.z0;

public class c implements z0 {
    private jc4 a;
    private final kg4 b;
    private final lc4 c;
    private final b91 f;
    private final w51 n;
    private View o;

    c(kg4 kg4, lc4 lc4, w51 w51, b91 b91) {
        this.b = kg4;
        this.c = lc4;
        this.n = w51;
        this.f = b91;
    }

    @Override // com.spotify.pageloader.z0
    public void d(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null) {
            bundle.setClassLoader(b61.class.getClassLoader());
            parcelable = bundle.getParcelable("browse_hubs_state");
        } else {
            parcelable = null;
        }
        if (parcelable != null) {
            ((kc4) this.a).d(parcelable);
        }
    }

    @Override // com.spotify.pageloader.z0
    public Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("browse_hubs_state", ((kc4) this.a).e());
        return bundle;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.o;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.o = this.b.p(context);
        this.a = this.c.b(new b61(this.n, this.b));
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        ((kc4) this.a).f(this.f);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        ((kc4) this.a).g();
    }
}
