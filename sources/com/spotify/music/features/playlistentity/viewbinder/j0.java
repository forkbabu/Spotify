package com.spotify.music.features.playlistentity.viewbinder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.t;
import com.spotify.pageloader.z0;
import java.util.List;

public class j0 implements z0 {
    private final fs6 a;
    private final c b;
    private final a c;
    private final List<t> f;
    private final sr6 n;
    private View o;

    public interface a {
        void a(LayoutInflater layoutInflater, ViewGroup viewGroup);
    }

    public interface b {
    }

    public static abstract class c {
        /* access modifiers changed from: package-private */
        public abstract String a();

        /* access modifiers changed from: package-private */
        public abstract List<String> b();

        /* access modifiers changed from: package-private */
        public abstract LicenseLayout c();

        /* access modifiers changed from: package-private */
        public abstract String d();
    }

    public j0(sr6 sr6, fs6 fs6, c cVar, a aVar, List<t> list) {
        this.a = fs6;
        this.b = cVar;
        this.c = aVar;
        this.f = list;
        this.n = sr6;
    }

    @Override // com.spotify.pageloader.z0
    public void d(Bundle bundle) {
        this.n.b(bundle);
    }

    @Override // com.spotify.pageloader.z0
    public Bundle f() {
        Bundle bundle = new Bundle();
        this.n.c(bundle);
        return bundle;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.o;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.o = this.a.a(layoutInflater, viewGroup);
        this.c.a(layoutInflater, viewGroup);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        for (t tVar : this.f) {
            tVar.h();
        }
        this.a.b();
        this.n.d(this.b.d());
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        for (t tVar : this.f) {
            tVar.f();
        }
        this.n.e();
    }
}
