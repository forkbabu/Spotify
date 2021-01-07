package defpackage;

import android.view.ViewGroup;
import com.spotify.inappmessaging.preview.views.i;

/* renamed from: pp0  reason: default package */
public final /* synthetic */ class pp0 implements Runnable {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ i b;

    public /* synthetic */ pp0(ViewGroup viewGroup, i iVar) {
        this.a = viewGroup;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.addView(this.b);
    }
}
