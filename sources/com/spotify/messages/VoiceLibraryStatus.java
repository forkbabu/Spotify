package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class VoiceLibraryStatus extends GeneratedMessageLite<VoiceLibraryStatus, b> implements Object {
    private static final VoiceLibraryStatus p;
    private static volatile x<VoiceLibraryStatus> q;
    private int a;
    private String b = "";
    private String c = "";
    private boolean f;
    private boolean n;
    private String o = "";

    public static final class b extends GeneratedMessageLite.b<VoiceLibraryStatus, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            VoiceLibraryStatus.i((VoiceLibraryStatus) this.instance, str);
            return this;
        }

        public b n(boolean z) {
            copyOnWrite();
            VoiceLibraryStatus.n((VoiceLibraryStatus) this.instance, z);
            return this;
        }

        public b o(boolean z) {
            copyOnWrite();
            VoiceLibraryStatus.m((VoiceLibraryStatus) this.instance, z);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            VoiceLibraryStatus.l((VoiceLibraryStatus) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            VoiceLibraryStatus.h((VoiceLibraryStatus) this.instance, str);
            return this;
        }

        private b() {
            super(VoiceLibraryStatus.p);
        }
    }

    static {
        VoiceLibraryStatus voiceLibraryStatus = new VoiceLibraryStatus();
        p = voiceLibraryStatus;
        voiceLibraryStatus.makeImmutable();
    }

    private VoiceLibraryStatus() {
    }

    static void h(VoiceLibraryStatus voiceLibraryStatus, String str) {
        voiceLibraryStatus.getClass();
        str.getClass();
        voiceLibraryStatus.a |= 1;
        voiceLibraryStatus.b = str;
    }

    static void i(VoiceLibraryStatus voiceLibraryStatus, String str) {
        voiceLibraryStatus.getClass();
        str.getClass();
        voiceLibraryStatus.a |= 16;
        voiceLibraryStatus.o = str;
    }

    static void l(VoiceLibraryStatus voiceLibraryStatus, String str) {
        voiceLibraryStatus.getClass();
        str.getClass();
        voiceLibraryStatus.a |= 2;
        voiceLibraryStatus.c = str;
    }

    static void m(VoiceLibraryStatus voiceLibraryStatus, boolean z) {
        voiceLibraryStatus.a |= 4;
        voiceLibraryStatus.f = z;
    }

    static void n(VoiceLibraryStatus voiceLibraryStatus, boolean z) {
        voiceLibraryStatus.a |= 8;
        voiceLibraryStatus.n = z;
    }

    public static b o() {
        return (b) p.toBuilder();
    }

    public static x<VoiceLibraryStatus> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                VoiceLibraryStatus voiceLibraryStatus = (VoiceLibraryStatus) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (voiceLibraryStatus.a & 1) == 1, voiceLibraryStatus.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (voiceLibraryStatus.a & 2) == 2, voiceLibraryStatus.c);
                this.f = hVar.f((this.a & 4) == 4, this.f, (voiceLibraryStatus.a & 4) == 4, voiceLibraryStatus.f);
                this.n = hVar.f((this.a & 8) == 8, this.n, (voiceLibraryStatus.a & 8) == 8, voiceLibraryStatus.n);
                boolean z2 = (this.a & 16) == 16;
                String str = this.o;
                if ((voiceLibraryStatus.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.n(z2, str, z, voiceLibraryStatus.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= voiceLibraryStatus.a;
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
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.h();
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.h();
                            } else if (B == 42) {
                                String z5 = gVar.z();
                                this.a |= 16;
                                this.o = z5;
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
                return new VoiceLibraryStatus();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (VoiceLibraryStatus.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.d(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.d(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
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
            codedOutputStream.A(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.A(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
