package com.spotify.corex.transcripts.metadata.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EpisodeTranscriptMetadata extends GeneratedMessageLite<EpisodeTranscriptMetadata, b> implements Object {
    private static final EpisodeTranscriptMetadata n;
    private static volatile x<EpisodeTranscriptMetadata> o;
    private String a = "";
    private String b = "";
    private boolean c;
    private String f = "";

    public static final class b extends GeneratedMessageLite.b<EpisodeTranscriptMetadata, b> implements Object {
        private b() {
            super(EpisodeTranscriptMetadata.n);
        }
    }

    static {
        EpisodeTranscriptMetadata episodeTranscriptMetadata = new EpisodeTranscriptMetadata();
        n = episodeTranscriptMetadata;
        episodeTranscriptMetadata.makeImmutable();
    }

    private EpisodeTranscriptMetadata() {
    }

    public static x<EpisodeTranscriptMetadata> parser() {
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
                EpisodeTranscriptMetadata episodeTranscriptMetadata = (EpisodeTranscriptMetadata) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !episodeTranscriptMetadata.a.isEmpty(), episodeTranscriptMetadata.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !episodeTranscriptMetadata.b.isEmpty(), episodeTranscriptMetadata.b);
                boolean z = this.c;
                boolean z2 = episodeTranscriptMetadata.c;
                this.c = hVar.f(z, z, z2, z2);
                this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ episodeTranscriptMetadata.f.isEmpty(), episodeTranscriptMetadata.f);
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
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 24) {
                                this.c = gVar.h();
                            } else if (B == 34) {
                                this.f = gVar.A();
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
                return new EpisodeTranscriptMetadata();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (EpisodeTranscriptMetadata.class) {
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
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        boolean z = this.c;
        if (z) {
            i2 += CodedOutputStream.d(3, z);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.f;
    }

    public boolean i() {
        return this.c;
    }

    public String l() {
        return this.b;
    }

    public String m() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        boolean z = this.c;
        if (z) {
            codedOutputStream.A(3, z);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
    }
}
