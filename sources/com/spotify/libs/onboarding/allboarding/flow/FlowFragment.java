package com.spotify.libs.onboarding.allboarding.flow;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l0;
import androidx.fragment.app.x;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.m;
import com.spotify.libs.onboarding.allboarding.b;
import com.spotify.music.C0707R;
import kotlin.d;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class FlowFragment extends Fragment {
    private final d g0 = l0.a(this, j.b(b.class), new FlowFragment$$special$$inlined$activityViewModels$1(this), new FlowFragment$$special$$inlined$activityViewModels$2(this));

    static final class a implements NavController.b {
        final /* synthetic */ FlowFragment a;

        a(FlowFragment flowFragment) {
            this.a = flowFragment;
        }

        @Override // androidx.navigation.NavController.b
        public final void a(NavController navController, m mVar, Bundle bundle) {
            h.e(navController, "<anonymous parameter 0>");
            h.e(mVar, "destination");
            FlowFragment.K4(this.a).h(mVar.k());
        }
    }

    public FlowFragment() {
        super(C0707R.layout.flow_view);
    }

    public static final b K4(FlowFragment flowFragment) {
        return (b) flowFragment.g0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        Fragment T = E2().T(C0707R.id.nav_host_fragment);
        if (T != null) {
            NavController L4 = ((NavHostFragment) T).L4();
            h.d(L4, "navHostFragment.navController");
            L4.o(C0707R.navigation.onboarding, k4());
            L4.a(new a(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        super.p3(context);
        x i = Q2().i();
        i.v(this);
        i.i();
    }
}
