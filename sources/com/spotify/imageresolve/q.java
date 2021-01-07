package com.spotify.imageresolve;

import com.google.protobuf.ByteString;
import com.spotify.imageresolve.a0;
import com.spotify.imageresolve.proto.ProjectionMetadata;

final class q extends a0 {
    private final ByteString c;
    private final ProjectionMetadata d;
    private final String e;

    static final class b implements a0.a {
        private ByteString a;
        private ProjectionMetadata b;
        private String c;

        b() {
        }

        public a0 a() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " metadata");
            }
            if (this.c == null) {
                str = je.x0(str, " urlTemplate");
            }
            if (str.isEmpty()) {
                return new q(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public a0.a b(ByteString byteString) {
            if (byteString != null) {
                this.a = byteString;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public a0.a c(ProjectionMetadata projectionMetadata) {
            if (projectionMetadata != null) {
                this.b = projectionMetadata;
                return this;
            }
            throw new NullPointerException("Null metadata");
        }

        public a0.a d(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null urlTemplate");
        }
    }

    q(ByteString byteString, ProjectionMetadata projectionMetadata, String str, a aVar) {
        this.c = byteString;
        this.d = projectionMetadata;
        this.e = str;
    }

    @Override // com.spotify.imageresolve.a0
    public ByteString b() {
        return this.c;
    }

    @Override // com.spotify.imageresolve.a0
    public ProjectionMetadata c() {
        return this.d;
    }

    @Override // com.spotify.imageresolve.a0
    public String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!this.c.equals(a0Var.b()) || !this.d.equals(a0Var.c()) || !this.e.equals(a0Var.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Projection{id=");
        V0.append(this.c);
        V0.append(", metadata=");
        V0.append(this.d);
        V0.append(", urlTemplate=");
        return je.I0(V0, this.e, "}");
    }
}
