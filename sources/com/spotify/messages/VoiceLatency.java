package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class VoiceLatency extends GeneratedMessageLite<VoiceLatency, b> implements Object {
    private static final VoiceLatency n;
    private static volatile x<VoiceLatency> o;
    private int a;
    private String b = "";
    private int c;
    private int f;

    public static final class b extends GeneratedMessageLite.b<VoiceLatency, b> implements Object {
        public b m(int i) {
            copyOnWrite();
            VoiceLatency.i((VoiceLatency) this.instance, i);
            return this;
        }

        public b n(int i) {
            copyOnWrite();
            VoiceLatency.l((VoiceLatency) this.instance, i);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            VoiceLatency.h((VoiceLatency) this.instance, str);
            return this;
        }

        private b() {
            super(VoiceLatency.n);
        }
    }

    static {
        VoiceLatency voiceLatency = new VoiceLatency();
        n = voiceLatency;
        voiceLatency.makeImmutable();
    }

    private VoiceLatency() {
    }

    static void h(VoiceLatency voiceLatency, String str) {
        voiceLatency.getClass();
        str.getClass();
        voiceLatency.a |= 1;
        voiceLatency.b = str;
    }

    static void i(VoiceLatency voiceLatency, int i) {
        voiceLatency.a |= 2;
        voiceLatency.c = i;
    }

    static void l(VoiceLatency voiceLatency, int i) {
        voiceLatency.a |= 4;
        voiceLatency.f = i;
    }

    public static b m() {
        return (b) n.toBuilder();
    }

    public static x<VoiceLatency> parser() {
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
                VoiceLatency voiceLatency = (VoiceLatency) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (voiceLatency.a & 1) == 1, voiceLatency.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (voiceLatency.a & 2) == 2, voiceLatency.c);
                boolean z2 = (this.a & 4) == 4;
                int i = this.f;
                if ((voiceLatency.a & 4) == 4) {
                    z = true;
                }
                this.f = hVar.m(z2, i, z, voiceLatency.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= voiceLatency.a;
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
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.u();
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.u();
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
                return new VoiceLatency();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (VoiceLatency.class) {
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
            i2 += CodedOutputStream.j(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.j(3, this.f);
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
            codedOutputStream.K(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.K(3, this.f);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
