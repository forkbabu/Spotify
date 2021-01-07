package com.spotify.mobile.android.offline.coordinator.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$DownloadResponse;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$IdentifyResponse;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$RemoveResponse;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$StopDownloadResponse;
import java.io.IOException;

public final class OfflinePlugin$PluginResponse extends GeneratedMessageLite<OfflinePlugin$PluginResponse, a> implements Object {
    private static final OfflinePlugin$PluginResponse f;
    private static volatile x<OfflinePlugin$PluginResponse> n;
    private int a = 0;
    private Object b;
    private String c = "";

    public enum ResponseCase implements o.c {
        IDENTIFY(2),
        DOWNLOAD(3),
        REMOVE(4),
        STOP_DOWNLOAD(5),
        RESPONSE_NOT_SET(0);
        
        private final int value;

        private ResponseCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<OfflinePlugin$PluginResponse, a> implements Object {
        public a m(OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse) {
            copyOnWrite();
            OfflinePlugin$PluginResponse.l((OfflinePlugin$PluginResponse) this.instance, offlinePlugin$DownloadResponse);
            return this;
        }

        public a n(String str) {
            copyOnWrite();
            OfflinePlugin$PluginResponse.h((OfflinePlugin$PluginResponse) this.instance, str);
            return this;
        }

        public a o(OfflinePlugin$IdentifyResponse offlinePlugin$IdentifyResponse) {
            copyOnWrite();
            OfflinePlugin$PluginResponse.i((OfflinePlugin$PluginResponse) this.instance, offlinePlugin$IdentifyResponse);
            return this;
        }

        public a p(OfflinePlugin$RemoveResponse offlinePlugin$RemoveResponse) {
            copyOnWrite();
            OfflinePlugin$PluginResponse.m((OfflinePlugin$PluginResponse) this.instance, offlinePlugin$RemoveResponse);
            return this;
        }

        public a q(OfflinePlugin$StopDownloadResponse offlinePlugin$StopDownloadResponse) {
            copyOnWrite();
            OfflinePlugin$PluginResponse.n((OfflinePlugin$PluginResponse) this.instance, offlinePlugin$StopDownloadResponse);
            return this;
        }

        private a() {
            super(OfflinePlugin$PluginResponse.f);
        }
    }

    static {
        OfflinePlugin$PluginResponse offlinePlugin$PluginResponse = new OfflinePlugin$PluginResponse();
        f = offlinePlugin$PluginResponse;
        offlinePlugin$PluginResponse.makeImmutable();
    }

    private OfflinePlugin$PluginResponse() {
    }

    static void h(OfflinePlugin$PluginResponse offlinePlugin$PluginResponse, String str) {
        offlinePlugin$PluginResponse.getClass();
        str.getClass();
        offlinePlugin$PluginResponse.c = str;
    }

    static void i(OfflinePlugin$PluginResponse offlinePlugin$PluginResponse, OfflinePlugin$IdentifyResponse offlinePlugin$IdentifyResponse) {
        offlinePlugin$PluginResponse.getClass();
        offlinePlugin$IdentifyResponse.getClass();
        offlinePlugin$PluginResponse.b = offlinePlugin$IdentifyResponse;
        offlinePlugin$PluginResponse.a = 2;
    }

    static void l(OfflinePlugin$PluginResponse offlinePlugin$PluginResponse, OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse) {
        offlinePlugin$PluginResponse.getClass();
        offlinePlugin$DownloadResponse.getClass();
        offlinePlugin$PluginResponse.b = offlinePlugin$DownloadResponse;
        offlinePlugin$PluginResponse.a = 3;
    }

    static void m(OfflinePlugin$PluginResponse offlinePlugin$PluginResponse, OfflinePlugin$RemoveResponse offlinePlugin$RemoveResponse) {
        offlinePlugin$PluginResponse.getClass();
        offlinePlugin$RemoveResponse.getClass();
        offlinePlugin$PluginResponse.b = offlinePlugin$RemoveResponse;
        offlinePlugin$PluginResponse.a = 4;
    }

    static void n(OfflinePlugin$PluginResponse offlinePlugin$PluginResponse, OfflinePlugin$StopDownloadResponse offlinePlugin$StopDownloadResponse) {
        offlinePlugin$PluginResponse.getClass();
        offlinePlugin$StopDownloadResponse.getClass();
        offlinePlugin$PluginResponse.b = offlinePlugin$StopDownloadResponse;
        offlinePlugin$PluginResponse.a = 5;
    }

    public static a o() {
        return (a) f.toBuilder();
    }

