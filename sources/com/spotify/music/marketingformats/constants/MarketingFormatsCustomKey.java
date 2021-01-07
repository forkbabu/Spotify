package com.spotify.music.marketingformats.constants;

public enum MarketingFormatsCustomKey {
    KEY_ACCENT_COLOR("accentColor"),
    KEY_COLOR("color"),
    KEY_CREATOR("creatorName"),
    KEY_CREATOR_URL("creatorImageUrl"),
    KEY_CONTEXT_URI("contextUri"),
    KEY_DIALOG_IMAGE_URI("dialogImageUri"),
    KEY_ENTITY_URI("entityUri"),
    KEY_PAGE_URI("page_uri"),
    KEY_SECONDARY_ACCENT_COLOR("secondaryAccentColor"),
    KEY_SHARE_IMAGE_URI("shareImageUri"),
    KEY_SHARE_IMAGE_URI_LOCALES("shareImageUriLocales"),
    KEY_TITLE_IMAGE_URL("titleImageUrl"),
    KEY_URI("uri");
    
    private final String key;

    private MarketingFormatsCustomKey(String str) {
        this.key = str;
    }

    public final String d() {
        return this.key;
    }
}
