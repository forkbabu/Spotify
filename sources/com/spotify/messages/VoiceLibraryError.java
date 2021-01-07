package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class VoiceLibraryError extends GeneratedMessageLite<VoiceLibraryError, b> implements Object {
    private static final VoiceLibraryError p;
    private static volatile x<VoiceLibraryError> q;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";

    public static final class b extends GeneratedMessageLite.b<VoiceLibraryError, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            VoiceLibraryError.l((VoiceLibraryError) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            VoiceLibraryError.n((VoiceLibraryError) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            VoiceLibraryError.i((VoiceLibraryError) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            VoiceLibraryError.m((VoiceLibraryError) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            VoiceLibraryError.h((VoiceLibraryError) this.instance, str);
            return this;
        }

        private b() {
            super(VoiceLibraryError.p);
        }
    }

    static {
        VoiceLibraryError voiceLibraryError = new VoiceLibraryError();
        p = voiceLibraryError;
        voiceLibraryError.makeImmutable();
    }

    private VoiceLibraryError() {
    }

    static void h(VoiceLibraryError voiceLibraryError, String str) {
        voiceLibraryError.getClass();
        str.getClass();
        voiceLibraryError.a |= 1;
        voiceLibraryError.b = str;
    }

    static void i(VoiceLibraryError voiceLibraryError, String str) {
        voiceLibraryError.getClass();
        str.getClass();
        voiceLibraryError.a |= 8;
        voiceLibraryError.n = str;
    }

    static void l(VoiceLibraryError voiceLibraryError, String str) {
        voiceLibraryError.getClass();
        str.getClass();
        voiceLibraryError.a |= 16;
        voiceLibraryError.o = str;
    }

    static void m(VoiceLibraryError voiceLibraryError, String str) {
        voiceLibraryError.getClass();
        str.getClass();
        voiceLibraryError.a |= 2;
        voiceLibraryError.c = str;
    }

    static void n(VoiceLibraryError voiceLibraryError, String str) {
        voiceLibraryError.getClass();
        str.getClass();
        voiceLibraryError.a |= 4;
        voiceLibraryError.f = str;
    }

    public static b o() {
        return (b) p.toBuilder();
    }

    public static x<VoiceLibraryError> parser() {
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
                VoiceLibraryError voiceLibraryError = (VoiceLibraryError) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (voiceLibraryError.a & 1) == 1, voiceLibraryError.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (voiceLibraryError.a & 2) == 2, voiceLibraryError.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (voiceLibraryError.a & 4) == 4, voiceLibraryError.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (voiceLibraryError.a & 8) == 8, voiceLibraryError.n);
                boolean z2 = (this.a & 16) == 16;
                String str = this.o;
                if ((voiceLibraryError.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.n(z2, str, z, voiceLibraryError.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= voiceLibraryError.a;
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
                            } else if (B == 34) {
                                String z6 = gVar.z();
                                this.a |= 8;
                                this.n = z6;
                            } else if (B == 42) {
                                String z7 = gVar.z();
                                this.a |= 16;
                                this.o = z7;
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
                return new VoiceLibraryError();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (VoiceLibraryError.class) {
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
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(4, this.n);
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
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
