package defpackage;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobius.e0;
import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import defpackage.o19;
import defpackage.q19;

/* renamed from: d19  reason: default package */
public final /* synthetic */ class d19 implements ti0 {
    public final /* synthetic */ q19 a;

    public /* synthetic */ d19(q19 q19) {
        this.a = q19;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        q19 q19 = this.a;
        o19.e eVar = (o19.e) obj;
        YourLibraryPageId m = eVar.m();
        LoadingState l = eVar.l();
        q19.a e = q19.e();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put(m, l);
        e.d(builder.putAll(Collections2.filterKeys(q19.c(), new l19(m))).build());
        return e0.f(e.a());
    }
}
