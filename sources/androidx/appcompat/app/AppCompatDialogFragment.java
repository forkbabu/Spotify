package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        return new p(F2(), Q4());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void W4(Dialog dialog, int i) {
        if (dialog instanceof p) {
            p pVar = (p) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            pVar.c(1);
            return;
        }
        super.W4(dialog, i);
    }
}
