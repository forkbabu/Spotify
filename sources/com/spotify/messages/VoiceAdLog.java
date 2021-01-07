package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.t;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Map;

public final class VoiceAdLog extends GeneratedMessageLite<VoiceAdLog, c> implements Object {
    private static final VoiceAdLog r;
    private static volatile x<VoiceAdLog> s;
    private int a;
    private String b = "";
    private long c;
    private String f = "";
    private MapFieldLite<String, String> n = MapFieldLite.d();
    private MapFieldLite<String, String> o = MapFieldLite.d();
    private double p;
    private String q = "";

    private static final class b {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    public static final class c extends GeneratedMessageLite.b<VoiceAdLog, c> implements Object {
        public c m(String str, String str2) {
            str2.getClass();
            copyOnWrite();
            ((MapFieldLite) VoiceAdLog.i((VoiceAdLog) this.instance)).put(str, str2);
            return this;
        }

        public c n(String str, String str2) {
            str2.getClass();
            copyOnWrite();
            ((MapFieldLite) VoiceAdLog.p((VoiceAdLog) this.instance)).put(str, str2);
            return this;
        }

        public c o(String str) {
            copyOnWrite();
            VoiceAdLog.o((VoiceAdLog) this.instance, str);
            return this;
        }

        public c p(String str) {
            copyOnWrite();
            VoiceAdLog.h((VoiceAdLog) this.instance, str);
            return this;
        }

        public c q(double d) {
            copyOnWrite();
            VoiceAdLog.l((VoiceAdLog) this.instance, d);
            return this;
        }

        public c r(long j) {
            copyOnWrite();
            VoiceAdLog.n((VoiceAdLog) this.instance, j);
            return this;
        }

        public c s(String str) {
            copyOnWrite();
            VoiceAdLog.m((VoiceAdLog) this.instance, str);
            return this;
        }

        private c() {
            super(VoiceAdLog.r);
        }
    }

    private static final class d {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    static {
        VoiceAdLog voiceAdLog = new VoiceAdLog();
        r = voiceAdLog;
        voiceAdLog.makeImmutable();
    }

    private VoiceAdLog() {
    }

    static void h(VoiceAdLog voiceAdLog, String str) {
        voiceAdLog.getClass();
        str.getClass();
        voiceAdLog.a |= 1;
        voiceAdLog.b = str;
    }

    static Map i(VoiceAdLog voiceAdLog) {
        if (!voiceAdLog.o.f()) {
            voiceAdLog.o = voiceAdLog.o.k();
        }
        return voiceAdLog.o;
    }

    static void l(VoiceAdLog voiceAdLog, double d2) {
        voiceAdLog.a |= 8;
        voiceAdLog.p = d2;
    }

    static void m(VoiceAdLog voiceAdLog, String str) {
        voiceAdLog.getClass();
        str.getClass();
        voiceAdLog.a |= 16;
        voiceAdLog.q = str;
    }

    static void n(VoiceAdLog voiceAdLog, long j) {
        voiceAdLog.a |= 2;
        voiceAdLog.c = j;
    }

    static void o(VoiceAdLog voiceAdLog, String str) {
        voiceAdLog.getClass();
        str.getClass();
        voiceAdLog.a |= 4;
        voiceAdLog.f = str;
    }

    static Map p(VoiceAdLog voiceAdLog) {
        if (!voiceAdLog.n.f()) {
            voiceAdLog.n = voiceAdLog.n.k();
        }
        return voiceAdLog.n;
    }

    public static x<VoiceAdLog> parser() {
        return r.getParserForType();
    }

    public static c q() {
        return (c) r.toBuilder();
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
                VoiceAdLog voiceAdLog = (VoiceAdLog) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (voiceAdLog.a & 1) == 1, voiceAdLog.b);
                this.c = hVar.s((this.a & 2) == 2, this.c, (voiceAdLog.a & 2) == 2, voiceAdLog.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (voiceAdLog.a & 4) == 4, voiceAdLog.f);
                this.n = hVar.c(this.n, voiceAdLog.n);
                this.o = hVar.c(this.o, voiceAdLog.o);
                this.p = hVar.t((this.a & 8) == 8, this.p, (voiceAdLog.a & 8) == 8, voiceAdLog.p);
                boolean z2 = (this.a & 16) == 16;
                String str = this.q;
                if ((voiceAdLog.a & 16) == 16) {
                    z = true;
                }
                this.q = hVar.n(z2, str, z, voiceAdLog.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= voiceAdLog.a;
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
                                this.c = gVar.w();
                            } else if (B == 26) {
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.f = z4;
                            } else if (B == 34) {
                                if (!this.n.f()) {
                                    this.n = this.n.k();
                                }
                                d.a.d(this.n, gVar, kVar);
                            } else if (B == 42) {
                                if (!this.o.f()) {
                                    this.o = this.o.k();
                                }
                                b.a.d(this.o, gVar, kVar);
                            } else if (B == 49) {
                                this.a |= 8;
                                this.p = gVar.j();
                            } else if (B == 58) {
                                String z5 = gVar.z();
                                this.a |= 16;
                                this.q = z5;
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
                this.n.g();
                this.o.g();
                return null;
            case 4:
                return new VoiceAdLog();
            case 5:
                return new c();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (VoiceAdLog.class) {
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
            i2 += CodedOutputStream.l(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        for (Map.Entry<String, String> entry : this.n.entrySet()) {
            i2 = je.j1(entry, d.a, 4, entry.getKey(), i2);
        }
        for (Map.Entry<String, String> entry2 : this.o.entrySet()) {
            i2 = je.j1(entry2, b.a, 5, entry2.getKey(), i2);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.g(6, this.p);
        }
        if ((this.a & 16) == 16) {
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
            codedOutputStream.U(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.f);
        }
        for (Map.Entry<String, String> entry : this.n.entrySet()) {
            d.a.e(codedOutputStream, 4, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : this.o.entrySet()) {
            b.a.e(codedOutputStream, 5, entry2.getKey(), entry2.getValue());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.E(6, this.p);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(7, this.q);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
