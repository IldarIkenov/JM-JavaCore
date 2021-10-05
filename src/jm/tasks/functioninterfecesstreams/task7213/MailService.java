package jm.tasks.functioninterfecesstreams.task7213;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {
    Map<String, List<T>> list = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, Collections.emptyList());
        }
    };

    Map<String, List<T>> getMailBox() {
        return list;
    }

    @Override
    public void accept(Sendable<T> o) {
        list.computeIfAbsent(o.getTo(), k -> new LinkedList<>()).add(o.getContent());
    }
}
