package com.spotify.music.libs.fullscreen.story.prefetcher.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.music.libs.fullscreen.story.prefetcher.v1.proto.NoVideoOverride;
import com.spotify.music.libs.fullscreen.story.prefetcher.v1.proto.P2SOverride;
import com.spotify.music.libs.fullscreen.story.prefetcher.v1.proto.StoryOverride;
import java.io.IOException;

public final class ExperimentOverride extends GeneratedMessageLite<ExperimentOverride, b> implements Object {
    private static final ExperimentOverride f;
    private static volatile x<ExperimentOverride> n;
    private StoryOverride a;
    private P2SOverride b;
    private NoVideoOverride c;

    public static final class b extends GeneratedMessageLite.b<ExperimentOverride, b> implements Object {
        private b() {
            super(ExperimentOverride.f);
        }
    }

    static {
        ExperimentOverride experimentOverride = new ExperimentOverride();
        f = experimentOverride;
        experimentOverride.makeImmutable();
    }

    private ExperimentOverride() {
    }

    public static x<ExperimentOverride> parser() {
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
                ExperimentOverride experimentOverride = (ExperimentOverride) obj2;
                this.a = (StoryOverride) hVar.i(this.a, experimentOverride.a);
                this.b = (P2SOverride) hVar.i(this.b, experimentOverride.b);
                this.c = (NoVideoOverride) hVar.i(this.c, experimentOverride.c);
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
                                StoryOverride storyOverride = this.a;
                                StoryOverride.b bVar = storyOverride != null ? (StoryOverride.b) storyOverride.toBuilder() : null;
                                StoryOverride storyOverride2 = (StoryOverride) gVar.o(StoryOverride.parser(), kVar);
                                this.a = storyOverride2;
                                if (bVar != null) {
                                    bVar.mergeFrom((StoryOverride.b) storyOverride2);
                                    this.a = (StoryOverride) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                P2SOverride p2SOverride = this.b;
                                P2SOverride.b bVar2 = p2SOverride != null ? (P2SOverride.b) p2SOverride.toBuilder() : null;
                                P2SOverride p2SOverride2 = (P2SOverride) gVar.o(P2SOverride.parser(), kVar);
                                this.b = p2SOverride2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((P2SOverride.b) p2SOverride2);
                                    this.b = (P2SOverride) bVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                NoVideoOverride noVideoOverride = this.c;
                                NoVideoOverride.b bVar3 = noVideoOverride != null ? (NoVideoOverride.b) noVideoOverride.toBuilder() : null;
                                NoVideoOverride noVideoOverride2 = (NoVideoOverride) gVar.o(NoVideoOverride.parser(), kVar);
                                this.c = noVideoOverride2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((NoVideoOverride.b) noVideoOverride2);
                                    this.c = (NoVideoOverride) bVar3.buildPartial();
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
                return new ExperimentOverride();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (ExperimentOverride.class) {
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
        StoryOverride storyOverride = this.a;
        if (storyOverride != null) {
            i2 = 0 + CodedOutputStream.n(1, storyOverride);
        }
        P2SOverride p2SOverride = this.b;
        if (p2SOverride != null) {
            i2 += CodedOutputStream.n(2, p2SOverride);
        }
        NoVideoOverride noVideoOverride = this.c;
        if (noVideoOverride != null) {
            i2 += CodedOutputStream.n(3, noVideoOverride);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        StoryOverride storyOverride = this.a;
        if (storyOverride != null) {
            codedOutputStream.M(1, storyOverride);
        }
        P2SOverride p2SOverride = this.b;
        if (p2SOverride != null) {
            codedOutputStream.M(2, p2SOverride);
        }
        NoVideoOverride noVideoOverride = this.c;
        if (noVideoOverride != null) {
            codedOutputStream.M(3, noVideoOverride);
        }
    }
}
