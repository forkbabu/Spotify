package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class Paragraph extends GeneratedMessageLite<Paragraph, b> implements Object {
    private static final Paragraph o;
    private static volatile x<Paragraph> p;
    private int a;
    private String b = "";
    private o.i<String> c = GeneratedMessageLite.emptyProtobufList();
    private String f = "";
    private String n = "";

    public static final class b extends GeneratedMessageLite.b<Paragraph, b> implements Object {
        private b() {
            super(Paragraph.o);
        }
    }

    static {
        Paragraph paragraph = new Paragraph();
        o = paragraph;
        paragraph.makeImmutable();
    }

    private Paragraph() {
    }

    public static Paragraph h() {
        return o;
    }

    public static x<Paragraph> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Paragraph paragraph = (Paragraph) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !paragraph.b.isEmpty(), paragraph.b);
                this.c = hVar.q(this.c, paragraph.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !paragraph.f.isEmpty(), paragraph.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ paragraph.n.isEmpty(), paragraph.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= paragraph.a;
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
                                String A = gVar.A();
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(A);
                            } else if (B == 26) {
                                this.f = gVar.A();
                            } else if (B == 34) {
                                this.n = gVar.A();
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
                return new Paragraph();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (Paragraph.class) {
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
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            i2 += CodedOutputStream.q(this.c.get(i3));
        }
        int C0 = je.C0(this.c, 1, p2 + i2);
        if (!this.f.isEmpty()) {
            C0 += CodedOutputStream.p(3, this.f);
        }
        if (!this.n.isEmpty()) {
            C0 += CodedOutputStream.p(4, this.n);
        }
        this.memoizedSerializedSize = C0;
        return C0;
    }

    public String i() {
        return this.b;
    }

    public String l() {
        return this.f;
    }

    public String m() {
        return this.n;
    }

    public List<String> n() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.P(2, this.c.get(i));
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
    }
}
