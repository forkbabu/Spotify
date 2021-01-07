package com.spotify.music.appprotocol.superbird.tts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class TtsAppProtocol implements JacksonModel {

    public static final class Tts extends TtsAppProtocol {
        private final String file;
        private final String utterance;

        public Tts(@JsonProperty("utterance") String str, @JsonProperty("file") String str2) {
            super(null);
            this.utterance = str;
            this.file = str2;
        }

        public static /* synthetic */ Tts copy$default(Tts tts, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tts.utterance;
            }
            if ((i & 2) != 0) {
                str2 = tts.file;
            }
            return tts.copy(str, str2);
        }

        public final String component1() {
            return this.utterance;
        }

        public final String component2() {
            return this.file;
        }

        public final Tts copy(@JsonProperty("utterance") String str, @JsonProperty("file") String str2) {
            return new Tts(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tts)) {
                return false;
            }
            Tts tts = (Tts) obj;
            return h.a(this.utterance, tts.utterance) && h.a(this.file, tts.file);
        }

        public final String getFile() {
            return this.file;
        }

        public final String getUtterance() {
            return this.utterance;
        }

        public int hashCode() {
            String str = this.utterance;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.file;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Tts(utterance=");
            V0.append(this.utterance);
            V0.append(", file=");
            return je.I0(V0, this.file, ")");
        }
    }

    private TtsAppProtocol() {
    }

    public /* synthetic */ TtsAppProtocol(f fVar) {
        this();
    }
}
