package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.playbackprogress;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface PlaybackProgress extends Element {

    public static final class DefaultImpls {
        public static void onEvent(PlaybackProgress playbackProgress, nmf<?, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(playbackProgress, nmf);
        }
    }

    public static final class Model {
        private final boolean isPlayed;
        private final float progress;

        public Model(boolean z, float f) {
            this.isPlayed = z;
            this.progress = f;
        }

        public static /* synthetic */ Model copy$default(Model model, boolean z, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                z = model.isPlayed;
            }
            if ((i & 2) != 0) {
                f = model.progress;
            }
            return model.copy(z, f);
        }

        public final boolean component1() {
            return this.isPlayed;
        }

        public final float component2() {
            return this.progress;
        }

        public final Model copy(boolean z, float f) {
            return new Model(z, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return this.isPlayed == model.isPlayed && Float.compare(this.progress, model.progress) == 0;
        }

        public final float getProgress() {
            return this.progress;
        }

        public int hashCode() {
            boolean z = this.isPlayed;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return Float.floatToIntBits(this.progress) + (i * 31);
        }

        public final boolean isPlayed() {
            return this.isPlayed;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(isPlayed=");
            V0.append(this.isPlayed);
            V0.append(", progress=");
            V0.append(this.progress);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(boolean z, float f, int i, kotlin.jvm.internal.f fVar) {
            this(z, (i & 2) != 0 ? 0.0f : f);
        }
    }
}
