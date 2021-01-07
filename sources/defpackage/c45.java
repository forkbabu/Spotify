package defpackage;

import java.util.Calendar;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: c45  reason: default package */
public abstract class c45 {

    /* renamed from: c45$a */
    public static final class a extends c45 {
        private final Calendar a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Calendar calendar) {
            super(null);
            h.e(calendar, "calendar");
            this.a = calendar;
        }

        public final Calendar a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Calendar calendar = this.a;
            if (calendar != null) {
                return calendar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Date(calendar=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: c45$b */
    public static final class b extends c45 {
        private final int a;

        public b(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.a == ((b) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("Days(days="), this.a, ")");
        }
    }

    /* renamed from: c45$c */
    public static final class c extends c45 {
        private final int a;

        public c(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && this.a == ((c) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("Hours(hours="), this.a, ")");
        }
    }

    /* renamed from: c45$d */
    public static final class d extends c45 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: c45$e */
    public static final class e extends c45 {
        private final int a;

        public e(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && this.a == ((e) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("Minutes(minutes="), this.a, ")");
        }
    }

    public c45(f fVar) {
    }
}
