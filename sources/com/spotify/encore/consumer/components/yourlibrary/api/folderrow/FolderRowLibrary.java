package com.spotify.encore.consumer.components.yourlibrary.api.folderrow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface FolderRowLibrary extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultFolderRowLibraryConfiguration implements Configuration {
            public static final DefaultFolderRowLibraryConfiguration INSTANCE = new DefaultFolderRowLibraryConfiguration();

            private DefaultFolderRowLibraryConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(FolderRowLibrary folderRowLibrary, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(folderRowLibrary, nmf);
        }
    }

    public enum Events {
        RowClicked,
        RowLongClicked,
        DismissClicked
    }

    public static final class Model {
        private final LibraryItemDescription.Model.Folder description;
        private final boolean isDismissible;
        private final boolean isPinned;
        private final String name;

        public Model(String str, LibraryItemDescription.Model.Folder folder, boolean z, boolean z2) {
            h.e(str, "name");
            h.e(folder, "description");
            this.name = str;
            this.description = folder;
            this.isDismissible = z;
            this.isPinned = z2;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, LibraryItemDescription.Model.Folder folder, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.name;
            }
            if ((i & 2) != 0) {
                folder = model.description;
            }
            if ((i & 4) != 0) {
                z = model.isDismissible;
            }
            if ((i & 8) != 0) {
                z2 = model.isPinned;
            }
            return model.copy(str, folder, z, z2);
        }

        public final String component1() {
            return this.name;
        }

        public final LibraryItemDescription.Model.Folder component2() {
            return this.description;
        }

        public final boolean component3() {
            return this.isDismissible;
        }

        public final boolean component4() {
            return this.isPinned;
        }

        public final Model copy(String str, LibraryItemDescription.Model.Folder folder, boolean z, boolean z2) {
            h.e(str, "name");
            h.e(folder, "description");
            return new Model(str, folder, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.name, model.name) && h.a(this.description, model.description) && this.isDismissible == model.isDismissible && this.isPinned == model.isPinned;
        }

        public final LibraryItemDescription.Model.Folder getDescription() {
            return this.description;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            LibraryItemDescription.Model.Folder folder = this.description;
            if (folder != null) {
                i = folder.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.isDismissible;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            boolean z2 = this.isPinned;
            if (!z2) {
                i3 = z2 ? 1 : 0;
            }
            return i7 + i3;
        }

        public final boolean isDismissible() {
            return this.isDismissible;
        }

        public final boolean isPinned() {
            return this.isPinned;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(name=");
            V0.append(this.name);
            V0.append(", description=");
            V0.append(this.description);
            V0.append(", isDismissible=");
            V0.append(this.isDismissible);
            V0.append(", isPinned=");
            return je.P0(V0, this.isPinned, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, LibraryItemDescription.Model.Folder folder, boolean z, boolean z2, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? new LibraryItemDescription.Model.Folder(0, 0) : folder, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }
    }
}
