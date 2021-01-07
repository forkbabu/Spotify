package defpackage;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ku8  reason: default package */
public class ku8 implements l<b91, b91> {
    private final mu8 a;

    public ku8(mu8 mu8) {
        this.a = mu8;
    }

    private List<? extends s81> a(List<? extends s81> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            s81 s81 = (s81) list.get(i);
            if (s81.children().isEmpty()) {
                arrayList.add(b(s81, i));
            } else {
                arrayList.add(b(s81, i).toBuilder().m(a(s81.children())).l());
            }
        }
        return arrayList;
    }

    private s81 b(s81 s81, int i) {
        return s81.target() != null && !MoreObjects.isNullOrEmpty(s81.target().uri()) ? s81.toBuilder().f("click", this.a.a(s81, i)).x(null).l() : s81;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public b91 apply(b91 b91) {
        b91 b912 = b91;
        List<? extends s81> body = b912.body();
        return body.isEmpty() ? b912 : b912.toBuilder().e(a(body)).g();
    }
}
