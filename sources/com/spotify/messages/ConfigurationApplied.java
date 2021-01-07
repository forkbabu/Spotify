package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class ConfigurationApplied extends GeneratedMessageLite<ConfigurationApplied, b> implements Object {
    private static final ConfigurationApplied s;
    private static volatile x<ConfigurationApplied> t;
    private int a;
    private long b;
    private String c = "";
    private o.f f = GeneratedMessageLite.emptyIntList();
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private String r = "";

    public static final class b extends GeneratedMessageLite.b<ConfigurationApplied, b> implements Object {
        public b m(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ConfigurationApplied.p((ConfigurationApplied) this.instance, iterable);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ConfigurationApplied.i((ConfigurationApplied) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ConfigurationApplied.o((ConfigurationApplied) this.instance, str);
            return this;
        }

        public b p(long j) {
            copyOnWrite();
            ConfigurationApplied.h((ConfigurationApplied) this.instance, j);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            ConfigurationApplied.n((ConfigurationApplied) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            ConfigurationApplied.l((ConfigurationApplied) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            ConfigurationApplied.m((ConfigurationApplied) this.instance, str);
            return this;
        }

        private b() {
            super(ConfigurationApplied.s);
        }
    }

    static {
        ConfigurationApplied configurationApplied = new ConfigurationApplied();
        s = configurationApplied;
        configurationApplied.makeImmutable();
    }

    private ConfigurationApplied() {
    }

    static void h(ConfigurationApplied configurationApplied, long j) {
        configurationApplied.a |= 1;
        configurationApplied.b = j;
    }

    static void i(ConfigurationApplied configurationApplied, String str) {
        configurationApplied.getClass();
        str.getClass();
        configurationApplied.a |= 4;
        configurationApplied.n = str;
    }

    static void l(ConfigurationApplied configurationApplied, String str) {
        configurationApplied.getClass();
        str.getClass();
        configurationApplied.a |= 8;
        configurationApplied.o = str;
    }

    static void m(ConfigurationApplied configurationApplied, String str) {
        configurationApplied.getClass();
        str.getClass();
        configurationApplied.a |= 16;
        configurationApplied.p = str;
    }

    static void n(ConfigurationApplied configurationApplied, String str) {
        configurationApplied.getClass();
        str.getClass();
        configurationApplied.a |= 32;
        configurationApplied.q = str;
    }

    static void o(ConfigurationApplied configurationApplied, String str) {
        configurationApplied.getClass();
        str.getClass();
        configurationApplied.a |= 2;
        configurationApplied.c = str;
    }

    static void p(ConfigurationApplied configurationApplied, Iterable iterable) {
        if (!configurationApplied.f.R0()) {
            configurationApplied.f = GeneratedMessageLite.mutableCopy(configurationApplied.f);
        }
        com.google.protobuf.a.addAll(iterable, configurationApplied.f);
    }

    public static x<ConfigurationApplied> parser() {
        return s.getParserForType();
    }

    public static b q() {
        return (b) s.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ConfigurationApplied configurationApplied = (ConfigurationApplied) obj2;
                this.b = hVar.s((this.a & 1) == 1, this.b, (configurationApplied.a & 1) == 1, configurationApplied.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (configurationApplied.a & 2) == 2, configurationApplied.c);
                this.f = hVar.h(this.f, configurationApplied.f);
                this.n = hVar.n((this.a & 4) == 4, this.n, (configurationApplied.a & 4) == 4, configurationApplied.n);
                this.o = hVar.n((this.a & 8) == 8, this.o, (configurationApplied.a & 8) == 8, configurationApplied.o);
                this.p = hVar.n((this.a & 16) == 16, this.p, (configurationApplied.a & 16) == 16, configurationApplied.p);
                this.q = hVar.n((this.a & 32) == 32, this.q, (configurationApplied.a & 32) == 32, configurationApplied.q);
                this.r = hVar.n((this.a & 64) == 64, this.r, (configurationApplied.a & 64) == 64, configurationApplied.r);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= configurationApplied.a;
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
                            if (B == 8) {
                                this.a |= 1;
                                this.b = gVar.w();
                            } else if (B == 18) {
                                String z2 = gVar.z();
                                this.a |= 2;
                                this.c = z2;
                            } else if (B == 24) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.i1(gVar.u());
                            } else if (B == 26) {
                                int g = gVar.g(gVar.u());
                                if (!this.f.R0() && gVar.b() > 0) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                while (gVar.b() > 0) {
                                    this.f.i1(gVar.u());
                                }
                                gVar.f(g);
                            } else if (B == 34) {
                                String z3 = gVar.z();
                                this.a |= 4;
                                this.n = z3;
                            } else if (B == 42) {
                                String z4 = gVar.z();
                                this.a |= 8;
                                this.o = z4;
                            } else if (B == 50) {
                                String z5 = gVar.z();
                                this.a |= 16;
                                this.p = z5;
                            } else if (B == 58) {
                                String z6 = gVar.z();
                                this.a |= 32;
                                this.q = z6;
                            } else if (B == 66) {
                                String z7 = gVar.z();
                                this.a |= 64;
                                this.r = z7;
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
                this.f.C();
                return null;
            case 4:
                return new ConfigurationApplied();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (ConfigurationApplied.class) {
                        if (t == null) {
                            t = new GeneratedMessageLite.c(s);
                        }
                    }
                }
                return t;
            default:
                throw new UnsupportedOperationException();
        }
        return s;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int l = (this.a & 1) == 1 ? CodedOutputStream.l(1, this.b) + 0 : 0;
        if ((this.a & 2) == 2) {
            l += CodedOutputStream.p(2, this.c);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            i2 += CodedOutputStream.k(this.f.T1(i3));
        }
        int size = (this.f.size() * 1) + l + i2;
        if ((this.a & 4) == 4) {
            size += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 8) == 8) {
            size += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 16) == 16) {
            size += CodedOutputStream.p(6, this.p);
        }
        if ((this.a & 32) == 32) {
            size += CodedOutputStream.p(7, this.q);
        }
        if ((this.a & 64) == 64) {
            size += CodedOutputStream.p(8, this.r);
        }
        int c2 = this.unknownFields.c() + size;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.U(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.K(3, this.f.T1(i));
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(5, this.o);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(6, this.p);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(7, this.q);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(8, this.r);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
