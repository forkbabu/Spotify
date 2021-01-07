package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: zrc  reason: default package */
public interface zrc {

    /* renamed from: zrc$a */
    public static class a {
        private final Class<? extends csc> a;
        private final yrc b;

        private a(Class<? extends csc> cls, yrc yrc) {
            this.a = cls;
            this.b = yrc;
        }

        public static a a(Class<? extends csc> cls, yrc yrc) {
            return new a(cls, yrc);
        }

        public yrc b() {
            return this.b;
        }

        public Class<? extends csc> c() {
            return this.a;
        }
    }

    void a(csc csc, RecyclerView.b0 b0Var);

    RecyclerView.b0 b(ViewGroup viewGroup, int i);

    void c(csc csc, RecyclerView.b0 b0Var, int i);

    void d(csc csc, RecyclerView.b0 b0Var);

    int e(csc csc);
}
