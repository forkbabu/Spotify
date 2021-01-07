package com.spotify.cosmos.util.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.cosmos.util.proto.PodcastSegmentsPolicy;
import java.io.IOException;
import java.io.InputStream;

public final class EpisodeDecorationPolicy extends GeneratedMessageLite<EpisodeDecorationPolicy, Builder> implements EpisodeDecorationPolicyOrBuilder {
    public static final int AVAILABLE_FIELD_NUMBER = 12;
    public static final int BACKGROUNDABLE_FIELD_NUMBER = 15;
    public static final int COVERS_FIELD_NUMBER = 9;
    private static final EpisodeDecorationPolicy DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int FREEZE_FRAMES_FIELD_NUMBER = 10;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 16;
    public static final int IS_MUSIC_AND_TALK_FIELD_NUMBER = 18;
    public static final int LANGUAGE_FIELD_NUMBER = 11;
    public static final int LENGTH_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int MANIFEST_ID_FIELD_NUMBER = 4;
    public static final int MEDIA_TYPE_ENUM_FIELD_NUMBER = 13;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int NUMBER_FIELD_NUMBER = 14;
    private static volatile x<EpisodeDecorationPolicy> PARSER = null;
    public static final int PODCAST_SEGMENTS_FIELD_NUMBER = 19;
    public static final int PREVIEW_ID_FIELD_NUMBER = 5;
    public static final int PREVIEW_MANIFEST_ID_FIELD_NUMBER = 6;
    public static final int PUBLISH_DATE_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 17;
    private boolean available_;
    private boolean backgroundable_;
    private boolean covers_;
    private boolean description_;
    private boolean freezeFrames_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private boolean language_;
    private boolean length_;
    private boolean link_;
    private boolean manifestId_;
    private boolean mediaTypeEnum_;
    private boolean name_;
    private boolean number_;
    private PodcastSegmentsPolicy podcastSegments_;
    private boolean previewId_;
    private boolean previewManifestId_;
    private boolean publishDate_;
    private boolean type_;

    /* renamed from: com.spotify.cosmos.util.proto.EpisodeDecorationPolicy$1  reason: invalid class name */
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

