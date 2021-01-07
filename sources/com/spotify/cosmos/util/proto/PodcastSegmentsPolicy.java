package com.spotify.cosmos.util.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;
import java.io.InputStream;

public final class PodcastSegmentsPolicy extends GeneratedMessageLite<PodcastSegmentsPolicy, Builder> implements PodcastSegmentsPolicyOrBuilder {
    public static final int ALBUM_MOSAIC_URI_FIELD_NUMBER = 4;
    public static final int ARTISTS_FIELD_NUMBER = 5;
    public static final int CAN_UPSELL_FIELD_NUMBER = 3;
    private static final PodcastSegmentsPolicy DEFAULT_INSTANCE;
    public static final int EMBEDDED_SEGMENTS_FIELD_NUMBER = 2;
    private static volatile x<PodcastSegmentsPolicy> PARSER = null;
    public static final int PLAYBACK_SEGMENTS_FIELD_NUMBER = 1;
    private boolean albumMosaicUri_;
    private boolean artists_;
    private boolean canUpsell_;
    private boolean embeddedSegments_;
    private boolean playbackSegments_;

    /* renamed from: com.spotify.cosmos.util.proto.PodcastSegmentsPolicy$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            GeneratedMessageLite.MethodToInvoke.values();
            int[] iArr = new int[8];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.b<PodcastSegmentsPolicy, Builder> implements PodcastSegmentsPolicyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder clearAlbumMosaicUri() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).clearAlbumMosaicUri();
            return this;
        }

        public Builder clearArtists() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).clearArtists();
            return this;
        }

        public Builder clearCanUpsell() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).clearCanUpsell();
            return this;
        }

        public Builder clearEmbeddedSegments() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).clearEmbeddedSegments();
            return this;
        }

        public Builder clearPlaybackSegments() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).clearPlaybackSegments();
            return this;
        }

        @Override // com.spotify.cosmos.util.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getAlbumMosaicUri() {
            return ((PodcastSegmentsPolicy) this.instance).getAlbumMosaicUri();
        }

        @Override // com.spotify.cosmos.util.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getArtists() {
            return ((PodcastSegmentsPolicy) this.instance).getArtists();
        }

        @Override // com.spotify.cosmos.util.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getCanUpsell() {
            return ((PodcastSegmentsPolicy) this.instance).getCanUpsell();
        }

        @Override // com.spotify.cosmos.util.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getEmbeddedSegments() {
            return ((PodcastSegmentsPolicy) this.instance).getEmbeddedSegments();
        }

        @Override // com.spotify.cosmos.util.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getPlaybackSegments() {
            return ((PodcastSegmentsPolicy) this.instance).getPlaybackSegments();
        }

        public Builder setAlbumMosaicUri(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).setAlbumMosaicUri(z);
            return this;
        }

        public Builder setArtists(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).setArtists(z);
            return this;
        }

        public Builder setCanUpsell(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).setCanUpsell(z);
            return this;
        }

        public Builder setEmbeddedSegments(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).setEmbeddedSegments(z);
            return this;
        }

        public Builder setPlaybackSegments(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) this.instance).setPlaybackSegments(z);
            return this;
        }

        private Builder() {
            super(PodcastSegmentsPolicy.DEFAULT_INSTANCE);
        }
    }

    static {
        PodcastSegmentsPolicy podcastSegmentsPolicy = new PodcastSegmentsPolicy();
        DEFAULT_INSTANCE = podcastSegmentsPolicy;
        podcastSegmentsPolicy.makeImmutable();
    }

    private PodcastSegmentsPolicy() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearAlbumMosaicUri() {
        this.albumMosaicUri_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearArtists() {
        this.artists_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearCanUpsell() {
        this.canUpsell_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearEmbeddedSegments() {
        this.embeddedSegments_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPlaybackSegments() {
        this.playbackSegments_ = false;
    }

    public static PodcastSegmentsPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.toBuilder();
    }

    public static PodcastSegmentsPolicy parseDelimitedFrom(InputStream inputStream) {
        return (PodcastSegmentsPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PodcastSegmentsPolicy parseFrom(ByteString byteString) {
        return (PodcastSegmentsPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static x<PodcastSegmentsPolicy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setAlbumMosaicUri(boolean z) {
        this.albumMosaicUri_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setArtists(boolean z) {
        this.artists_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCanUpsell(boolean z) {
        this.canUpsell_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setEmbeddedSegments(boolean z) {
        this.embeddedSegments_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPlaybackSegments(boolean z) {
        this.playbackSegments_ = z;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return DEFAULT_INSTANCE;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PodcastSegmentsPolicy podcastSegmentsPolicy = (PodcastSegmentsPolicy) obj2;
                boolean z = this.playbackSegments_;
                boolean z2 = podcastSegmentsPolicy.playbackSegments_;
                this.playbackSegments_ = hVar.f(z, z, z2, z2);
                boolean z3 = this.embeddedSegments_;
                boolean z4 = podcastSegmentsPolicy.embeddedSegments_;
                this.embeddedSegments_ = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.canUpsell_;
                boolean z6 = podcastSegmentsPolicy.canUpsell_;
                this.canUpsell_ = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.albumMosaicUri_;
                boolean z8 = podcastSegmentsPolicy.albumMosaicUri_;
                this.albumMosaicUri_ = hVar.f(z7, z7, z8, z8);
                boolean z9 = this.artists_;
                boolean z10 = podcastSegmentsPolicy.artists_;
                this.artists_ = hVar.f(z9, z9, z10, z10);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z11 = false;
                while (!z11) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.playbackSegments_ = gVar.h();
                            } else if (B == 16) {
                                this.embeddedSegments_ = gVar.h();
                            } else if (B == 24) {
                                this.canUpsell_ = gVar.h();
                            } else if (B == 32) {
                                this.albumMosaicUri_ = gVar.h();
                            } else if (B == 40) {
                                this.artists_ = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z11 = true;
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
                return new PodcastSegmentsPolicy();
            case 5:
                return new Builder(null);
            case 6:
                break;
            case 7:
                if (PARSER == null) {
                    synchronized (PodcastSegmentsPolicy.class) {
                        if (PARSER == null) {
                            PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                        }
                    }
                }
                return PARSER;
            default:
                throw new UnsupportedOperationException();
        }
        return DEFAULT_INSTANCE;
    }

    @Override // com.spotify.cosmos.util.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getAlbumMosaicUri() {
        return this.albumMosaicUri_;
    }

    @Override // com.spotify.cosmos.util.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getArtists() {
        return this.artists_;
    }

    @Override // com.spotify.cosmos.util.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getCanUpsell() {
        return this.canUpsell_;
    }

    @Override // com.spotify.cosmos.util.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getEmbeddedSegments() {
        return this.embeddedSegments_;
    }

    @Override // com.spotify.cosmos.util.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getPlaybackSegments() {
        return this.playbackSegments_;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.playbackSegments_;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        boolean z2 = this.embeddedSegments_;
        if (z2) {
            i2 += CodedOutputStream.d(2, z2);
        }
        boolean z3 = this.canUpsell_;
        if (z3) {
            i2 += CodedOutputStream.d(3, z3);
        }
        boolean z4 = this.albumMosaicUri_;
        if (z4) {
            i2 += CodedOutputStream.d(4, z4);
        }
        boolean z5 = this.artists_;
        if (z5) {
            i2 += CodedOutputStream.d(5, z5);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.playbackSegments_;
        if (z) {
            codedOutputStream.A(1, z);
        }
        boolean z2 = this.embeddedSegments_;
        if (z2) {
            codedOutputStream.A(2, z2);
        }
        boolean z3 = this.canUpsell_;
        if (z3) {
            codedOutputStream.A(3, z3);
        }
        boolean z4 = this.albumMosaicUri_;
        if (z4) {
            codedOutputStream.A(4, z4);
        }
        boolean z5 = this.artists_;
        if (z5) {
            codedOutputStream.A(5, z5);
        }
    }

    public static Builder newBuilder(PodcastSegmentsPolicy podcastSegmentsPolicy) {
        return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom((Builder) podcastSegmentsPolicy);
    }

    public static PodcastSegmentsPolicy parseDelimitedFrom(InputStream inputStream, k kVar) {
        return (PodcastSegmentsPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static PodcastSegmentsPolicy parseFrom(ByteString byteString, k kVar) {
        return (PodcastSegmentsPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, kVar);
    }

    public static PodcastSegmentsPolicy parseFrom(byte[] bArr) {
        return (PodcastSegmentsPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PodcastSegmentsPolicy parseFrom(byte[] bArr, k kVar) {
        return (PodcastSegmentsPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, kVar);
    }

    public static PodcastSegmentsPolicy parseFrom(InputStream inputStream) {
        return (PodcastSegmentsPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PodcastSegmentsPolicy parseFrom(InputStream inputStream, k kVar) {
        return (PodcastSegmentsPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static PodcastSegmentsPolicy parseFrom(g gVar) {
        return (PodcastSegmentsPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static PodcastSegmentsPolicy parseFrom(g gVar, k kVar) {
        return (PodcastSegmentsPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, kVar);
    }
}
