package com.spotify.encore.consumer.elements.downloadbutton;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface DownloadButton extends Element<Model, f> {

    public static final class DefaultImpls {
        public static void onEvent(DownloadButton downloadButton, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(downloadButton, nmf);
        }
    }

    public static final class Model {
        private final DownloadState downloadState;
        private final String id;

        public Model(DownloadState downloadState2, String str) {
            h.e(downloadState2, "downloadState");
            h.e(str, "id");
            this.downloadState = downloadState2;
            this.id = str;
        }

        public static /* synthetic */ Model copy$default(Model model, DownloadState downloadState2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                downloadState2 = model.downloadState;
            }
            if ((i & 2) != 0) {
                str = model.id;
            }
            return model.copy(downloadState2, str);
        }

        public final DownloadState component1() {
            return this.downloadState;
        }

        public final String component2() {
            return this.id;
        }

        public final Model copy(DownloadState downloadState2, String str) {
            h.e(downloadState2, "downloadState");
            h.e(str, "id");
            return new Model(downloadState2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.downloadState, model.downloadState) && h.a(this.id, model.id);
        }

        public final DownloadState getDownloadState() {
            return this.downloadState;
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            DownloadState downloadState2 = this.downloadState;
            int i = 0;
            int hashCode = (downloadState2 != null ? downloadState2.hashCode() : 0) * 31;
            String str = this.id;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(downloadState=");
            V0.append(this.downloadState);
            V0.append(", id=");
            return je.I0(V0, this.id, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(DownloadState downloadState2, String str, int i, kotlin.jvm.internal.f fVar) {
            this(downloadState2, (i & 2) != 0 ? String.valueOf(downloadState2.hashCode()) : str);
        }
    }
}
