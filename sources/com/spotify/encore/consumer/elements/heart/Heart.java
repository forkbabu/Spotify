package com.spotify.encore.consumer.elements.heart;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface Heart extends Element<Model, Boolean> {

    public static final class DefaultImpls {
        public static void onEvent(Heart heart, nmf<? super Boolean, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(heart, nmf);
        }
    }

    public static final class Model {
        private final String contentDescContext;
        private final boolean isLiked;

        public Model(boolean z, String str) {
            this.isLiked = z;
            this.contentDescContext = str;
        }

        public static /* synthetic */ Model copy$default(Model model, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = model.isLiked;
            }
            if ((i & 2) != 0) {
                str = model.contentDescContext;
            }
            return model.copy(z, str);
        }

        public final boolean component1() {
            return this.isLiked;
        }

        public final String component2() {
            return this.contentDescContext;
        }

        public final Model copy(boolean z, String str) {
            return new Model(z, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return this.isLiked == model.isLiked && h.a(this.contentDescContext, model.contentDescContext);
        }

        public final String getContentDescContext() {
            return this.contentDescContext;
        }

        public int hashCode() {
            boolean z = this.isLiked;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            String str = this.contentDescContext;
            return i4 + (str != null ? str.hashCode() : 0);
        }

        public final boolean isLiked() {
            return this.isLiked;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(isLiked=");
            V0.append(this.isLiked);
            V0.append(", contentDescContext=");
            return je.I0(V0, this.contentDescContext, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(boolean z, String str, int i, kotlin.jvm.internal.f fVar) {
            this(z, (i & 2) != 0 ? null : str);
        }
    }
}
