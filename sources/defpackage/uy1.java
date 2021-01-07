package defpackage;

import kotlin.jvm.internal.f;

/* renamed from: uy1  reason: default package */
public abstract class uy1 {

    /* renamed from: uy1$a */
    public static final class a extends uy1 {
        private final int a;

        public a(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.a == ((a) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("LoadStory(storyIndex="), this.a, ")");
        }
    }

    /* renamed from: uy1$b */
    public static final class b extends uy1 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public uy1(f fVar) {
    }
}
