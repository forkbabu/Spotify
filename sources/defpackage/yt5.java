package defpackage;

import android.content.res.Resources;

/* renamed from: yt5  reason: default package */
public final /* synthetic */ class yt5 implements ea2 {
    public final /* synthetic */ int a;

    public /* synthetic */ yt5(int i) {
        this.a = i;
    }

    @Override // defpackage.ea2
    public final Object apply(Object obj) {
        return ((Resources) obj).getString(this.a);
    }
}
