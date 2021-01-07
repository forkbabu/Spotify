package com.spotify.music.podcastinteractivity.di;

public interface PollContainerPageIdProvider {

    public enum ContainerPageId {
        NPV,
        EPISODE_PAGE,
        POLL_FRAGMENT,
        UNKNOWN
    }

    ContainerPageId get();
}
