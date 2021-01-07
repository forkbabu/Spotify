package com.spotify.podcastinteractivity.qna.model.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.podcastinteractivity.qna.proto.Timestamp;
import java.io.IOException;

public final class Prompt extends GeneratedMessageLite<Prompt, b> implements Object {
    private static final Prompt o;
    private static volatile x<Prompt> p;
    private int a;
    private Timestamp b;
    private Timestamp c;
    private String f = "";
    private int n;

    public static final class b extends GeneratedMessageLite.b<Prompt, b> implements Object {
        private b() {
            super(Prompt.o);
        }
    }

    static {
        Prompt prompt = new Prompt();
        o = prompt;
        prompt.makeImmutable();
    }

    private Prompt() {
    }

    public static Prompt h() {
        return o;
    }

    public static x<Prompt> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Prompt prompt = (Prompt) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = prompt.a;
                this.a = hVar.m(z2, i, i2 != 0, i2);
                this.b = (Timestamp) hVar.i(this.b, prompt.b);
                this.c = (Timestamp) hVar.i(this.c, prompt.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !prompt.f.isEmpty(), prompt.f);
                int i3 = this.n;
                boolean z3 = i3 != 0;
                int i4 = prompt.n;
                if (i4 != 0) {
                    z = true;
                }
                this.n = hVar.m(z3, i3, z, i4);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.u();
                            } else if (B == 18) {
                                Timestamp timestamp = this.b;
                                Timestamp.b bVar = timestamp != null ? (Timestamp.b) timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) gVar.o(Timestamp.parser(), kVar);
                                this.b = timestamp2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Timestamp.b) timestamp2);
                                    this.b = (Timestamp) bVar.buildPartial();
                                }
                            } else if (B == 26) {
                                Timestamp timestamp3 = this.c;
                                Timestamp.b bVar2 = timestamp3 != null ? (Timestamp.b) timestamp3.toBuilder() : null;
                                Timestamp timestamp4 = (Timestamp) gVar.o(Timestamp.parser(), kVar);
                                this.c = timestamp4;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Timestamp.b) timestamp4);
                                    this.c = (Timestamp) bVar2.buildPartial();
                                }
                            } else if (B == 34) {
                                this.f = gVar.A();
                            } else if (B == 40) {
                                this.n = gVar.u();
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
                return null;
            case 4:
                return new Prompt();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (Prompt.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.a;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.j(1, i3);
        }
        Timestamp timestamp = this.b;
        if (timestamp != null) {
            i2 += CodedOutputStream.n(2, timestamp);
        }
        Timestamp timestamp2 = this.c;
        if (timestamp2 != null) {
            i2 += CodedOutputStream.n(3, timestamp2);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        if (this.n != QAndAStatus.DRAFT.getNumber()) {
            i2 += CodedOutputStream.h(5, this.n);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String i() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        int i = this.a;
        if (i != 0) {
            codedOutputStream.K(1, i);
        }
        Timestamp timestamp = this.b;
        if (timestamp != null) {
            codedOutputStream.M(2, timestamp);
        }
        Timestamp timestamp2 = this.c;
        if (timestamp2 != null) {
            codedOutputStream.M(3, timestamp2);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
        if (this.n != QAndAStatus.DRAFT.getNumber()) {
            codedOutputStream.K(5, this.n);
        }
    }
}
