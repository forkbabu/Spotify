package defpackage;

import android.view.View;
import android.widget.ImageView;

/* access modifiers changed from: package-private */
/* renamed from: yq  reason: default package */
public final class yq implements View.OnClickListener {
    private final /* synthetic */ wq a;

    yq(wq wqVar) {
        this.a = wqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView = (ImageView) view;
        this.a.H();
    }
}
