package com.spotify.corex.transcripts.metadata.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class EpisodeTranscriptsMetadata extends GeneratedMessageLite<EpisodeTranscriptsMetadata, b> implements Object {
    private static final EpisodeTranscriptsMetadata f;
    private static volatile x<EpisodeTranscriptsMetadata> n;
    private int a;
    private String b = "";
    private o.i<EpisodeTranscriptMetadata> c = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<EpisodeTranscriptsMetadata, b> implements Object {
        private b() {
            super(EpisodeTranscriptsMetadata.f);
        }
    }

    static {
        EpisodeTranscriptsMetadata episodeTranscriptsMetadata = new EpisodeTranscriptsMetadata();
        f = episodeTranscriptsMetadata;
        episodeTranscriptsMetadata.makeImmutable();
    }

    private EpisodeTranscriptsMetadata() {
    }

    public static EpisodeTranscriptsMetadata h() {
        return f;
    }

    public static x<EpisodeTranscriptsMetadata> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EpisodeTranscriptsMetadata episodeTranscriptsMetadata = (EpisodeTranscriptsMetadata) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ episodeTranscriptsMetadata.b.isEmpty(), episodeTranscriptsMetadata.b);
                this.c = hVar.q(this.c, episodeTranscriptsMetadata.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= episodeTranscriptsMetadata.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.b = gVar.A();
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(EpisodeTranscriptMetadata.parser(), kVar));
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z = true;
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
                this.c.C();
                return null;
            case 4:
                return new EpisodeTranscriptsMetadata();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EpisodeTranscriptsMetadata.class) {
                        if (n == null) {
                            n = new GeneratedMessageLite.c(f);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            p += CodedOutputStream.n(2, this.c.get(i2));
        }
        this.memoizedSerializedSize = p;
        return p;
    }

    public String i() {
        return this.b;
    }

    public int l() {
        return this.c.size();
    }

    public List<EpisodeTranscriptMetadata> m() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
    }
}
