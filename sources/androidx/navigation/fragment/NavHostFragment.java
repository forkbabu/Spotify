package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.o;
import androidx.navigation.NavController;
import androidx.navigation.q;
import androidx.navigation.u;
import androidx.navigation.w;
import androidx.navigation.x;
import com.spotify.music.C0707R;

public class NavHostFragment extends Fragment {
    private q g0;
    private Boolean h0 = null;
    private View i0;
    private int j0;
    private boolean k0;

    public static NavController K4(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.P2()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).L4();
            }
            Fragment f0 = fragment2.Q2().f0();
            if (f0 instanceof NavHostFragment) {
                return ((NavHostFragment) f0).L4();
            }
        }
        View a3 = fragment.a3();
        if (a3 != null) {
            return u.a(a3);
        }
        throw new IllegalStateException(je.u0("Fragment ", fragment, " does not have a NavController set"));
    }

    @Override // androidx.fragment.app.Fragment
    public void D3(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.D3(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.b);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.j0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.c);
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.k0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void K3(boolean z) {
        q qVar = this.g0;
        if (qVar != null) {
            qVar.c(z);
        } else {
            this.h0 = Boolean.valueOf(z);
        }
    }

    public final NavController L4() {
        q qVar = this.g0;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        Bundle n = this.g0.n();
        if (n != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", n);
        }
        if (this.k0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i = this.j0;
        if (i != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        if (view instanceof ViewGroup) {
            view.setTag(C0707R.id.nav_controller_view_tag, this.g0);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.i0 = view2;
                if (view2.getId() == L2()) {
                    this.i0.setTag(C0707R.id.nav_controller_view_tag, this.g0);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        super.p3(context);
        if (this.k0) {
            androidx.fragment.app.x i = Q2().i();
            i.v(this);
            i.i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        Bundle bundle2;
        super.s3(bundle);
        q qVar = new q(l4());
        this.g0 = qVar;
        qVar.p(this);
        this.g0.q(j4().S0());
        q qVar2 = this.g0;
        Boolean bool = this.h0;
        int i = 0;
        qVar2.c(bool != null && bool.booleanValue());
        Bundle bundle3 = null;
        this.h0 = null;
        this.g0.r(Z());
        q qVar3 = this.g0;
        qVar3.g().a(new DialogFragmentNavigator(l4(), E2()));
        w g = qVar3.g();
        Context l4 = l4();
        o E2 = E2();
        int L2 = L2();
        if (L2 == 0 || L2 == -1) {
            L2 = C0707R.id.nav_host_fragment_container;
        }
        g.a(new a(l4, E2, L2));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.k0 = true;
                androidx.fragment.app.x i2 = Q2().i();
                i2.v(this);
                i2.i();
            }
            this.j0 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.g0.m(bundle2);
        }
        int i3 = this.j0;
        if (i3 != 0) {
            this.g0.o(i3, null);
            return;
        }
        Bundle D2 = D2();
        if (D2 != null) {
            i = D2.getInt("android-support-nav:fragment:graphId");
        }
        if (D2 != null) {
            bundle3 = D2.getBundle("android-support-nav:fragment:startDestinationArgs");
        }
        if (i != 0) {
            this.g0.o(i, bundle3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int L2 = L2();
        if (L2 == 0 || L2 == -1) {
            L2 = C0707R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(L2);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        View view = this.i0;
        if (view != null && u.a(view) == this.g0) {
            this.i0.setTag(C0707R.id.nav_controller_view_tag, null);
        }
        this.i0 = null;
    }
}
