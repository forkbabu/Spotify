package defpackage;

import java.util.Random;
import kotlin.jvm.internal.h;

/* renamed from: dnf  reason: default package */
public final class dnf extends cnf {
    private final a c = new a();

    /* renamed from: dnf$a */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // defpackage.cnf
    public Random f() {
        Object obj = this.c.get();
        h.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
