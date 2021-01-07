package com.spotify.music.spotlets.radio.model;

import android.os.Parcelable;
import java.util.List;

public abstract class c implements Parcelable {

    /* access modifiers changed from: package-private */
    public static class a extends apd<RadioStationModel> {
        protected a() {
            super(RadioStationModel.CREATOR);
        }
    }

    public static c a(List<RadioStationModel> list) {
        return new b(list);
    }

    public abstract List<RadioStationModel> b();
}
