package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.c;
import androidx.room.j;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.protobuf.ByteString;
import com.spotify.eventsender.Fragment;
import com.spotify.eventsender.FragmentsContainer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: bl0  reason: default package */
public final class bl0 extends al0 {
    private final RoomDatabase a;
    private final c<uk0> b;

    /* renamed from: bl0$a */
    class a extends c<uk0> {
        a(bl0 bl0, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR ABORT INTO `Events` (`id`,`authenticated`,`eventName`,`sequenceId`,`sequenceNumber`,`fragments`,`owner`,`deviceId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, uk0 uk0) {
            uk0 uk02 = uk0;
            t7Var.t1(1, uk02.a);
            Boolean bool = uk02.b;
            Integer valueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (valueOf == null) {
                t7Var.O1(2);
            } else {
                t7Var.t1(2, (long) valueOf.intValue());
            }
            String str = uk02.c;
            if (str == null) {
                t7Var.O1(3);
            } else {
                t7Var.a1(3, str);
            }
            byte[] bArr = uk02.d;
            if (bArr == null) {
                t7Var.O1(4);
            } else {
                t7Var.y1(4, bArr);
            }
            t7Var.t1(5, uk02.e);
            byte[] bArr2 = uk02.f;
            if (bArr2 == null) {
                t7Var.O1(6);
            } else {
                t7Var.y1(6, bArr2);
            }
            String str2 = uk02.g;
            if (str2 == null) {
                t7Var.O1(7);
            } else {
                t7Var.a1(7, str2);
            }
            String str3 = uk02.h;
            if (str3 == null) {
                t7Var.O1(8);
            } else {
                t7Var.a1(8, str3);
            }
        }
    }

    public bl0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    static void g(bl0 bl0, String str, byte[] bArr, wk0 wk0, pk0 pk0, gk0 gk0, kl0 kl0, boolean z, String str2, String str3) {
        uk0 uk0 = new uk0();
        byte[] a2 = pk0.a(Optional.fromNullable(str2));
        uk0.c = str;
        uk0.g = str2;
        uk0.b = Boolean.valueOf(z);
        uk0.d = a2;
        uk0.h = str3;
        FragmentsContainer.b n = FragmentsContainer.n();
        Fragment.b n2 = Fragment.n();
        n2.n("message");
        n2.m(ByteString.h(bArr));
        n.n(n2);
        n.m(FluentIterable.from(gk0.a()).transform(sk0.a).transform(rk0.a));
        uk0.f = ((FragmentsContainer) n.build()).toByteArray();
        xk0 xk0 = (xk0) wk0;
        long c = xk0.c(str, a2);
        if (c == 0) {
            c = 1;
        }
        uk0.e = c;
        long h = bl0.h(uk0);
        xk0.d(new vk0(uk0.c, 1 + c, a2));
        kl0.d(String.format(Locale.US, "Event persisted: %d, Name: %s, Sequence No: %d", Long.valueOf(h), str, Long.valueOf(c)));
    }

    @Override // defpackage.al0
    public void a(Collection<Long> collection, Collection<byte[]> collection2, wk0 wk0) {
        this.a.c();
        try {
            b(collection);
            ((xk0) wk0).b(collection2);
            this.a.s();
        } finally {
            this.a.h();
        }
    }

    @Override // defpackage.al0
    public void b(Collection<Long> collection) {
        this.a.b();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM Events WHERE id IN (");
        m7.a(sb, collection.size());
        sb.append(")");
        t7 e = this.a.e(sb.toString());
        int i = 1;
        for (Long l : collection) {
            if (l == null) {
                e.O1(i);
            } else {
                e.t1(i, l.longValue());
            }
            i++;
        }
        this.a.c();
        try {
            e.E();
            this.a.s();
        } finally {
            this.a.h();
        }
    }

    @Override // defpackage.al0
    public List<uk0> c(int i, String str) {
        Integer num;
        Boolean bool;
        j d = j.d("SELECT * FROM Events WHERE CASE WHEN authenticated IS NULL THEN 1 ELSE authenticated END = 1 AND  CASE WHEN owner IS NULL THEN ? ELSE owner END IS ? ORDER BY id ASC LIMIT ?", 3);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        if (str == null) {
            d.O1(2);
        } else {
            d.a1(2, str);
        }
        d.t1(3, (long) i);
        this.a.b();
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            int d2 = h7.d(b2, "id");
            int d3 = h7.d(b2, "authenticated");
            int d4 = h7.d(b2, "eventName");
            int d5 = h7.d(b2, "sequenceId");
            int d6 = h7.d(b2, "sequenceNumber");
            int d7 = h7.d(b2, "fragments");
            int d8 = h7.d(b2, "owner");
            int d9 = h7.d(b2, "deviceId");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                uk0 uk0 = new uk0();
                uk0.a = b2.getLong(d2);
                if (b2.isNull(d3)) {
                    num = null;
                } else {
                    num = Integer.valueOf(b2.getInt(d3));
                }
                if (num == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(num.intValue() != 0);
                }
                uk0.b = bool;
                uk0.c = b2.getString(d4);
                uk0.d = b2.getBlob(d5);
                uk0.e = b2.getLong(d6);
                uk0.f = b2.getBlob(d7);
                uk0.g = b2.getString(d8);
                uk0.h = b2.getString(d9);
                arrayList.add(uk0);
            }
            return arrayList;
        } finally {
            b2.close();
            d.f();
        }
    }

    @Override // defpackage.al0
    public List<uk0> d(int i) {
        Integer num;
        Boolean bool;
        j d = j.d("SELECT * FROM Events WHERE CASE WHEN authenticated IS NULL THEN 1 ELSE authenticated END = 0 ORDER BY id ASC LIMIT ?", 1);
        d.t1(1, (long) i);
        this.a.b();
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            int d2 = h7.d(b2, "id");
            int d3 = h7.d(b2, "authenticated");
            int d4 = h7.d(b2, "eventName");
            int d5 = h7.d(b2, "sequenceId");
            int d6 = h7.d(b2, "sequenceNumber");
            int d7 = h7.d(b2, "fragments");
            int d8 = h7.d(b2, "owner");
            int d9 = h7.d(b2, "deviceId");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                uk0 uk0 = new uk0();
                uk0.a = b2.getLong(d2);
                if (b2.isNull(d3)) {
                    num = null;
                } else {
                    num = Integer.valueOf(b2.getInt(d3));
                }
                if (num == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(num.intValue() != 0);
                }
                uk0.b = bool;
                uk0.c = b2.getString(d4);
                uk0.d = b2.getBlob(d5);
                uk0.e = b2.getLong(d6);
                uk0.f = b2.getBlob(d7);
                uk0.g = b2.getString(d8);
                uk0.h = b2.getString(d9);
                arrayList.add(uk0);
            }
            return arrayList;
        } finally {
            b2.close();
            d.f();
        }
    }

    @Override // defpackage.al0
    public List<uk0> e(String str) {
        Integer num;
        Boolean bool;
        j d = j.d("SELECT * FROM Events WHERE deviceId IS NULL OR deviceId <> ? ORDER BY id ASC", 1);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        this.a.b();
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            int d2 = h7.d(b2, "id");
            int d3 = h7.d(b2, "authenticated");
            int d4 = h7.d(b2, "eventName");
            int d5 = h7.d(b2, "sequenceId");
            int d6 = h7.d(b2, "sequenceNumber");
            int d7 = h7.d(b2, "fragments");
            int d8 = h7.d(b2, "owner");
            int d9 = h7.d(b2, "deviceId");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                uk0 uk0 = new uk0();
                uk0.a = b2.getLong(d2);
                if (b2.isNull(d3)) {
                    num = null;
                } else {
                    num = Integer.valueOf(b2.getInt(d3));
                }
                if (num == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(num.intValue() != 0);
                }
                uk0.b = bool;
                uk0.c = b2.getString(d4);
                uk0.d = b2.getBlob(d5);
                uk0.e = b2.getLong(d6);
                uk0.f = b2.getBlob(d7);
                uk0.g = b2.getString(d8);
                uk0.h = b2.getString(d9);
                arrayList.add(uk0);
            }
            return arrayList;
        } finally {
            b2.close();
            d.f();
        }
    }

    @Override // defpackage.al0
    public void f(String str, byte[] bArr, wk0 wk0, pk0 pk0, gk0 gk0, kl0 kl0, boolean z, String str2, String str3) {
        this.a.c();
        try {
            g(this, str, bArr, wk0, pk0, gk0, kl0, z, str2, str3);
            this.a.s();
        } finally {
            this.a.h();
        }
    }

    public long h(uk0 uk0) {
        this.a.b();
        this.a.c();
        try {
            long h = this.b.h(uk0);
            this.a.s();
            return h;
        } finally {
            this.a.h();
        }
    }
}
