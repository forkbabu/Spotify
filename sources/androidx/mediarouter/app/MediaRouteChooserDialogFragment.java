package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class MediaRouteChooserDialogFragment extends DialogFragment {
    private boolean u0 = false;
    private Dialog v0;
    private m6 w0;

    public MediaRouteChooserDialogFragment() {
        T4(true);
    }

    private void a5() {
        if (this.w0 == null) {
            Bundle D2 = D2();
            if (D2 != null) {
                this.w0 = m6.c(D2.getBundle("selector"));
            }
            if (this.w0 == null) {
                this.w0 = m6.c;
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        if (this.u0) {
            i iVar = new i(F2());
            this.v0 = iVar;
            a5();
            iVar.e(this.w0);
        } else {
            a b5 = b5(F2());
            this.v0 = b5;
            a5();
            b5.e(this.w0);
        }
        return this.v0;
    }

    public a b5(Context context) {
        return new a(context);
    }

    public void c5(m6 m6Var) {
        if (m6Var != null) {
            a5();
            if (!this.w0.equals(m6Var)) {
                this.w0 = m6Var;
                Bundle D2 = D2();
                if (D2 == null) {
                    D2 = new Bundle();
                }
                D2.putBundle("selector", m6Var.a());
                r4(D2);
                Dialog dialog = this.v0;
                if (dialog == null) {
                    return;
                }
                if (this.u0) {
                    ((i) dialog).e(m6Var);
                } else {
                    ((a) dialog).e(m6Var);
                }
            }
        } else {
            throw new IllegalArgumentException("selector must not be null");
        }
    }

    /* access modifiers changed from: package-private */
    public void d5(boolean z) {
        if (this.v0 == null) {
            this.u0 = z;
            return;
        }
        throw new IllegalStateException("This must be called before creating dialog");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.v0;
        if (dialog != null) {
            if (this.u0) {
                ((i) dialog).f();
                return;
            }
            a aVar = (a) dialog;
            aVar.getWindow().setLayout(g.a(aVar.getContext()), -2);
        }
    }
}
