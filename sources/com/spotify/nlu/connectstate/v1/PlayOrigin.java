package com.spotify.nlu.connectstate.v1;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class PlayOrigin extends GeneratedMessageLite<PlayOrigin, b> implements Object {
    private static final PlayOrigin r;
    private static volatile x<PlayOrigin> s;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private o.i<String> q = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<PlayOrigin, b> implements Object {
        private b() {
            super(PlayOrigin.r);
        }
    }

    static {
        PlayOrigin playOrigin = new PlayOrigin();
        r = playOrigin;
        playOrigin.makeImmutable();
    }

    private PlayOrigin() {
    }

    public static x<PlayOrigin> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlayOrigin playOrigin = (PlayOrigin) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !playOrigin.b.isEmpty(), playOrigin.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !playOrigin.c.isEmpty(), playOrigin.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !playOrigin.f.isEmpty(), playOrigin.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !playOrigin.n.isEmpty(), playOrigin.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !playOrigin.o.isEmpty(), playOrigin.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, true ^ playOrigin.p.isEmpty(), playOrigin.p);
                this.q = hVar.q(this.q, playOrigin.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playOrigin.a;
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
                                this.n = gVar.A();
                            } else if (B == 42) {
                                this.o = gVar.A();
                            } else if (B == 50) {
                                this.p = gVar.A();
                            } else if (B == 58) {
                                String A = gVar.A();
                                if (!this.q.R0()) {
                                    this.q = GeneratedMessageLite.mutableCopy(this.q);
                                }
                                this.q.add(A);
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
                this.q.C();
                return null;
            case 4:
                return new PlayOrigin();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (PlayOrigin.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
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
        if (!this.n.isEmpty()) {
            p2 += CodedOutputStream.p(4, this.n);
        }
        if (!this.o.isEmpty()) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        if (!this.p.isEmpty()) {
            p2 += CodedOutputStream.p(6, this.p);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            i2 += CodedOutputStream.q(this.q.get(i3));
        }
        int C0 = je.C0(this.q, 1, p2 + i2);
        this.memoizedSerializedSize = C0;
        return C0;
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
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(5, this.o);
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(6, this.p);
        }
        for (int i = 0; i < this.q.size(); i++) {
            codedOutputStream.P(7, this.q.get(i));
        }
    }
}
