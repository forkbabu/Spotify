package defpackage;

import com.spotify.libs.search.online.entity.b;
import io.reactivex.functions.l;

/* renamed from: c78  reason: default package */
public final /* synthetic */ class c78 implements l {
    public final /* synthetic */ boolean a;

    public /* synthetic */ c78(boolean z) {
        this.a = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new b(((Boolean) obj).booleanValue(), this.a);
    }
}
