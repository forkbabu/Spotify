package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.c;
import androidx.room.j;
import java.util.Collection;

/* renamed from: xk0  reason: default package */
public final class xk0 implements wk0 {
    private final RoomDatabase a;
    private final c<vk0> b;

    /* renamed from: xk0$a */
    class a extends c<vk0> {
        a(xk0 xk0, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR REPLACE INTO `EventSequenceNumbers` (`eventName`,`sequenceId`,`sequenceNumberNext`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, vk0 vk0) {
            vk0 vk02 = vk0;
            String str = vk02.a;
            if (str == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, str);
            }
            byte[] bArr = vk02.b;
            if (bArr == null) {
                t7Var.O1(2);
            } else {
                t7Var.y1(2, bArr);
            }
            t7Var.t1(3, vk02.c);
        }
    }

    public xk0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    public int a() {
        int i = 0;
        j d = j.d("SELECT count(*) FROM EventSequenceNumbers", 0);
        this.a.b();
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            if (b2.moveToFirst()) {
                i = b2.getInt(0);
            }
            return i;
        } finally {
            b2.close();
            d.f();
        }
    }

    public void b(Collection<byte[]> collection) {
        this.a.b();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM EventSequenceNumbers WHERE sequenceId IN (");
        m7.a(sb, collection.size());
        sb.append(")");
        t7 e = this.a.e(sb.toString());
        int i = 1;
        for (byte[] bArr : collection) {
            if (bArr == null) {
                e.O1(i);
            } else {
                e.y1(i, bArr);
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

    public long c(String str, byte[] bArr) {
        j d = j.d("SELECT sequenceNumberNext FROM EventSequenceNumbers WHERE eventName = ? AND sequenceId = ?", 2);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        if (bArr == null) {
            d.O1(2);
        } else {
            d.y1(2, bArr);
        }
        this.a.b();
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            return b2.moveToFirst() ? b2.getLong(0) : 0;
        } finally {
            b2.close();
            d.f();
        }
    }

    public void d(vk0 vk0) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(vk0);
            this.a.s();
        } finally {
            this.a.h();
        }
    }
}
