package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class OfflinePlaylistContainingItem extends GeneratedMessageLite<OfflinePlaylistContainingItem, b> implements Object {
    private static final OfflinePlaylistContainingItem n;
    private static volatile x<OfflinePlaylistContainingItem> o;
    private int a;
    private String b = "";
    private String c = "";
    private byte f = -1;

    public static final class b extends GeneratedMessageLite.b<OfflinePlaylistContainingItem, b> implements Object {
        private b() {
            super(OfflinePlaylistContainingItem.n);
        }
    }

    static {
        OfflinePlaylistContainingItem offlinePlaylistContainingItem = new OfflinePlaylistContainingItem();
        n = offlinePlaylistContainingItem;
        offlinePlaylistContainingItem.makeImmutable();
    }

    private OfflinePlaylistContainingItem() {
    }

    public static x<OfflinePlaylistContainingItem> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                byte b2 = this.f;
                if (b2 == 1) {
                    return n;
                }
                if (b2 == 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!l()) {
                    if (booleanValue) {
                        this.f = 0;
                    }
                    return null;
                }
                if (booleanValue) {
                    this.f = 1;
                }
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                OfflinePlaylistContainingItem offlinePlaylistContainingItem = (OfflinePlaylistContainingItem) obj2;
                this.b = hVar.n(l(), this.b, offlinePlaylistContainingItem.l(), offlinePlaylistContainingItem.b);
                boolean z2 = (this.a & 2) == 2;
                String str = this.c;
                if ((offlinePlaylistContainingItem.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.n(z2, str, z, offlinePlaylistContainingItem.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= offlinePlaylistContainingItem.a;
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
                return new OfflinePlaylistContainingItem();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (OfflinePlaylistContainingItem.class) {
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
            i2 += CodedOutputStream.p(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String h() {
        return this.b;
    }

    public String i() {
        return this.c;
    }

    public boolean l() {
        return (this.a & 1) == 1;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
