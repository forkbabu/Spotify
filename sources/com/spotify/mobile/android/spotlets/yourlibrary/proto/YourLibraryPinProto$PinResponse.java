package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class YourLibraryPinProto$PinResponse extends GeneratedMessageLite<YourLibraryPinProto$PinResponse, a> implements Object {
    private static final YourLibraryPinProto$PinResponse c;
    private static volatile x<YourLibraryPinProto$PinResponse> f;
    private int a;
    private boolean b;

    public enum PinStatus implements o.c {
        UNKNOWN(0),
        PINNED(1),
        NOT_PINNED(2),
        NOT_PINNABLE__IS_FOLDER(3),
        UNRECOGNIZED(-1);
        
        private final int value;

        private PinStatus(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<YourLibraryPinProto$PinResponse, a> implements Object {
        private a() {
            super(YourLibraryPinProto$PinResponse.c);
        }
    }

    static {
        YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse = new YourLibraryPinProto$PinResponse();
        c = yourLibraryPinProto$PinResponse;
        yourLibraryPinProto$PinResponse.makeImmutable();
    }

    private YourLibraryPinProto$PinResponse() {
    }

    public static x<YourLibraryPinProto$PinResponse> parser() {
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
                YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse = (YourLibraryPinProto$PinResponse) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = yourLibraryPinProto$PinResponse.a;
                if (i2 != 0) {
                    z = true;
                }
                this.a = hVar.m(z2, i, z, i2);
                boolean z3 = this.b;
                boolean z4 = yourLibraryPinProto$PinResponse.b;
                this.b = hVar.f(z3, z3, z4, z4);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.u();
                            } else if (B == 16) {
                                this.b = gVar.h();
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
                return null;
            case 4:
                return new YourLibraryPinProto$PinResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (YourLibraryPinProto$PinResponse.class) {
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
        if (this.a != PinStatus.UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.a);
        }
        boolean z = this.b;
        if (z) {
            i2 += CodedOutputStream.d(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean h() {
        return this.b;
    }

    public PinStatus i() {
        PinStatus pinStatus;
        int i = this.a;
        if (i == 0) {
            pinStatus = PinStatus.UNKNOWN;
        } else if (i == 1) {
            pinStatus = PinStatus.PINNED;
        } else if (i == 2) {
            pinStatus = PinStatus.NOT_PINNED;
        } else if (i != 3) {
            pinStatus = null;
        } else {
            pinStatus = PinStatus.NOT_PINNABLE__IS_FOLDER;
        }
        return pinStatus == null ? PinStatus.UNRECOGNIZED : pinStatus;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != PinStatus.UNKNOWN.getNumber()) {
            codedOutputStream.K(1, this.a);
        }
        boolean z = this.b;
        if (z) {
            codedOutputStream.A(2, z);
        }
    }
}
