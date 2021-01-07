package defpackage;

import android.view.View;
import kotlin.jvm.internal.h;

/* renamed from: qhc  reason: default package */
public interface qhc {

    /* renamed from: qhc$a */
    public interface a {
        qhc create();
    }

    /* renamed from: qhc$b */
    public static final class b {
        private final int a;
        private final boolean b;
        private final View.OnClickListener c;

        public b(int i, boolean z, View.OnClickListener onClickListener) {
            h.e(onClickListener, "onFilterClickListener");
            this.a = i;
            this.b = z;
            this.c = onClickListener;
        }

        public final int a() {
            return this.a;
        }

        public final View.OnClickListener b() {
            return this.c;
        }

        public final boolean c() {
            return this.b;
        }
    }
}
