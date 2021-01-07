package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ShowShowRequest$ProtoOnlineData extends GeneratedMessageLite<ShowShowRequest$ProtoOnlineData, a> implements Object {
    private static final ShowShowRequest$ProtoOnlineData c;
    private static volatile x<ShowShowRequest$ProtoOnlineData> f;
    private int a;
    private int b;

    public static final class a extends GeneratedMessageLite.b<ShowShowRequest$ProtoOnlineData, a> implements Object {
        private a() {
            super(ShowShowRequest$ProtoOnlineData.c);
        }
    }

    static {
        ShowShowRequest$ProtoOnlineData showShowRequest$ProtoOnlineData = new ShowShowRequest$ProtoOnlineData();
        c = showShowRequest$ProtoOnlineData;
        showShowRequest$ProtoOnlineData.makeImmutable();
    }

    private ShowShowRequest$ProtoOnlineData() {
    }

    public static ShowShowRequest$ProtoOnlineData h() {
        return c;
    }

    public static x<ShowShowRequest$ProtoOnlineData> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowShowRequest$ProtoOnlineData showShowRequest$ProtoOnlineData = (ShowShowRequest$ProtoOnlineData) obj2;
                boolean z2 = (this.a & 1) == 1;
                int i = this.b;
                if ((showShowRequest$ProtoOnlineData.a & 1) == 1) {
                    z = true;
                }
                this.b = hVar.m(z2, i, z, showShowRequest$ProtoOnlineData.b);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showShowRequest$ProtoOnlineData.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a |= 1;
                                this.b = gVar.u();
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
                return new ShowShowRequest$ProtoOnlineData();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (ShowShowRequest$ProtoOnlineData.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.s(1, this.b);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int i() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.S(1, this.b);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
