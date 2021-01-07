package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class SummaryShareCardColorScheme extends GeneratedMessageLite<SummaryShareCardColorScheme, b> implements Object {
    private static final SummaryShareCardColorScheme p;
    private static volatile x<SummaryShareCardColorScheme> q;
    private String a = "";
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";

    public static final class b extends GeneratedMessageLite.b<SummaryShareCardColorScheme, b> implements Object {
        private b() {
            super(SummaryShareCardColorScheme.p);
        }
    }

    static {
        SummaryShareCardColorScheme summaryShareCardColorScheme = new SummaryShareCardColorScheme();
        p = summaryShareCardColorScheme;
        summaryShareCardColorScheme.makeImmutable();
    }

    private SummaryShareCardColorScheme() {
    }

    public static x<SummaryShareCardColorScheme> parser() {
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
                SummaryShareCardColorScheme summaryShareCardColorScheme = (SummaryShareCardColorScheme) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !summaryShareCardColorScheme.a.isEmpty(), summaryShareCardColorScheme.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !summaryShareCardColorScheme.b.isEmpty(), summaryShareCardColorScheme.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !summaryShareCardColorScheme.c.isEmpty(), summaryShareCardColorScheme.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !summaryShareCardColorScheme.f.isEmpty(), summaryShareCardColorScheme.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !summaryShareCardColorScheme.n.isEmpty(), summaryShareCardColorScheme.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, true ^ summaryShareCardColorScheme.o.isEmpty(), summaryShareCardColorScheme.o);
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
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 34) {
                                this.f = gVar.A();
                            } else if (B == 42) {
                                this.n = gVar.A();
                            } else if (B == 50) {
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
                return null;
            case 4:
                return new SummaryShareCardColorScheme();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (SummaryShareCardColorScheme.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
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
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.n);
        }
        if (!this.o.isEmpty()) {
            i2 += CodedOutputStream.p(6, this.o);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.a;
    }

    public String i() {
        return this.b;
    }

    public String l() {
        return this.n;
    }

    public String m() {
        return this.c;
    }

    public String n() {
        return this.f;
    }

    public String o() {
        return this.o;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
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
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(6, this.o);
        }
    }
}
