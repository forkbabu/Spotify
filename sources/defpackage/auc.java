package defpackage;

import com.spotify.podcastinteractivity.qna.model.proto.QAndA;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: auc  reason: default package */
public abstract class auc {

    /* renamed from: auc$a */
    public static final class a extends auc {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: auc$b */
    public static final class b extends auc {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: auc$c */
    public static final class c extends auc {
        private final QAndA a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(QAndA qAndA) {
            super(null);
            h.e(qAndA, "qna");
            this.a = qAndA;
        }

        public final QAndA a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            QAndA qAndA = this.a;
            if (qAndA != null) {
                return qAndA.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Loaded(qna=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: auc$d */
    public static final class d extends auc {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public auc(f fVar) {
    }
}
