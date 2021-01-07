package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.a;
import defpackage.pg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: li  reason: default package */
public class li implements nh, com.google.android.datatransport.runtime.synchronization.a {
    private static final com.google.android.datatransport.b n = com.google.android.datatransport.b.b("proto");
    public static final /* synthetic */ int o = 0;
    private final ri a;
    private final ti b;
    private final ti c;
    private final oh f;

    /* access modifiers changed from: package-private */
    /* renamed from: li$b */
    public interface b<T, U> {
        U apply(T t);
    }

    /* access modifiers changed from: private */
    /* renamed from: li$c */
    public static class c {
        final String a;
        final String b;

        c(String str, String str2, a aVar) {
            this.a = str;
            this.b = str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: li$d */
    public interface d<T> {
        T a();
    }

    li(ti tiVar, ti tiVar2, oh ohVar, ri riVar) {
        this.a = riVar;
        this.b = tiVar;
        this.c = tiVar2;
        this.f = ohVar;
    }

    private Long d(SQLiteDatabase sQLiteDatabase, tg tgVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(tgVar.b(), String.valueOf(yi.a(tgVar.d()))));
        if (tgVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(tgVar.c(), 0));
        }
        return (Long) r(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), hi.a());
    }

    private <T> T f(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase b2 = b();
        b2.beginTransaction();
        try {
            T apply = bVar.apply(b2);
            b2.setTransactionSuccessful();
            return apply;
        } finally {
            b2.endTransaction();
        }
    }

    static /* synthetic */ Boolean g(li liVar, tg tgVar, SQLiteDatabase sQLiteDatabase) {
        Long d2 = liVar.d(sQLiteDatabase, tgVar);
        if (d2 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) r(liVar.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{d2.toString()}), ei.a());
    }

    static /* synthetic */ List h(SQLiteDatabase sQLiteDatabase) {
        return (List) r(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), di.a());
    }

    static List i(li liVar, tg tgVar, SQLiteDatabase sQLiteDatabase) {
        liVar.getClass();
        ArrayList arrayList = new ArrayList();
        Long d2 = liVar.d(sQLiteDatabase, tgVar);
        if (d2 != null) {
            r(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{d2.toString()}, null, null, null, String.valueOf(liVar.f.c())), xh.a(liVar, arrayList, tgVar));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(((sh) arrayList.get(i)).b());
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        r(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), zh.a(hashMap));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            sh shVar = (sh) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(shVar.b()))) {
                pg.a l = shVar.a().l();
                for (c cVar : (Set) hashMap.get(Long.valueOf(shVar.b()))) {
                    l.c(cVar.a, cVar.b);
                }
                listIterator.set(new mh(shVar.b(), shVar.c(), l.d()));
            }
        }
        return arrayList;
    }

    static Object l(li liVar, List list, tg tgVar, Cursor cursor) {
        com.google.android.datatransport.b bVar;
        com.google.android.datatransport.b bVar2;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            pg.a a2 = pg.a();
            a2.i(cursor.getString(1));
            a2.h(cursor.getLong(2));
            a2.j(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                if (string == null) {
                    bVar2 = n;
                } else {
                    bVar2 = com.google.android.datatransport.b.b(string);
                }
                a2.g(new og(bVar2, cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                if (string2 == null) {
                    bVar = n;
                } else {
                    bVar = com.google.android.datatransport.b.b(string2);
                }
                a2.g(new og(bVar, (byte[]) r(liVar.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), yh.a())));
            }
            if (!cursor.isNull(6)) {
                a2.f(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(new mh(j, tgVar, a2.d()));
        }
        return null;
    }

    static Long m(li liVar, tg tgVar, pg pgVar, SQLiteDatabase sQLiteDatabase) {
        long j;
        if (liVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * liVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong() >= liVar.f.e()) {
            return -1L;
        }
        Long d2 = liVar.d(sQLiteDatabase, tgVar);
        if (d2 != null) {
            j = d2.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", tgVar.b());
            contentValues.put("priority", Integer.valueOf(yi.a(tgVar.d())));
            contentValues.put("next_request_ms", (Integer) 0);
            if (tgVar.c() != null) {
                contentValues.put("extras", Base64.encodeToString(tgVar.c(), 0));
            }
            j = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int d3 = liVar.f.d();
        byte[] a2 = pgVar.e().a();
        boolean z = a2.length <= d3;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(j));
        contentValues2.put("transport_name", pgVar.j());
        contentValues2.put("timestamp_ms", Long.valueOf(pgVar.f()));
        contentValues2.put("uptime_ms", Long.valueOf(pgVar.k()));
        contentValues2.put("payload_encoding", pgVar.e().b().a());
        contentValues2.put("code", pgVar.d());
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        contentValues2.put("payload", z ? a2 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues2);
        if (!z) {
            double length = (double) a2.length;
            double d4 = (double) d3;
            Double.isNaN(length);
            Double.isNaN(d4);
            int ceil = (int) Math.ceil(length / d4);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i - 1) * d3, Math.min(i * d3, a2.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert));
                contentValues3.put("sequence_num", Integer.valueOf(i));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Map.Entry<String, String> entry : pgVar.i().entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert));
            contentValues4.put("name", entry.getKey());
            contentValues4.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(insert);
    }

    private <T> T p(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.c.a() >= ((long) this.f.a()) + a2) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    private static String q(Iterable<sh> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<sh> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    private static <T> T r(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // defpackage.nh
    public long F0(tg tgVar) {
        return ((Long) r(b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{tgVar.b(), String.valueOf(yi.a(tgVar.d()))}), ji.a())).longValue();
    }

    @Override // defpackage.nh
    public boolean I0(tg tgVar) {
        return ((Boolean) f(ki.a(this, tgVar))).booleanValue();
    }

    @Override // defpackage.nh
    public void K(tg tgVar, long j) {
        f(th.a(j, tgVar));
    }

    @Override // defpackage.nh
    public void K0(Iterable<sh> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder V0 = je.V0("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            V0.append(q(iterable));
            f(ii.a(V0.toString()));
        }
    }

    @Override // defpackage.nh
    public Iterable<tg> P() {
        return (Iterable) f(vh.a());
    }

    @Override // defpackage.nh
    public sh W1(tg tgVar, pg pgVar) {
        bh.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", tgVar.d(), pgVar.j(), tgVar.b());
        long longValue = ((Long) f(gi.a(this, tgVar, pgVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new mh(longValue, tgVar, pgVar);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.a
    public <T> T a(a.AbstractC0087a<T> aVar) {
        SQLiteDatabase b2 = b();
        p(ai.b(b2), bi.a());
        try {
            T h = aVar.h();
            b2.setTransactionSuccessful();
            return h;
        } finally {
            b2.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase b() {
        ri riVar = this.a;
        riVar.getClass();
        return (SQLiteDatabase) p(ci.b(riVar), fi.a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.nh
    public Iterable<sh> f1(tg tgVar) {
        return (Iterable) f(uh.a(this, tgVar));
    }

    @Override // defpackage.nh
    public int j() {
        return ((Integer) f(wh.a(this.b.a() - this.f.b()))).intValue();
    }

    @Override // defpackage.nh
    public void x(Iterable<sh> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder V0 = je.V0("DELETE FROM events WHERE _id in ");
            V0.append(q(iterable));
            b().compileStatement(V0.toString()).execute();
        }
    }
}
