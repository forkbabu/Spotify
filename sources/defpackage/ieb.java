package defpackage;

import android.view.View;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: ieb  reason: default package */
final class ieb implements View.OnClickListener {
    final /* synthetic */ jeb a;

    ieb(jeb jeb) {
        this.a = jeb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<qeb> list = this.a.c;
        if (list != null) {
            h.d(view, "view");
            Object tag = view.getTag();
            if (tag != null) {
                qeb qeb = list.get(((Integer) tag).intValue());
                qeb qeb2 = new qeb(qeb.c(), qeb.e(), qeb.b(), (qeb.a() + 1) % qeb.b().size());
                jeb jeb = this.a;
                qeb[] qebArr = {qeb2};
                jeb.getClass();
                h.e(qebArr, "items");
                jeb.c = d.R(qebArr);
                ((heb) this.a.n).e(qeb2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        h.k("items");
        throw null;
    }
}
