package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.li;

/* renamed from: gi  reason: default package */
final /* synthetic */ class gi implements li.b {
    private final li a;
    private final tg b;
    private final pg c;

    private gi(li liVar, tg tgVar, pg pgVar) {
        this.a = liVar;
        this.b = tgVar;
        this.c = pgVar;
    }

    public static li.b a(li liVar, tg tgVar, pg pgVar) {
        return new gi(liVar, tgVar, pgVar);
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        return li.m(this.a, this.b, this.c, (SQLiteDatabase) obj);
    }
}
