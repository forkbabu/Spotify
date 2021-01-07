package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.allboarding.model.v1.proto.NullableString;
import java.io.IOException;
import java.util.List;

public final class Section extends GeneratedMessageLite<Section, b> implements Object {
    private static final Section o;
    private static volatile x<Section> p;
    private int a;
    private NullableString b;
    private o.i<Item> c = GeneratedMessageLite.emptyProtobufList();
    private NullableString f;
    private String n = "";

    public static final class b extends GeneratedMessageLite.b<Section, b> implements Object {
        private b() {
            super(Section.o);
        }
    }

    static {
        Section section = new Section();
        o = section;
        section.makeImmutable();
    }

    private Section() {
    }

    public static x<Section> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Section section = (Section) obj2;
                this.b = (NullableString) hVar.i(this.b, section.b);
                this.c = hVar.q(this.c, section.c);
                this.f = (NullableString) hVar.i(this.f, section.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ section.n.isEmpty(), section.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= section.a;
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
                            if (B == 10) {
                                NullableString nullableString = this.b;
                                NullableString.b bVar = nullableString != null ? (NullableString.b) nullableString.toBuilder() : null;
                                NullableString nullableString2 = (NullableString) gVar.o(NullableString.parser(), kVar);
                                this.b = nullableString2;
                                if (bVar != null) {
                                    bVar.mergeFrom((NullableString.b) nullableString2);
                                    this.b = (NullableString) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(Item.parser(), kVar));
                            } else if (B == 26) {
                                NullableString nullableString3 = this.f;
                                NullableString.b bVar2 = nullableString3 != null ? (NullableString.b) nullableString3.toBuilder() : null;
                                NullableString nullableString4 = (NullableString) gVar.o(NullableString.parser(), kVar);
                                this.f = nullableString4;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((NullableString.b) nullableString4);
                                    this.f = (NullableString) bVar2.buildPartial();
                                }
                            } else if (B == 34) {
                                this.n = gVar.A();
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
                return new Section();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (Section.class) {
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
        int n2 = this.b != null ? CodedOutputStream.n(1, m()) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            n2 += CodedOutputStream.n(2, this.c.get(i2));
        }
        if (this.f != null) {
            n2 += CodedOutputStream.n(3, l());
        }
        if (!this.n.isEmpty()) {
            n2 += CodedOutputStream.p(4, this.n);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public String h() {
        return this.n;
    }

    public List<Item> i() {
        return this.c;
    }

    public NullableString l() {
        NullableString nullableString = this.f;
        return nullableString == null ? NullableString.h() : nullableString;
    }

    public NullableString m() {
        NullableString nullableString = this.b;
        return nullableString == null ? NullableString.h() : nullableString;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.b != null) {
            codedOutputStream.M(1, m());
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
        if (this.f != null) {
            codedOutputStream.M(3, l());
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
    }
}
