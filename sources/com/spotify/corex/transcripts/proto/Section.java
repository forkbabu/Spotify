package com.spotify.corex.transcripts.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.corex.transcripts.proto.PlaintextContent;
import java.io.IOException;

public final class Section extends GeneratedMessageLite<Section, b> implements Object {
    private static final Section n;
    private static volatile x<Section> o;
    private int a = 0;
    private Object b;
    private int c;
    private int f;

    public enum BodyCase implements o.c {
        PLAINTEXT_CONTENT(3),
        BODY_NOT_SET(0);
        
        private final int value;

        private BodyCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<Section, b> implements Object {
        private b() {
            super(Section.n);
        }
    }

    static {
        Section section = new Section();
        n = section;
        section.makeImmutable();
    }

    private Section() {
    }

    public static x<Section> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = false;
        BodyCase bodyCase = null;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Section section = (Section) obj2;
                int i2 = this.c;
                boolean z2 = i2 != 0;
                int i3 = section.c;
                this.c = hVar.m(z2, i2, i3 != 0, i3);
                int i4 = this.f;
                boolean z3 = i4 != 0;
                int i5 = section.f;
                this.f = hVar.m(z3, i4, i5 != 0, i5);
                int i6 = section.a;
                if (i6 == 0) {
                    bodyCase = BodyCase.BODY_NOT_SET;
                } else if (i6 == 3) {
                    bodyCase = BodyCase.PLAINTEXT_CONTENT;
                }
                int ordinal = bodyCase.ordinal();
                if (ordinal == 0) {
                    if (this.a == 3) {
                        z = true;
                    }
                    this.b = hVar.u(z, this.b, section.b);
                } else if (ordinal == 1) {
                    if (this.a != 0) {
                        z = true;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = section.a) != 0) {
                    this.a = i;
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
                                this.c = gVar.u();
                            } else if (B == 16) {
                                this.f = gVar.u();
                            } else if (B == 26) {
                                PlaintextContent.b bVar = this.a == 3 ? (PlaintextContent.b) ((PlaintextContent) this.b).toBuilder() : null;
                                u o2 = gVar.o(PlaintextContent.parser(), kVar);
                                this.b = o2;
                                if (bVar != null) {
                                    bVar.mergeFrom((PlaintextContent.b) ((PlaintextContent) o2));
                                    this.b = bVar.buildPartial();
                                }
                                this.a = 3;
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
                return new Section();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (Section.class) {
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
        if (this.c != SectionType.UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.c);
        }
        int i3 = this.f;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(2, i3);
        }
        if (this.a == 3) {
            i2 += CodedOutputStream.n(3, (PlaintextContent) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public PlaintextContent h() {
        if (this.a == 3) {
            return (PlaintextContent) this.b;
        }
        return PlaintextContent.h();
    }

    public int i() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.c != SectionType.UNKNOWN.getNumber()) {
            codedOutputStream.K(1, this.c);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputStream.K(2, i);
        }
        if (this.a == 3) {
            codedOutputStream.M(3, (PlaintextContent) this.b);
        }
    }
}
