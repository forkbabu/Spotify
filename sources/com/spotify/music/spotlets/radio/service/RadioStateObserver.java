package com.spotify.music.spotlets.radio.service;

import com.spotify.music.spotlets.radio.model.RadioStationsModel;

public interface RadioStateObserver {

    public enum FailureState {
        CLUSTER_FEEDBACK_FAILURE
    }

    void a(j0 j0Var);

    void b(FailureState failureState);

    void c(RadioStationsModel radioStationsModel);
}
