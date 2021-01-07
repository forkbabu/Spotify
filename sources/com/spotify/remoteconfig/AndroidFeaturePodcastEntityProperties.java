package com.spotify.remoteconfig;

public abstract class AndroidFeaturePodcastEntityProperties implements n0e {

    public enum RolloutPodcastShowpageHeader implements m0e {
        LEGACY("legacy"),
        CONDENSED("condensed");
        
        final String value;

        private RolloutPodcastShowpageHeader(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract RolloutPodcastShowpageHeader c();
}
