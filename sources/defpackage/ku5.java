package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: ku5  reason: default package */
public abstract class ku5 {

    /* renamed from: ku5$a */
    public static final class a extends ku5 {
        a() {
        }

        @Override // defpackage.ku5
        public final void b(si0<a> si0, si0<b> si02) {
            si0.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Hidden{}";
        }
    }

    /* renamed from: ku5$b */
    public static final class b extends ku5 {
        private final sg0<Context, Drawable> a;
        private final boolean b;
        private final int c;

        b(sg0<Context, Drawable> sg0, boolean z, int i) {
            sg0.getClass();
            this.a = sg0;
            this.b = z;
            this.c = i;
        }

        @Override // defpackage.ku5
        public final void b(si0<a> si0, si0<b> si02) {
            si02.accept(this);
        }

        public final int d() {
            return this.c;
        }

        public final sg0<Context, Drawable> e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.b == this.b && bVar.c == this.c && bVar.a.equals(this.a)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = Boolean.valueOf(this.b).hashCode();
            return je.b(this.c, (hashCode + ((this.a.hashCode() + 0) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Visible{drawable=");
            V0.append(this.a);
            V0.append(", isActivated=");
            V0.append(this.b);
            V0.append(", contentDescResId=");
            return je.A0(V0, this.c, '}');
        }
    }

    ku5() {
    }

    public static ku5 a() {
        return new a();
    }

    public static ku5 c(sg0<Context, Drawable> sg0, boolean z, int i) {
        return new b(sg0, z, i);
    }

    public abstract void b(si0<a> si0, si0<b> si02);
}