    public static final class Builder extends GeneratedMessageLite.b<EpisodeDecorationPolicy, Builder> implements EpisodeDecorationPolicyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder clearAvailable() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearAvailable();
            return this;
        }

        public Builder clearBackgroundable() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearBackgroundable();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearCovers();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearDescription();
            return this;
        }

        public Builder clearFreezeFrames() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearFreezeFrames();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsMusicAndTalk() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearIsMusicAndTalk();
            return this;
        }

        public Builder clearLanguage() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearLanguage();
            return this;
        }

        public Builder clearLength() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearLength();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearManifestId() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearManifestId();
            return this;
        }

        public Builder clearMediaTypeEnum() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearMediaTypeEnum();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearNumber();
            return this;
        }

        public Builder clearPodcastSegments() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearPodcastSegments();
            return this;
        }

        public Builder clearPreviewId() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearPreviewId();
            return this;
        }

        public Builder clearPreviewManifestId() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearPreviewManifestId();
            return this;
        }

        public Builder clearPublishDate() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearPublishDate();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearType();
            return this;
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getAvailable() {
            return ((EpisodeDecorationPolicy) this.instance).getAvailable();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getBackgroundable() {
            return ((EpisodeDecorationPolicy) this.instance).getBackgroundable();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getCovers() {
            return ((EpisodeDecorationPolicy) this.instance).getCovers();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getDescription() {
            return ((EpisodeDecorationPolicy) this.instance).getDescription();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getFreezeFrames() {
            return ((EpisodeDecorationPolicy) this.instance).getFreezeFrames();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsExplicit() {
            return ((EpisodeDecorationPolicy) this.instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsMusicAndTalk() {
            return ((EpisodeDecorationPolicy) this.instance).getIsMusicAndTalk();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getLanguage() {
            return ((EpisodeDecorationPolicy) this.instance).getLanguage();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getLength() {
            return ((EpisodeDecorationPolicy) this.instance).getLength();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((EpisodeDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getManifestId() {
            return ((EpisodeDecorationPolicy) this.instance).getManifestId();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getMediaTypeEnum() {
            return ((EpisodeDecorationPolicy) this.instance).getMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getName() {
            return ((EpisodeDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getNumber() {
            return ((EpisodeDecorationPolicy) this.instance).getNumber();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public PodcastSegmentsPolicy getPodcastSegments() {
            return ((EpisodeDecorationPolicy) this.instance).getPodcastSegments();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getPreviewId() {
            return ((EpisodeDecorationPolicy) this.instance).getPreviewId();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getPreviewManifestId() {
            return ((EpisodeDecorationPolicy) this.instance).getPreviewManifestId();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getPublishDate() {
            return ((EpisodeDecorationPolicy) this.instance).getPublishDate();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getType() {
            return ((EpisodeDecorationPolicy) this.instance).getType();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
        public boolean hasPodcastSegments() {
            return ((EpisodeDecorationPolicy) this.instance).hasPodcastSegments();
        }

        public Builder mergePodcastSegments(PodcastSegmentsPolicy podcastSegmentsPolicy) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).mergePodcastSegments(podcastSegmentsPolicy);
            return this;
        }

        public Builder setAvailable(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setAvailable(z);
            return this;
        }

        public Builder setBackgroundable(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setBackgroundable(z);
            return this;
        }

        public Builder setCovers(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setCovers(z);
            return this;
        }

        public Builder setDescription(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setDescription(z);
            return this;
        }

        public Builder setFreezeFrames(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setFreezeFrames(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsMusicAndTalk(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setIsMusicAndTalk(z);
            return this;
        }

        public Builder setLanguage(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setLanguage(z);
            return this;
        }

        public Builder setLength(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setLength(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setManifestId(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setManifestId(z);
            return this;
        }

        public Builder setMediaTypeEnum(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setMediaTypeEnum(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setNumber(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setNumber(z);
            return this;
        }

        public Builder setPodcastSegments(PodcastSegmentsPolicy podcastSegmentsPolicy) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setPodcastSegments(podcastSegmentsPolicy);
            return this;
        }

        public Builder setPreviewId(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setPreviewId(z);
            return this;
        }

        public Builder setPreviewManifestId(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setPreviewManifestId(z);
            return this;
        }

        public Builder setPublishDate(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setPublishDate(z);
            return this;
        }

        public Builder setType(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setType(z);
            return this;
        }

        private Builder() {
            super(EpisodeDecorationPolicy.DEFAULT_INSTANCE);
        }

        public Builder setPodcastSegments(PodcastSegmentsPolicy.Builder builder) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setPodcastSegments(builder);
            return this;
        }
    }

    static {
        EpisodeDecorationPolicy episodeDecorationPolicy = new EpisodeDecorationPolicy();
        DEFAULT_INSTANCE = episodeDecorationPolicy;
        episodeDecorationPolicy.makeImmutable();
    }

    private EpisodeDecorationPolicy() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearAvailable() {
        this.available_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearBackgroundable() {
        this.backgroundable_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearCovers() {
        this.covers_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearDescription() {
        this.description_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearFreezeFrames() {
        this.freezeFrames_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIsExplicit() {
        this.isExplicit_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIsMusicAndTalk() {
        this.isMusicAndTalk_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearLanguage() {
        this.language_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearLength() {
        this.length_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearLink() {
        this.link_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearManifestId() {
        this.manifestId_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearMediaTypeEnum() {
        this.mediaTypeEnum_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearName() {
        this.name_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearNumber() {
        this.number_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPodcastSegments() {
        this.podcastSegments_ = null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPreviewId() {
        this.previewId_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPreviewManifestId() {
        this.previewManifestId_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPublishDate() {
        this.publishDate_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearType() {
        this.type_ = false;
    }

    public static EpisodeDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void mergePodcastSegments(PodcastSegmentsPolicy podcastSegmentsPolicy) {
        PodcastSegmentsPolicy podcastSegmentsPolicy2 = this.podcastSegments_;
        if (podcastSegmentsPolicy2 == null || podcastSegmentsPolicy2 == PodcastSegmentsPolicy.getDefaultInstance()) {
            this.podcastSegments_ = podcastSegmentsPolicy;
        } else {
            this.podcastSegments_ = (PodcastSegmentsPolicy) ((PodcastSegmentsPolicy.Builder) PodcastSegmentsPolicy.newBuilder(this.podcastSegments_).mergeFrom((PodcastSegmentsPolicy.Builder) podcastSegmentsPolicy)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.toBuilder();
    }

    public static EpisodeDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeDecorationPolicy parseFrom(ByteString byteString) {
        return (EpisodeDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static x<EpisodeDecorationPolicy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setAvailable(boolean z) {
        this.available_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setBackgroundable(boolean z) {
        this.backgroundable_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCovers(boolean z) {
        this.covers_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setDescription(boolean z) {
        this.description_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setFreezeFrames(boolean z) {
        this.freezeFrames_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIsExplicit(boolean z) {
        this.isExplicit_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIsMusicAndTalk(boolean z) {
        this.isMusicAndTalk_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setLanguage(boolean z) {
        this.language_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setLength(boolean z) {
        this.length_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setLink(boolean z) {
        this.link_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setManifestId(boolean z) {
        this.manifestId_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setMediaTypeEnum(boolean z) {
        this.mediaTypeEnum_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setName(boolean z) {
        this.name_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setNumber(boolean z) {
        this.number_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPodcastSegments(PodcastSegmentsPolicy podcastSegmentsPolicy) {
        podcastSegmentsPolicy.getClass();
        this.podcastSegments_ = podcastSegmentsPolicy;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPreviewId(boolean z) {
        this.previewId_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPreviewManifestId(boolean z) {
        this.previewManifestId_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPublishDate(boolean z) {
        this.publishDate_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setType(boolean z) {
        this.type_ = z;
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
                EpisodeDecorationPolicy episodeDecorationPolicy = (EpisodeDecorationPolicy) obj2;
                boolean z = this.link_;
                boolean z2 = episodeDecorationPolicy.link_;
                this.link_ = hVar.f(z, z, z2, z2);
                boolean z3 = this.length_;
                boolean z4 = episodeDecorationPolicy.length_;
                this.length_ = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.name_;
                boolean z6 = episodeDecorationPolicy.name_;
                this.name_ = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.manifestId_;
                boolean z8 = episodeDecorationPolicy.manifestId_;
                this.manifestId_ = hVar.f(z7, z7, z8, z8);
                boolean z9 = this.previewId_;
                boolean z10 = episodeDecorationPolicy.previewId_;
                this.previewId_ = hVar.f(z9, z9, z10, z10);
                boolean z11 = this.previewManifestId_;
                boolean z12 = episodeDecorationPolicy.previewManifestId_;
                this.previewManifestId_ = hVar.f(z11, z11, z12, z12);
                boolean z13 = this.description_;
                boolean z14 = episodeDecorationPolicy.description_;
                this.description_ = hVar.f(z13, z13, z14, z14);
                boolean z15 = this.publishDate_;
                boolean z16 = episodeDecorationPolicy.publishDate_;
                this.publishDate_ = hVar.f(z15, z15, z16, z16);
                boolean z17 = this.covers_;
                boolean z18 = episodeDecorationPolicy.covers_;
                this.covers_ = hVar.f(z17, z17, z18, z18);
                boolean z19 = this.freezeFrames_;
                boolean z20 = episodeDecorationPolicy.freezeFrames_;
                this.freezeFrames_ = hVar.f(z19, z19, z20, z20);
                boolean z21 = this.language_;
                boolean z22 = episodeDecorationPolicy.language_;
                this.language_ = hVar.f(z21, z21, z22, z22);
                boolean z23 = this.available_;
                boolean z24 = episodeDecorationPolicy.available_;
                this.available_ = hVar.f(z23, z23, z24, z24);
                boolean z25 = this.mediaTypeEnum_;
                boolean z26 = episodeDecorationPolicy.mediaTypeEnum_;
                this.mediaTypeEnum_ = hVar.f(z25, z25, z26, z26);
                boolean z27 = this.number_;
                boolean z28 = episodeDecorationPolicy.number_;
                this.number_ = hVar.f(z27, z27, z28, z28);
                boolean z29 = this.backgroundable_;
                boolean z30 = episodeDecorationPolicy.backgroundable_;
                this.backgroundable_ = hVar.f(z29, z29, z30, z30);
                boolean z31 = this.isExplicit_;
                boolean z32 = episodeDecorationPolicy.isExplicit_;
                this.isExplicit_ = hVar.f(z31, z31, z32, z32);
                boolean z33 = this.type_;
                boolean z34 = episodeDecorationPolicy.type_;
                this.type_ = hVar.f(z33, z33, z34, z34);
                boolean z35 = this.isMusicAndTalk_;
                boolean z36 = episodeDecorationPolicy.isMusicAndTalk_;
                this.isMusicAndTalk_ = hVar.f(z35, z35, z36, z36);
                this.podcastSegments_ = (PodcastSegmentsPolicy) hVar.i(this.podcastSegments_, episodeDecorationPolicy.podcastSegments_);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z37 = false;
                while (!z37) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 8:
                                this.link_ = gVar.h();
                                continue;
                            case 16:
                                this.length_ = gVar.h();
                                continue;
                            case 24:
                                this.name_ = gVar.h();
                                continue;
                            case 32:
                                this.manifestId_ = gVar.h();
                                continue;
                            case 40:
                                this.previewId_ = gVar.h();
                                continue;
                            case 48:
                                this.previewManifestId_ = gVar.h();
                                continue;
                            case 56:
                                this.description_ = gVar.h();
                                continue;
                            case 64:
                                this.publishDate_ = gVar.h();
                                continue;
                            case 72:
                                this.covers_ = gVar.h();
                                continue;
                            case 80:
                                this.freezeFrames_ = gVar.h();
                                continue;
                            case 88:
                                this.language_ = gVar.h();
                                continue;
                            case 96:
                                this.available_ = gVar.h();
                                continue;
                            case 104:
                                this.mediaTypeEnum_ = gVar.h();
                                continue;
                            case 112:
                                this.number_ = gVar.h();
                                continue;
                            case 120:
                                this.backgroundable_ = gVar.h();
                                continue;
                            case 128:
                                this.isExplicit_ = gVar.h();
                                continue;
                            case 136:
                                this.type_ = gVar.h();
                                continue;
                            case 144:
                                this.isMusicAndTalk_ = gVar.h();
                                continue;
                            case 154:
                                PodcastSegmentsPolicy podcastSegmentsPolicy = this.podcastSegments_;
                                PodcastSegmentsPolicy.Builder builder = podcastSegmentsPolicy != null ? (PodcastSegmentsPolicy.Builder) podcastSegmentsPolicy.toBuilder() : null;
                                PodcastSegmentsPolicy podcastSegmentsPolicy2 = (PodcastSegmentsPolicy) gVar.o(PodcastSegmentsPolicy.parser(), kVar);
                                this.podcastSegments_ = podcastSegmentsPolicy2;
                                if (builder != null) {
                                    builder.mergeFrom((PodcastSegmentsPolicy.Builder) podcastSegmentsPolicy2);
                                    this.podcastSegments_ = (PodcastSegmentsPolicy) builder.buildPartial();
                                } else {
                                    continue;
                                }
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
                        }
                        z37 = true;
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
                return new EpisodeDecorationPolicy();
            case 5:
                return new Builder(null);
            case 6:
                break;
            case 7:
                if (PARSER == null) {
                    synchronized (EpisodeDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getAvailable() {
        return this.available_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getBackgroundable() {
        return this.backgroundable_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getCovers() {
        return this.covers_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getDescription() {
        return this.description_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getFreezeFrames() {
        return this.freezeFrames_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getLanguage() {
        return this.language_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getManifestId() {
        return this.manifestId_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getMediaTypeEnum() {
        return this.mediaTypeEnum_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getNumber() {
        return this.number_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public PodcastSegmentsPolicy getPodcastSegments() {
        PodcastSegmentsPolicy podcastSegmentsPolicy = this.podcastSegments_;
        return podcastSegmentsPolicy == null ? PodcastSegmentsPolicy.getDefaultInstance() : podcastSegmentsPolicy;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getPreviewId() {
        return this.previewId_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getPreviewManifestId() {
        return this.previewManifestId_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getPublishDate() {
        return this.publishDate_;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.link_;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        boolean z2 = this.length_;
        if (z2) {
            i2 += CodedOutputStream.d(2, z2);
        }
        boolean z3 = this.name_;
        if (z3) {
            i2 += CodedOutputStream.d(3, z3);
        }
        boolean z4 = this.manifestId_;
        if (z4) {
            i2 += CodedOutputStream.d(4, z4);
        }
        boolean z5 = this.previewId_;
        if (z5) {
            i2 += CodedOutputStream.d(5, z5);
        }
        boolean z6 = this.previewManifestId_;
        if (z6) {
            i2 += CodedOutputStream.d(6, z6);
        }
        boolean z7 = this.description_;
        if (z7) {
            i2 += CodedOutputStream.d(7, z7);
        }
        boolean z8 = this.publishDate_;
        if (z8) {
            i2 += CodedOutputStream.d(8, z8);
        }
        boolean z9 = this.covers_;
        if (z9) {
            i2 += CodedOutputStream.d(9, z9);
        }
        boolean z10 = this.freezeFrames_;
        if (z10) {
            i2 += CodedOutputStream.d(10, z10);
        }
        boolean z11 = this.language_;
        if (z11) {
            i2 += CodedOutputStream.d(11, z11);
        }
        boolean z12 = this.available_;
        if (z12) {
            i2 += CodedOutputStream.d(12, z12);
        }
        boolean z13 = this.mediaTypeEnum_;
        if (z13) {
            i2 += CodedOutputStream.d(13, z13);
        }
        boolean z14 = this.number_;
        if (z14) {
            i2 += CodedOutputStream.d(14, z14);
        }
        boolean z15 = this.backgroundable_;
        if (z15) {
            i2 += CodedOutputStream.d(15, z15);
        }
        boolean z16 = this.isExplicit_;
        if (z16) {
            i2 += CodedOutputStream.d(16, z16);
        }
        boolean z17 = this.type_;
        if (z17) {
            i2 += CodedOutputStream.d(17, z17);
        }
        boolean z18 = this.isMusicAndTalk_;
        if (z18) {
            i2 += CodedOutputStream.d(18, z18);
        }
        if (this.podcastSegments_ != null) {
            i2 += CodedOutputStream.n(19, getPodcastSegments());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getType() {
        return this.type_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeDecorationPolicyOrBuilder
    public boolean hasPodcastSegments() {
        return this.podcastSegments_ != null;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.link_;
        if (z) {
            codedOutputStream.A(1, z);
        }
        boolean z2 = this.length_;
        if (z2) {
            codedOutputStream.A(2, z2);
        }
        boolean z3 = this.name_;
        if (z3) {
            codedOutputStream.A(3, z3);
        }
        boolean z4 = this.manifestId_;
        if (z4) {
            codedOutputStream.A(4, z4);
        }
        boolean z5 = this.previewId_;
        if (z5) {
            codedOutputStream.A(5, z5);
        }
        boolean z6 = this.previewManifestId_;
        if (z6) {
            codedOutputStream.A(6, z6);
        }
        boolean z7 = this.description_;
        if (z7) {
            codedOutputStream.A(7, z7);
        }
        boolean z8 = this.publishDate_;
        if (z8) {
            codedOutputStream.A(8, z8);
        }
        boolean z9 = this.covers_;
        if (z9) {
            codedOutputStream.A(9, z9);
        }
        boolean z10 = this.freezeFrames_;
        if (z10) {
            codedOutputStream.A(10, z10);
        }
        boolean z11 = this.language_;
        if (z11) {
            codedOutputStream.A(11, z11);
        }
        boolean z12 = this.available_;
        if (z12) {
            codedOutputStream.A(12, z12);
        }
        boolean z13 = this.mediaTypeEnum_;
        if (z13) {
            codedOutputStream.A(13, z13);
        }
        boolean z14 = this.number_;
        if (z14) {
            codedOutputStream.A(14, z14);
        }
        boolean z15 = this.backgroundable_;
        if (z15) {
            codedOutputStream.A(15, z15);
        }
        boolean z16 = this.isExplicit_;
        if (z16) {
            codedOutputStream.A(16, z16);
        }
        boolean z17 = this.type_;
        if (z17) {
            codedOutputStream.A(17, z17);
        }
        boolean z18 = this.isMusicAndTalk_;
        if (z18) {
            codedOutputStream.A(18, z18);
        }
        if (this.podcastSegments_ != null) {
            codedOutputStream.M(19, getPodcastSegments());
        }
    }

    public static Builder newBuilder(EpisodeDecorationPolicy episodeDecorationPolicy) {
        return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom((Builder) episodeDecorationPolicy);
    }

    public static EpisodeDecorationPolicy parseDelimitedFrom(InputStream inputStream, k kVar) {
        return (EpisodeDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static EpisodeDecorationPolicy parseFrom(ByteString byteString, k kVar) {
        return (EpisodeDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, kVar);
    }

    public static EpisodeDecorationPolicy parseFrom(byte[] bArr) {
        return (EpisodeDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPodcastSegments(PodcastSegmentsPolicy.Builder builder) {
        this.podcastSegments_ = (PodcastSegmentsPolicy) builder.build();
    }

    public static EpisodeDecorationPolicy parseFrom(byte[] bArr, k kVar) {
        return (EpisodeDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, kVar);
    }

    public static EpisodeDecorationPolicy parseFrom(InputStream inputStream) {
        return (EpisodeDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeDecorationPolicy parseFrom(InputStream inputStream, k kVar) {
        return (EpisodeDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static EpisodeDecorationPolicy parseFrom(g gVar) {
        return (EpisodeDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static EpisodeDecorationPolicy parseFrom(g gVar, k kVar) {
        return (EpisodeDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, kVar);
    }
}
