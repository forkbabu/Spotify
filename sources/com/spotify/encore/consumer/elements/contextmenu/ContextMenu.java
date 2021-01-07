package com.spotify.encore.consumer.elements.contextmenu;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ContextMenu extends Element<Model, f> {

    public static final class DefaultImpls {
        public static void onEvent(ContextMenu contextMenu, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(contextMenu, nmf);
        }
    }

    public static final class Model {
        private final boolean enabled;
        private final String title;
        private final ContextMenuType type;

        public Model(ContextMenuType contextMenuType, String str, boolean z) {
            h.e(contextMenuType, "type");
            h.e(str, "title");
            this.type = contextMenuType;
            this.title = str;
            this.enabled = z;
        }

        public static /* synthetic */ Model copy$default(Model model, ContextMenuType contextMenuType, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                contextMenuType = model.type;
            }
            if ((i & 2) != 0) {
                str = model.title;
            }
            if ((i & 4) != 0) {
                z = model.enabled;
            }
            return model.copy(contextMenuType, str, z);
        }

        public final ContextMenuType component1() {
            return this.type;
        }

        public final String component2() {
            return this.title;
        }

        public final boolean component3() {
            return this.enabled;
        }

        public final Model copy(ContextMenuType contextMenuType, String str, boolean z) {
            h.e(contextMenuType, "type");
            h.e(str, "title");
            return new Model(contextMenuType, str, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.type, model.type) && h.a(this.title, model.title) && this.enabled == model.enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getTitle() {
            return this.title;
        }

        public final ContextMenuType getType() {
            return this.type;
        }

        public int hashCode() {
            ContextMenuType contextMenuType = this.type;
            int i = 0;
            int hashCode = (contextMenuType != null ? contextMenuType.hashCode() : 0) * 31;
            String str = this.title;
            if (str != null) {
                i = str.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.enabled;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(type=");
            V0.append(this.type);
            V0.append(", title=");
            V0.append(this.title);
            V0.append(", enabled=");
            return je.P0(V0, this.enabled, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(ContextMenuType contextMenuType, String str, boolean z, int i, kotlin.jvm.internal.f fVar) {
            this(contextMenuType, str, (i & 4) != 0 ? true : z);
        }
    }
}
