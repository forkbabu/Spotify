package com.spotify.music.features.blendinvitation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class BlendInvitationFragment extends DaggerFragment implements s {
    public BlendInvitationInjector h0;
    public Picasso i0;
    public wlf<x34> j0;
    private MobiusLoop.g<x34, v34> k0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        String string = context.getString(C0707R.string.create_blend);
        h.d(string, "context.getString(R.string.create_blend)");
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        MobiusLoop.g<x34, v34> gVar = this.k0;
        if (gVar != null) {
            gVar.stop();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        MobiusLoop.g<x34, v34> gVar = this.k0;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "blend-invitation";
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.BLEND_INVITATION, null);
        h.d(b, "PageViewObservable.creat…tifiers.BLEND_INVITATION)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        Picasso picasso = this.i0;
        if (picasso != null) {
            p44 p44 = new p44(layoutInflater, viewGroup, picasso);
            BlendInvitationInjector blendInvitationInjector = this.h0;
            if (blendInvitationInjector != null) {
                wlf<x34> wlf = this.j0;
                if (wlf != null) {
                    x34 x34 = wlf.get();
                    h.d(x34, "initialModelProvider.get()");
                    MobiusLoop.g<x34, v34> a = blendInvitationInjector.a(x34);
                    this.k0 = a;
                    if (a != null) {
                        a.c(p44);
                        return p44.f();
                    }
                    h.k("controller");
                    throw null;
                }
                h.k("initialModelProvider");
                throw null;
            }
            h.k("injector");
            throw null;
        }
        h.k("picasso");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        MobiusLoop.g<x34, v34> gVar = this.k0;
        if (gVar != null) {
            gVar.d();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.n;
        h.d(ifd, "FeatureIdentifiers.BLEND");
        return ifd;
    }
}
