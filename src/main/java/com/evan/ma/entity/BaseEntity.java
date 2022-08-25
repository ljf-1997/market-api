package com.evan.ma.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by chj.
 */
public abstract class BaseEntity implements Serializable {
    private static Logger logger = LoggerFactory.getLogger(BaseEntity.class);

    @Override
    public String toString() {
        return clsToString(this.getClass());
    }

    private String clsToString(Class cls) {
        StringBuilder sb = new StringBuilder("[");
        try {
            while (cls != Object.class) {
                Field[] fields = cls.getFields();
                Field[] declaredFields = cls.getDeclaredFields();

                cls = cls.getSuperclass();
                for (int i = 0; i < fields.length; i++) {
                    Field field = fields[i];
                    Object val = field.get(this);
                    if (i > 0) {
                        sb.append(",");
                    }
                    setString(val, field, sb);
                }

                for (int i = 0; i < declaredFields.length; i++) {
                    Field field = declaredFields[i];
                    field.setAccessible(true);
                    Object val = field.get(this);
                    if (i > 0) {
                        sb.append(",");
                    }
                    setString(val, field, sb);
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return sb.append("]").toString();
    }

    private void setString(Object val, Field field, StringBuilder sb) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (val instanceof String ||
                val instanceof Integer ||
                val instanceof Long ||
                val instanceof Float ||
                val instanceof Double) {
            sb.append(String.format("%s=%s", field.getName(), val));
        } else if (val instanceof Date) {
            sb.append(String.format("%s=%s", field.getName(), dateFormat.format(val)));
        } else if (val instanceof List) {
            sb.append(String.format("%s=[", field.getName()));
            ((List) val).forEach(p -> sb.append(p.toString()).append(","));
            sb.append("]");
        } else {
            sb.append(String.format("%s=%s", field.getName(), val));
        }
    }
}
