package com.daniel.abc.pack01;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Map;

public class MapUtils {
    public static <T> T fromMap(T t, Map map) {
        try {
            for (Field field : t.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if ("java.lang.String".equals(field.getType().getName())) {
                    field.set(t, (String) map.get(field.getName()));
                }
                if ("java.lang.Integer".equals(field.getType().getName())) {
                    field.set(t, Integer.parseInt((String) map.get(field.getName())));
                }
                if ("java.math.BigDecimal".equals(field.getType().getName())) {
                    field.set(t, new BigDecimal((String) map.get(field.getName())));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }
}
