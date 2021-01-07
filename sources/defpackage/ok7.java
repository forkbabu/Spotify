package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.e;
import com.spotify.music.features.profile.proto.PlaylistlistResponse$PlaylistList;
import io.reactivex.functions.l;

/* renamed from: ok7  reason: default package */
public final /* synthetic */ class ok7 implements l {
    public final /* synthetic */ il7 a;

    public /* synthetic */ ok7(il7 il7) {
        this.a = il7;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        il7 il7 = this.a;
        il7.getClass();
        e.a a2 = e.a();
        a2.c(LoadingState.LOADED);
        a2.b(ImmutableList.copyOf(Collections2.transform((Iterable) ((PlaylistlistResponse$PlaylistList) obj).h(), (Function) new lk7(il7))));
        return a2.a();
    }
}
