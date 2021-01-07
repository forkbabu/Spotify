package com.spotify.imageresolve.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class ProjectionMap extends GeneratedMessageLite<ProjectionMap, b> implements Object {
    private static final ProjectionMap f;
    private static volatile x<ProjectionMap> n;
    private o.i<String> a = GeneratedMessageLite.emptyProtobufList();
    private o.i<ProjectionMetadata> b = GeneratedMessageLite.emptyProtobufList();
    private o.i<Collection> c = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<ProjectionMap, b> implements Object {
        private b() {
            super(ProjectionMap.f);
        }
    }

    static {
        ProjectionMap projectionMap = new ProjectionMap();
        f = projectionMap;
        projectionMap.makeImmutable();
    }

    private ProjectionMap() {
    }

    public static ProjectionMap i() {
        return f;
    }

    public static ProjectionMap p(byte[] bArr) {
        return (ProjectionMap) GeneratedMessageLite.parseFrom(f, bArr);
    }

    public static x<ProjectionMap> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ProjectionMap projectionMap = (ProjectionMap) obj2;
                this.a = hVar.q(this.a, projectionMap.a);
                this.b = hVar.q(this.b, projectionMap.b);
                this.c = hVar.q(this.c, projectionMap.c);
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
                                String A = gVar.A();
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(A);
                            } else if (B == 18) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(ProjectionMetadata.parser(), kVar));
                            } else if (B == 26) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(Collection.parser(), kVar));
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
                this.b.C();
                this.c.C();
                return null;
            case 4:
                return new ProjectionMap();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (ProjectionMap.class) {
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
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.q(this.a.get(i3));
        }
        int C0 = je.C0(this.a, 1, i2 + 0);
        for (int i4 = 0; i4 < this.b.size(); i4++) {
            C0 += CodedOutputStream.n(2, this.b.get(i4));
        }
        for (int i5 = 0; i5 < this.c.size(); i5++) {
            C0 += CodedOutputStream.n(3, this.c.get(i5));
        }
        this.memoizedSerializedSize = C0;
        return C0;
    }

    public List<Collection> h() {
        return this.c;
    }

    public ProjectionMetadata l(int i) {
        return this.b.get(i);
    }

    public int m() {
        return this.b.size();
    }

    public String n(int i) {
        return this.a.get(i);
    }

    public int o() {
        return this.a.size();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.P(1, this.a.get(i));
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            codedOutputStream.M(2, this.b.get(i2));
        }
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            codedOutputStream.M(3, this.c.get(i3));
        }
    }
}
