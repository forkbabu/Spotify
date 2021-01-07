package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: afb  reason: default package */
public final class afb {
    private final List<o8e> a = new ArrayList();
    private final Set<Integer> b = d.H(Integer.valueOf((int) C0707R.id.share_app_instagram_stories), Integer.valueOf((int) C0707R.id.share_app_facebook_stories), Integer.valueOf((int) C0707R.id.share_app_twitter));
    private final Context c;
    private final r2e d;

    /* renamed from: afb$a */
    static final class a<T, R> implements l<List<o8e>, List<? extends o8e>> {
        final /* synthetic */ afb a;

        a(afb afb) {
            this.a = afb;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public List<? extends o8e> apply(List<o8e> list) {
            List<o8e> list2 = list;
            h.e(list2, "it");
            for (o8e o8e : list2) {
                if (this.a.b.contains(Integer.valueOf(o8e.id()))) {
                    List list3 = this.a.a;
                    h.d(o8e, "appShareDestination");
                    list3.add(o8e);
                }
            }
            return this.a.a;
        }
    }

    public afb(Context context, r2e r2e) {
        h.e(context, "context");
        h.e(r2e, "shareDestinationProvider");
        this.c = context;
        this.d = r2e;
    }

    public final o8e c(int i) {
        for (T t : this.a) {
            if (t.id() == i) {
                return t;
            }
        }
        return null;
    }

    public final z<List<o8e>> d() {
        if (!this.a.isEmpty()) {
            z<List<o8e>> z = z.z(this.a);
            h.d(z, "Single.just(destinations)");
            return z;
        }
        z<R> A = this.d.b(this.c.getString(C0707R.string.integration_id_context_menu)).A(new a(this));
        h.d(A, "shareDestinationProvider…nations\n                }");
        return A;
    }
}
