package com.spotify.mobile.android.audioplayer.domain;

import android.net.Uri;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class g {

    public static final class a extends g {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends g {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends g {
        private final Uri a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Uri uri) {
            super(null);
            h.e(uri, "audioUri");
            this.a = uri;
        }

        public final Uri a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
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
            StringBuilder V0 = je.V0("Play(audioUri=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class d extends g {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends g {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    private g() {
    }

    public g(f fVar) {
    }
}
