package com.spotify.stories.v2.view.rpc.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.stories.v2.view.proto.Story;
import java.io.IOException;

public final class GetStoryViewResponse extends GeneratedMessageLite<GetStoryViewResponse, b> implements Object {
    private static final GetStoryViewResponse b;
    private static volatile x<GetStoryViewResponse> c;
    private Story a;

    public static final class b extends GeneratedMessageLite.b<GetStoryViewResponse, b> implements Object {
        private b() {
            super(GetStoryViewResponse.b);
        }
    }

    static {
        GetStoryViewResponse getStoryViewResponse = new GetStoryViewResponse();
        b = getStoryViewResponse;
        getStoryViewResponse.makeImmutable();
    }

    private GetStoryViewResponse() {
    }

    public static x<GetStoryViewResponse> parser() {
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
                this.a = (Story) ((GeneratedMessageLite.h) obj).i(this.a, ((GetStoryViewResponse) obj2).a);
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
                                Story story = this.a;
                                Story.b bVar = story != null ? (Story.b) story.toBuilder() : null;
                                Story story2 = (Story) gVar.o(Story.parser(), kVar);
                                this.a = story2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Story.b) story2);
                                    this.a = (Story) bVar.buildPartial();
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
                return null;
            case 4:
                return new GetStoryViewResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (GetStoryViewResponse.class) {
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
        if (this.a != null) {
            i2 = 0 + CodedOutputStream.n(1, h());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Story h() {
        Story story = this.a;
        return story == null ? Story.l() : story;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != null) {
            codedOutputStream.M(1, h());
        }
    }
}
