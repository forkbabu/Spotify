package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$ProtoShowRequestItem;
import java.io.IOException;

public final class ShowShowRequest$ContinueListeningSection extends GeneratedMessageLite<ShowShowRequest$ContinueListeningSection, a> implements Object {
    private static final ShowShowRequest$ContinueListeningSection c;
    private static volatile x<ShowShowRequest$ContinueListeningSection> f;
    private int a;
    private ShowShowRequest$ProtoShowRequestItem b;

    public static final class a extends GeneratedMessageLite.b<ShowShowRequest$ContinueListeningSection, a> implements Object {
        private a() {
            super(ShowShowRequest$ContinueListeningSection.c);
        }
    }

    static {
        ShowShowRequest$ContinueListeningSection showShowRequest$ContinueListeningSection = new ShowShowRequest$ContinueListeningSection();
        c = showShowRequest$ContinueListeningSection;
        showShowRequest$ContinueListeningSection.makeImmutable();
    }

    private ShowShowRequest$ContinueListeningSection() {
    }

    public static ShowShowRequest$ContinueListeningSection h() {
        return c;
    }

    public static x<ShowShowRequest$ContinueListeningSection> parser() {
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
                ShowShowRequest$ContinueListeningSection showShowRequest$ContinueListeningSection = (ShowShowRequest$ContinueListeningSection) obj2;
                this.b = (ShowShowRequest$ProtoShowRequestItem) hVar.i(this.b, showShowRequest$ContinueListeningSection.b);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showShowRequest$ContinueListeningSection.a;
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
                                ShowShowRequest$ProtoShowRequestItem.a aVar = (this.a & 1) == 1 ? (ShowShowRequest$ProtoShowRequestItem.a) this.b.toBuilder() : null;
                                ShowShowRequest$ProtoShowRequestItem showShowRequest$ProtoShowRequestItem = (ShowShowRequest$ProtoShowRequestItem) gVar.o(ShowShowRequest$ProtoShowRequestItem.parser(), kVar);
                                this.b = showShowRequest$ProtoShowRequestItem;
                                if (aVar != null) {
                                    aVar.mergeFrom((ShowShowRequest$ProtoShowRequestItem.a) showShowRequest$ProtoShowRequestItem);
                                    this.b = (ShowShowRequest$ProtoShowRequestItem) aVar.buildPartial();
                                }
                                this.a |= 1;
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
                return new ShowShowRequest$ContinueListeningSection();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (ShowShowRequest$ContinueListeningSection.class) {
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
            i2 = 0 + CodedOutputStream.n(1, i());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public ShowShowRequest$ProtoShowRequestItem i() {
        ShowShowRequest$ProtoShowRequestItem showShowRequest$ProtoShowRequestItem = this.b;
        return showShowRequest$ProtoShowRequestItem == null ? ShowShowRequest$ProtoShowRequestItem.h() : showShowRequest$ProtoShowRequestItem;
    }

    public boolean l() {
        return (this.a & 1) == 1;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, i());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
