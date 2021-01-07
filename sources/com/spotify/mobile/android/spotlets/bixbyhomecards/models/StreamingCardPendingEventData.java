package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

public class StreamingCardPendingEventData extends StreamingCardData {
    private final String mLoadingText;
    private final String mPendingEventString;
    private final StreamingCardData mStreamingCardData;

    public StreamingCardPendingEventData(StreamingCardData streamingCardData, String str, String str2) {
        this.mStreamingCardData = streamingCardData;
        this.mPendingEventString = str;
        this.mLoadingText = str2;
    }

    private boolean shouldShowLoadingOnMainContentItem() {
        return "SPAGE_ON_MEDIA_NEXT".equals(this.mPendingEventString) || "SPAGE_ON_MEDIA_PAUSE".equals(this.mPendingEventString) || "SPAGE_ON_MEDIA_PLAY".equals(this.mPendingEventString) || "SPAGE_ON_MEDIA_PREV".equals(this.mPendingEventString) || "EVENT_MAIN_ITEM".equals(this.mPendingEventString);
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    public boolean isCachedData() {
        return true;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    public boolean isNextButtonDisabled() {
        return true;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    public boolean isPaused() {
        return true;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    public boolean isPlaying() {
        return false;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    public boolean isPrevButtonDisabled() {
        return true;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    public ContentItem listItem1() {
        ContentItem listItem1 = this.mStreamingCardData.listItem1();
        return "EVENT_LIST_1".equals(this.mPendingEventString) ? ContentItem.builder().contentUri(listItem1.contentUri()).title(listItem1.title()).metadata1(this.mLoadingText).metadata2(listItem1.metadata2()).imageUrl(listItem1.imageUrl()).intentDataUriString(listItem1.intentDataUriString()).build() : listItem1;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    public ContentItem listItem2() {
        ContentItem listItem2 = this.mStreamingCardData.listItem2();
        return "EVENT_LIST_2".equals(this.mPendingEventString) ? ContentItem.builder().contentUri(listItem2.contentUri()).title(listItem2.title()).metadata1(this.mLoadingText).metadata2(listItem2.metadata2()).imageUrl(listItem2.imageUrl()).intentDataUriString(listItem2.intentDataUriString()).build() : listItem2;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    public ContentItem mainContentItem() {
        ContentItem mainContentItem = this.mStreamingCardData.mainContentItem();
        return shouldShowLoadingOnMainContentItem() ? ContentItem.builder().contentUri(mainContentItem.contentUri()).title(mainContentItem.title()).metadata1(mainContentItem.metadata1()).metadata2(this.mLoadingText).imageUrl(mainContentItem.imageUrl()).intentDataUriString(mainContentItem.intentDataUriString()).build() : mainContentItem;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    public String trackUri() {
        return null;
    }
}
