package com.spotify.music.features.entityselector.container;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.C0707R;
import com.spotify.music.features.entityselector.container.view.EntitySelectorViews;
import dagger.android.support.DaggerAppCompatDialogFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class EntitySelectorFragment extends DaggerAppCompatDialogFragment {
    public EntitySelectorsInjector v0;
    public nmf<List<ty4>, f> w0;
    public cmf<List<ty4>> x0;
    public dz4 y0;
    private MobiusLoop.g<xy4, wy4> z0;

    public EntitySelectorFragment() {
        V4(2, C0707R.style.res_2132083508_theme_glue_noactionbar_entityselectordialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        MobiusLoop.g<xy4, wy4> gVar = this.z0;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        MobiusLoop.g<xy4, wy4> gVar = this.z0;
        if (gVar != null) {
            gVar.stop();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        h.e(dialogInterface, "dialog");
        nmf<List<ty4>, f> nmf = this.w0;
        if (nmf != null) {
            cmf<List<ty4>> cmf = this.x0;
            if (cmf != null) {
                nmf.invoke(cmf.invoke());
                super.onDismiss(dialogInterface);
                return;
            }
            h.k("resultProvider");
            throw null;
        }
        h.k("resultConsumer");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        String string = k4().getString("list_name");
        ArrayList<String> stringArrayList = k4().getStringArrayList("playlist_items");
        if (stringArrayList == null) {
            stringArrayList = new ArrayList<>();
        }
        List Q = d.Q(stringArrayList);
        dz4 dz4 = this.y0;
        if (dz4 != null) {
            b bVar = new b(this, Q, string, dz4);
            dz4 dz42 = this.y0;
            if (dz42 != null) {
                EntitySelectorViews entitySelectorViews = new EntitySelectorViews(layoutInflater, viewGroup, bVar, dz42);
                xy4 xy4 = new xy4(null, string, d.Q(stringArrayList), 1);
                EntitySelectorsInjector entitySelectorsInjector = this.v0;
                if (entitySelectorsInjector != null) {
                    MobiusLoop.g<xy4, wy4> a = entitySelectorsInjector.a(xy4);
                    this.z0 = a;
                    if (a != null) {
                        a.c(entitySelectorViews);
                        return entitySelectorViews.a();
                    }
                    h.k("controller");
                    throw null;
                }
                h.k("injector");
                throw null;
            }
            h.k("entitySelectorLogger");
            throw null;
        }
        h.k("entitySelectorLogger");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        MobiusLoop.g<xy4, wy4> gVar = this.z0;
        if (gVar != null) {
            gVar.d();
        } else {
            h.k("controller");
            throw null;
        }
    }
}
