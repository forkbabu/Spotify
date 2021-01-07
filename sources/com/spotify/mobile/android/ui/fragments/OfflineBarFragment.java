package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.mobile.android.ui.view.anchorbar.d;
import com.spotify.music.C0707R;
import com.spotify.music.connection.OfflineReason;
import com.spotify.music.connection.g;
import com.spotify.music.connection.l;
import dagger.android.support.a;
import io.reactivex.disposables.b;
import io.reactivex.s;
import io.reactivex.y;

public class OfflineBarFragment extends LifecycleListenableFragment {
    public static final /* synthetic */ int q0 = 0;
    l h0;
    s<Boolean> i0;
    y j0;
    private TextView k0;
    private d l0;
    private int m0;
    private final Runnable n0 = new j(this);
    private final Handler o0 = new Handler();
    private b p0;

    public static void K4(OfflineBarFragment offlineBarFragment) {
        d dVar = offlineBarFragment.l0;
        if (dVar != null) {
            dVar.setVisible(true);
        }
    }

    public void L4(g.c cVar) {
        this.o0.removeCallbacks(this.n0);
        d dVar = this.l0;
        if (dVar != null) {
            dVar.setVisible(false);
        }
    }

    public void M4(g.b bVar) {
        if (bVar.d() == OfflineReason.FORCED_OFFLINE) {
            this.k0.setText(C0707R.string.main_spotify_is_in_offline_mode);
            this.o0.post(this.n0);
            return;
        }
        this.k0.setText(C0707R.string.main_spotify_has_no_internet_connection);
        this.o0.postDelayed(this.n0, (long) this.m0);
    }

    public void N4(g.a aVar) {
        this.k0.setText(C0707R.string.main_spotify_has_no_internet_connection);
        this.o0.postDelayed(this.n0, (long) this.m0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.p0 = s.n(this.h0.a(), this.i0, p.a).o0(this.j0).subscribe(new m(this), k.a);
    }

    public void O4(u3 u3Var) {
        boolean booleanValue = u3Var.b.booleanValue();
        F f = u3Var.a;
        if (booleanValue) {
            this.o0.removeCallbacks(this.n0);
            d dVar = this.l0;
            if (dVar != null) {
                dVar.setVisible(false);
                return;
            }
            return;
        }
        f.b(new n(this), new o(this), new l(this));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.p0.dispose();
        super.P3();
    }

    public void P4(d dVar) {
        this.l0 = dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_offline_bar, viewGroup, false);
        this.m0 = R2().getInteger(C0707R.integer.offline_bar_show_delay);
        this.k0 = (TextView) inflate.findViewById(C0707R.id.text);
        d dVar = this.l0;
        if (dVar != null) {
            dVar.setVisible(false);
        }
        return inflate;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void x3() {
        this.o0.removeCallbacks(this.n0);
        super.x3();
    }
}
