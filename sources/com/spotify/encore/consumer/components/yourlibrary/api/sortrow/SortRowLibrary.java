package com.spotify.encore.consumer.components.yourlibrary.api.sortrow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface SortRowLibrary extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultSortRowLibraryConfiguration implements Configuration {
            public static final DefaultSortRowLibraryConfiguration INSTANCE = new DefaultSortRowLibraryConfiguration();

            private DefaultSortRowLibraryConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(SortRowLibrary sortRowLibrary, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(sortRowLibrary, nmf);
        }
    }

    public enum Events {
        SortOrderClicked,
        ViewDensityClicked
    }

    public static final class Model {
        private final ViewDensity density;
        private final SortOrder sortOrder;

        public Model() {
            this(null, null, 3, null);
        }

        public Model(SortOrder sortOrder2, ViewDensity viewDensity) {
            h.e(sortOrder2, "sortOrder");
            h.e(viewDensity, "density");
            this.sortOrder = sortOrder2;
            this.density = viewDensity;
        }

        public static /* synthetic */ Model copy$default(Model model, SortOrder sortOrder2, ViewDensity viewDensity, int i, Object obj) {
            if ((i & 1) != 0) {
                sortOrder2 = model.sortOrder;
            }
            if ((i & 2) != 0) {
                viewDensity = model.density;
            }
            return model.copy(sortOrder2, viewDensity);
        }

        public final SortOrder component1() {
            return this.sortOrder;
        }

        public final ViewDensity component2() {
            return this.density;
        }

        public final Model copy(SortOrder sortOrder2, ViewDensity viewDensity) {
            h.e(sortOrder2, "sortOrder");
            h.e(viewDensity, "density");
            return new Model(sortOrder2, viewDensity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.sortOrder, model.sortOrder) && h.a(this.density, model.density);
        }

        public final ViewDensity getDensity() {
            return this.density;
        }

        public final SortOrder getSortOrder() {
            return this.sortOrder;
        }

        public int hashCode() {
            SortOrder sortOrder2 = this.sortOrder;
            int i = 0;
            int hashCode = (sortOrder2 != null ? sortOrder2.hashCode() : 0) * 31;
            ViewDensity viewDensity = this.density;
            if (viewDensity != null) {
                i = viewDensity.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(sortOrder=");
            V0.append(this.sortOrder);
            V0.append(", density=");
            V0.append(this.density);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(SortOrder sortOrder2, ViewDensity viewDensity, int i, kotlin.jvm.internal.f fVar) {
            this((i & 1) != 0 ? SortOrder.MostRelevant : sortOrder2, (i & 2) != 0 ? ViewDensity.List : viewDensity);
        }
    }

    public enum SortOrder {
        MostRelevant,
        RecentlyPlayed,
        RecentlyAdded,
        Alphabetical,
        Creator
    }

    public enum ViewDensity {
        List,
        Grid
    }
}
