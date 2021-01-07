package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: i08  reason: default package */
public final /* synthetic */ class i08 implements Runnable {
    public final /* synthetic */ ViewGroup a;

    public /* synthetic */ i08(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.a;
        viewGroup.setY(0.0f);
        viewGroup.removeAllViews();
        viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }
}
