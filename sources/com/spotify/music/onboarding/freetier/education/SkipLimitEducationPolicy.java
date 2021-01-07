package com.spotify.music.onboarding.freetier.education;

public interface SkipLimitEducationPolicy {

    public enum Result {
        NO_MESSAGE,
        SHOW_FIRST_SKIP_LIMIT_MESSAGE,
        SHOW_SUBSEQUENT_SKIP_LIMIT_MESSAGE
    }

    Result a();
}
