package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.navigation.b;
import androidx.navigation.m;
import androidx.navigation.s;
import androidx.navigation.v;

@v.b("dialog")
public final class DialogFragmentNavigator extends v<a> {
    private final Context a;
    private final o b;
    private int c = 0;
    private l d = new l(this) {
        /* class androidx.navigation.fragment.DialogFragmentNavigator.AnonymousClass1 */

        @Override // androidx.lifecycle.l
        public void p(n nVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                DialogFragment dialogFragment = (DialogFragment) nVar;
                if (!dialogFragment.S4().isShowing()) {
                    NavHostFragment.K4(dialogFragment).k();
                }
            }
        }
    };

    public static class a extends m implements b {
        private String r;

        public a(v<? extends a> vVar) {
            super(vVar);
        }

        @Override // androidx.navigation.m
        public void t(Context context, AttributeSet attributeSet) {
            super.t(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b.a);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.r = string;
            }
            obtainAttributes.recycle();
        }

        public final String z() {
            String str = this.r;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
    }

    public DialogFragmentNavigator(Context context, o oVar) {
        this.a = context;
        this.b = oVar;
    }

    /* Return type fixed from 'androidx.navigation.m' to match base method */
    @Override // androidx.navigation.v
    public a a() {
        return new a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.navigation.m, android.os.Bundle, androidx.navigation.s, androidx.navigation.v$a] */
    @Override // androidx.navigation.v
    public m b(a aVar, Bundle bundle, s sVar, v.a aVar2) {
        a aVar3 = aVar;
        if (this.b.o0()) {
            return null;
        }
        String z = aVar3.z();
        if (z.charAt(0) == '.') {
            z = this.a.getPackageName() + z;
        }
        Fragment a2 = this.b.a0().a(this.a.getClassLoader(), z);
        if (DialogFragment.class.isAssignableFrom(a2.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) a2;
            dialogFragment.r4(bundle);
            dialogFragment.A().a(this.d);
            o oVar = this.b;
            StringBuilder V0 = je.V0("androidx-nav-fragment:navigator:dialog:");
            int i = this.c;
            this.c = i + 1;
            V0.append(i);
            dialogFragment.Y4(oVar, V0.toString());
            return aVar3;
        }
        StringBuilder V02 = je.V0("Dialog destination ");
        V02.append(aVar3.z());
        V02.append(" is not an instance of DialogFragment");
        throw new IllegalArgumentException(V02.toString());
    }

    @Override // androidx.navigation.v
    public void c(Bundle bundle) {
        this.c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
        for (int i = 0; i < this.c; i++) {
            o oVar = this.b;
            DialogFragment dialogFragment = (DialogFragment) oVar.U("androidx-nav-fragment:navigator:dialog:" + i);
            if (dialogFragment != null) {
                dialogFragment.A().a(this.d);
            } else {
                throw new IllegalStateException(je.q0("DialogFragment ", i, " doesn't exist in the FragmentManager"));
            }
        }
    }

    @Override // androidx.navigation.v
    public Bundle d() {
        if (this.c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.c);
        return bundle;
    }

    @Override // androidx.navigation.v
    public boolean e() {
        if (this.c == 0 || this.b.o0()) {
            return false;
        }
        o oVar = this.b;
        StringBuilder V0 = je.V0("androidx-nav-fragment:navigator:dialog:");
        int i = this.c - 1;
        this.c = i;
        V0.append(i);
        Fragment U = oVar.U(V0.toString());
        if (U != null) {
            U.A().c(this.d);
            ((DialogFragment) U).M4();
        }
        return true;
    }
}
