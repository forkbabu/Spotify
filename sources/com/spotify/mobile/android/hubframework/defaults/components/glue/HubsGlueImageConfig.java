package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

public enum HubsGlueImageConfig implements HubsGlueImageDelegate.ImageConfig {
    THUMBNAIL(HubsGlueImageDelegate.ImageConfig.IconSize.LARGE, HubsGlueImageDelegate.ImageConfig.ImageSize.SMALL),
    CARD(HubsGlueImageDelegate.ImageConfig.IconSize.SMALL, HubsGlueImageDelegate.ImageConfig.ImageSize.LARGE);
    
    private final HubsGlueImageDelegate.ImageConfig.IconSize mIconSize;
    private final HubsGlueImageDelegate.ImageConfig.ImageSize mImageSize;

    private HubsGlueImageConfig(HubsGlueImageDelegate.ImageConfig.IconSize iconSize, HubsGlueImageDelegate.ImageConfig.ImageSize imageSize) {
        this.mIconSize = iconSize;
        this.mImageSize = imageSize;
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig
    public HubsGlueImageDelegate.ImageConfig.IconSize d() {
        return this.mIconSize;
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig
    public HubsGlueImageDelegate.ImageConfig.ImageSize g() {
        return this.mImageSize;
    }
}
