package defpackage;

import android.view.View;
import com.google.android.gms.cast.framework.media.h;

/* access modifiers changed from: package-private */
/* renamed from: dr  reason: default package */
public final class dr implements View.OnClickListener {
    private final /* synthetic */ long a;
    private final /* synthetic */ wq b;

    dr(wq wqVar, long j) {
        this.b = wqVar;
        this.a = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wq wqVar = this.b;
        long j = this.a;
        h D = wqVar.D();
        if (D != null && D.m()) {
            if (wqVar.D() == null || !wqVar.D().m() || !wqVar.D().t()) {
                D.y(D.f() + j);
                return;
            }
            xq xqVar = wqVar.d;
            D.y(Math.min(D.f() + j, xqVar.h() + ((long) xqVar.g())));
        }
    }
}
