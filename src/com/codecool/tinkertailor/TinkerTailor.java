package com.codecool.tinkertailor;

import java.util.List;
import java.util.ArrayList;

class TinkerTailor {
    static List<Integer> calculate(int N, int K) {
        List<Integer> children = new ArrayList<>();
        for (int i = 1; i <= N; i++) children.add(i);

        List<Integer> result = new ArrayList<>();

        // The loop
        int index = 0;
        while (result.size() != N) {
            index += K - 1;
            if (index > children.size() - 1) index -= children.size();

            result.add(children.get(index));
            children.remove(index);
            if (index >= children.size()) index--;
        }

        return result;
    }
}
