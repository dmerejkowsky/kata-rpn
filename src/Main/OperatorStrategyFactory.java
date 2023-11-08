package src.Main;

import java.util.HashMap;
import java.util.Map;

class OperatorStrategyFactory {

    private static final Map<String, OperatorStrategy> STRATEGIES = new HashMap<>();

    static {
        STRATEGIES.put("+", new AddStrategy());
        STRATEGIES.put("-", new SubstractStrategy());
        STRATEGIES.put("*", new MultiplyStrategy());
        STRATEGIES.put("/", new DivideStrategy());
    }

    public static OperatorStrategy getStrategy(String operator) {
        return STRATEGIES.get(operator);
    }
}
