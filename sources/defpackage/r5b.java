package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.proto.MainViewResponse;
import io.reactivex.functions.l;

/* renamed from: r5b  reason: default package */
public final /* synthetic */ class r5b implements l {
    public final /* synthetic */ s7b a;

    public /* synthetic */ r5b(s7b s7b) {
        this.a = s7b;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s7b s7b = this.a;
        MainViewResponse mainViewResponse = (MainViewResponse) obj;
        String d = s7b.d();
        String c = s7b.c();
        Optional<Integer> absent = Optional.absent();
        if (s7b instanceof n7b) {
            absent = ((n7b) s7b).e();
        }
        return jua.a(d, c, absent, mainViewResponse);
    }
}
