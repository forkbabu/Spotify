package com.spotify.music.libs.profile.proto;

import com.google.protobuf.BoolValue;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.StringValue;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class IdentityV3$UserProfile extends GeneratedMessageLite<IdentityV3$UserProfile, a> implements Object {
    private static final IdentityV3$UserProfile v;
    private static volatile x<IdentityV3$UserProfile> w;
    private int a;
    private StringValue b;
    private StringValue c;
    private o.i<IdentityV3$Image> f = GeneratedMessageLite.emptyProtobufList();
    private BoolValue n;
    private BoolValue o;
    private BoolValue p;
    private BoolValue q;
    private BoolValue r;
    private BoolValue s;
    private BoolValue t;
    private Int32Value u;

    public static final class a extends GeneratedMessageLite.b<IdentityV3$UserProfile, a> implements Object {
        private a() {
            super(IdentityV3$UserProfile.v);
        }
    }

    static {
        IdentityV3$UserProfile identityV3$UserProfile = new IdentityV3$UserProfile();
        v = identityV3$UserProfile;
        identityV3$UserProfile.makeImmutable();
    }

    private IdentityV3$UserProfile() {
    }

    public static IdentityV3$UserProfile h() {
        return v;
    }

    public static x<IdentityV3$UserProfile> parser() {
        return v.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return v;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                IdentityV3$UserProfile identityV3$UserProfile = (IdentityV3$UserProfile) obj2;
                this.b = (StringValue) hVar.i(this.b, identityV3$UserProfile.b);
                this.c = (StringValue) hVar.i(this.c, identityV3$UserProfile.c);
                this.f = hVar.q(this.f, identityV3$UserProfile.f);
                this.n = (BoolValue) hVar.i(this.n, identityV3$UserProfile.n);
                this.o = (BoolValue) hVar.i(this.o, identityV3$UserProfile.o);
                this.p = (BoolValue) hVar.i(this.p, identityV3$UserProfile.p);
                this.q = (BoolValue) hVar.i(this.q, identityV3$UserProfile.q);
                this.r = (BoolValue) hVar.i(this.r, identityV3$UserProfile.r);
                this.s = (BoolValue) hVar.i(this.s, identityV3$UserProfile.s);
                this.t = (BoolValue) hVar.i(this.t, identityV3$UserProfile.t);
                this.u = (Int32Value) hVar.i(this.u, identityV3$UserProfile.u);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= identityV3$UserProfile.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                StringValue stringValue = this.b;
                                StringValue.b bVar = stringValue != null ? (StringValue.b) stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) gVar.o(StringValue.parser(), kVar);
                                this.b = stringValue2;
                                if (bVar != null) {
                                    bVar.mergeFrom((StringValue.b) stringValue2);
                                    this.b = (StringValue) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 18:
                                StringValue stringValue3 = this.c;
                                StringValue.b bVar2 = stringValue3 != null ? (StringValue.b) stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) gVar.o(StringValue.parser(), kVar);
                                this.c = stringValue4;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((StringValue.b) stringValue4);
                                    this.c = (StringValue) bVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 26:
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(IdentityV3$Image.parser(), kVar));
                                continue;
                            case 34:
                                BoolValue boolValue = this.n;
                                BoolValue.b bVar3 = boolValue != null ? (BoolValue.b) boolValue.toBuilder() : null;
                                BoolValue boolValue2 = (BoolValue) gVar.o(BoolValue.parser(), kVar);
                                this.n = boolValue2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((BoolValue.b) boolValue2);
                                    this.n = (BoolValue) bVar3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 42:
                                BoolValue boolValue3 = this.o;
                                BoolValue.b bVar4 = boolValue3 != null ? (BoolValue.b) boolValue3.toBuilder() : null;
                                BoolValue boolValue4 = (BoolValue) gVar.o(BoolValue.parser(), kVar);
                                this.o = boolValue4;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((BoolValue.b) boolValue4);
                                    this.o = (BoolValue) bVar4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 50:
                                BoolValue boolValue5 = this.p;
                                BoolValue.b bVar5 = boolValue5 != null ? (BoolValue.b) boolValue5.toBuilder() : null;
                                BoolValue boolValue6 = (BoolValue) gVar.o(BoolValue.parser(), kVar);
                                this.p = boolValue6;
                                if (bVar5 != null) {
                                    bVar5.mergeFrom((BoolValue.b) boolValue6);
                                    this.p = (BoolValue) bVar5.buildPartial();
                                } else {
                                    continue;
                                }
                            case 58:
                                BoolValue boolValue7 = this.q;
                                BoolValue.b bVar6 = boolValue7 != null ? (BoolValue.b) boolValue7.toBuilder() : null;
                                BoolValue boolValue8 = (BoolValue) gVar.o(BoolValue.parser(), kVar);
                                this.q = boolValue8;
                                if (bVar6 != null) {
                                    bVar6.mergeFrom((BoolValue.b) boolValue8);
                                    this.q = (BoolValue) bVar6.buildPartial();
                                } else {
                                    continue;
                                }
                            case 66:
                                BoolValue boolValue9 = this.r;
                                BoolValue.b bVar7 = boolValue9 != null ? (BoolValue.b) boolValue9.toBuilder() : null;
                                BoolValue boolValue10 = (BoolValue) gVar.o(BoolValue.parser(), kVar);
                                this.r = boolValue10;
                                if (bVar7 != null) {
                                    bVar7.mergeFrom((BoolValue.b) boolValue10);
                                    this.r = (BoolValue) bVar7.buildPartial();
                                } else {
                                    continue;
                                }
                            case 74:
                                BoolValue boolValue11 = this.s;
                                BoolValue.b bVar8 = boolValue11 != null ? (BoolValue.b) boolValue11.toBuilder() : null;
                                BoolValue boolValue12 = (BoolValue) gVar.o(BoolValue.parser(), kVar);
                                this.s = boolValue12;
                                if (bVar8 != null) {
                                    bVar8.mergeFrom((BoolValue.b) boolValue12);
                                    this.s = (BoolValue) bVar8.buildPartial();
                                } else {
                                    continue;
                                }
                            case 82:
                                BoolValue boolValue13 = this.t;
                                BoolValue.b bVar9 = boolValue13 != null ? (BoolValue.b) boolValue13.toBuilder() : null;
                                BoolValue boolValue14 = (BoolValue) gVar.o(BoolValue.parser(), kVar);
                                this.t = boolValue14;
                                if (bVar9 != null) {
                                    bVar9.mergeFrom((BoolValue.b) boolValue14);
                                    this.t = (BoolValue) bVar9.buildPartial();
                                } else {
                                    continue;
                                }
                            case 90:
                                Int32Value int32Value = this.u;
                                Int32Value.b bVar10 = int32Value != null ? (Int32Value.b) int32Value.toBuilder() : null;
                                Int32Value int32Value2 = (Int32Value) gVar.o(Int32Value.parser(), kVar);
                                this.u = int32Value2;
                                if (bVar10 != null) {
                                    bVar10.mergeFrom((Int32Value.b) int32Value2);
                                    this.u = (Int32Value) bVar10.buildPartial();
                                } else {
                                    continue;
                                }
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
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
                return new IdentityV3$UserProfile();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (w == null) {
                    synchronized (IdentityV3$UserProfile.class) {
                        if (w == null) {
                            w = new GeneratedMessageLite.c(v);
                        }
                    }
                }
                return w;
            default:
                throw new UnsupportedOperationException();
        }
        return v;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int n2 = this.b != null ? CodedOutputStream.n(1, o()) + 0 : 0;
        if (this.c != null) {
            n2 += CodedOutputStream.n(2, n());
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            n2 += CodedOutputStream.n(3, this.f.get(i2));
        }
        BoolValue boolValue = this.n;
        if (boolValue != null) {
            n2 += CodedOutputStream.n(4, boolValue);
        }
        BoolValue boolValue2 = this.o;
        if (boolValue2 != null) {
            n2 += CodedOutputStream.n(5, boolValue2);
        }
        BoolValue boolValue3 = this.p;
        if (boolValue3 != null) {
            n2 += CodedOutputStream.n(6, boolValue3);
        }
        BoolValue boolValue4 = this.q;
        if (boolValue4 != null) {
            n2 += CodedOutputStream.n(7, boolValue4);
        }
        BoolValue boolValue5 = this.r;
        if (boolValue5 != null) {
            n2 += CodedOutputStream.n(8, boolValue5);
        }
        BoolValue boolValue6 = this.s;
        if (boolValue6 != null) {
            n2 += CodedOutputStream.n(9, boolValue6);
        }
        if (this.t != null) {
            n2 += CodedOutputStream.n(10, i());
        }
        Int32Value int32Value = this.u;
        if (int32Value != null) {
            n2 += CodedOutputStream.n(11, int32Value);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public BoolValue i() {
        BoolValue boolValue = this.t;
        return boolValue == null ? BoolValue.h() : boolValue;
    }

    public IdentityV3$Image l(int i) {
        return this.f.get(i);
    }

    public int m() {
        return this.f.size();
    }

    public StringValue n() {
        StringValue stringValue = this.c;
        return stringValue == null ? StringValue.h() : stringValue;
    }

    public StringValue o() {
        StringValue stringValue = this.b;
        return stringValue == null ? StringValue.h() : stringValue;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.b != null) {
            codedOutputStream.M(1, o());
        }
        if (this.c != null) {
            codedOutputStream.M(2, n());
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.M(3, this.f.get(i));
        }
        BoolValue boolValue = this.n;
        if (boolValue != null) {
            codedOutputStream.M(4, boolValue);
        }
        BoolValue boolValue2 = this.o;
        if (boolValue2 != null) {
            codedOutputStream.M(5, boolValue2);
        }
        BoolValue boolValue3 = this.p;
        if (boolValue3 != null) {
            codedOutputStream.M(6, boolValue3);
        }
        BoolValue boolValue4 = this.q;
        if (boolValue4 != null) {
            codedOutputStream.M(7, boolValue4);
        }
        BoolValue boolValue5 = this.r;
        if (boolValue5 != null) {
            codedOutputStream.M(8, boolValue5);
        }
        BoolValue boolValue6 = this.s;
        if (boolValue6 != null) {
            codedOutputStream.M(9, boolValue6);
        }
        if (this.t != null) {
            codedOutputStream.M(10, i());
        }
        Int32Value int32Value = this.u;
        if (int32Value != null) {
            codedOutputStream.M(11, int32Value);
        }
    }
}
