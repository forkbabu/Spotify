package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ConnectVolumeControl extends GeneratedMessageLite<ConnectVolumeControl, b> implements Object {
    private static final ConnectVolumeControl r;
    private static volatile x<ConnectVolumeControl> s;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private float n;
    private String o = "";
    private float p;
    private String q = "";

    public static final class b extends GeneratedMessageLite.b<ConnectVolumeControl, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            ConnectVolumeControl.h((ConnectVolumeControl) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ConnectVolumeControl.n((ConnectVolumeControl) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ConnectVolumeControl.o((ConnectVolumeControl) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            ConnectVolumeControl.l((ConnectVolumeControl) this.instance, str);
            return this;
        }

        public b q(float f) {
            copyOnWrite();
            ConnectVolumeControl.m((ConnectVolumeControl) this.instance, f);
            return this;
        }

        public b r(float f) {
            copyOnWrite();
            ConnectVolumeControl.i((ConnectVolumeControl) this.instance, f);
            return this;
        }

        private b() {
            super(ConnectVolumeControl.r);
        }
    }

    static {
        ConnectVolumeControl connectVolumeControl = new ConnectVolumeControl();
        r = connectVolumeControl;
        connectVolumeControl.makeImmutable();
    }

    private ConnectVolumeControl() {
    }

    static void h(ConnectVolumeControl connectVolumeControl, String str) {
        connectVolumeControl.getClass();
        str.getClass();
        connectVolumeControl.a |= 1;
        connectVolumeControl.b = str;
    }

    static void i(ConnectVolumeControl connectVolumeControl, float f2) {
        connectVolumeControl.a |= 8;
        connectVolumeControl.n = f2;
    }

    static void l(ConnectVolumeControl connectVolumeControl, String str) {
        connectVolumeControl.getClass();
        str.getClass();
        connectVolumeControl.a |= 16;
        connectVolumeControl.o = str;
    }

    static void m(ConnectVolumeControl connectVolumeControl, float f2) {
        connectVolumeControl.a |= 32;
        connectVolumeControl.p = f2;
    }

    static void n(ConnectVolumeControl connectVolumeControl, String str) {
        connectVolumeControl.getClass();
        str.getClass();
        connectVolumeControl.a |= 2;
        connectVolumeControl.c = str;
    }

    static void o(ConnectVolumeControl connectVolumeControl, String str) {
        connectVolumeControl.getClass();
        str.getClass();
        connectVolumeControl.a |= 4;
        connectVolumeControl.f = str;
    }

    public static b p() {
        return (b) r.toBuilder();
    }

    public static x<ConnectVolumeControl> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ConnectVolumeControl connectVolumeControl = (ConnectVolumeControl) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (connectVolumeControl.a & 1) == 1, connectVolumeControl.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (connectVolumeControl.a & 2) == 2, connectVolumeControl.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (connectVolumeControl.a & 4) == 4, connectVolumeControl.f);
                this.n = hVar.o((this.a & 8) == 8, this.n, (connectVolumeControl.a & 8) == 8, connectVolumeControl.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (connectVolumeControl.a & 16) == 16, connectVolumeControl.o);
                this.p = hVar.o((this.a & 32) == 32, this.p, (connectVolumeControl.a & 32) == 32, connectVolumeControl.p);
                boolean z2 = (this.a & 64) == 64;
                String str = this.q;
                if ((connectVolumeControl.a & 64) == 64) {
                    z = true;
                }
                this.q = hVar.n(z2, str, z, connectVolumeControl.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= connectVolumeControl.a;
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
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 4;
                                this.f = z5;
                            } else if (B == 37) {
                                this.a |= 8;
                                this.n = gVar.l();
                            } else if (B == 42) {
                                String z6 = gVar.z();
                                this.a |= 16;
                                this.o = z6;
                            } else if (B == 53) {
                                this.a |= 32;
                                this.p = gVar.l();
                            } else if (B == 58) {
                                String z7 = gVar.z();
                                this.a |= 64;
                                this.q = z7;
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
                return new ConnectVolumeControl();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (ConnectVolumeControl.class) {
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
            i2 += CodedOutputStream.i(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.i(6, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.p(7, this.q);
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
            codedOutputStream.J(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.J(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(7, this.q);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
