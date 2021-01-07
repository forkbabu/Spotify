package com.spotify.stories.v2.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.stories.v2.view.proto.ContextMenu;
import java.io.IOException;
import java.util.List;

public final class Story extends GeneratedMessageLite<Story, b> implements Object {
    private static final Story q;
    private static volatile x<Story> r;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private o.i<Chapter> o = GeneratedMessageLite.emptyProtobufList();
    private ContextMenu p;

    public static final class b extends GeneratedMessageLite.b<Story, b> implements Object {
        private b() {
            super(Story.q);
        }
    }

    static {
        Story story = new Story();
        q = story;
        story.makeImmutable();
    }

    private Story() {
    }

    public static Story l() {
        return q;
    }

    public static x<Story> parser() {
        return q.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return q;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Story story = (Story) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !story.b.isEmpty(), story.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !story.c.isEmpty(), story.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !story.f.isEmpty(), story.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ story.n.isEmpty(), story.n);
                this.o = hVar.q(this.o, story.o);
                this.p = (ContextMenu) hVar.i(this.p, story.p);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= story.a;
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
                                this.b = gVar.A();
                            } else if (B == 18) {
                                this.c = gVar.A();
                            } else if (B == 26) {
                                this.f = gVar.A();
                            } else if (B == 34) {
                                this.n = gVar.A();
                            } else if (B == 42) {
                                if (!this.o.R0()) {
                                    this.o = GeneratedMessageLite.mutableCopy(this.o);
                                }
                                this.o.add(gVar.o(Chapter.parser(), kVar));
                            } else if (B == 50) {
                                ContextMenu contextMenu = this.p;
                                ContextMenu.b bVar = contextMenu != null ? (ContextMenu.b) contextMenu.toBuilder() : null;
                                ContextMenu contextMenu2 = (ContextMenu) gVar.o(ContextMenu.parser(), kVar);
                                this.p = contextMenu2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ContextMenu.b) contextMenu2);
                                    this.p = (ContextMenu) bVar.buildPartial();
                                }
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
                this.o.C();
                return null;
            case 4:
                return new Story();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (Story.class) {
                        if (r == null) {
                            r = new GeneratedMessageLite.c(q);
                        }
                    }
                }
                return r;
            default:
                throw new UnsupportedOperationException();
        }
        return q;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (!this.c.isEmpty()) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        if (!this.f.isEmpty()) {
            p2 += CodedOutputStream.p(3, this.f);
        }
        if (!this.n.isEmpty()) {
            p2 += CodedOutputStream.p(4, this.n);
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            p2 += CodedOutputStream.n(5, this.o.get(i2));
        }
        if (this.p != null) {
            p2 += CodedOutputStream.n(6, i());
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public List<Chapter> h() {
        return this.o;
    }

    public ContextMenu i() {
        ContextMenu contextMenu = this.p;
        return contextMenu == null ? ContextMenu.h() : contextMenu;
    }

    public String m() {
        return this.b;
    }

    public String n() {
        return this.n;
    }

    public String o() {
        return this.f;
    }

    public String p() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
        for (int i = 0; i < this.o.size(); i++) {
            codedOutputStream.M(5, this.o.get(i));
        }
        if (this.p != null) {
            codedOutputStream.M(6, i());
        }
    }
}
