package defpackage;

import com.spotify.music.podcastinteractivity.qna.datasource.i;
import com.spotify.podcastinteractivity.qna.model.proto.UserStatus;
import defpackage.euc;
import defpackage.wtc;
import defpackage.xtc;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: cuc  reason: default package */
final class cuc<T, R> implements l<UserStatus, xtc> {
    final /* synthetic */ euc.a a;
    final /* synthetic */ wtc.b b;

    cuc(euc.a aVar, wtc.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public xtc apply(UserStatus userStatus) {
        UserStatus userStatus2 = userStatus;
        h.e(userStatus2, "userStatus");
        this.a.a.b.c(new i.a(this.b.a()));
        return new xtc.j(userStatus2);
    }
}
