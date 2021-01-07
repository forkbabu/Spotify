package com.spotify.music.features.yourlibrary.musicpages.datasource;

public final /* synthetic */ class i2 implements m4 {
    public static final /* synthetic */ i2 a = new i2();

    private /* synthetic */ i2() {
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.m4
    public final boolean a(x3 x3Var) {
        String str = x3Var.h().get("collapse_recommended_artists_section");
        if (str != null) {
            return true ^ Boolean.parseBoolean(str);
        }
        return true;
    }
}
