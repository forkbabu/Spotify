package com.comscore.streaming;

import com.comscore.util.ArrayUtils;
import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

public class ContentMetadata extends AssetMetadata {

    public static class Builder extends CppJavaBinder {
        long a;

        public Builder() {
            try {
                this.a = ContentMetadata.newCppInstanceBuilderNative();
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public ContentMetadata build() {
            try {
                return new ContentMetadata(ContentMetadata.buildNative(this.a));
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return new ContentMetadata(0);
            }
        }

        public Builder carryTvAdvertisementLoad(boolean z) {
            try {
                ContentMetadata.carryTvAdvertisementLoadNative(this.a, z);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder classifyAsAudioStream(boolean z) {
            try {
                ContentMetadata.classifyAsAudioStreamNative(this.a, z);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder classifyAsCompleteEpisode(boolean z) {
            try {
                ContentMetadata.classifyAsCompleteEpisodeNative(this.a, z);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder clipUrl(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.clipUrlNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder customLabels(Map<String, String> map) {
            try {
                ContentMetadata.customLabelsNative(this.a, map);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder dateOfDigitalAiring(int i, int i2, int i3) {
            try {
                ContentMetadata.dateOfDigitalAiringNative(this.a, i, i2, i3);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder dateOfProduction(int i, int i2, int i3) {
            try {
                ContentMetadata.dateOfProductionNative(this.a, i, i2, i3);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder dateOfTvAiring(int i, int i2, int i3) {
            try {
                ContentMetadata.dateOfTvAiringNative(this.a, i, i2, i3);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder deliveryAdvertisementCapability(int i) {
            if (!ArrayUtils.contains(ContentDeliveryAdvertisementCapability.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                ContentMetadata.deliveryAdvertisementCapabilityNative(this.a, i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder deliveryComposition(int i) {
            if (!ArrayUtils.contains(ContentDeliveryComposition.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                ContentMetadata.deliveryCompositionNative(this.a, i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder deliveryMode(int i) {
            if (!ArrayUtils.contains(ContentDeliveryMode.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                ContentMetadata.deliveryModeNative(this.a, i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder deliverySubscriptionType(int i) {
            if (!ArrayUtils.contains(ContentDeliverySubscriptionType.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                ContentMetadata.deliverySubscriptionTypeNative(this.a, i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        /* access modifiers changed from: protected */
        @Override // com.comscore.util.cpp.CppJavaBinder
        public void destroyCppObject() {
            try {
                ContentMetadata.destroyCppInstanceBuilderNative(this.a);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public Builder dictionaryClassificationC3(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.dictionaryClassificationC3Native(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder dictionaryClassificationC4(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.dictionaryClassificationC4Native(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder dictionaryClassificationC6(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.dictionaryClassificationC6Native(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder distributionModel(int i) {
            if (!ArrayUtils.contains(ContentDistributionModel.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                ContentMetadata.distributionModelNative(this.a, i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder episodeId(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.episodeIdNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder episodeNumber(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.episodeNumberNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder episodeSeasonNumber(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.episodeSeasonNumberNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder episodeTitle(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.episodeTitleNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder fee(int i) {
            try {
                ContentMetadata.feeNative(this.a, i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder feedType(int i) {
            if (!ArrayUtils.contains(ContentFeedType.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                ContentMetadata.feedTypeNative(this.a, i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder genreId(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.genreIdNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder genreName(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.genreNameNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder length(long j) {
            try {
                ContentMetadata.lengthNative(this.a, j);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder mediaFormat(int i) {
            if (!ArrayUtils.contains(ContentMediaFormat.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                ContentMetadata.mediaFormatNative(this.a, i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder mediaType(int i) {
            if (!ArrayUtils.contains(ContentType.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                ContentMetadata.mediaTypeNative(this.a, i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder networkAffiliate(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.networkAffiliateNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder playlistTitle(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.playlistTitleNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder programId(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.programIdNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder programTitle(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.programTitleNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder publisherName(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.publisherNameNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder setStack(String str, StackedContentMetadata stackedContentMetadata) {
            try {
                ContentMetadata.setStackNative(this.a, str, stackedContentMetadata.a());
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder stationCode(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.stationCodeNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder stationTitle(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.stationTitleNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder timeOfDigitalAiring(int i, int i2) {
            try {
                ContentMetadata.timeOfDigitalAiringNative(this.a, i, i2);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder timeOfProduction(int i, int i2) {
            try {
                ContentMetadata.timeOfProductionNative(this.a, i, i2);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder timeOfTvAiring(int i, int i2) {
            try {
                ContentMetadata.timeOfTvAiringNative(this.a, i, i2);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder totalSegments(int i) {
            try {
                ContentMetadata.totalSegmentsNative(this.a, i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder uniqueId(String str) {
            if (str == null) {
                return this;
            }
            try {
                ContentMetadata.uniqueIdNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder videoDimensions(int i, int i2) {
            try {
                ContentMetadata.videoDimensionsNative(this.a, i, i2);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }
    }

    protected ContentMetadata(long j) {
        super(j);
    }

    /* access modifiers changed from: private */
    public static native long buildNative(long j);

    /* access modifiers changed from: private */
    public static native void carryTvAdvertisementLoadNative(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void classifyAsAudioStreamNative(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void classifyAsCompleteEpisodeNative(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void clipUrlNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void customLabelsNative(long j, Map<String, String> map);

    /* access modifiers changed from: private */
    public static native void dateOfDigitalAiringNative(long j, int i, int i2, int i3);

    /* access modifiers changed from: private */
    public static native void dateOfProductionNative(long j, int i, int i2, int i3);

    /* access modifiers changed from: private */
    public static native void dateOfTvAiringNative(long j, int i, int i2, int i3);

    /* access modifiers changed from: private */
    public static native void deliveryAdvertisementCapabilityNative(long j, int i);

    /* access modifiers changed from: private */
    public static native void deliveryCompositionNative(long j, int i);

    /* access modifiers changed from: private */
    public static native void deliveryModeNative(long j, int i);

    /* access modifiers changed from: private */
    public static native void deliverySubscriptionTypeNative(long j, int i);

    /* access modifiers changed from: private */
    public static native void destroyCppInstanceBuilderNative(long j);

    private native void destroyCppInstanceNative(long j);

    /* access modifiers changed from: private */
    public static native void dictionaryClassificationC3Native(long j, String str);

    /* access modifiers changed from: private */
    public static native void dictionaryClassificationC4Native(long j, String str);

    /* access modifiers changed from: private */
    public static native void dictionaryClassificationC6Native(long j, String str);

    /* access modifiers changed from: private */
    public static native void distributionModelNative(long j, int i);

    /* access modifiers changed from: private */
    public static native void episodeIdNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void episodeNumberNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void episodeSeasonNumberNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void episodeTitleNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void feeNative(long j, int i);

    /* access modifiers changed from: private */
    public static native void feedTypeNative(long j, int i);

    /* access modifiers changed from: private */
    public static native void genreIdNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void genreNameNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void lengthNative(long j, long j2);

    /* access modifiers changed from: private */
    public static native void mediaFormatNative(long j, int i);

    /* access modifiers changed from: private */
    public static native void mediaTypeNative(long j, int i);

    /* access modifiers changed from: private */
    public static native void networkAffiliateNative(long j, String str);

    /* access modifiers changed from: private */
    public static native long newCppInstanceBuilderNative();

    /* access modifiers changed from: private */
    public static native void playlistTitleNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void programIdNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void programTitleNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void publisherNameNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void setStackNative(long j, String str, long j2);

    /* access modifiers changed from: private */
    public static native void stationCodeNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void stationTitleNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void timeOfDigitalAiringNative(long j, int i, int i2);

    /* access modifiers changed from: private */
    public static native void timeOfProductionNative(long j, int i, int i2);

    /* access modifiers changed from: private */
    public static native void timeOfTvAiringNative(long j, int i, int i2);

    /* access modifiers changed from: private */
    public static native void totalSegmentsNative(long j, int i);

    /* access modifiers changed from: private */
    public static native void uniqueIdNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void videoDimensionsNative(long j, int i, int i2);

    /* access modifiers changed from: protected */
    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        destroyCppInstanceNative(b());
    }
}
