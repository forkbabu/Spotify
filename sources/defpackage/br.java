package defpackage;

import android.view.View;
import com.google.android.gms.cast.framework.media.h;

/* access modifiers changed from: package-private */
/* renamed from: br  reason: default package */
public final class br implements View.OnClickListener {
    private final /* synthetic */ wq a;

    br(wq wqVar) {
        this.a = wqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h D = this.a.D();
        if (D != null && D.m()) {
            D.u(null);
        }
    }
}
