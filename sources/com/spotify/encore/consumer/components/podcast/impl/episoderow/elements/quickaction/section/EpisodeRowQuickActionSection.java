package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.section;

import com.spotify.encore.Element;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface EpisodeRowQuickActionSection extends Element<Model, ClickEvent> {

    public static final class ClickEvent {
        private final EpisodeRowQuickAction action;

        public ClickEvent(EpisodeRowQuickAction episodeRowQuickAction) {
            h.e(episodeRowQuickAction, "action");
            this.action = episodeRowQuickAction;
        }

        public static /* synthetic */ ClickEvent copy$default(ClickEvent clickEvent, EpisodeRowQuickAction episodeRowQuickAction, int i, Object obj) {
            if ((i & 1) != 0) {
                episodeRowQuickAction = clickEvent.action;
            }
            return clickEvent.copy(episodeRowQuickAction);
        }

        public final EpisodeRowQuickAction component1() {
            return this.action;
        }

        public final ClickEvent copy(EpisodeRowQuickAction episodeRowQuickAction) {
            h.e(episodeRowQuickAction, "action");
            return new ClickEvent(episodeRowQuickAction);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ClickEvent) && h.a(this.action, ((ClickEvent) obj).action);
            }
            return true;
        }

        public final EpisodeRowQuickAction getAction() {
            return this.action;
        }

        public int hashCode() {
            EpisodeRowQuickAction episodeRowQuickAction = this.action;
            if (episodeRowQuickAction != null) {
                return episodeRowQuickAction.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ClickEvent(action=");
            V0.append(this.action);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(EpisodeRowQuickActionSection episodeRowQuickActionSection, nmf<? super ClickEvent, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(episodeRowQuickActionSection, nmf);
        }
    }

    public static final class Model {
        private final List<EpisodeRowQuickAction> actions;
        private final String title;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction> */
        /* JADX WARN: Multi-variable type inference failed */
        public Model(String str, List<? extends EpisodeRowQuickAction> list) {
            h.e(str, "title");
            h.e(list, "actions");
            this.title = str;
            this.actions = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.section.EpisodeRowQuickActionSection$Model */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Model copy$default(Model model, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.title;
            }
            if ((i & 2) != 0) {
                list = model.actions;
            }
            return model.copy(str, list);
        }

        public final String component1() {
            return this.title;
        }

        public final List<EpisodeRowQuickAction> component2() {
            return this.actions;
        }

        public final Model copy(String str, List<? extends EpisodeRowQuickAction> list) {
            h.e(str, "title");
            h.e(list, "actions");
            return new Model(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.title, model.title) && h.a(this.actions, model.actions);
        }

        public final List<EpisodeRowQuickAction> getActions() {
            return this.actions;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<EpisodeRowQuickAction> list = this.actions;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(title=");
            V0.append(this.title);
            V0.append(", actions=");
            return je.L0(V0, this.actions, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, List list, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? EmptyList.a : list);
        }
    }
}
