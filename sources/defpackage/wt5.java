package defpackage;

import android.content.res.Resources;

/* renamed from: wt5  reason: default package */
public final /* synthetic */ class wt5 implements ea2 {
    public final /* synthetic */ int a;

    public /* synthetic */ wt5(int i) {
        this.a = i;
    }

    @Override // defpackage.ea2
    public final Object apply(Object obj) {
        return ((Resources) obj).getString(this.a);
    }
}
