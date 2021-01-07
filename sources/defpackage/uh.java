package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.li;

/* renamed from: uh  reason: default package */
final /* synthetic */ class uh implements li.b {
    private final li a;
    private final tg b;

    private uh(li liVar, tg tgVar) {
        this.a = liVar;
        this.b = tgVar;
    }

    public static li.b a(li liVar, tg tgVar) {
        return new uh(liVar, tgVar);
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        return li.i(this.a, this.b, (SQLiteDatabase) obj);
    }
}
