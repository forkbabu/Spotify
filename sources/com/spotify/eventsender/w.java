package com.spotify.eventsender;

import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.eventsender.c0;

final class w extends c0 {
    private final long a;
    private final String b;
    private final ByteString c;
    private final long d;
    private final Iterable<Pair<String, ByteString>> e;

    static final class b extends c0.a {
        private Long a;
        private String b;
        private ByteString c;
        private Long d;
        private Iterable<Pair<String, ByteString>> e;

        b() {
        }

        public c0 a() {
            String str = this.a == null ? " internalId" : "";
            if (this.b == null) {
                str = je.x0(str, " eventName");
            }
            if (this.c == null) {
                str = je.x0(str, " sequenceId");
            }
            if (this.d == null) {
                str = je.x0(str, " sequenceNumber");
            }
            if (this.e == null) {
                str = je.x0(str, " fragments");
            }
            if (str.isEmpty()) {
                return new w(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public c0.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null eventName");
        }

        public c0.a c(Iterable<Pair<String, ByteString>> iterable) {
            if (iterable != null) {
                this.e = iterable;
                return this;
            }
            throw new NullPointerException("Null fragments");
        }

        public c0.a d(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public c0.a e(ByteString byteString) {
            this.c = byteString;
            return this;
        }

        public c0.a f(long j) {
            this.d = Long.valueOf(j);
            return this;
        }
    }

    w(long j, String str, ByteString byteString, long j2, Iterable iterable, a aVar) {
        this.a = j;
        this.b = str;
        this.c = byteString;
        this.d = j2;
        this.e = iterable;
    }

    @Override // com.spotify.eventsender.c0
    public String a() {
        return this.b;
    }

    @Override // com.spotify.eventsender.c0
    public Iterable<Pair<String, ByteString>> b() {
        return this.e;
    }

    @Override // com.spotify.eventsender.c0
    public long c() {
        return this.a;
    }

    @Override // com.spotify.eventsender.c0
    public ByteString d() {
        return this.c;
    }

    @Override // com.spotify.eventsender.c0
    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.a != c0Var.c() || !this.b.equals(c0Var.a()) || !this.c.equals(c0Var.d()) || this.d != c0Var.e() || !this.e.equals(c0Var.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.d;
        return this.e.hashCode() ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Event{internalId=");
        V0.append(this.a);
        V0.append(", eventName=");
        V0.append(this.b);
        V0.append(", sequenceId=");
        V0.append(this.c);
        V0.append(", sequenceNumber=");
        V0.append(this.d);
        V0.append(", fragments=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}
