package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.searchview.proto.Duration;
import java.io.IOException;

public final class AudioEpisode extends GeneratedMessageLite<AudioEpisode, b> implements Object {
    private static final AudioEpisode n;
    private static volatile x<AudioEpisode> o;
    private String a = "";
    private boolean b;
    private Duration c;
    private boolean f;

    public static final class b extends GeneratedMessageLite.b<AudioEpisode, b> implements Object {
        private b() {
            super(AudioEpisode.n);
        }
    }

    static {
        AudioEpisode audioEpisode = new AudioEpisode();
        n = audioEpisode;
        audioEpisode.makeImmutable();
    }

    private AudioEpisode() {
    }

    public static AudioEpisode h() {
        return n;
    }

    public static x<AudioEpisode> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                AudioEpisode audioEpisode = (AudioEpisode) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, true ^ audioEpisode.a.isEmpty(), audioEpisode.a);
                boolean z = this.b;
                boolean z2 = audioEpisode.b;
                this.b = hVar.f(z, z, z2, z2);
                this.c = (Duration) hVar.i(this.c, audioEpisode.c);
                boolean z3 = this.f;
                boolean z4 = audioEpisode.f;
                this.f = hVar.f(z3, z3, z4, z4);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 16) {
                                this.b = gVar.h();
                            } else if (B == 26) {
                                Duration duration = this.c;
                                Duration.b bVar = duration != null ? (Duration.b) duration.toBuilder() : null;
                                Duration duration2 = (Duration) gVar.o(Duration.parser(), kVar);
                                this.c = duration2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Duration.b) duration2);
                                    this.c = (Duration) bVar.buildPartial();
                                }
                            } else if (B == 48) {
                                this.f = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z5 = true;
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
                if (o == null) {
                    synchronized (AudioEpisode.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        boolean z = this.b;
        if (z) {
            i2 += CodedOutputStream.d(2, z);
        }
        if (this.c != null) {
            i2 += CodedOutputStream.n(3, i());
        }
        boolean z2 = this.f;
        if (z2) {
            i2 += CodedOutputStream.d(6, z2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Duration i() {
        Duration duration = this.c;
        return duration == null ? Duration.h() : duration;
    }

    public boolean l() {
        return this.b;
    }

    public boolean m() {
        return this.f;
    }

    public String n() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        boolean z = this.b;
        if (z) {
            codedOutputStream.A(2, z);
        }
        if (this.c != null) {
            codedOutputStream.M(3, i());
        }
        boolean z2 = this.f;
        if (z2) {
            codedOutputStream.A(6, z2);
        }
    }
}
