package com.spotify.music.features.profile.saveprofile.domain;

import java.util.List;

public enum SaveProfileTask {
    GET_USERNAME(1),
    GET_CORE_PROFILE_DATA(1),
    UPLOAD_IMAGE(100),
    SET_IMAGE(5),
    REMOVE_IMAGE(5),
    SET_DISPLAY_NAME(5),
    CONFIRM_CHANGES(5),
    NOTHING(0);
    
    public final int weight;

    private SaveProfileTask(int i) {
        this.weight = i;
    }

    public static int d(List<SaveProfileTask> list) {
        int i = 0;
        for (SaveProfileTask saveProfileTask : list) {
            i += saveProfileTask.weight;
        }
        return i;
    }
}
