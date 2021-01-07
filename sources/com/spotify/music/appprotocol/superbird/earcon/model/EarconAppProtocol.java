package com.spotify.music.appprotocol.superbird.earcon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class EarconAppProtocol implements JacksonModel {

    public static final class PlayEarconRequest extends EarconAppProtocol {
        private final String earcon;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PlayEarconRequest(@JsonProperty("earcon") String str) {
            super(null);
            h.e(str, "earcon");
            this.earcon = str;
        }

        public static /* synthetic */ PlayEarconRequest copy$default(PlayEarconRequest playEarconRequest, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = playEarconRequest.earcon;
            }
            return playEarconRequest.copy(str);
        }

        public final String component1() {
            return this.earcon;
        }

        public final PlayEarconRequest copy(@JsonProperty("earcon") String str) {
            h.e(str, "earcon");
            return new PlayEarconRequest(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof PlayEarconRequest) && h.a(this.earcon, ((PlayEarconRequest) obj).earcon);
            }
            return true;
        }

        public final String getEarcon() {
            return this.earcon;
        }

        public int hashCode() {
            String str = this.earcon;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("PlayEarconRequest(earcon="), this.earcon, ")");
        }
    }

    private EarconAppProtocol() {
    }

    public /* synthetic */ EarconAppProtocol(f fVar) {
        this();
    }
}