    public static x<OfflinePlugin$PluginResponse> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = false;
        ResponseCase responseCase = null;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                OfflinePlugin$PluginResponse offlinePlugin$PluginResponse = (OfflinePlugin$PluginResponse) obj2;
                this.c = hVar.n(!this.c.isEmpty(), this.c, !offlinePlugin$PluginResponse.c.isEmpty(), offlinePlugin$PluginResponse.c);
                int i2 = offlinePlugin$PluginResponse.a;
                if (i2 == 0) {
                    responseCase = ResponseCase.RESPONSE_NOT_SET;
                } else if (i2 == 2) {
                    responseCase = ResponseCase.IDENTIFY;
                } else if (i2 == 3) {
                    responseCase = ResponseCase.DOWNLOAD;
                } else if (i2 == 4) {
                    responseCase = ResponseCase.REMOVE;
                } else if (i2 == 5) {
                    responseCase = ResponseCase.STOP_DOWNLOAD;
                }
                int ordinal = responseCase.ordinal();
                if (ordinal == 0) {
                    if (this.a != 2) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, offlinePlugin$PluginResponse.b);
                } else if (ordinal == 1) {
                    if (this.a != 3) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, offlinePlugin$PluginResponse.b);
                } else if (ordinal == 2) {
                    if (this.a != 4) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, offlinePlugin$PluginResponse.b);
                } else if (ordinal == 3) {
                    if (this.a != 5) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, offlinePlugin$PluginResponse.b);
                } else if (ordinal == 4) {
                    if (this.a == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = offlinePlugin$PluginResponse.a) != 0) {
                    this.a = i;
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
                                this.c = gVar.A();
                            } else if (B == 18) {
                                OfflinePlugin$IdentifyResponse.a aVar = this.a == 2 ? (OfflinePlugin$IdentifyResponse.a) ((OfflinePlugin$IdentifyResponse) this.b).toBuilder() : null;
                                u o = gVar.o(OfflinePlugin$IdentifyResponse.parser(), kVar);
                                this.b = o;
                                if (aVar != null) {
                                    aVar.mergeFrom((OfflinePlugin$IdentifyResponse.a) ((OfflinePlugin$IdentifyResponse) o));
                                    this.b = aVar.buildPartial();
                                }
                                this.a = 2;
                            } else if (B == 26) {
                                OfflinePlugin$DownloadResponse.a aVar2 = this.a == 3 ? (OfflinePlugin$DownloadResponse.a) ((OfflinePlugin$DownloadResponse) this.b).toBuilder() : null;
                                u o2 = gVar.o(OfflinePlugin$DownloadResponse.parser(), kVar);
                                this.b = o2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((OfflinePlugin$DownloadResponse.a) ((OfflinePlugin$DownloadResponse) o2));
                                    this.b = aVar2.buildPartial();
                                }
                                this.a = 3;
                            } else if (B == 34) {
                                OfflinePlugin$RemoveResponse.a aVar3 = this.a == 4 ? (OfflinePlugin$RemoveResponse.a) ((OfflinePlugin$RemoveResponse) this.b).toBuilder() : null;
                                u o3 = gVar.o(OfflinePlugin$RemoveResponse.parser(), kVar);
                                this.b = o3;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((OfflinePlugin$RemoveResponse.a) ((OfflinePlugin$RemoveResponse) o3));
                                    this.b = aVar3.buildPartial();
                                }
                                this.a = 4;
                            } else if (B == 42) {
                                OfflinePlugin$StopDownloadResponse.a aVar4 = this.a == 5 ? (OfflinePlugin$StopDownloadResponse.a) ((OfflinePlugin$StopDownloadResponse) this.b).toBuilder() : null;
                                u o4 = gVar.o(OfflinePlugin$StopDownloadResponse.parser(), kVar);
                                this.b = o4;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((OfflinePlugin$StopDownloadResponse.a) ((OfflinePlugin$StopDownloadResponse) o4));
                                    this.b = aVar4.buildPartial();
                                }
                                this.a = 5;
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
                return null;
            case 4:
                return new OfflinePlugin$PluginResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (OfflinePlugin$PluginResponse.class) {
                        if (n == null) {
                            n = new GeneratedMessageLite.c(f);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.c.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.c);
        }
        if (this.a == 2) {
            i2 += CodedOutputStream.n(2, (OfflinePlugin$IdentifyResponse) this.b);
        }
        if (this.a == 3) {
            i2 += CodedOutputStream.n(3, (OfflinePlugin$DownloadResponse) this.b);
        }
        if (this.a == 4) {
            i2 += CodedOutputStream.n(4, (OfflinePlugin$RemoveResponse) this.b);
        }
        if (this.a == 5) {
            i2 += CodedOutputStream.n(5, (OfflinePlugin$StopDownloadResponse) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.c.isEmpty()) {
            codedOutputStream.P(1, this.c);
        }
        if (this.a == 2) {
            codedOutputStream.M(2, (OfflinePlugin$IdentifyResponse) this.b);
        }
        if (this.a == 3) {
            codedOutputStream.M(3, (OfflinePlugin$DownloadResponse) this.b);
        }
        if (this.a == 4) {
            codedOutputStream.M(4, (OfflinePlugin$RemoveResponse) this.b);
        }
        if (this.a == 5) {
            codedOutputStream.M(5, (OfflinePlugin$StopDownloadResponse) this.b);
        }
    }
}
