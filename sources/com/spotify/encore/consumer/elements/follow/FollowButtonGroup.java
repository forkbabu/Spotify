package com.spotify.encore.consumer.elements.follow;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface FollowButtonGroup extends Element<Model, Boolean> {

    public static final class DefaultImpls {
        public static void onEvent(FollowButtonGroup followButtonGroup, nmf<? super Boolean, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(followButtonGroup, nmf);
        }
    }

    public static final class Model {
        private final String contentDescContext;
        private final boolean isError;
        private final boolean isFollowed;

        public Model(boolean z, String str, boolean z2) {
            this.isFollowed = z;
            this.contentDescContext = str;
            this.isError = z2;
        }

        public static /* synthetic */ Model copy$default(Model model, boolean z, String str, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = model.isFollowed;
            }
            if ((i & 2) != 0) {
                str = model.contentDescContext;
            }
            if ((i & 4) != 0) {
                z2 = model.isError;
            }
            return model.copy(z, str, z2);
        }

        public final boolean component1() {
            return this.isFollowed;
        }

        public final String component2() {
            return this.contentDescContext;
        }

        public final boolean component3() {
            return this.isError;
        }

        public final Model copy(boolean z, String str, boolean z2) {
            return new Model(z, str, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return this.isFollowed == model.isFollowed && h.a(this.contentDescContext, model.contentDescContext) && this.isError == model.isError;
        }

        public final String getContentDescContext() {
            return this.contentDescContext;
        }

        public int hashCode() {
            boolean z = this.isFollowed;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            String str = this.contentDescContext;
            int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
            boolean z2 = this.isError;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return hashCode + i;
        }

        public final boolean isError() {
            return this.isError;
        }

        public final boolean isFollowed() {
            return this.isFollowed;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(isFollowed=");
            V0.append(this.isFollowed);
            V0.append(", contentDescContext=");
            V0.append(this.contentDescContext);
            V0.append(", isError=");
            return je.P0(V0, this.isError, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(boolean z, String str, boolean z2, int i, kotlin.jvm.internal.f fVar) {
            this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2);
        }
    }
}
