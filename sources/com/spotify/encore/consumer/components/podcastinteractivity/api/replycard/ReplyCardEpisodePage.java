package com.spotify.encore.consumer.components.podcastinteractivity.api.replycard;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ReplyCardEpisodePage extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultReplyCardEpisodePageConfiguration implements Configuration {
            public static final DefaultReplyCardEpisodePageConfiguration INSTANCE = new DefaultReplyCardEpisodePageConfiguration();

            private DefaultReplyCardEpisodePageConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(ReplyCardEpisodePage replyCardEpisodePage, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(replyCardEpisodePage, nmf);
        }
    }

    public enum Events {
        CardClicked
    }

    public static final class Model {
        private final Artwork.Model artwork;
        private final String name;
        private final String repliedAt;
        private final String response;

        public Model() {
            this(null, null, null, null, 15, null);
        }

        public Model(String str, String str2, String str3, Artwork.Model model) {
            h.e(model, "artwork");
            this.response = str;
            this.repliedAt = str2;
            this.name = str3;
            this.artwork = model;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, Artwork.Model model2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.response;
            }
            if ((i & 2) != 0) {
                str2 = model.repliedAt;
            }
            if ((i & 4) != 0) {
                str3 = model.name;
            }
            if ((i & 8) != 0) {
                model2 = model.artwork;
            }
            return model.copy(str, str2, str3, model2);
        }

        public final String component1() {
            return this.response;
        }

        public final String component2() {
            return this.repliedAt;
        }

        public final String component3() {
            return this.name;
        }

        public final Artwork.Model component4() {
            return this.artwork;
        }

        public final Model copy(String str, String str2, String str3, Artwork.Model model) {
            h.e(model, "artwork");
            return new Model(str, str2, str3, model);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.response, model.response) && h.a(this.repliedAt, model.repliedAt) && h.a(this.name, model.name) && h.a(this.artwork, model.artwork);
        }

        public final Artwork.Model getArtwork() {
            return this.artwork;
        }

        public final String getName() {
            return this.name;
        }

        public final String getRepliedAt() {
            return this.repliedAt;
        }

        public final String getResponse() {
            return this.response;
        }

        public int hashCode() {
            String str = this.response;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.repliedAt;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.name;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Artwork.Model model = this.artwork;
            if (model != null) {
                i = model.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(response=");
            V0.append(this.response);
            V0.append(", repliedAt=");
            V0.append(this.repliedAt);
            V0.append(", name=");
            V0.append(this.name);
            V0.append(", artwork=");
            V0.append(this.artwork);
            V0.append(")");
            return V0.toString();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Model(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.spotify.encore.consumer.elements.artwork.Artwork.Model r12, int r13, kotlin.jvm.internal.f r14) {
            /*
                r8 = this;
                r14 = r13 & 1
                r0 = 0
                if (r14 == 0) goto L_0x0006
                r9 = r0
            L_0x0006:
                r14 = r13 & 2
                if (r14 == 0) goto L_0x000b
                r10 = r0
            L_0x000b:
                r14 = r13 & 4
                if (r14 == 0) goto L_0x0010
                r11 = r0
            L_0x0010:
                r13 = r13 & 8
                if (r13 == 0) goto L_0x002b
                com.spotify.encore.consumer.elements.artwork.Artwork$Model$User r12 = new com.spotify.encore.consumer.elements.artwork.Artwork$Model$User
                com.spotify.encore.consumer.elements.artwork.Artwork$ImageData r2 = new com.spotify.encore.consumer.elements.artwork.Artwork$ImageData
                r2.<init>(r0)
                if (r11 == 0) goto L_0x001f
                r3 = r11
                goto L_0x0022
            L_0x001f:
                java.lang.String r13 = ""
                r3 = r13
            L_0x0022:
                r4 = 0
                r5 = 0
                r6 = 8
                r7 = 0
                r1 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7)
            L_0x002b:
                r8.<init>(r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.encore.consumer.components.podcastinteractivity.api.replycard.ReplyCardEpisodePage.Model.<init>(java.lang.String, java.lang.String, java.lang.String, com.spotify.encore.consumer.elements.artwork.Artwork$Model, int, kotlin.jvm.internal.f):void");
        }
    }
}
