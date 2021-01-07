package com.spotify.music.ads.voice.domain;

public abstract class w {

    public static final class a extends w {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "MicrophoneOff{}";
        }
    }

    public static final class b extends w {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "MicrophoneOn{}";
        }
    }

    public static final class c extends w {
        c() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VoiceoverOn{}";
        }
    }

    w() {
    }

    public static w a() {
        return new c();
    }
}
