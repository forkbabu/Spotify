package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EndTrackPreview extends GeneratedMessageLite<EndTrackPreview, b> implements Object {
    private static final EndTrackPreview n;
    private static volatile x<EndTrackPreview> o;
    private int a;
    private String b = "";
    private String c = "";
    private long f;

    public static final class b extends GeneratedMessageLite.b<EndTrackPreview, b> implements Object {
        public b m(long j) {
            copyOnWrite();
            EndTrackPreview.l((EndTrackPreview) this.instance, j);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            EndTrackPreview.h((EndTrackPreview) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            EndTrackPreview.i((EndTrackPreview) this.instance, str);
            return this;
        }

        private b() {
            super(EndTrackPreview.n);
        }
    }

    static {
        EndTrackPreview endTrackPreview = new EndTrackPreview();
        n = endTrackPreview;
        endTrackPreview.makeImmutable();
    }

    private EndTrackPreview() {
    }

    static void h(EndTrackPreview endTrackPreview, String str) {
        endTrackPreview.getClass();
        str.getClass();
        endTrackPreview.a |= 1;
        endTrackPreview.b = str;
    }

    static void i(EndTrackPreview endTrackPreview, String str) {
        endTrackPreview.getClass();
        str.getClass();
        endTrackPreview.a |= 2;
        endTrackPreview.c = str;
    }

    static void l(EndTrackPreview endTrackPreview, long j) {
        endTrackPreview.a |= 4;
        endTrackPreview.f = j;
    }

    public static b m() {
        return (b) n.toBuilder();
    }

    public static x<EndTrackPreview> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EndTrackPreview endTrackPreview = (EndTrackPreview) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (endTrackPreview.a & 1) == 1, endTrackPreview.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (endTrackPreview.a & 2) == 2, endTrackPreview.c);
                this.f = hVar.s((this.a & 4) == 4, this.f, (endTrackPreview.a & 4) == 4, endTrackPreview.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= endTrackPreview.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                String z2 = gVar.z();
                                this.a |= 1;
                                this.b = z2;
                            } else if (B == 18) {
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.w();
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new EndTrackPreview();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (EndTrackPreview.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.l(3, this.f);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.U(3, this.f);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
