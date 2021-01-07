package defpackage;

import com.spotify.inappmessaging.preview.views.d;
import com.spotify.inappmessaging.preview.views.e;

/* renamed from: eq0  reason: default package */
public abstract class eq0 {

    /* renamed from: eq0$a */
    public static final class a extends eq0 {
        a() {
        }

        @Override // defpackage.eq0
        public final void a(si0<b> si0, si0<c> si02, si0<a> si03) {
            ((e) si03).accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Loading{}";
        }
    }

    /* renamed from: eq0$b */
    public static final class b extends eq0 {
        b() {
        }

        @Override // defpackage.eq0
        public final void a(si0<b> si0, si0<c> si02, si0<a> si03) {
            ((com.spotify.inappmessaging.preview.views.c) si0).accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PreviewButton{}";
        }
    }

    /* renamed from: eq0$c */
    public static final class c extends eq0 {
        c() {
        }

        @Override // defpackage.eq0
        public final void a(si0<b> si0, si0<c> si02, si0<a> si03) {
            ((d) si02).accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PreviewSubmission{}";
        }
    }

    eq0() {
    }

    public abstract void a(si0<b> si0, si0<c> si02, si0<a> si03);
}
