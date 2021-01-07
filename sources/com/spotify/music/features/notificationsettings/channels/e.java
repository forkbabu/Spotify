package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.features.notificationsettings.common.Channel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class e {

    public static final class a extends e {
        private final Channel a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Channel channel, int i) {
            super(null);
            h.e(channel, "selectedChannel");
            this.a = channel;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final Channel b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            Channel channel = this.a;
            return ((channel != null ? channel.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogUBIAndNavigateToChannelCategories(selectedChannel=");
            V0.append(this.a);
            V0.append(", position=");
            return je.B0(V0, this.b, ")");
        }
    }

    public e(f fVar) {
    }
}
