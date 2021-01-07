package com.spotify.music.libs.fullscreen.story.domain;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class j {

    public static final class a extends j {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            h.e(str, "artistName");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Followed(artistName="), this.a, ")");
        }
    }

    public static final class b extends j {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends j {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            h.e(str, "artistName");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Unfollowed(artistName="), this.a, ")");
        }
    }

    public static final class d extends j {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public j(f fVar) {
    }
}
