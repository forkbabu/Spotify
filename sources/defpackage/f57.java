package defpackage;

import android.os.Bundle;
import android.view.View;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import kotlin.jvm.internal.h;

/* renamed from: f57  reason: default package */
public abstract class f57 {

    /* renamed from: f57$a */
    public static final class a extends f57 {
        private final boa a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boa boa) {
            super(null);
            h.e(boa, "coverArtModel");
            this.a = boa;
        }

        public final boa a() {
            return this.a;
        }
    }

    /* renamed from: f57$b */
    public static final class b extends f57 {
        private final a0 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var) {
            super(null);
            h.e(a0Var, "toolbarMenu");
            this.a = a0Var;
        }

        public final a0 a() {
            return this.a;
        }
    }

    /* renamed from: f57$c */
    public static final class c extends f57 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: f57$d */
    public static final class d extends f57 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(null);
            h.e(view, "view");
        }
    }

    /* renamed from: f57$e */
    public static final class e extends f57 {
        private final qyd a;
        private final esc b;
        private final boolean c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(qyd qyd, esc esc, boolean z) {
            super(null);
            h.e(qyd, "showEntity");
            h.e(esc, "blueprint");
            this.a = qyd;
            this.b = esc;
            this.c = z;
        }

        public final esc a() {
            return this.b;
        }

        public final qyd b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }
    }

    /* renamed from: f57$f */
    public static final class f extends f57 {
        private final Bundle a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Bundle bundle) {
            super(null);
            h.e(bundle, "bundle");
            this.a = bundle;
        }

        public final Bundle a() {
            return this.a;
        }
    }

    /* renamed from: f57$g */
    public static final class g extends f57 {
        private final Bundle a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(Bundle bundle) {
            super(null);
            h.e(bundle, "bundle");
            this.a = bundle;
        }

        public final Bundle a() {
            return this.a;
        }
    }

    public f57(kotlin.jvm.internal.f fVar) {
    }
}
