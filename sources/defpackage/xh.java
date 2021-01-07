package defpackage;

import android.database.Cursor;
import defpackage.li;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: xh  reason: default package */
public final /* synthetic */ class xh implements li.b {
    private final li a;
    private final List b;
    private final tg c;

    private xh(li liVar, List list, tg tgVar) {
        this.a = liVar;
        this.b = list;
        this.c = tgVar;
    }

    public static li.b a(li liVar, List list, tg tgVar) {
        return new xh(liVar, list, tgVar);
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        li.l(this.a, this.b, this.c, (Cursor) obj);
        return null;
    }
}
