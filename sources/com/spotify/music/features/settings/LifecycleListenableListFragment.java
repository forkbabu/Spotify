package com.spotify.music.features.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.fragment.app.ListFragment;
import com.spotify.mobile.android.util.ui.Lifecycle$Listeners;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.l;

public abstract class LifecycleListenableListFragment extends ListFragment implements k {
    private final Lifecycle$Listeners q0 = new Lifecycle$Listeners();

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.q0.f();
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.q0.h();
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        this.q0.i(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.q0.j();
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.q0.k();
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        this.q0.g(bundle);
    }

    @Override // com.spotify.mobile.android.util.ui.k
    public boolean e1(l lVar) {
        return this.q0.e1(lVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        this.q0.b(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.q0.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        this.q0.d(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.q0.e();
    }

    @Override // com.spotify.mobile.android.util.ui.k
    public boolean y0(l lVar) {
        Lifecycle$Listeners lifecycle$Listeners = this.q0;
        lVar.getClass();
        return lifecycle$Listeners.y0(lVar);
    }
}
