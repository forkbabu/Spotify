package com.spotify.instrumentation.navigation.logger;

import kotlin.jvm.internal.f;

public abstract class h {

    public static final class a extends h {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends h {
        private final f a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(null);
            kotlin.jvm.internal.h.e(fVar, "originalAction");
            this.a = fVar;
        }

        public final f a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && kotlin.jvm.internal.h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            f fVar = this.a;
            if (fVar != null) {
                return fVar.hashCode();
            }
            return 0;
        }

        @Override // com.spotify.instrumentation.navigation.logger.h
        public String toString() {
            StringBuilder V0 = je.V0("LocationChangingMoreThanOnce(originalAction=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class c extends h {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends h {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends h {
        private final NavigationTransactionState a;
        private final f b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(NavigationTransactionState navigationTransactionState, f fVar) {
            super(null);
            kotlin.jvm.internal.h.e(navigationTransactionState, "stateWhenInterrupted");
            kotlin.jvm.internal.h.e(fVar, "originalAction");
            this.a = navigationTransactionState;
            this.b = fVar;
        }

        public final f a() {
            return this.b;
        }

        public final NavigationTransactionState b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.h.a(this.a, eVar.a) && kotlin.jvm.internal.h.a(this.b, eVar.b);
        }

        public int hashCode() {
            NavigationTransactionState navigationTransactionState = this.a;
            int i = 0;
            int hashCode = (navigationTransactionState != null ? navigationTransactionState.hashCode() : 0) * 31;
            f fVar = this.b;
            if (fVar != null) {
                i = fVar.hashCode();
            }
            return hashCode + i;
        }

        @Override // com.spotify.instrumentation.navigation.logger.h
        public String toString() {
            StringBuilder V0 = je.V0("NavigationInterruptedByNewAction(stateWhenInterrupted=");
            V0.append(this.a);
            V0.append(", originalAction=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    private h() {
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public h(f fVar) {
    }
}
