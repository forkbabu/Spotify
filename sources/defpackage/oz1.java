package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import com.spotify.mobile.android.util.DialogPresenter;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: oz1  reason: default package */
public class oz1 implements pz1 {
    private final o a;
    private final qz1 b;

    oz1(qz1 qz1, o oVar) {
        this.b = qz1;
        this.a = oVar;
    }

    @Override // defpackage.pz1
    public void a(c cVar) {
        if (this.a.U("dialog_presenter") == null) {
            o oVar = this.a;
            qz1 qz1 = this.b;
            DialogPresenter dialogPresenter = new DialogPresenter();
            LinkedHashMap<String, PresentableDialogFragment> a2 = qz1.a(cVar);
            x i = oVar.i();
            i.d(dialogPresenter, "dialog_presenter");
            for (Map.Entry<String, PresentableDialogFragment> entry : a2.entrySet()) {
                i.d(entry.getValue(), entry.getKey());
            }
            i.i();
            for (PresentableDialogFragment presentableDialogFragment : a2.values()) {
                MoreObjects.checkArgument(!TextUtils.isEmpty(presentableDialogFragment.X2()), "Fragment must be added to a transaction with a specific tag before being registered in DialogPresenter.");
                presentableDialogFragment.K4(dialogPresenter);
            }
        }
    }
}
