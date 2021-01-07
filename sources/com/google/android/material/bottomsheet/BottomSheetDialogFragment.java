package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    private boolean u0;

    private class b extends BottomSheetBehavior.d {
        b(a aVar) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public void a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public void b(View view, int i) {
            if (i == 5) {
                BottomSheetDialogFragment.a5(BottomSheetDialogFragment.this);
            }
        }
    }

    static void a5(BottomSheetDialogFragment bottomSheetDialogFragment) {
        if (bottomSheetDialogFragment.u0) {
            bottomSheetDialogFragment.N4();
        } else {
            super.M4();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void M4() {
        Dialog P4 = P4();
        boolean z = false;
        if (P4 instanceof c) {
            c cVar = (c) P4;
            BottomSheetBehavior<FrameLayout> e = cVar.e();
            if (e.v && cVar.n) {
                this.u0 = false;
                if (e.y == 5) {
                    super.M4();
                } else {
                    if (P4() instanceof c) {
                        ((c) P4()).f();
                    }
                    e.i(new b(null));
                    e.x(5);
                }
                z = true;
            }
        }
        if (!z) {
            super.M4();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        return new c(F2(), Q4());
    }
}
