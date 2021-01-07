package defpackage;

import io.reactivex.s;

/* renamed from: zi9  reason: default package */
public interface zi9 extends dj9 {

    /* renamed from: zi9$a */
    public static class a implements zi9 {
        private final com.jakewharton.rxrelay2.b<ej9> a = com.jakewharton.rxrelay2.b.h1(b.a);

        @Override // defpackage.dj9
        public void E(String str, String str2) {
            this.a.accept(new yi9(str, str2, null, null));
        }

        @Override // defpackage.dj9
        public void K() {
            this.a.accept(b.a);
        }

        @Override // defpackage.zi9
        public s<ej9> o() {
            return this.a;
        }
    }

    /* renamed from: zi9$b */
    public static class b implements ej9 {
        public static final b a = new b();

        private b() {
        }
    }

    s<ej9> o();
}
