package com.spotify.rcs.admin.grpc.v0;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PropertyDefinition$Identifier extends GeneratedMessageLite<PropertyDefinition$Identifier, a> implements Object {
    private static final PropertyDefinition$Identifier c;
    private static volatile x<PropertyDefinition$Identifier> f;
    private String a = "";
    private String b = "";

    public static final class a extends GeneratedMessageLite.b<PropertyDefinition$Identifier, a> implements Object {
        private a() {
            super(PropertyDefinition$Identifier.c);
        }
    }

    static {
        PropertyDefinition$Identifier propertyDefinition$Identifier = new PropertyDefinition$Identifier();
        c = propertyDefinition$Identifier;
        propertyDefinition$Identifier.makeImmutable();
    }

    private PropertyDefinition$Identifier() {
    }

    public static PropertyDefinition$Identifier h() {
        return c;
    }

    public static x<PropertyDefinition$Identifier> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PropertyDefinition$Identifier propertyDefinition$Identifier = (PropertyDefinition$Identifier) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !propertyDefinition$Identifier.a.isEmpty(), propertyDefinition$Identifier.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ propertyDefinition$Identifier.b.isEmpty(), propertyDefinition$Identifier.b);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
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
                return new PropertyDefinition$Identifier();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (PropertyDefinition$Identifier.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String i() {
        return this.b;
    }

    public String l() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
    }
}