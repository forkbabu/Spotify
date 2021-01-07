package defpackage;

import com.spotify.libs.search.history.SearchHistory;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: nza  reason: default package */
public final /* synthetic */ class nza implements l {
    public static final /* synthetic */ nza a = new nza();

    private /* synthetic */ nza() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return zya.h(dza.a(SearchHistory.create((List) obj)));
    }
}
