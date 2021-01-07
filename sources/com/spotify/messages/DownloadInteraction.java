package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class DownloadInteraction extends GeneratedMessageLite<DownloadInteraction, b> implements Object {
    private static final DownloadInteraction o;
    private static volatile x<DownloadInteraction> p;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private boolean n;

    public static final class b extends GeneratedMessageLite.b<DownloadInteraction, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            DownloadInteraction.l((DownloadInteraction) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            DownloadInteraction.m((DownloadInteraction) this.instance, str);
            return this;
        }

        public b o(boolean z) {
            copyOnWrite();
            DownloadInteraction.i((DownloadInteraction) this.instance, z);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            DownloadInteraction.h((DownloadInteraction) this.instance, str);
            return this;
        }

        private b() {
            super(DownloadInteraction.o);
        }
    }

    static {
        DownloadInteraction downloadInteraction = new DownloadInteraction();
        o = downloadInteraction;
        downloadInteraction.makeImmutable();
    }

    private DownloadInteraction() {
    }

    static void h(DownloadInteraction downloadInteraction, String str) {
        downloadInteraction.getClass();
        str.getClass();
        downloadInteraction.a |= 1;
        downloadInteraction.b = str;
    }

    static void i(DownloadInteraction downloadInteraction, boolean z) {
        downloadInteraction.a |= 8;
        downloadInteraction.n = z;
    }

    static void l(DownloadInteraction downloadInteraction, String str) {
        downloadInteraction.getClass();
        str.getClass();
        downloadInteraction.a |= 2;
        downloadInteraction.c = str;
    }

    static void m(DownloadInteraction downloadInteraction, String str) {
        downloadInteraction.getClass();
        str.getClass();
        downloadInteraction.a |= 4;
        downloadInteraction.f = str;
    }

    public static b n() {
        return (b) o.toBuilder();
    }

    public static x<DownloadInteraction> parser() {
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
                DownloadInteraction downloadInteraction = (DownloadInteraction) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (downloadInteraction.a & 1) == 1, downloadInteraction.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (downloadInteraction.a & 2) == 2, downloadInteraction.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (downloadInteraction.a & 4) == 4, downloadInteraction.f);
                boolean z2 = (this.a & 8) == 8;
                boolean z3 = this.n;
                if ((downloadInteraction.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.f(z2, z3, z, downloadInteraction.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= downloadInteraction.a;
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
                                String z4 = gVar.z();
                                this.a |= 1;
                                this.b = z4;
                            } else if (B == 18) {
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.c = z5;
                            } else if (B == 26) {
                                String z6 = gVar.z();
                                this.a |= 4;
                                this.f = z6;
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.h();
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
                return new DownloadInteraction();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (DownloadInteraction.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.d(4, this.n);
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
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.A(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
