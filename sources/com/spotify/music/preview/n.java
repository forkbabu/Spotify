package com.spotify.music.preview;

import com.google.common.base.Optional;
import com.spotify.music.preview.PreviewPlayerImpl;

final class n extends PreviewPlayerImpl.b {
    private final String b;
    private final Optional<String> c;
    private final Optional<String> d;
    private final Optional<Long> e;

    n(String str, Optional optional, Optional optional2, Optional optional3, a aVar) {
        this.b = str;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
    }

    @Override // com.spotify.music.preview.PreviewPlayerImpl.b
    public Optional<Long> b() {
        return this.e;
    }

    @Override // com.spotify.music.preview.PreviewPlayerImpl.b
    public String c() {
        return this.b;
    }

    @Override // com.spotify.music.preview.PreviewPlayerImpl.b
    public Optional<String> d() {
        return this.c;
    }

    @Override // com.spotify.music.preview.PreviewPlayerImpl.b
    public Optional<String> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreviewPlayerImpl.b)) {
            return false;
        }
        PreviewPlayerImpl.b bVar = (PreviewPlayerImpl.b) obj;
        if (!this.b.equals(bVar.c()) || !this.c.equals(bVar.d()) || !this.d.equals(bVar.e()) || !this.e.equals(bVar.b())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.preview.PreviewPlayerImpl.b
    public PreviewPlayerImpl.b.a f() {
        return new b(this, null);
    }

    public int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PreviewAction{previewId=");
        V0.append(this.b);
        V0.append(", previewKey=");
        V0.append(this.c);
        V0.append(", previewUrl=");
        V0.append(this.d);
        V0.append(", maxDuration=");
        return je.F0(V0, this.e, "}");
    }

    /* access modifiers changed from: package-private */
    public static final class b implements PreviewPlayerImpl.b.a {
        private String a;
        private Optional<String> b = Optional.absent();
        private Optional<String> c = Optional.absent();
        private Optional<Long> d = Optional.absent();

        b() {
        }

        public PreviewPlayerImpl.b a() {
            String str = this.a == null ? " previewId" : "";
            if (str.isEmpty()) {
                return new n(this.a, this.b, this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public PreviewPlayerImpl.b.a b(Optional<Long> optional) {
            this.d = optional;
            return this;
        }

        public PreviewPlayerImpl.b.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null previewId");
        }

        public PreviewPlayerImpl.b.a d(Optional<String> optional) {
            this.b = optional;
            return this;
        }

        public PreviewPlayerImpl.b.a e(Optional<String> optional) {
            this.c = optional;
            return this;
        }

        b(PreviewPlayerImpl.b bVar, a aVar) {
            this.a = bVar.c();
            this.b = bVar.d();
            this.c = bVar.e();
            this.d = bVar.b();
        }
    }
}
