package com.spotify.topic.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.topic.proto.Duration;
import java.io.IOException;

public final class AudioEpisode extends GeneratedMessageLite<AudioEpisode, b> implements Object {
    private static final AudioEpisode p;
    private static volatile x<AudioEpisode> q;
    private Duration a;
    private String b = "";
    private String c = "";
    private String f = "";
    private boolean n;
    private Timestamp o;

    public static final class b extends GeneratedMessageLite.b<AudioEpisode, b> implements Object {
        private b() {
            super(AudioEpisode.p);
        }
    }

    static {
        AudioEpisode audioEpisode = new AudioEpisode();
        p = audioEpisode;
        audioEpisode.makeImmutable();
    }

    private AudioEpisode() {
    }

    public static AudioEpisode h() {
        return p;
    }

    public static x<AudioEpisode> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                AudioEpisode audioEpisode = (AudioEpisode) obj2;
                this.a = (Duration) hVar.i(this.a, audioEpisode.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !audioEpisode.b.isEmpty(), audioEpisode.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !audioEpisode.c.isEmpty(), audioEpisode.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ audioEpisode.f.isEmpty(), audioEpisode.f);
                boolean z = this.n;
                boolean z2 = audioEpisode.n;
                this.n = hVar.f(z, z, z2, z2);
                this.o = (Timestamp) hVar.i(this.o, audioEpisode.o);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                Duration duration = this.a;
                                Duration.b bVar = duration != null ? (Duration.b) duration.toBuilder() : null;
                                Duration duration2 = (Duration) gVar.o(Duration.parser(), kVar);
                                this.a = duration2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Duration.b) duration2);
                                    this.a = (Duration) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 34) {
                                this.f = gVar.A();
                            } else if (B == 40) {
                                this.n = gVar.h();
                            } else if (B == 50) {
                                Timestamp timestamp = this.o;
                                Timestamp.b bVar2 = timestamp != null ? (Timestamp.b) timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) gVar.o(Timestamp.parser(), kVar);
                                this.o = timestamp2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Timestamp.b) timestamp2);
                                    this.o = (Timestamp) bVar2.buildPartial();
                                }
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z3 = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d(this);
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new AudioEpisode();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (AudioEpisode.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.a != null) {
            i2 = 0 + CodedOutputStream.n(1, l());
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        boolean z = this.n;
        if (z) {
            i2 += CodedOutputStream.d(5, z);
        }
        if (this.o != null) {
            i2 += CodedOutputStream.n(6, n());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String i() {
        return this.f;
    }

    public Duration l() {
        Duration duration = this.a;
        return duration == null ? Duration.h() : duration;
    }

    public boolean m() {
        return this.n;
    }

    public Timestamp n() {
        Timestamp timestamp = this.o;
        return timestamp == null ? Timestamp.h() : timestamp;
    }

    public String o() {
        return this.b;
    }

    public String p() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != null) {
            codedOutputStream.M(1, l());
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
        boolean z = this.n;
        if (z) {
            codedOutputStream.A(5, z);
        }
        if (this.o != null) {
            codedOutputStream.M(6, n());
        }
    }
}
