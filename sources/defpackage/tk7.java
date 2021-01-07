package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.profile.model.e;
import io.reactivex.functions.l;

/* renamed from: tk7  reason: default package */
public final /* synthetic */ class tk7 implements l {
    public final /* synthetic */ il7 a;
    public final /* synthetic */ e b;

    public /* synthetic */ tk7(il7 il7, e eVar) {
        this.a = il7;
        this.b = eVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        il7 il7 = this.a;
        e eVar = this.b;
        il7.getClass();
        e.a e = eVar.e();
        e.b(ImmutableList.copyOf(Collections2.transform((Iterable) eVar.b(), (Function) new rk7(il7, (ImmutableMap) obj))));
        return e.a();
    }
}
