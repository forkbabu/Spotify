package com.spotify.encore.consumer.components.podcastinteractivity.api.replyrow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ReplyRowQnA extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultReplyRowQnAConfiguration implements Configuration {
            public static final DefaultReplyRowQnAConfiguration INSTANCE = new DefaultReplyRowQnAConfiguration();

            private DefaultReplyRowQnAConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(ReplyRowQnA replyRowQnA, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(replyRowQnA, nmf);
        }
    }

    public enum Events {
        ReplyButtonClicked,
        RepliedButtonClicked
    }

    public static final class Model {
        private final boolean hasUserResponse;
        private final boolean isUserResponseFeatured;
        private final int totalResponses;

        public Model() {
            this(0, false, false, 7, null);
        }

        public Model(int i, boolean z, boolean z2) {
            this.totalResponses = i;
            this.hasUserResponse = z;
            this.isUserResponseFeatured = z2;
        }

        public static /* synthetic */ Model copy$default(Model model, int i, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = model.totalResponses;
            }
            if ((i2 & 2) != 0) {
                z = model.hasUserResponse;
            }
            if ((i2 & 4) != 0) {
                z2 = model.isUserResponseFeatured;
            }
            return model.copy(i, z, z2);
        }

        public final int component1() {
            return this.totalResponses;
        }

        public final boolean component2() {
            return this.hasUserResponse;
        }

        public final boolean component3() {
            return this.isUserResponseFeatured;
        }

        public final Model copy(int i, boolean z, boolean z2) {
            return new Model(i, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return this.totalResponses == model.totalResponses && this.hasUserResponse == model.hasUserResponse && this.isUserResponseFeatured == model.isUserResponseFeatured;
        }

        public final boolean getHasUserResponse() {
            return this.hasUserResponse;
        }

        public final int getTotalResponses() {
            return this.totalResponses;
        }

        public int hashCode() {
            int i = this.totalResponses * 31;
            boolean z = this.hasUserResponse;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (i + i3) * 31;
            boolean z2 = this.isUserResponseFeatured;
            if (!z2) {
                i2 = z2 ? 1 : 0;
            }
            return i6 + i2;
        }

        public final boolean isUserResponseFeatured() {
            return this.isUserResponseFeatured;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(totalResponses=");
            V0.append(this.totalResponses);
            V0.append(", hasUserResponse=");
            V0.append(this.hasUserResponse);
            V0.append(", isUserResponseFeatured=");
            return je.P0(V0, this.isUserResponseFeatured, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(int i, boolean z, boolean z2, int i2, kotlin.jvm.internal.f fVar) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2);
        }
    }
}
