package com.spotify.corex.transcripts.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class Transcript extends GeneratedMessageLite<Transcript, b> implements Object {
    private static final Transcript p;
    private static volatile x<Transcript> q;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private o.i<Section> n = GeneratedMessageLite.emptyProtobufList();
    private String o = "";

    public static final class b extends GeneratedMessageLite.b<Transcript, b> implements Object {
        private b() {
            super(Transcript.p);
        }
    }

    static {
        Transcript transcript = new Transcript();
        p = transcript;
        transcript.makeImmutable();
    }

    private Transcript() {
    }

    public static x<Transcript> parser() {
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
                Transcript transcript = (Transcript) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !transcript.b.isEmpty(), transcript.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !transcript.c.isEmpty(), transcript.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !transcript.f.isEmpty(), transcript.f);
                this.n = hVar.q(this.n, transcript.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, true ^ transcript.o.isEmpty(), transcript.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= transcript.a;
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
                                this.c = gVar.A();
                            } else if (B == 26) {
                                this.f = gVar.A();
                            } else if (B == 34) {
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(gVar.o(Section.parser(), kVar));
                            } else if (B == 42) {
                                this.o = gVar.A();
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
                this.n.C();
                return null;
            case 4:
                return new Transcript();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (Transcript.class) {
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
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (!this.c.isEmpty()) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        if (!this.f.isEmpty()) {
            p2 += CodedOutputStream.p(3, this.f);
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            p2 += CodedOutputStream.n(4, this.n.get(i2));
        }
        if (!this.o.isEmpty()) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public String h() {
        return this.c;
    }

    public String i() {
        return this.o;
    }

    public String l() {
        return this.f;
    }

    public List<Section> m() {
        return this.n;
    }

    public String n() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
        for (int i = 0; i < this.n.size(); i++) {
            codedOutputStream.M(4, this.n.get(i));
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(5, this.o);
        }
    }
}
