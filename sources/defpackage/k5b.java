package defpackage;

import com.spotify.searchview.assistedcuration.proto.MainViewResponse;
import io.reactivex.functions.l;

/* renamed from: k5b  reason: default package */
public final /* synthetic */ class k5b implements l {
    public final /* synthetic */ s7b a;

    public /* synthetic */ k5b(s7b s7b) {
        this.a = s7b;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s7b s7b = this.a;
        return hva.a(s7b.d(), s7b.a(), (MainViewResponse) obj);
    }
}
