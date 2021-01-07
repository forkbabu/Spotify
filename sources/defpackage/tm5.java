package defpackage;

import com.spotify.music.features.listeninghistory.datasource.ListeningHistoryDataSource;
import com.spotify.music.features.listeninghistory.datasource.d;
import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: tm5  reason: default package */
public final class tm5 implements e0<b91, b91> {
    private final boolean a;
    private final d b;

    /* renamed from: tm5$a */
    static final class a<T, R> implements l<b91, b91> {
        final /* synthetic */ tm5 a;

        a(tm5 tm5) {
            this.a = tm5;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public b91 apply(b91 b91) {
            b91 b912 = b91;
            h.e(b912, "hubsViewModel");
            ListeningHistoryDataSource.HistoryType filter = this.a.b.getFilter();
            ArrayList arrayList = new ArrayList(b912.body().size());
            for (s81 s81 : b912.body()) {
                o81 o81 = (o81) s81.events().get("click");
                if (o81 == null) {
                    arrayList.add(s81);
                } else {
                    arrayList.add(s81.toBuilder().q(tm5.b(this.a, filter, s81, o81)).l());
                }
            }
            return je.L(b912, arrayList);
        }
    }

    public tm5(boolean z, d dVar) {
        h.e(dVar, "properties");
        this.a = z;
        this.b = dVar;
    }

    public static final Map b(tm5 tm5, ListeningHistoryDataSource.HistoryType historyType, s81 s81, o81 o81) {
        String str;
        boolean z;
        tm5.getClass();
        if (historyType != ListeningHistoryDataSource.HistoryType.GROUP) {
            h.e(s81, "$this$isPodcastOrEpisode");
            String[] strArr = {"show", "episode"};
            Collection<? extends o81> values = s81.events().values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator<T> it = values.iterator();
                if (it.hasNext()) {
                    String string = it.next().data().string("uri", "");
                    int i = 0;
                    while (true) {
                        if (i >= 2) {
                            break;
                        } else if (e.c(string, strArr[i], false, 2, null)) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            z = false;
            if (z || tm5.a) {
                str = "playFromContext";
                o81 c = o81.toBuilder().e(str).c();
                return kotlin.collections.d.y(new Pair("click", c), new Pair("rightAccessoryClick", c));
            }
        }
        str = "navigate";
        o81 c2 = o81.toBuilder().e(str).c();
        return kotlin.collections.d.y(new Pair("click", c2), new Pair("rightAccessoryClick", c2));
    }

    @Override // io.reactivex.e0
    public d0<b91> a(z<b91> zVar) {
        h.e(zVar, "upstream");
        z<R> A = zVar.A(new a(this));
        h.d(A, "upstream.map { hubsViewM…ewBody).build()\n        }");
        return A;
    }
}
