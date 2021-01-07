package com.spotify.encore.consumer.components.yourlibrary.api.filterrow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface FilterRowLibrary extends Component<Model, Event> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultFilterRowLibraryConfiguration implements Configuration {
            public static final DefaultFilterRowLibraryConfiguration INSTANCE = new DefaultFilterRowLibraryConfiguration();

            private DefaultFilterRowLibraryConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(FilterRowLibrary filterRowLibrary, nmf<? super Event, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(filterRowLibrary, nmf);
        }
    }

    public static abstract class Event {

        public static final class ClearClicked extends Event {
            public static final ClearClicked INSTANCE = new ClearClicked();

            private ClearClicked() {
                super(null);
            }
        }

        public static final class FilterChanged extends Event {
            private final Filter filter;
            private final int position;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public FilterChanged(Filter filter2, int i) {
                super(null);
                h.e(filter2, "filter");
                this.filter = filter2;
                this.position = i;
            }

            public static /* synthetic */ FilterChanged copy$default(FilterChanged filterChanged, Filter filter2, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    filter2 = filterChanged.filter;
                }
                if ((i2 & 2) != 0) {
                    i = filterChanged.position;
                }
                return filterChanged.copy(filter2, i);
            }

            public final Filter component1() {
                return this.filter;
            }

            public final int component2() {
                return this.position;
            }

            public final FilterChanged copy(Filter filter2, int i) {
                h.e(filter2, "filter");
                return new FilterChanged(filter2, i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FilterChanged)) {
                    return false;
                }
                FilterChanged filterChanged = (FilterChanged) obj;
                return h.a(this.filter, filterChanged.filter) && this.position == filterChanged.position;
            }

            public final Filter getFilter() {
                return this.filter;
            }

            public final int getPosition() {
                return this.position;
            }

            public int hashCode() {
                Filter filter2 = this.filter;
                return ((filter2 != null ? filter2.hashCode() : 0) * 31) + this.position;
            }

            public String toString() {
                StringBuilder V0 = je.V0("FilterChanged(filter=");
                V0.append(this.filter);
                V0.append(", position=");
                return je.B0(V0, this.position, ")");
            }
        }

        private Event() {
        }

        public /* synthetic */ Event(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    public static final class Filter {
        private final int id;
        private final String name;
        private final boolean selected;

        public Filter(int i, String str, boolean z) {
            h.e(str, "name");
            this.id = i;
            this.name = str;
            this.selected = z;
        }

        public static /* synthetic */ Filter copy$default(Filter filter, int i, String str, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = filter.id;
            }
            if ((i2 & 2) != 0) {
                str = filter.name;
            }
            if ((i2 & 4) != 0) {
                z = filter.selected;
            }
            return filter.copy(i, str, z);
        }

        public final int component1() {
            return this.id;
        }

        public final String component2() {
            return this.name;
        }

        public final boolean component3() {
            return this.selected;
        }

        public final Filter copy(int i, String str, boolean z) {
            h.e(str, "name");
            return new Filter(i, str, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) obj;
            return this.id == filter.id && h.a(this.name, filter.name) && this.selected == filter.selected;
        }

        public final int getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        public int hashCode() {
            int i = this.id * 31;
            String str = this.name;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.selected;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Filter(id=");
            V0.append(this.id);
            V0.append(", name=");
            V0.append(this.name);
            V0.append(", selected=");
            return je.P0(V0, this.selected, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Filter(int i, String str, boolean z, int i2, kotlin.jvm.internal.f fVar) {
            this(i, str, (i2 & 4) != 0 ? false : z);
        }
    }

    public static final class Model {
        private final List<Filter> filters;

        public Model(List<Filter> list) {
            h.e(list, "filters");
            this.filters = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary$Model */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Model copy$default(Model model, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = model.filters;
            }
            return model.copy(list);
        }

        public final List<Filter> component1() {
            return this.filters;
        }

        public final Model copy(List<Filter> list) {
            h.e(list, "filters");
            return new Model(list);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Model) && h.a(this.filters, ((Model) obj).filters);
            }
            return true;
        }

        public final List<Filter> getFilters() {
            return this.filters;
        }

        public int hashCode() {
            List<Filter> list = this.filters;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("Model(filters="), this.filters, ")");
        }
    }
}
