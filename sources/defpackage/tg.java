package defpackage;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import defpackage.lg;

/* renamed from: tg  reason: default package */
public abstract class tg {

    /* renamed from: tg$a */
    public static abstract class a {
        public abstract tg a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(Priority priority);
    }

    public static a a() {
        lg.b bVar = new lg.b();
        bVar.d(Priority.DEFAULT);
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract Priority d();

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0023: APUT  (r0v1 java.lang.Object[]), (2 ??[int, float, short, byte, char]), (r1v3 java.lang.String) */
    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
