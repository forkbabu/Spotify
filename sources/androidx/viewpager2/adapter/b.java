package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;

/* access modifiers changed from: package-private */
public class b extends o.e {
    final /* synthetic */ Fragment a;
    final /* synthetic */ FrameLayout b;
    final /* synthetic */ FragmentStateAdapter c;

    b(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        this.c = fragmentStateAdapter;
        this.a = fragment;
        this.b = frameLayout;
    }

    @Override // androidx.fragment.app.o.e
    public void b(o oVar, Fragment fragment, View view, Bundle bundle) {
        if (fragment == this.a) {
            oVar.R0(this);
            this.c.X(view, this.b);
        }
    }
}
