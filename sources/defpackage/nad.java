package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.models.Session;
import io.reactivex.functions.l;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: nad  reason: default package */
final class nad<T, R> implements l<List<Session>, ImmutableList<Session>> {
    public static final nad a = new nad();

    nad() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public ImmutableList<Session> apply(List<Session> list) {
        List<Session> list2 = list;
        h.e(list2, "it");
        return ImmutableList.copyOf((Collection) list2);
    }
}
