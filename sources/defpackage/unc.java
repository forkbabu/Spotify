package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: unc  reason: default package */
public interface unc {

    /* renamed from: unc$a */
    public static abstract class a {
        private final String a;

        /* renamed from: unc$a$a  reason: collision with other inner class name */
        public static final class C0688a extends a {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0688a(String str) {
                super(str, null);
                h.e(str, "uri");
            }
        }

        /* renamed from: unc$a$b */
        public static final class b extends a {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(str, null);
                h.e(str, "uri");
            }
        }

        public a(String str, f fVar) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    String a();

    String b(a aVar);
}
