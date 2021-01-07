package com.spotify.mobile.android.offline.coordinator.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class OfflinePlugin$PluginInit extends GeneratedMessageLite<OfflinePlugin$PluginInit, a> implements Object {
    private static final OfflinePlugin$PluginInit n;
    private static volatile x<OfflinePlugin$PluginInit> o;
    private int a;
    private String b = "";
    private o.i<String> c = GeneratedMessageLite.emptyProtobufList();
    private int f;

    public static final class a extends GeneratedMessageLite.b<OfflinePlugin$PluginInit, a> implements Object {
        public a m(String str) {
            copyOnWrite();
            OfflinePlugin$PluginInit.l((OfflinePlugin$PluginInit) this.instance, str);
            return this;
        }

        public a n(String str) {
            copyOnWrite();
            OfflinePlugin$PluginInit.h((OfflinePlugin$PluginInit) this.instance, str);
            return this;
        }

        public a o(OfflinePluginResourceType$ResourceType offlinePluginResourceType$ResourceType) {
            copyOnWrite();
            OfflinePlugin$PluginInit.i((OfflinePlugin$PluginInit) this.instance, offlinePluginResourceType$ResourceType);
            return this;
        }

        private a() {
            super(OfflinePlugin$PluginInit.n);
        }
    }

    static {
        OfflinePlugin$PluginInit offlinePlugin$PluginInit = new OfflinePlugin$PluginInit();
        n = offlinePlugin$PluginInit;
        offlinePlugin$PluginInit.makeImmutable();
    }

    private OfflinePlugin$PluginInit() {
    }

    static void h(OfflinePlugin$PluginInit offlinePlugin$PluginInit, String str) {
        offlinePlugin$PluginInit.getClass();
        str.getClass();
        offlinePlugin$PluginInit.b = str;
    }

    static void i(OfflinePlugin$PluginInit offlinePlugin$PluginInit, OfflinePluginResourceType$ResourceType offlinePluginResourceType$ResourceType) {
        offlinePlugin$PluginInit.getClass();
        offlinePluginResourceType$ResourceType.getClass();
        offlinePlugin$PluginInit.f = offlinePluginResourceType$ResourceType.getNumber();
    }

    static void l(OfflinePlugin$PluginInit offlinePlugin$PluginInit, String str) {
        offlinePlugin$PluginInit.getClass();
        str.getClass();
        if (!offlinePlugin$PluginInit.c.R0()) {
            offlinePlugin$PluginInit.c = GeneratedMessageLite.mutableCopy(offlinePlugin$PluginInit.c);
        }
        offlinePlugin$PluginInit.c.add(str);
    }

    public static a m() {
        return (a) n.toBuilder();
    }

    public static x<OfflinePlugin$PluginInit> parser() {
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
                OfflinePlugin$PluginInit offlinePlugin$PluginInit = (OfflinePlugin$PluginInit) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !offlinePlugin$PluginInit.b.isEmpty(), offlinePlugin$PluginInit.b);
                this.c = hVar.q(this.c, offlinePlugin$PluginInit.c);
                int i = this.f;
                boolean z2 = i != 0;
                int i2 = offlinePlugin$PluginInit.f;
                if (i2 != 0) {
                    z = true;
                }
                this.f = hVar.m(z2, i, z, i2);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= offlinePlugin$PluginInit.a;
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
                                this.b = gVar.A();
                            } else if (B == 18) {
                                String A = gVar.A();
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(A);
                            } else if (B == 24) {
                                this.f = gVar.u();
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
                return new OfflinePlugin$PluginInit();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (OfflinePlugin$PluginInit.class) {
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
        int p = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            i2 += CodedOutputStream.q(this.c.get(i3));
        }
        int C0 = je.C0(this.c, 1, p + i2);
        if (this.f != OfflinePluginResourceType$ResourceType.OTHER.getNumber()) {
            C0 += CodedOutputStream.h(3, this.f);
        }
        this.memoizedSerializedSize = C0;
        return C0;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.P(2, this.c.get(i));
        }
        if (this.f != OfflinePluginResourceType$ResourceType.OTHER.getNumber()) {
            codedOutputStream.K(3, this.f);
        }
    }
}
