package com.spotify.music.navigation;

public enum BackNavigationInteractionType {
    HW_BACK_BUTTON_PRESSED("nav-back-hardware-back-button"),
    UP_BUTTON_PRESSED("nav-back-up-toolbar-button"),
    NO_BUTTON_PRESSED("no-op");
    
    private final String mInteractionType;

    private BackNavigationInteractionType(String str) {
        this.mInteractionType = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mInteractionType;
    }
}
