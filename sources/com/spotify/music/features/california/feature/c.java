package com.spotify.music.features.california.feature;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import com.spotify.remoteconfig.bd;
import kotlin.jvm.internal.h;

public final class c implements s0 {
    private CaliforniaViewBinderImpl a;
    private CaliforniaPresenter b;
    private final g c;
    private final j f;
    private final String n;

    public c(bd bdVar, g gVar, j jVar, f fVar, String str) {
        h.e(bdVar, "properties");
        h.e(gVar, "presenterFactory");
        h.e(jVar, "viewBinderFactory");
        h.e(fVar, "args");
        h.e(str, "employeeFlag");
        this.c = gVar;
        this.f = jVar;
        this.n = str;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        CaliforniaViewBinderImpl californiaViewBinderImpl = this.a;
        if (californiaViewBinderImpl != null) {
            return californiaViewBinderImpl.e();
        }
        return null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        CaliforniaViewBinderImpl b2 = this.f.b(layoutInflater, viewGroup);
        this.a = b2;
        CaliforniaPresenter b3 = this.c.b(b2, this.n);
        h.d(b3, "presenterFactory.create(viewBinder, employeeFlag)");
        this.b = b3;
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        CaliforniaPresenter californiaPresenter = this.b;
        if (californiaPresenter != null) {
            californiaPresenter.e();
        } else {
            h.k("presenter");
            throw null;
        }
    }
}
