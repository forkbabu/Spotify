package defpackage;

import com.spotify.inappmessaging.j;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.follow.m;

/* renamed from: vz7  reason: default package */
public final /* synthetic */ class vz7 implements j {
    public final /* synthetic */ t8a a;
    public final /* synthetic */ d28 b;
    public final /* synthetic */ m c;

    public /* synthetic */ vz7(t8a t8a, d28 d28, m mVar) {
        this.a = t8a;
        this.b = d28;
        this.c = mVar;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        t8a t8a = this.a;
        d28 d28 = this.b;
        m mVar = this.c;
        if (l0.b(str2, LinkType.TRACK)) {
            t8a.f(str2, true);
            d28.c(str, str2);
        } else if (l0.b(str2, LinkType.ARTIST)) {
            mVar.f(str2, true);
            d28.j(str, str2);
        }
    }
}
