package com.spotify.stories.v2.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.stories.v2.view.proto.Overlay;
import com.spotify.stories.v2.view.proto.TrackChapter;
import com.spotify.stories.v2.view.proto.VideoChapter;
import java.io.IOException;

public final class Chapter extends GeneratedMessageLite<Chapter, b> implements Object {
    private static final Chapter f;
    private static volatile x<Chapter> n;
    private int a = 0;
    private Object b;
    private Overlay c;

    public enum ChapterTypeCase implements o.c {
        TRACK_CHAPTER(2),
        VIDEO_CHAPTER(3),
        CHAPTERTYPE_NOT_SET(0);
        
        private final int value;

        private ChapterTypeCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<Chapter, b> implements Object {
        private b() {
            super(Chapter.f);
        }
    }

    static {
        Chapter chapter = new Chapter();
        f = chapter;
        chapter.makeImmutable();
    }

    private Chapter() {
    }

    public static x<Chapter> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Chapter chapter = (Chapter) obj2;
                this.c = (Overlay) hVar.i(this.c, chapter.c);
                int ordinal = chapter.h().ordinal();
                if (ordinal == 0) {
                    if (this.a != 2) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, chapter.b);
                } else if (ordinal == 1) {
                    if (this.a != 3) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, chapter.b);
                } else if (ordinal == 2) {
                    if (this.a == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = chapter.a) != 0) {
                    this.a = i;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                Overlay overlay = this.c;
                                Overlay.b bVar = overlay != null ? (Overlay.b) overlay.toBuilder() : null;
                                Overlay overlay2 = (Overlay) gVar.o(Overlay.parser(), kVar);
                                this.c = overlay2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Overlay.b) overlay2);
                                    this.c = (Overlay) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                TrackChapter.b bVar2 = this.a == 2 ? (TrackChapter.b) ((TrackChapter) this.b).toBuilder() : null;
                                u o = gVar.o(TrackChapter.parser(), kVar);
                                this.b = o;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((TrackChapter.b) ((TrackChapter) o));
                                    this.b = bVar2.buildPartial();
                                }
                                this.a = 2;
                            } else if (B == 26) {
                                VideoChapter.b bVar3 = this.a == 3 ? (VideoChapter.b) ((VideoChapter) this.b).toBuilder() : null;
                                u o2 = gVar.o(VideoChapter.parser(), kVar);
                                this.b = o2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((VideoChapter.b) ((VideoChapter) o2));
                                    this.b = bVar3.buildPartial();
                                }
                                this.a = 3;
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z2 = true;
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
                return new Chapter();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (Chapter.class) {
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
        if (this.c != null) {
            i2 = 0 + CodedOutputStream.n(1, i());
        }
        if (this.a == 2) {
            i2 += CodedOutputStream.n(2, (TrackChapter) this.b);
        }
        if (this.a == 3) {
            i2 += CodedOutputStream.n(3, (VideoChapter) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public ChapterTypeCase h() {
        int i = this.a;
        if (i == 0) {
            return ChapterTypeCase.CHAPTERTYPE_NOT_SET;
        }
        if (i == 2) {
            return ChapterTypeCase.TRACK_CHAPTER;
        }
        if (i != 3) {
            return null;
        }
        return ChapterTypeCase.VIDEO_CHAPTER;
    }

    public Overlay i() {
        Overlay overlay = this.c;
        return overlay == null ? Overlay.l() : overlay;
    }

    public TrackChapter l() {
        if (this.a == 2) {
            return (TrackChapter) this.b;
        }
        return TrackChapter.i();
    }

    public VideoChapter m() {
        if (this.a == 3) {
            return (VideoChapter) this.b;
        }
        return VideoChapter.h();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.c != null) {
            codedOutputStream.M(1, i());
        }
        if (this.a == 2) {
            codedOutputStream.M(2, (TrackChapter) this.b);
        }
        if (this.a == 3) {
            codedOutputStream.M(3, (VideoChapter) this.b);
        }
    }
}
