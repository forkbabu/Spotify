package com.spotify.inappmessaging.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class Preview$PreviewResponseV1 extends GeneratedMessageLite<Preview$PreviewResponseV1, a> implements Object {
    private static final Preview$PreviewResponseV1 b;
    private static volatile x<Preview$PreviewResponseV1> c;
    private o.i<Messages$MessageV1> a = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<Preview$PreviewResponseV1, a> implements Object {
        private a() {
            super(Preview$PreviewResponseV1.b);
        }
    }

    static {
        Preview$PreviewResponseV1 preview$PreviewResponseV1 = new Preview$PreviewResponseV1();
        b = preview$PreviewResponseV1;
        preview$PreviewResponseV1.makeImmutable();
    }

    private Preview$PreviewResponseV1() {
    }

    public static Preview$PreviewResponseV1 l(byte[] bArr) {
        return (Preview$PreviewResponseV1) GeneratedMessageLite.parseFrom(b, bArr);
    }

    public static x<Preview$PreviewResponseV1> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((Preview$PreviewResponseV1) obj2).a);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 34) {
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(gVar.o(Messages$MessageV1.parser(), kVar));
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
                this.a.C();
                return null;
            case 4:
                return new Preview$PreviewResponseV1();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (Preview$PreviewResponseV1.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.n(4, this.a.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Messages$MessageV1 h(int i) {
        return this.a.get(i);
    }

    public int i() {
        return this.a.size();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(4, this.a.get(i));
        }
    }
}
