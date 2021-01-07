package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h61  reason: default package */
public interface h61 {

    /* renamed from: h61$a */
    public static class a {

        /* renamed from: h61$a$a  reason: collision with other inner class name */
        private static class C0596a implements h61 {
            private final RecyclerView.e<?> a;

            C0596a(RecyclerView.e<?> eVar) {
                eVar.getClass();
                this.a = eVar;
            }

            @Override // defpackage.h61
            public void a() {
                this.a.z();
            }
        }

        /* renamed from: h61$a$b */
        private static class b implements h61 {
            private final q61 a;

            b(q61 q61) {
                q61.getClass();
                this.a = q61;
            }

            @Override // defpackage.h61
            public void a() {
                this.a.f();
            }
        }

        public static h61 a(RecyclerView.e<?> eVar) {
            return new C0596a(eVar);
        }

        public static h61 b(q61 q61) {
            return new b(q61);
        }
    }

    void a();
}
