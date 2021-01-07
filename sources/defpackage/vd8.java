package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.search.OldSearchDrillDownFragment;
import com.spotify.music.features.search.SearchDrillDownFragment;
import com.spotify.music.features.search.SearchFragment;
import com.spotify.music.features.search.mobius.SearchMobiusFragment;
import com.spotify.music.libs.search.transition.l;
import com.spotify.music.navigation.y;
import com.spotify.music.sociallistening.participantlist.impl.m;

@Deprecated
/* renamed from: vd8  reason: default package */
public final class vd8 {
    private vd8() {
    }

    @Deprecated
    public static s a(l0 l0Var, boolean z, boolean z2, boolean z3, String str, l lVar, boolean z4, boolean z5, boolean z6) {
        s sVar;
        if (l0Var.q() == LinkType.SEARCH_ROOT) {
            return b(null, z, z2, str, lVar, z3, z4, z5);
        }
        if (l0Var.q() == LinkType.SEARCH_QUERY) {
            return b(l0Var.j(1, ":"), z, z2, str, lVar, z3, z4, z5);
        }
        if (l0Var.q() != LinkType.SEARCH_DRILL_DOWN) {
            return y.a;
        }
        String B = l0Var.B();
        B.getClass();
        ld8 ld8 = new ld8(new kd8(z4, z2, z3), B);
        if (z6) {
            sVar = new SearchDrillDownFragment();
        } else {
            sVar = new OldSearchDrillDownFragment();
        }
        Bundle bundle = new Bundle();
        bundle.setClassLoader(vd8.class.getClassLoader());
        bundle.putParcelable("search_params", ld8);
        bundle.putString("username", str);
        Fragment e = sVar.e();
        e.r4(bundle);
        m.d(e, bu9.x);
        return sVar;
    }

    @Deprecated
    public static s b(String str, boolean z, boolean z2, String str2, l lVar, boolean z3, boolean z4, boolean z5) {
        s sVar;
        md8 md8 = new md8(new kd8(z4, z2, z3), Optional.fromNullable(str), z);
        if (z5) {
            sVar = new SearchMobiusFragment();
        } else {
            sVar = new SearchFragment();
        }
        Bundle bundle = new Bundle();
        bundle.setClassLoader(vd8.class.getClassLoader());
        bundle.putParcelable("search_params", md8);
        bundle.putString("username", str2);
        Fragment e = sVar.e();
        e.r4(bundle);
        m.d(e, bu9.w);
        Bundle D2 = e.D2();
        if (D2 == null) {
            D2 = je.D(e);
        }
        D2.putParcelable("EXTRA_TRANSITION_PARAMS", lVar);
        return sVar;
    }
}
