package com.spotify.pses.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.pses.v1.proto.DefaultLayout;
import com.spotify.pses.v1.proto.IntentLedLayout;
import com.spotify.pses.v1.proto.MethodLedLayout;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class ConfigurationResponse extends GeneratedMessageLite<ConfigurationResponse, b> implements Object {
    private static final ConfigurationResponse o;
    private static volatile x<ConfigurationResponse> p;
    private int a;
    private int b = 0;
    private Object c;
    private o.i<String> f = GeneratedMessageLite.emptyProtobufList();
    private String n = "";

    public enum LayoutCase implements o.c {
        DEFAULT_LAYOUT(3),
        INTENT_LED_LAYOUT(5),
        METHOD_LED_LAYOUT(6),
        LAYOUT_NOT_SET(0);
        
        private final int value;

        private LayoutCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<ConfigurationResponse, b> implements Object {
        public b m(Iterable<String> iterable) {
            copyOnWrite();
            ConfigurationResponse.i((ConfigurationResponse) this.instance, iterable);
            return this;
        }

        public b n() {
            copyOnWrite();
            ConfigurationResponse.l((ConfigurationResponse) this.instance);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ConfigurationResponse.h((ConfigurationResponse) this.instance, str);
            return this;
        }

        private b() {
            super(ConfigurationResponse.o);
        }
    }

    static {
        ConfigurationResponse configurationResponse = new ConfigurationResponse();
        o = configurationResponse;
        configurationResponse.makeImmutable();
    }

    private ConfigurationResponse() {
    }

    static void h(ConfigurationResponse configurationResponse, String str) {
        configurationResponse.getClass();
        str.getClass();
        configurationResponse.n = str;
    }

    static void i(ConfigurationResponse configurationResponse, Iterable iterable) {
        if (!configurationResponse.f.R0()) {
            configurationResponse.f = GeneratedMessageLite.mutableCopy(configurationResponse.f);
        }
        com.google.protobuf.a.addAll(iterable, configurationResponse.f);
    }

    static void l(ConfigurationResponse configurationResponse) {
        configurationResponse.getClass();
        configurationResponse.f = GeneratedMessageLite.emptyProtobufList();
    }

    public static x<ConfigurationResponse> parser() {
        return o.getParserForType();
    }

    public static b s() {
        return (b) o.toBuilder();
    }

    public static b t(ConfigurationResponse configurationResponse) {
        return (b) ((b) o.toBuilder()).mergeFrom((b) configurationResponse);
    }

    public static ConfigurationResponse u(InputStream inputStream) {
        return (ConfigurationResponse) GeneratedMessageLite.parseFrom(o, inputStream);
    }

    public static ConfigurationResponse v(byte[] bArr) {
        return (ConfigurationResponse) GeneratedMessageLite.parseFrom(o, bArr);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = true;
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ConfigurationResponse configurationResponse = (ConfigurationResponse) obj2;
                this.f = hVar.q(this.f, configurationResponse.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !configurationResponse.n.isEmpty(), configurationResponse.n);
                int ordinal = configurationResponse.p().ordinal();
                if (ordinal == 0) {
                    if (this.b != 3) {
                        z = false;
                    }
                    this.c = hVar.u(z, this.c, configurationResponse.c);
                } else if (ordinal == 1) {
                    if (this.b != 5) {
                        z = false;
                    }
                    this.c = hVar.u(z, this.c, configurationResponse.c);
                } else if (ordinal == 2) {
                    if (this.b != 6) {
                        z = false;
                    }
                    this.c = hVar.u(z, this.c, configurationResponse.c);
                } else if (ordinal == 3) {
                    if (this.b == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a) {
                    int i = configurationResponse.b;
                    if (i != 0) {
                        this.b = i;
                    }
                    this.a |= configurationResponse.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                String A = gVar.A();
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(A);
                            } else if (B == 26) {
                                DefaultLayout.b bVar = this.b == 3 ? (DefaultLayout.b) ((DefaultLayout) this.c).toBuilder() : null;
                                u o2 = gVar.o(DefaultLayout.parser(), kVar);
                                this.c = o2;
                                if (bVar != null) {
                                    bVar.mergeFrom((DefaultLayout.b) ((DefaultLayout) o2));
                                    this.c = bVar.buildPartial();
                                }
                                this.b = 3;
                            } else if (B == 34) {
                                this.n = gVar.A();
                            } else if (B == 42) {
                                IntentLedLayout.b bVar2 = this.b == 5 ? (IntentLedLayout.b) ((IntentLedLayout) this.c).toBuilder() : null;
                                u o3 = gVar.o(IntentLedLayout.parser(), kVar);
                                this.c = o3;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((IntentLedLayout.b) ((IntentLedLayout) o3));
                                    this.c = bVar2.buildPartial();
                                }
                                this.b = 5;
                            } else if (B == 50) {
                                MethodLedLayout.b bVar3 = this.b == 6 ? (MethodLedLayout.b) ((MethodLedLayout) this.c).toBuilder() : null;
                                u o4 = gVar.o(MethodLedLayout.parser(), kVar);
                                this.c = o4;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((MethodLedLayout.b) ((MethodLedLayout) o4));
                                    this.c = bVar3.buildPartial();
                                }
                                this.b = 6;
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z2 = true;
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
                return new ConfigurationResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (ConfigurationResponse.class) {
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
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            i2 += CodedOutputStream.q(this.f.get(i3));
        }
        int C0 = je.C0(this.f, 1, 0 + i2);
        if (this.b == 3) {
            C0 += CodedOutputStream.n(3, (DefaultLayout) this.c);
        }
        if (!this.n.isEmpty()) {
            C0 += CodedOutputStream.p(4, this.n);
        }
        if (this.b == 5) {
            C0 += CodedOutputStream.n(5, (IntentLedLayout) this.c);
        }
        if (this.b == 6) {
            C0 += CodedOutputStream.n(6, (MethodLedLayout) this.c);
        }
        this.memoizedSerializedSize = C0;
        return C0;
    }

    public DefaultLayout m() {
        if (this.b == 3) {
            return (DefaultLayout) this.c;
        }
        return DefaultLayout.i();
    }

    public List<String> n() {
        return this.f;
    }

    public IntentLedLayout o() {
        if (this.b == 5) {
            return (IntentLedLayout) this.c;
        }
        return IntentLedLayout.i();
    }

    public LayoutCase p() {
        int i = this.b;
        if (i == 0) {
            return LayoutCase.LAYOUT_NOT_SET;
        }
        if (i == 3) {
            return LayoutCase.DEFAULT_LAYOUT;
        }
        if (i == 5) {
            return LayoutCase.INTENT_LED_LAYOUT;
        }
        if (i != 6) {
            return null;
        }
        return LayoutCase.METHOD_LED_LAYOUT;
    }

    public MethodLedLayout q() {
        if (this.b == 6) {
            return (MethodLedLayout) this.c;
        }
        return MethodLedLayout.i();
    }

    public String r() {
        return this.n;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.P(1, this.f.get(i));
        }
        if (this.b == 3) {
            codedOutputStream.M(3, (DefaultLayout) this.c);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
        if (this.b == 5) {
            codedOutputStream.M(5, (IntentLedLayout) this.c);
        }
        if (this.b == 6) {
            codedOutputStream.M(6, (MethodLedLayout) this.c);
        }
    }
}
