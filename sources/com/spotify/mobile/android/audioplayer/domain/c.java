package com.spotify.mobile.android.audioplayer.domain;

import android.net.Uri;
import kotlin.jvm.internal.h;

public abstract class c {

    public static final class a extends c {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends c {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: com.spotify.mobile.android.audioplayer.domain.c$c  reason: collision with other inner class name */
    public static final class C0172c extends c {
        private final Uri a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0172c(Uri uri) {
            super(null);
            h.e(uri, "audioUri");
            this.a = uri;
        }

        public final Uri a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0172c) && h.a(this.a, ((C0172c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Uri uri = this.a;
            if (uri != null) {
                return uri.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PreparePlay(audioUri=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class d extends c {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends c {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    public static final class f extends c {
        private final long a;

        public f(long j) {
            super(null);
            this.a = j;
        }

        public final long a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && this.a == ((f) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return defpackage.e.a(this.a);
        }

        public String toString() {
            return je.E0(je.V0("SeekAndResume(position="), this.a, ")");
        }
    }

    public c(kotlin.jvm.internal.f fVar) {
    }
}
