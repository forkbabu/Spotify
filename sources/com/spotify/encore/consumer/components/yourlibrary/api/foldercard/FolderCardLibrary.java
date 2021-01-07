package com.spotify.encore.consumer.components.yourlibrary.api.foldercard;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface FolderCardLibrary extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultFolderCardLibraryConfiguration implements Configuration {
            public static final DefaultFolderCardLibraryConfiguration INSTANCE = new DefaultFolderCardLibraryConfiguration();

            private DefaultFolderCardLibraryConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(FolderCardLibrary folderCardLibrary, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(folderCardLibrary, nmf);
        }
    }

    public enum Events {
        CardClicked,
        CardLongClicked
    }

    public static final class Model {
        private final LibraryItemDescription.Model.Folder description;
        private final boolean isPinned;
        private final String name;

        public Model(String str, LibraryItemDescription.Model.Folder folder, boolean z) {
            h.e(str, "name");
            h.e(folder, "description");
            this.name = str;
            this.description = folder;
            this.isPinned = z;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, LibraryItemDescription.Model.Folder folder, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.name;
            }
            if ((i & 2) != 0) {
                folder = model.description;
            }
            if ((i & 4) != 0) {
                z = model.isPinned;
            }
            return model.copy(str, folder, z);
        }

        public final String component1() {
            return this.name;
        }

        public final LibraryItemDescription.Model.Folder component2() {
            return this.description;
        }

        public final boolean component3() {
            return this.isPinned;
        }

        public final Model copy(String str, LibraryItemDescription.Model.Folder folder, boolean z) {
            h.e(str, "name");
            h.e(folder, "description");
            return new Model(str, folder, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.name, model.name) && h.a(this.description, model.description) && this.isPinned == model.isPinned;
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
            boolean z = this.isPinned;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public final boolean isPinned() {
            return this.isPinned;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(name=");
            V0.append(this.name);
            V0.append(", description=");
            V0.append(this.description);
            V0.append(", isPinned=");
            return je.P0(V0, this.isPinned, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, LibraryItemDescription.Model.Folder folder, boolean z, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? new LibraryItemDescription.Model.Folder(0, 0) : folder, (i & 4) != 0 ? false : z);
        }
    }
}
