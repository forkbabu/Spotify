package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.markasplayed;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface MarkAsPlayedButton extends Element<Model, f> {

    public static final class DefaultImpls {
        public static void onEvent(MarkAsPlayedButton markAsPlayedButton, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(markAsPlayedButton, nmf);
        }
    }

    public static final class Model {
        private final String episodeName;

        public Model(String str) {
            h.e(str, "episodeName");
            this.episodeName = str;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.episodeName;
            }
            return model.copy(str);
        }

        public final String component1() {
            return this.episodeName;
        }

        public final Model copy(String str) {
            h.e(str, "episodeName");
            return new Model(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Model) && h.a(this.episodeName, ((Model) obj).episodeName);
            }
            return true;
        }

        public final String getEpisodeName() {
            return this.episodeName;
        }

        public int hashCode() {
            String str = this.episodeName;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Model(episodeName="), this.episodeName, ")");
        }
    }
}
