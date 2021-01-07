package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.framework.media.h;

/* access modifiers changed from: package-private */
/* renamed from: zq  reason: default package */
public final class zq implements View.OnClickListener {
    private final /* synthetic */ wq a;

    zq(wq wqVar) {
        this.a = wqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView = (ImageView) view;
        h D = this.a.D();
        if (D != null && D.m()) {
            D.C();
        }
    }
}
