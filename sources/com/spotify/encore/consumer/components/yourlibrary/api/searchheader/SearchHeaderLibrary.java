package com.spotify.encore.consumer.components.yourlibrary.api.searchheader;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface SearchHeaderLibrary extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultSearchHeaderLibraryConfiguration implements Configuration {
            public static final DefaultSearchHeaderLibraryConfiguration INSTANCE = new DefaultSearchHeaderLibraryConfiguration();

            private DefaultSearchHeaderLibraryConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(SearchHeaderLibrary searchHeaderLibrary, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(searchHeaderLibrary, nmf);
        }
    }

    public static abstract class Events {

        public static final class BackButtonClicked extends Events {
            public static final BackButtonClicked INSTANCE = new BackButtonClicked();

            private BackButtonClicked() {
                super(null);
            }
        }

        public static final class ClearButtonClicked extends Events {
            public static final ClearButtonClicked INSTANCE = new ClearButtonClicked();

            private ClearButtonClicked() {
                super(null);
            }
        }

        public static final class SearchTextChanged extends Events {
            private final String searchText;

            public SearchTextChanged() {
                this(null, 1, null);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SearchTextChanged(String str) {
                super(null);
                h.e(str, "searchText");
                this.searchText = str;
            }

            public static /* synthetic */ SearchTextChanged copy$default(SearchTextChanged searchTextChanged, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = searchTextChanged.searchText;
                }
                return searchTextChanged.copy(str);
            }

            public final String component1() {
                return this.searchText;
            }

            public final SearchTextChanged copy(String str) {
                h.e(str, "searchText");
                return new SearchTextChanged(str);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof SearchTextChanged) && h.a(this.searchText, ((SearchTextChanged) obj).searchText);
                }
                return true;
            }

            public final String getSearchText() {
                return this.searchText;
            }

            public int hashCode() {
                String str = this.searchText;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return je.I0(je.V0("SearchTextChanged(searchText="), this.searchText, ")");
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ SearchTextChanged(String str, int i, kotlin.jvm.internal.f fVar) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        private Events() {
        }

        public /* synthetic */ Events(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    public static final class Model {
        private final String searchText;

        public Model() {
            this(null, 1, null);
        }

        public Model(String str) {
            h.e(str, "searchText");
            this.searchText = str;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.searchText;
            }
            return model.copy(str);
        }

        public final String component1() {
            return this.searchText;
        }

        public final Model copy(String str) {
            h.e(str, "searchText");
            return new Model(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Model) && h.a(this.searchText, ((Model) obj).searchText);
            }
            return true;
        }

        public final String getSearchText() {
            return this.searchText;
        }

        public int hashCode() {
            String str = this.searchText;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Model(searchText="), this.searchText, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, int i, kotlin.jvm.internal.f fVar) {
            this((i & 1) != 0 ? "" : str);
        }
    }
}
